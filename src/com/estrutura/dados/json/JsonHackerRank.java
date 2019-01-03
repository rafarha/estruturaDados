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
import java.util.Calendar;
import java.util.List;

public class JsonHackerRank {

    public static void main(String[] args) {
	//        Scanner in = new Scanner(System.in);
	//        String _firstDate;
	//        try {
	//            _firstDate = in.nextLine();
	//        } catch (Exception e) {
	//            _firstDate = null;
	//        }
	//
	//        String _lastDate;
	//        try {
	//            _lastDate = in.nextLine();
	//        } catch (Exception e) {
	//            _lastDate = null;
	//        }
	//
	//        String _weekDay;
	//        try {
	//            _weekDay = in.nextLine();
	//        } catch (Exception e) {
	//            _weekDay = null;
	//        }
	//
	//        openAndClosePrices(_firstDate, _lastDate, _weekDay);

	openAndClosePrices("1-January-2000", "22-February-2000", "Monday");

    }

    /*
     * Complete the function below.
     */
    static void openAndClosePrices(String firstDate, String lastDate, String weekDay) {
	try {
	    Calendar calendar = Calendar.getInstance();
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("DD-MMMM-yyyy");
	    calendar.setTime(simpleDateFormat.parse(firstDate));
	    String diaSemana = new DateFormatSymbols().getWeekdays()[calendar.DAY_OF_WEEK];

	    System.out.println(calendar);

	    //	    Reader reader = reader("https://jsonmock.hackerrank.com/api/stocks/search?date=7-January-2000&page=1");
	    Reader reader = reader("https://jsonmock.hackerrank.com/api/stocks/?page=1");

	    PaginaEstoque paginaEstoque = new Gson().fromJson(reader, PaginaEstoque.class);
	    //	    List<DadosEstoque> dadosEstoqueList = paginaEstoque.getData();
	    //	    System.out.println(paginaEstoque.toString());
	} catch (IOException pE) {
	    pE.printStackTrace();
	} catch (ParseException pE) {
	    pE.printStackTrace();
	}
    }

    static Reader reader(String pUrl) throws IOException {
	Reader reader = new InputStreamReader(new URL(pUrl).openStream()); //Read the json output
	//
	//        URL url = new URL(pUrl);
	//        InputStreamReader reader = new InputStreamReader(url.openStream());
	return reader;
    }

    class DadosEstoque {
	private BigDecimal close;

	private String date;

	private BigDecimal high;

	private BigDecimal low;

	private BigDecimal open;

	public BigDecimal getClose() {
	    return close;
	}

	public BigDecimal getHigh() {
	    return high;
	}

	public BigDecimal getLow() {
	    return low;
	}

	public BigDecimal getOpen() {
	    return open;
	}

	public void setClose(final BigDecimal pClose) {
	    close = pClose;
	}

	public void setHigh(final BigDecimal pHigh) {
	    high = pHigh;
	}

	public void setLow(final BigDecimal pLow) {
	    low = pLow;
	}

	public void setOpen(final BigDecimal pOpen) {
	    open = pOpen;
	}
    }

    class PaginaEstoque {
	private List<DadosEstoque> data;

	private Integer page;

	private Integer per_page;

	private Integer total;

	private Integer total_pages;

	public List<DadosEstoque> getData() {
	    return data;
	}

	public Integer getPage() {
	    return page;
	}

	public Integer getPer_page() {
	    return per_page;
	}

	public Integer getTotal() {
	    return total;
	}

	public Integer getTotal_pages() {
	    return total_pages;
	}

	public void setData(final List<DadosEstoque> pData) {
	    data = pData;
	}

	public void setPage(final Integer pPage) {
	    page = pPage;
	}

	public void setPer_page(final Integer pPer_page) {
	    per_page = pPer_page;
	}

	public void setTotal(final Integer pTotal) {
	    total = pTotal;
	}

	public void setTotal_pages(final Integer pTotal_pages) {
	    total_pages = pTotal_pages;
	}

	@Override public String toString() {
	    return "PaginaEstoque{" +
			    "data=" + data +
			    ", page=" + page +
			    ", per_page=" + per_page +
			    ", total=" + total +
			    ", total_pages=" + total_pages +
			    '}';
	}
    }
}
