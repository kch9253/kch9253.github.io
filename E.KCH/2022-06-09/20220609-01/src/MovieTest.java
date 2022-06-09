import java.util.Arrays;
import java.util.Scanner;

public class MovieTest {
	
	public class Book1 {
		private String title; // ����
		private String director; //
		private int grade;
		private String genre;
		private String summary;
		
		public Book1(){}
		
		public Book1(String title, String director, int grade, String genre) {
			super();
			this.title = title;
			this.director = director;
			this.grade = grade;
			this.genre = genre;
		}
		
		public Book1(String title, String director, int grade, String genre, String summary) {
			super();
			this.title = title;
			this.director = director;
			this.grade = grade;
			this.genre = genre;
			this.summary = summary;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDirector() {
			return director;
		}

		public void setDirector(String director) {
			this.director = director;
		}

		public int getGrade() {
			return grade;
		}

		public void setGrade(int grade) {
			this.grade = grade;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public String getSummary() {
			return summary;
		}

		public void setSummary(String summary) {
			this.summary = summary;
		}

		@Override
		public String toString() {
			return "title=" + title + ", director=" + director + ", grade=" + grade + ", genre=" + genre
					+ ", summary=" + summary +"\n";
		}
			
		
	}
	
	
	
	public interface MovieMgr {
		void add(Book1 m);
		Book1[] search();
		Book1[] search(String title);
		Book1[] searchDirector(String name);
		Book1[] searchGenre(String genre);
		void delete(String title);
		int getSize();
	}
	
	
	public static class MovieMgrImpl implements MovieMgr {
		private Book1[ ] movies = new Book1[100];
		private int index;
		private static MovieMgrImpl mgr = new MovieMgrImpl();
		private MovieMgrImpl() {}
		public static MovieMgrImpl getInstance() {
			return mgr;
		}
		//�̱���...MovieMgr�� mgr�̸����� ��ü ����...getInstance�� ������ ��ü�� �޾ƿ´�.
		
		//��ȭ ���� �߰��ϱ�
		public void add(Book1 m) {
			movies[index++] = m;
		}
		
		// ��ȭ ���� ��� �˻��ϱ�
		public Book1[] search() {
			Book1[] ms = new Book1[index];
			for(int i = 0; i < index; i++) {
				if(movies[i] != null) {
					ms[i] = movies[i];
				}
			}
			return ms;
		}
		
		// ��ȭ �������� ��ȭ ã��
		// equals()�� �ƴ� contains()�� Ű���尡 ���ԵǸ� �˻��� �ɸ�
		public Book1[] search(String title) {
			int i = 0; int count = 0;
			Book1[] ms = new Book1[index];
			for(Book1 m : movies) {
				if(m == null) continue;
				else if(m.getTitle().contains(title)) {
					ms[i++] = m;
					count++;
				}
			}
			
			//null ���� �߸��� ���ؼ� �ٽ� for���� ���۽�Ŵ.
			Book1[] ms2 = new Book1[count];
			if(count > 0) System.arraycopy(ms, 0, ms2, 0, count);
			return ms2;
		}

		// ���������� ��ȭ ã��
		public Book1[] searchDirector(String name) {
			int size = 0;
			for(int i = 0; i < index; i++) {
				if(movies[i] == null) continue;
				else if(movies[i].getDirector().equals(name)) size++; //2
			}
			Book1[] ms = new Book1[size];
			for(int i = 0; i < index; i++) {
				if(movies[i].getDirector().equals(name)) {
					ms[--size] = movies[i];
					//�ڿ������� �ϳ��� �־��ִ� ��. ms[1], ms[0]
				}
			}
			return ms;
		}

		// �帣�� ��ȭ ã��
		public Book1[] searchGenre(String genre) {
			int count = 0; int i = 0;
			Book1[] ms = new Book1[index];
			for(Book1 m : movies) {
				if(m == null) continue;
				else if(m.getGenre().equals(genre)) {
					ms[i++] = m;
					count++;
				}
			}
			Book1[] ms2 = new Book1[count];
			for(int j = 0; j < count; j++) {
				ms2[j] = ms[j];
			}
			return ms2;
		}

		// �̸����� ��ȭ ���� �����ϱ�
		public void delete(String title) {
			int count = 0;
			for(Book1 m : movies) {
				if(m == null) continue;
				else if(m.getTitle().equals(title)) count++;
			}
			Book1[] ms = new Book1[index-count];
			int idx = 0;
			for(Book1 m : movies) {
				if(m == null) continue;
				else if(m.getTitle().equals(title)) continue;
				else ms[idx++] = m;
			}
			System.out.println(Arrays.toString(ms));
		}
		
		// �迭�� ����
		public int getSize() {
			return index;
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("<<���� ���� ���α׷�>>");
		//getInstance()�� MovieMgr ��ü �޾ƿ�..
		MovieMgrImpl mvManager = MovieMgrImpl.getInstance();
		
		boolean flag = true;
		while(flag) {
			System.out.println("1. �������� �Է�");
			System.out.println("2. �������� ��ü �˻�");
			System.out.println("3. ������ �˻�");
			System.out.println("4. ���� ���ں� �˻�");
			System.out.println("5. ���� �帣�� �˻�");
			System.out.println("6. ���� ���� ����");
			System.out.println("0. ����");
			
			int selectNum = sc.nextInt();
			switch(selectNum) {
			case 1:
				System.out.print("������ �Է����ּ��� : ");
				String mvName = sc.next();
				System.out.print("���ڸ� �Է����ּ��� : ");
				String mvDir = sc.next();
				System.out.print("������ �Է����ּ��� : ");
				String mvSumm = sc.next();
				System.out.print("�帣�� �Է����ּ��� : ");
				String mvGre = sc.next();
				System.out.print("������ �Է����ּ��� : ");
				int mvGr = sc.nextInt();
				//mvManager.add(new Movie(mvName, mvDir, mvGr, mvGre, mvSumm));
				System.out.println("���������� �߰��Ǿ����ϴ�.");
				break;
			case 2:
				System.out.println(Arrays.toString(mvManager.search()));
				break;
			case 3:
				System.out.println("ã�����ϴ� ������ �Է��ϼ��� : ");
				mvName = sc.next();
				System.out.println(Arrays.toString(mvManager.search(mvName)));
				break;
			case 4:
				System.out.println("ã�����ϴ� ������ �Է��ϼ��� : ");
				mvName = sc.next();
				System.out.println(Arrays.toString(mvManager.searchDirector(mvName)));
				break;
			case 5:
				System.out.print("ã�����ϴ� �帣�� �Է��ϼ��� : ");
				sc.nextLine();
				mvGre = sc.next();
				System.out.println(Arrays.toString(mvManager.searchGenre(mvGre)));
				break;
			case 6:
				System.out.print("�����ϰ����ϴ� ������ �Է��ϼ��� : ");
				mvName = sc.next();
				mvManager.delete(mvName);
				System.out.println("�����Ϸ�");
				break;
			case 0:
				flag=false;
				break;
			}			
		}
	}

}
