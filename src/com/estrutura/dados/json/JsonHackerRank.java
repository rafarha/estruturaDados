package com.estrutura.dados.json;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class JsonHackerRank {

    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String _firstDate;
	        try {
	            _firstDate = in.nextLine();
	        } catch (Exception e) {
	            _firstDate = null;
	        }

	        String _lastDate;
	        try {
	            _lastDate = in.nextLine();
	        } catch (Exception e) {
	            _lastDate = null;
	        }

	        String _weekDay;
	        try {
	            _weekDay = in.nextLine();
	        } catch (Exception e) {
	            _weekDay = null;
	        }

	        openAndClosePrices(_firstDate, _lastDate, _weekDay);

	//	openAndClosePrices("1-January-2000", "22-February-2000", "Monday");
	//	openAndClosePrices("1-January-2000", "22-February-2000", "Moay");
	//	openAndClosePrices("", "22-February-2000", "Monday");
	//	openAndClosePrices("1-January-2000", "", "Monday");
	//	openAndClosePrices("1-Jan]ry-2000", "22-February-2000", "Monday");
	//	openAndClosePrices("1-January-2000", "50-February-2000", "Monday");

    }

    private static StockPage getPaginaEstoque(final int pIndexPage, final String pStrCurrentDate)
		    throws IOException {
	String strReader;
	if (pStrCurrentDate == null) {
	    strReader = "https://jsonmock.hackerrank.com/api/stocks/search?&page=" + pIndexPage;
	} else {
	    strReader = "https://jsonmock.hackerrank.com/api/stocks/search?date=" + pStrCurrentDate + "&page=" + pIndexPage;
	}
	Reader reader = reader(strReader);
	return new Gson().fromJson(reader, StockPage.class);
    }

    /*
     * Complete the function below.
     */
    static void openAndClosePrices(String firstDate, String lastDate, String weekDay) {
	try {
	    //Validation of null or empty date
	    if ((firstDate.isEmpty() || firstDate == null) || (lastDate.isEmpty() || lastDate == null)) {
		return;
	    }
	    //Find the day number of week from weekday
	    final String[] weekdays = new DateFormatSymbols(Locale.US).getWeekdays();
	    int weekDayNumber = 0;
	    for (int i = 1; i < weekdays.length; i++) {
		if (weekdays[i].equalsIgnoreCase(weekDay)) {
		    weekDayNumber = i;
		    break;
		}
	    }
	    //Validation if weekday is a valid day
	    if (weekDayNumber == 0) {
		return;
	    }

	    //Format and convert the String date to LocalDateTime
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy", Locale.US);
	    //if the date format it isn't compatibly the program will be stop
	    simpleDateFormat.setLenient(false);
	    LocalDateTime dtInicio = LocalDateTime
			    .ofInstant(simpleDateFormat.parse(firstDate).toInstant(), TimeZone.getDefault().toZoneId());
	    LocalDateTime dtFim = LocalDateTime
			    .ofInstant(simpleDateFormat.parse(lastDate).toInstant(), TimeZone.getDefault().toZoneId());

	    //Modify dtInicio for the first date based on weekDay
	    dtInicio = dtInicio.plusDays(weekDayNumber);

	    //Page of JSON
	    int indexPage = 1;
	    //When I find some result I'll update this index and this index will be the initial base to find the others day.
	    // I am assuming that the JSON is sorted then when I find a date I have to continuous searching after this index.
	    int indexInitialPage = 1;

	    //Find out the number of pages of JSON
	    final Integer totalPages = getPaginaEstoque(indexPage, null).getTotal_pages();

	    //Looking for the dates on STOCK and printing them
	    while (dtInicio.isBefore(dtFim)) {
		//Search per page and date
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMMM-yyyy", Locale.US);
		final String strCurrentDate = dtInicio.format(formatter).toString();

		while (indexPage <= totalPages) {
		    StockPage stockPage = getPaginaEstoque(indexPage, strCurrentDate);
		    if (stockPage.getData().size() > 0) {
			//How to search by date is a String, sometimes can return values that is not exactly
			// so  I need to check if they are equals.
			for (StockData stockData : stockPage.getData()) {
			    if (stockData.getDate().equalsIgnoreCase(strCurrentDate)) {
				System.out.println(strCurrentDate + " " + stockData.getOpen() + " " + stockData.getClose());
				indexInitialPage = indexPage;
				break;
			    }
			}
			break;
		    } else {
			indexPage++;
		    }
		}
		dtInicio = dtInicio.plusDays(7);
		indexPage = indexInitialPage;
	    }
	} catch (IOException pE) {
	    return;
	} catch (ParseException pE) {
	    return;
	}
    }

    static Reader reader(String pUrl) throws IOException {
	Reader reader = new InputStreamReader(new URL(pUrl).openStream()); //Read the json output
	return reader;
    }

    class StockData {
	private BigDecimal close;

	private String date;

	private BigDecimal open;

	public BigDecimal getClose() {
	    return close;
	}

	public String getDate() {
	    return date;
	}

	public BigDecimal getOpen() {
	    return open;
	}

	public void setClose(final BigDecimal pClose) {
	    close = pClose;
	}

	public void setDate(final String pDate) {
	    date = pDate;
	}

	public void setOpen(final BigDecimal pOpen) {
	    open = pOpen;
	}
    }

    class StockPage {
	private List<StockData> data;

	private Integer page;

	private Integer total_pages;

	public List<StockData> getData() {
	    return data;
	}

	public Integer getPage() {
	    return page;
	}

	public Integer getTotal_pages() {
	    return total_pages;
	}

	public void setData(final List<StockData> pData) {
	    data = pData;
	}

	public void setPage(final Integer pPage) {
	    page = pPage;
	}

	public void setTotal_pages(final Integer pTotal_pages) {
	    total_pages = pTotal_pages;
	}

    }
}
