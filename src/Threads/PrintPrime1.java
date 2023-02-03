package Threads;

import java.util.TreeSet;

public class PrintPrime1 extends Thread{
	int start ;
	int end ;
	int threadNumber;
	public PrintPrime1(int i , int j , int z) {
		
		this.start = i;
		this.end = j;
		this.threadNumber = z;
	}
	public void run() {
		lab_4 lab = new lab_4();

		for(int i = start ; i < end;i++) {
			if(lab.isPrime(i)) {
				System.out.println(i + " From thread number: " + threadNumber);

			}
			

		}
		
		
	}
}
