package com.estrutura.dados.json;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//import java.net.*;
//import com.google.gson.*;

public class JsonHackerRank2 {

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

	//	openAndClosePrices(_firstDate, _lastDate, _weekDay);

	//	openAndClosePrices("1-January-2000", "22-February-2000", "Monday");
	openAndClosePrices("26-March-2001", "15-August-2001", "Wednesday");

	//		openAndClosePrices("1-January-2000", "22-February-2000", "Moay");
	//		openAndClosePrices("", "22-February-2000", "Monday");
	//		openAndClosePrices("1-January-2000", "", "Monday");
	//		openAndClosePrices("1-Jan]ry-2000", "22-February-2000", "Monday");
	//		openAndClosePrices("1-January-2000", "50-February-2000", "Monday");

    }

    /*
     * Complete the function below.
     */
    public static String openAndClosePrices(String firstDate, String lastDate, String weekDay) {
	String retorno;
	try {
	    //Validation of null or empty date
	    if ((firstDate.isEmpty() || firstDate == null) || (lastDate.isEmpty() || lastDate == null)) {
		return null;
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
		return null;
	    }
	    Calendar calendar = Calendar.getInstance(Locale.CANADA);
	    //Format and convert the String date to LocalDateTime
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy", Locale.US);
	    //if the date format it isn't compatibly the program will be stop
	    simpleDateFormat.setLenient(false);

	    Date dtInicio = simpleDateFormat.parse(firstDate);
	    Date dtFim = simpleDateFormat.parse(lastDate);

	    //Modify dtInicio for the first date based on weekDay
	    int addDayInDate = 0;
	    calendar.setTime(dtInicio);
	    if (calendar.get(calendar.DAY_OF_WEEK) < weekDayNumber) {
		addDayInDate = weekDayNumber - calendar.get(calendar.DAY_OF_WEEK);

	    } else if (calendar.get(calendar.DAY_OF_WEEK) > weekDayNumber) {
		//Find the diference between DAYOFWEEK of DATE and DAYWEEK inputed byr the user
		int i = calendar.get(calendar.DAY_OF_WEEK) - weekDayNumber;
		//Case result is negative convert to positive
		i = i < 0 ? i * -1 : i;
		addDayInDate = Calendar.DAY_OF_WEEK - i;
	    }
	    calendar.add(calendar.DATE, addDayInDate);
	    dtInicio = calendar.getTime();
	    retorno = simpleDateFormat.format(dtInicio);

	    //Page of JSON
	    int indexPage = 1;
	    //When I find some result I'll update this index and this index will be the initial base to find the others day.
	    // I am assuming that the JSON is sorted then when I find a date I have to continuous searching after this index.
	    int indexInitialPage = 1;

	    //Find out the number of pages of JSON
	    final Integer totalPages = getPaginaEstoque(indexPage, null).getTotalPages();

	    SimpleDateFormat simpleDateFormatToSearchJson = new SimpleDateFormat("d-MMMM-yyyy", Locale.US);
	    simpleDateFormat.setLenient(false);
	    //Looking for the dates on STOCK and printing them
	    while (dtInicio.compareTo(dtFim) == -1) {
		final String strCurrentDate = simpleDateFormatToSearchJson.format(dtInicio).toString();

		while (indexPage <= totalPages) {
		    //Search per page and date
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
		calendar.setTime(dtInicio);
		calendar.add(Calendar.DATE, 7);
		dtInicio = calendar.getTime();
		indexPage = indexInitialPage;
	    }
	    return retorno;
	} catch (IOException pE) {
	    return null;
	} catch (ParseException pE) {
	    return null;
	}
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

	@SerializedName("total_pages")
	private Integer totalPages;

	public List<StockData> getData() {
	    return data;
	}

	public Integer getPage() {
	    return page;
	}

	public Integer getTotalPages() {
	    return totalPages;
	}

	public void setData(final List<StockData> pData) {
	    data = pData;
	}

	public void setPage(final Integer pPage) {
	    page = pPage;
	}

    }
}
