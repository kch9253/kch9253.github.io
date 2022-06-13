import java.util.Scanner;

// p237 1번 배열을 사용하여 극장 예매 프로그램 만들기
public class Drill1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] seat = { "00", "00", "00", "00", "00", "00", "00", "00", "00", "00" };

		while (true) {
			System.out.print("좌석을 예약하시겠습니까? (1.예, 2.아니오)");
			int i = scan.nextInt();
			if (i == 1) {
				System.out.println("=좌석현황= 01 : 이선좌, 00 :빈좌석");
				System.out.println("=============================");
				System.out.println("01 02 03 04 05 06 07 08 09 10");
				System.out.println("=============================");
				for (int a = 0; a < seat.length; a++) {
					System.out.print(seat[a] + " ");
				}

				System.out.print("원하는 좌석을 입력하십시오.");
				int j = scan.nextInt();

				if (j > 0 && j <= 10) {
					// 이선좌를 구현하려면??
					if (!seat[j - 1].equals("01")) {
						seat[j - 1] = "01";
//								System.out.println("=좌석현황= 01 : 이선좌, 00 :빈좌석");
//								System.out.println("=============================");
//								System.out.println("01 02 03 04 05 06 07 08 09 10");
//								System.out.println("=============================");
//								for (int a = 0; a < seat.length; a++) {
//									System.out.print(seat[a] + " ");
//								}
						System.out.println("예약 되었습니다.");
						continue;
					} else {
						System.out.println("이미 선택된 좌석입니다.");
						continue;
					}
				} else {
					System.out.println("잘못된 입력입니다.");
					continue;
				}

			} else if (i == 2) {
				System.out.println("종료합니다.");
				break;
			} else {
				System.out.println("잘못된 입력입니다.");
				continue;
			}
		}
	}
}
