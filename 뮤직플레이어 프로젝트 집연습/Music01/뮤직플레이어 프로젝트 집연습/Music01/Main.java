package Music01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// View�� �Ǵ� �κ�
		Scanner sc = new Scanner(System.in);
		// �ݺ����� ���� ���θ� Ȯ���� �� �ִ� ����
		boolean isOk = true;
		MusicPlayer mp = new MusicPlayer();

		Music song;

		// mp3�� ����ؼ� ����� �� �ֵ��� �ݺ������� �ۼ�!
		while (isOk)// ����ڰ� �� �� �ִ� �޴����� ��� ����
		{
			System.out.print("[1]��� [2]���� [3]������ [4]������ [5]���� >>");
			int menu = sc.nextInt();

			if (menu == 1) {
				song = mp.play();
				System.out.println(mp.musicInfo(song));
			} else if (menu == 2) {

				mp.stop();

			} else if (menu == 3) {

				song = mp.nextPlay();
				System.out.println(mp.musicInfo(song));

			} else if (menu == 4) {
				song = mp.prePlay();
				System.out.println(mp.musicInfo(song));

			} else if (menu == 5) {
				System.out.println("����Ǿ����ϴ�.");

				isOk = false;
			}

		}

	}

}
