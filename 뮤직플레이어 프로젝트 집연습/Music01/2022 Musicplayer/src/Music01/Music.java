package Music01;

public class Music {
	// ���ǿ� ���� ������ ������ ���ִ� Model -> Value Object (VO Class)

		// �뷡����, �����̸�, �뷡�� �÷��� Ÿ��, �뷡�� ���

		private String title;
		private String Singer;
		private int playTime;
		private String musicPatch;

		// �������� �߰��� �� �� �ִ� �����ڸ޼ҵ� �����
		public Music(String title, String Singer, int playTime, String musicPatch) {
			this.title = title;
			this.Singer = Singer;
			this.playTime = playTime;
			this.musicPatch = musicPatch;

		}

		// ������ ������ �� �� �ִ� getter()����
		public String getTilte() {
			return title;

		}

		public String getSinger() {
			return Singer;
		}

		public int getplayTime() {
			return playTime;
		}

		public String getmusicPatch() {
			return musicPatch;
		}

	}
