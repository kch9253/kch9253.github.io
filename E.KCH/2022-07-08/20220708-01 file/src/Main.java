import java.io.File;

public class Main {
	public static void main(String[] args) {
//		File file = new File("d:\\E.KCH\\test.txt"); //드라이브>oo폴더>파일이름
//		System.out.println(file.getName()); // 파일이름
//		System.out.println(file.getPath()); // 파일경로 
//		System.out.println(file.exists()); // 파일이 존재하는가? (참,거짓으로 나타남)
//		
//		File f2 = new File("d:\\E.KCH\\asdf.txt");
//		// 파일의 객체는 실제파일이 아니고 외부파일이 있는지없는지 소통하기위한 수단이다 (없는파일을 호출하더라도 새로운 파일객체는 생성가능하다)
//		// 추상적인 객체라고 생각하면된다.
//		System.out.println(f2.getName());
//		System.out.println(f2.getPath());
//		System.out.println(f2.exists());
		
		// d: 이런식으로 하나씩 찾아가는건 절대적인경로다
		File dir = new File("d:\\E.KCH"); // 파일뿐 아니라 폴더를 디렉토리 할수도있다
		System.out.println(dir.getName());
		System.out.println(dir.getPath());
		System.out.println(dir.exists());
		
		System.out.println("파일인가요? " + dir.isFile()); // 해당파일인지 구분하는메소드
		System.out.println("디렉토리인가요? " + dir.isDirectory()); // 디렉토리 자체인지 구분하는 메소드
	}
}
