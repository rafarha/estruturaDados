package com.estrutura.dados.json;

import org.junit.Assert;
import org.junit.Test;

public class JsonHackerRank2Test {
    JsonHackerRank2 jsonHackerRank2 = new JsonHackerRank2();

    @Test
    public void test19March() {
	Assert.assertEquals("Monday Falhou: ", "19-March-2001",
			JsonHackerRank2.openAndClosePrices("19-March-2001", "15-August-2001", "Monday"));
	Assert.assertEquals("Tuesday Falhou: ", "20-March-2001",
			JsonHackerRank2.openAndClosePrices("19-March-2001", "15-August-2001", "Tuesday"));
	Assert.assertEquals("Wednesday Falhou: ", "21-March-2001",
			JsonHackerRank2.openAndClosePrices("19-March-2001", "15-August-2001", "Wednesday"));
	Assert.assertEquals("Thursday Falhou: ", "22-March-2001",
			JsonHackerRank2.openAndClosePrices("19-March-2001", "15-August-2001", "Thursday"));
	Assert.assertEquals("Friday Falhou: ", "23-March-2001",
			JsonHackerRank2.openAndClosePrices("19-March-2001", "15-August-2001", "Friday"));
	Assert.assertEquals("Saturday Falhou: ", "24-March-2001",
			JsonHackerRank2.openAndClosePrices("19-March-2001", "15-August-2001", "Saturday"));
	Assert.assertEquals("Sunday Falhou: ", "25-March-2001",
			JsonHackerRank2.openAndClosePrices("19-March-2001", "15-August-2001", "Sunday"));
    }

    @Test
    public void test20March() {
	Assert.assertEquals("Monday Falhou: ", "26-March-2001",
			JsonHackerRank2.openAndClosePrices("20-March-2001", "15-August-2001", "Monday"));
	Assert.assertEquals("Tuesday Falhou: ", "20-March-2001",
			JsonHackerRank2.openAndClosePrices("20-March-2001", "15-August-2001", "Tuesday"));
	Assert.assertEquals("Wednesday Falhou: ", "21-March-2001",
			JsonHackerRank2.openAndClosePrices("20-March-2001", "15-August-2001", "Wednesday"));
	Assert.assertEquals("Thursday Falhou: ", "22-March-2001",
			JsonHackerRank2.openAndClosePrices("20-March-2001", "15-August-2001", "Thursday"));
	Assert.assertEquals("Friday Falhou: ", "23-March-2001",
			JsonHackerRank2.openAndClosePrices("20-March-2001", "15-August-2001", "Friday"));
	Assert.assertEquals("Saturday Falhou: ", "24-March-2001",
			JsonHackerRank2.openAndClosePrices("20-March-2001", "15-August-2001", "Saturday"));
	Assert.assertEquals("Sunday Falhou: ", "25-March-2001",
			JsonHackerRank2.openAndClosePrices("20-March-2001", "15-August-2001", "Sunday"));
    }

    @Test
    public void test21March() {
	String firstDate = "21-March-2001";
	String lastDate = "29-March-2001";
	Assert.assertEquals("Monday Falhou: ", "26-March-2001",
			JsonHackerRank2.openAndClosePrices(firstDate, lastDate, "Monday"));
	Assert.assertEquals("Tuesday Falhou: ", "27-March-2001",
			JsonHackerRank2.openAndClosePrices(firstDate, lastDate, "Tuesday"));
	Assert.assertEquals("Wednesday Falhou: ", "21-March-2001",
			JsonHackerRank2.openAndClosePrices(firstDate, lastDate, "Wednesday"));
	Assert.assertEquals("Thursday Falhou: ", "22-March-2001",
			JsonHackerRank2.openAndClosePrices(firstDate, lastDate, "Thursday"));
	Assert.assertEquals("Friday Falhou: ", "23-March-2001",
			JsonHackerRank2.openAndClosePrices(firstDate, lastDate, "Friday"));
	Assert.assertEquals("Saturday Falhou: ", "24-March-2001",
			JsonHackerRank2.openAndClosePrices(firstDate, lastDate, "Saturday"));
	Assert.assertEquals("Sunday Falhou: ", "25-March-2001",
			JsonHackerRank2.openAndClosePrices(firstDate, lastDate, "Sunday"));
    }

    @Test
    public void test22March() {
	Assert.assertEquals("Monday Falhou: ", "26-March-2001",
			JsonHackerRank2.openAndClosePrices("22-March-2001", "15-August-2001", "Monday"));
	Assert.assertEquals("Tuesday Falhou: ", "27-March-2001",
			JsonHackerRank2.openAndClosePrices("22-March-2001", "15-August-2001", "Tuesday"));
	Assert.assertEquals("Wednesday Falhou: ", "28-March-2001",
			JsonHackerRank2.openAndClosePrices("22-March-2001", "15-August-2001", "Wednesday"));
	Assert.assertEquals("Thursday Falhou: ", "22-March-2001",
			JsonHackerRank2.openAndClosePrices("22-March-2001", "15-August-2001", "Thursday"));
	Assert.assertEquals("Friday Falhou: ", "23-March-2001",
			JsonHackerRank2.openAndClosePrices("22-March-2001", "15-August-2001", "Friday"));
	Assert.assertEquals("Saturday Falhou: ", "24-March-2001",
			JsonHackerRank2.openAndClosePrices("22-March-2001", "15-August-2001", "Saturday"));
	Assert.assertEquals("Sunday Falhou: ", "25-March-2001",
			JsonHackerRank2.openAndClosePrices("22-March-2001", "15-August-2001", "Sunday"));
    }

