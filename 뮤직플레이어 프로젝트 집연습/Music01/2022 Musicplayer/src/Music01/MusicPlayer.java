package Music01;

import java.util.ArrayList;

import javazoom.jl.player.MP3Player;

public class MusicPlayer {

	// 어러개의 음악을 담을 수 있는 어레이 리스트 생성하자

	ArrayList<Music> list = new ArrayList<>();
	MP3Player mp3 = new MP3Player();
	// 플레이 되고있는 곡의 인덱스 번호를 기억하기 위한 변수생성
	int num = 0;
	Music song;
	// 여러개의 음악을 list에 추가해줄 생성자 메소드

	public MusicPlayer() {

		list.add(new Music("라일락", "아이유", 100, "d://E.KCH/abc.mp3"));
		list.add(new Music("on the greoun", "로제", 90, "d://E.KCH/2.mp3"));
		list.add(new Music("parachute", "John K", 100, "d://E.KCH/3.mp3"));
		list.add(new Music("peaches", "Justin Bieber", 100, "d://E.KCH/7.mp3"));
		//list.add(new Music("Rollin", "브레이브 걸스", 110, "Music/rollin.mp3"));

	}

	// 노래를 재생하기 위한 메소드 생성
	public Music play() {

		// 재생의 조건을 주자 만약 현재 재생되고 있는 노래가 있다면
		// 없을때에만 노래를 재상한다.
		// isPlaying() : 재생되고 있는 음악이 있다라고 하면 True 재생되는 노래가 없다 False
		song = list.get(num);
		if (!mp3.isPlaying()) {

			mp3.play(song.getmusicPatch());
		}

		return song;
	}

	// 음악 재생시 정보를 보여주는 메소드 생성
	public String musicInfo(Music song) {

		return song.getTilte() + ", " + song.getSinger() + ", " + changeTime(song);
	}

	// 재생시간을 분/초로 나눠주는 메소드
	public String changeTime(Music song) {

		return (song.getplayTime() / 60) + "분" + (song.getplayTime() % 60) + "초";
	}

	// 음악 재생을 멈춰줄 수 있는 메소드
	public void stop() {
		if (mp3.isPlaying()) {
			mp3.stop();
		}
	}

	// 다음 곡을 재생하기 위한 메소드
	public Music nextPlay() {
		if (num < list.size() - 1) {
			num++;
		} else {
			num = 0;
		}

		// 현재 재생되고있는 노래가 있다면 곡을 정지하고
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

		// 현재 기억하고 있는 num에서 이전으로 돌아가기 위한 처리가 필요
		song = list.get(num);
		mp3.play(song.getmusicPatch());
		return song;

	}

}
