package com.estrutura.dados.dates;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public class Solution {
    public static void main(String[] args) throws IOException {
	BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	//	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	//	int datesCount = Integer.parseInt(bufferedReader.readLine().trim());
	//
	//	List<String> dates = IntStream.range(0, datesCount).mapToObj(i -> {
	//	    try {
	//		return bufferedReader.readLine();
	//	    } catch (IOException ex) {
	//		throw new RuntimeException(ex);
	//	    }
	//	})
	//			.collect(toList());

	List<String> dates2 = new ArrayList<>();
	dates2.add("20th Oct 2052");
	dates2.add("6th Aug 1999");
	dates2.add("27th Jan 1900");

	List<String> result = Result.reformatDate(dates2);
	//
	//	bufferedWriter.write(
	//			result.stream()
	//					.collect(joining("\n"))
	//					+ "\n"
	//	);
	//
	//	bufferedReader.close();
	//	bufferedWriter.close();
    }
}

class Result {

    /*
     * Complete the 'reformatDate' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY dates as parameter.
     */

    public static List<String> reformatDate(List<String> dates) {
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy", Locale.US);

	List<String> result = new ArrayList<>();
	for (String date : dates) {
	    //Convert ordinal numbers to numbers
	    final String strDateTest = date.replaceAll("(?<=[0-9])[A-z]+", "");
	    try {
		//Convert String to LocalDateTime
		LocalDateTime formatDate = LocalDateTime
				.ofInstant(simpleDateFormat.parse(strDateTest).toInstant(), TimeZone.getDefault().toZoneId());
		//Define the output format
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		//Add into the list
		result.add(formatDate.format(dateTimeFormatter));
	    } catch (ParseException pE) {
		pE.printStackTrace();
	    }
	}
	System.out.println(result.toString());
	// Write your code here
	return result;

    }

}
