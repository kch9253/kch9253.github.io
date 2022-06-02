
public class TTest {
		public static void main(String args[]) {			
			T t1 = new T("홍길동" , 50 , 30 , 50);
			T t2 = new T("길동이" , 70 , 40 , 60);
			T t3 = new T("마라탕" , 80 , 30 , 90);
		    
			
			
			
			int avg1 = t1.getAverage();
			int avg2 = t2.getAverage();
			int avg3 = t3.getAverage();
			
					
			int sum = avg1 + avg2 + avg3;
			int totlaAvg = sum / 3;
			 		
			
			t1.printAll();
			t2.printAll();
			t3.printAll();
			
			System.out.println("학생 3명 평균점수: " + totlaAvg);
			
	
				
		
		}
}
