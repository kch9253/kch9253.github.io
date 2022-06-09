import java.util.Scanner;

// 도서 관리 프로그램 
// 목록보기
// 가격순으로 (오름차순, 내림차순 선택가능)
// 분야를 선택해서 해당 분야만 보기

//1.  작별인사 / 김영하 / 복복서가 / 장편소설 / 12600원
//2. 불편한편의점 / 김호연 / 나무옆의자 / 장편소설 / 12600원
//3. 지금알고있는걸 그때도 알았더라면 / 류시화 / 열림원 / 시집 / 8100원
//4. 코스모스 / 칼 세이건 / 사이언스북스 / 과학 공학 / 16650원
//5. 여행의 이유 / 김영하 / 문학동네 / 에세이 / 12150원

// -----
// 상세보기
// 도서 정보수정
// 도서 정보추가

// 장르선택목록 / 장르에따른 가격과 도서이름,작가출력,출판출력


// 장르를 입력하면 해당 장르목록에 관련된 책제목 , 작가 , 출판 , 장르 , 가겨 다 뜨게하고
// 반대로 책제목 입력하면 나머지 정보들 전부뜨게하는
// 배열 선언 제목 , 작가 , 출판 , 장르 , 가격  총 5개

public class Main {
	String[] name = new String[5]; // 제목
	String[] genre = new String[5]; // 장르
	String[] Writer = new String[5]; // 작가
	String[] Publishing = new String[5]; // 출판
	int[] won = new int[5]; // 가격
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.print("해당번호를 입력하여 장르선택을하세요: " + "1.장편소설/" + "2.시집/" + "3.과학공학/" + "4.에세이" );
			int number = scan.nextInt();
			System.out.println("------------------------------------------------");
			if (number == 1) {
				System.out.println("장편소설 리스트입니다.");
				System.out.println("제목:작별인사");				
			} else if (number == 2) {
				System.out.println("시집 리스트입니다.");
			} else if (number == 3) {
				System.out.println("과학공학 리스트입니다.");
			} else if (number == 4) {
				System.out.println("에세이 리스트입니다.");
			} else {
				return;
			} 
		}
		
		
//		System.out.println("해당번호를 입력하여 장르선택을하세요: " + "1.장편소설/" + "2.시집/" + "3.과학공학/" + "4.에세이");
//		int number = scan.nextInt();
//		for (int i = 0; i < 5; i++) {
//				
//			if (number == 1) {
//				System.out.println("장편소설 리스트입니다.");
//			} else if (number == 2) {
//				System.out.println("시집 리스트입니다.");
//			}
//					
//		}
	}	
}
