package com.estrutura.dados.dates;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Solution2 {
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

class Result2 {

    /*
     * Complete the 'reformatDate' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY dates as parameter.
     */

    public static List<String> reformatDate(List<String> dates) {
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM yyyy", Locale.US);
	SimpleDateFormat simpleDateFormatFinal = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

	List<String> result = new ArrayList<>();
	for (String date : dates) {
	    //Convert ordinal numbers to numbers
	    final String strDateTest = date.replaceAll("(?<=[0-9])[A-z]+", "");
	    try {
		//Convert String to LocalDateTime
		final Date formatedDate = simpleDateFormat.parse(date);
		//Add into the list
		result.add(simpleDateFormatFinal.format(formatedDate));
	    } catch (ParseException pE) {
		pE.printStackTrace();
	    }
	}
	System.out.println(result.toString());
	// Write your code here
	return result;

    }

}
