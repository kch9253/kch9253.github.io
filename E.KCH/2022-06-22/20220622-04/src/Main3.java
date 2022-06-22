import java.util.Scanner;

class Menu1 {
	public static final int MAX = 10;
}

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		int ord = 10;	//사용자가 입력할 메뉴를 저장하는 변수
		int num = 0;    //메뉴의 개수를 저장할 변수
		int x = 0;      //조건문 안에 들어갈 변수, 음식의 값을 저장하는 변수
		int total = 0;  //총 금액
		
		while(ord != 0) {  //사용자가 메뉴 입력시 0을 입력할 때까지 반복
			System.out.println("주문하실 메뉴를 입력해주세요.\n 1.짜장면  2.짬뽕  3.볶음밥 ");
			ord = Integer.parseInt(sc.nextLine());
			System.out.println("주문하실 메뉴의 개수를 입력해주세요.");
			num = Integer.parseInt(sc.nextLine());
			
			if(ord == 1) {
				x = 2500;
			} else if(ord == 2) {
				x = 4000;
			} else if(ord == 3) {
				x = 4000;
			} 
			total += x*num;   
			System.out.print("종료하시겠습니까? 0.종료  5.계속\n");
			ord = Integer.parseInt(sc.nextLine());		
		}
		System.out.println("주문하신 메뉴의 총 금액은 "+total+"원 입니다.");
		
		
		
		
	}
}
