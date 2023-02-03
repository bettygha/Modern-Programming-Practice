package lesson9_StreamExcersice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class SummaryStats {
	public static void main(String[] args) {
		List<String> words = new ArrayList<>(Arrays.asList("Java","Spring","VB.Net"));
		
		IntSummaryStatistics summaryStatistics = words.stream().collect(Collectors.summarizingInt(String::length));
		
		System.out.println(summaryStatistics.getMax());
		System.out.println(summaryStatistics.getMin());
		System.out.println(summaryStatistics.getCount());
		System.out.println(summaryStatistics.getAverage());
		System.out.println(summaryStatistics.getSum());
		
	}

}
