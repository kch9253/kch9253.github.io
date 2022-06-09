import java.util.Arrays;
import java.util.Scanner;

public class MovieTest {
	
	public class Book1 {
		private String title; // 제목
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
		//싱글톤...MovieMgr을 mgr이름으로 객체 생성...getInstance로 생성한 객체를 받아온다.
		
		//영화 정보 추가하기
		public void add(Book1 m) {
			movies[index++] = m;
		}
		
		// 영화 정보 모두 검색하기
		public Book1[] search() {
			Book1[] ms = new Book1[index];
			for(int i = 0; i < index; i++) {
				if(movies[i] != null) {
					ms[i] = movies[i];
				}
			}
			return ms;
		}
		
		// 영화 제목으로 영화 찾기
		// equals()가 아닌 contains()로 키워드가 포함되면 검색에 걸림
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
			
			//null 값을 추리기 위해서 다시 for문을 동작시킴.
			Book1[] ms2 = new Book1[count];
			if(count > 0) System.arraycopy(ms, 0, ms2, 0, count);
			return ms2;
		}

		// 감독명으로 영화 찾기
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
					//뒤에서부터 하나씩 넣어주는 것. ms[1], ms[0]
				}
			}
			return ms;
		}

		// 장르로 영화 찾기
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

		// 이름으로 영화 정보 삭제하기
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
		
		// 배열의 길이
		public int getSize() {
			return index;
		}
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("<<도서 관리 프로그램>>");
		//getInstance()로 MovieMgr 객체 받아옴..
		MovieMgrImpl mvManager = MovieMgrImpl.getInstance();
		
		boolean flag = true;
		while(flag) {
			System.out.println("1. 도서정보 입력");
			System.out.println("2. 도서정보 전체 검색");
			System.out.println("3. 도서명 검색");
			System.out.println("4. 도서 저자별 검색");
			System.out.println("5. 도서 장르별 검색");
			System.out.println("6. 도서 정보 삭제");
			System.out.println("0. 종료");
			
			int selectNum = sc.nextInt();
			switch(selectNum) {
			case 1:
				System.out.print("제목을 입력해주세요 : ");
				String mvName = sc.next();
				System.out.print("저자를 입력해주세요 : ");
				String mvDir = sc.next();
				System.out.print("출판을 입력해주세요 : ");
				String mvSumm = sc.next();
				System.out.print("장르를 입력해주세요 : ");
				String mvGre = sc.next();
				System.out.print("가격을 입력해주세요 : ");
				int mvGr = sc.nextInt();
				//mvManager.add(new Movie(mvName, mvDir, mvGr, mvGre, mvSumm));
				System.out.println("성공적으로 추가되었습니다.");
				break;
			case 2:
				System.out.println(Arrays.toString(mvManager.search()));
				break;
			case 3:
				System.out.println("찾고자하는 제목을 입력하세요 : ");
				mvName = sc.next();
				System.out.println(Arrays.toString(mvManager.search(mvName)));
				break;
			case 4:
				System.out.println("찾고자하는 감독을 입력하세요 : ");
				mvName = sc.next();
				System.out.println(Arrays.toString(mvManager.searchDirector(mvName)));
				break;
			case 5:
				System.out.print("찾고자하는 장르를 입력하세요 : ");
				sc.nextLine();
				mvGre = sc.next();
				System.out.println(Arrays.toString(mvManager.searchGenre(mvGre)));
				break;
			case 6:
				System.out.print("삭제하고자하는 제목을 입력하세요 : ");
				mvName = sc.next();
				mvManager.delete(mvName);
				System.out.println("삭제완료");
				break;
			case 0:
				flag=false;
				break;
			}			
		}
	}

}