    @Test
    public void test23March() {
	Assert.assertEquals("Monday Falhou: ", "26-March-2001",
			JsonHackerRank2.openAndClosePrices("23-March-2001", "15-August-2001", "Monday"));
	Assert.assertEquals("Tuesday Falhou: ", "27-March-2001",
			JsonHackerRank2.openAndClosePrices("23-March-2001", "15-August-2001", "Tuesday"));
	Assert.assertEquals("Wednesday Falhou: ", "28-March-2001",
			JsonHackerRank2.openAndClosePrices("23-March-2001", "15-August-2001", "Wednesday"));
	Assert.assertEquals("Thursday Falhou: ", "29-March-2001",
			JsonHackerRank2.openAndClosePrices("23-March-2001", "15-August-2001", "Thursday"));
	Assert.assertEquals("Friday Falhou: ", "23-March-2001",
			JsonHackerRank2.openAndClosePrices("23-March-2001", "15-August-2001", "Friday"));
	Assert.assertEquals("Saturday Falhou: ", "24-March-2001",
			JsonHackerRank2.openAndClosePrices("23-March-2001", "15-August-2001", "Saturday"));
	Assert.assertEquals("Sunday Falhou: ", "25-March-2001",
			JsonHackerRank2.openAndClosePrices("23-March-2001", "15-August-2001", "Sunday"));
    }

    @Test
    public void test24March() {
	Assert.assertEquals("Monday Falhou: ", "26-March-2001",
			JsonHackerRank2.openAndClosePrices("24-March-2001", "15-August-2001", "Monday"));
	Assert.assertEquals("Tuesday Falhou: ", "27-March-2001",
			JsonHackerRank2.openAndClosePrices("24-March-2001", "15-August-2001", "Tuesday"));
	Assert.assertEquals("Wednesday Falhou: ", "28-March-2001",
			JsonHackerRank2.openAndClosePrices("24-March-2001", "15-August-2001", "Wednesday"));
	Assert.assertEquals("Thursday Falhou: ", "29-March-2001",
			JsonHackerRank2.openAndClosePrices("24-March-2001", "15-August-2001", "Thursday"));
	Assert.assertEquals("Friday Falhou: ", "30-March-2001",
			JsonHackerRank2.openAndClosePrices("24-March-2001", "15-August-2001", "Friday"));
	Assert.assertEquals("Saturday Falhou: ", "24-March-2001",
			JsonHackerRank2.openAndClosePrices("24-March-2001", "15-August-2001", "Saturday"));
	Assert.assertEquals("Sunday Falhou: ", "25-March-2001",
			JsonHackerRank2.openAndClosePrices("24-March-2001", "15-August-2001", "Sunday"));
    }

    @Test
    public void test25March() {
	Assert.assertEquals("Monday Falhou: ", "26-March-2001",
			JsonHackerRank2.openAndClosePrices("25-March-2001", "15-August-2001", "Monday"));
	Assert.assertEquals("Tuesday Falhou: ", "27-March-2001",
			JsonHackerRank2.openAndClosePrices("25-March-2001", "15-August-2001", "Tuesday"));
	Assert.assertEquals("Wednesday Falhou: ", "28-March-2001",
			JsonHackerRank2.openAndClosePrices("25-March-2001", "15-August-2001", "Wednesday"));
	Assert.assertEquals("Thursday Falhou: ", "29-March-2001",
			JsonHackerRank2.openAndClosePrices("25-March-2001", "15-August-2001", "Thursday"));
	Assert.assertEquals("Friday Falhou: ", "30-March-2001",
			JsonHackerRank2.openAndClosePrices("25-March-2001", "15-August-2001", "Friday"));
	Assert.assertEquals("Saturday Falhou: ", "31-March-2001",
			JsonHackerRank2.openAndClosePrices("25-March-2001", "15-August-2001", "Saturday"));
	Assert.assertEquals("Sunday Falhou: ", "25-March-2001",
			JsonHackerRank2.openAndClosePrices("25-March-2001", "15-August-2001", "Sunday"));
    }

    @Test
    public void test29March() {
	Assert.assertEquals("Monday Falhou: ", "02-April-2001",
			JsonHackerRank2.openAndClosePrices("29-March-2001", "15-August-2001", "Monday"));
	Assert.assertEquals("Tuesday Falhou: ", "03-April-2001",
			JsonHackerRank2.openAndClosePrices("29-March-2001", "15-August-2001", "Tuesday"));
	Assert.assertEquals("Wednesday Falhou: ", "04-April-2001",
			JsonHackerRank2.openAndClosePrices("29-March-2001", "15-August-2001", "Wednesday"));
	Assert.assertEquals("Thursday Falhou: ", "29-March-2001",
			JsonHackerRank2.openAndClosePrices("29-March-2001", "15-August-2001", "Thursday"));
	Assert.assertEquals("Friday Falhou: ", "30-March-2001",
			JsonHackerRank2.openAndClosePrices("29-March-2001", "15-August-2001", "Friday"));
	Assert.assertEquals("Saturday Falhou: ", "31-March-2001",
			JsonHackerRank2.openAndClosePrices("29-March-2001", "15-August-2001", "Saturday"));
	Assert.assertEquals("Sunday Falhou: ", "01-April-2001",
			JsonHackerRank2.openAndClosePrices("29-March-2001", "15-August-2001", "Sunday"));
    }

}
