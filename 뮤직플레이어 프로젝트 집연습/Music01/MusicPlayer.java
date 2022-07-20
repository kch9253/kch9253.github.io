package Music01;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {

	// ����� ������ ���� �� �ִ� ��� ����Ʈ ��������

	ArrayList<Music> list = new ArrayList<>();
	MP3Player mp3 = new MP3Player();
	// �÷��� �ǰ��ִ� ���� �ε��� ��ȣ�� ����ϱ� ���� ��������
	int num = 0;
	Music song;
	// �������� ������ list�� �߰����� ������ �޼ҵ�

	public MusicPlayer() {

		list.add(new Music("���϶�", "������", 40, "Music/lilac.mp3"));
		list.add(new Music("on the greoun", "����", 90, "Music/on the ground.mp3"));
		list.add(new Music("parachute", "John K", 100, "Music/parachute.mp3"));
		list.add(new Music("peaches", "Justin Bieber", 10, "Music/peaches.mp3"));
		list.add(new Music("Rollin", "�극�̺� �ɽ�", 110, "Music/rollin.mp3"));

	}

	// �뷡�� ����ϱ� ���� �޼ҵ� ����
	public Music play() {

		// ����� ������ ���� ���� ���� ����ǰ� �ִ� �뷡�� �ִٸ�
		// ���������� �뷡�� ����Ѵ�.
		// isPlaying() : ����ǰ� �ִ� ������ �ִٶ�� �ϸ� True ����Ǵ� �뷡�� ���� False
		song = list.get(num);
		if (!mp3.isPlaying()) {

			mp3.play(song.getmusicPatch());
		}

		return song;
	}

	// ���� ����� ������ �����ִ� �޼ҵ� ����
	public String musicInfo(Music song) {

		return song.getTilte() + ", " + song.getSinger() + ", " + changeTime(song);
	}

	// ����ð��� ��/�ʷ� �����ִ� �޼ҵ�
	public String changeTime(Music song) {

		return (song.getplayTime() / 60) + "��" + (song.getplayTime() % 60) + "��";
	}

	// ���� ����� ������ �� �ִ� �޼ҵ�
	public void stop() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
	}

	// ���� ���� ����ϱ� ���� �޼ҵ�
	public Music nextPlay() {
		if (num < list.size() - 1) {
			num++;
		} else {
			num = 0;
		}

		// ���� ����ǰ��ִ� �뷡�� �ִٸ� ���� �����ϰ�
		if (mp3.isPlaying()) {
			stop();

		}

		song = list.get(num);
		mp3.play(song.getmusicPatch());
		return song;
	}

	public Music prePlay() {
		if (num <= 0) {
			num = list.size() - 1;
		} else {
			num--;
		}

		if (mp3.isPlaying()) {
			stop();
		}

		// ���� ����ϰ� �ִ� num���� �������� ���ư��� ���� ó���� �ʿ�
		song = list.get(num);
		mp3.play(song.getmusicPatch());
		return song;

	}

}
