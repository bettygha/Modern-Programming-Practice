package lesson9_Lab_Assignment;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class ExamDate {
	
	private String studentNameString;
	private double testScore;
	public ExamDate(String nameString, double score) {
		this.studentNameString = studentNameString;
		this.testScore = score;
	}

	public static void main(String[] args) {
		List<ExamDate> dataDates = new ArrayList<>() {{
			add(new ExamDate("George", 91.3));
			add(new ExamDate("Tom",88.9 ));
			add(new ExamDate("Rick", 80));
			add(new ExamDate("Harold", 90.8));
			add(new ExamDate("Ignatius", 60.9));
			add(new ExamDate("Anna", 77));
			add(new ExamDate("Susan", 87.3));
			add(new ExamDate("Phil", 99.1));
			add(new ExamDate("Alex", 84));
			
		}
	};
	
	DoubleSummaryStatistics summeryStatistics = dataDates.stream().
			                           mapToDouble(s->s.testScore).summaryStatistics();
	
	
    System.out.println("Min: " + summeryStatistics.getMin());
    System.out.println("Max: " + summeryStatistics.getMax());
    System.out.println("Average: " + summeryStatistics.getAverage());
	

    DoubleSummaryStatistics summary = dataDates.stream().
    		collect(Collectors.summarizingDouble(e->e.testScore));
    
    System.out.println(summary);
    System.out.println("Min: " + summary.getMin());
    System.out.println("Max: " + summary.getMax());
    System.out.println("Average: " + summary.getAverage());
	
}}
