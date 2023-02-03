package Threads;


public class lab_4{
	public static void main(String[] args) {
		
		int start = 1 ;
		int end = 1000000;
		for(int i = 0 ; i <=5 ;i++) {
			PrintPrime1 prime1 = new PrintPrime1(start, end,i);
			start = start+ end;
			end = end + 1000000;
			prime1.start();
			try {
				prime1.join();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			try {
				prime1.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			
		}
	
		
		/* Thread prime1 = new PrintPrime1(1,1000000);
		prime1.start();
		
		Thread prime2 = new PrintPrime1(100001,200000);
		prime2.start();
		
		Thread prime3 = new PrintPrime1(200001,300000);
		prime3.start();
		
		Thread prime4 = new PrintPrime1(300001,400000);
		prime4.start();
		
		Thread prime5 = new PrintPrime1(400001,500000);
		prime5.start();
		
		Thread prime6 = new PrintPrime1(500001,600000);
		prime6.start();
		
		Thread prime7 = new PrintPrime1(600001,700000);
		prime7.start();
		
		Thread prime8 = new PrintPrime1(700001,800000);
		prime8.start();
		
		Thread prime9 = new PrintPrime1(800001,900000);
		prime9.start();
		
		Thread prime10 = new PrintPrime1(900001,100000);
		prime10.start(); */
		
	}
	
	public boolean isPrime(int x ) {
		if(x < 2) {
			return false;
		}
		else {
			for(int i = 2; i< x ;i++) {
				if(x % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
	

}



