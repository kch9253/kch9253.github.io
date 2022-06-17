
public class Main2 {
	public static void main(String[] args) {
		String s = null;
		
		try {
			String local = "지역변수";
			
			int[] arr = new int[0];
			arr[1] = 10;
			
			int div = 10 / 0; // 여기부터실행 예외발생 = 밑에 캐치값을 넣어주지않았기때문에 정상종료 프린트가 출력이아닌 그냥 강제종료
			s.equals("asdf");
			
			System.out.println("실행되나?"); // 얘는 실행안됨
			
			
			
			
		} catch (NullPointerException e) {
			
			//System.out.println(local); // 위에 try {} 안에 local 값을 캐치값 {} 안에 불러올수없다.
 			
			System.out.println("널 포인트 익셉션 처리");
			//e.printStackTrace(); // 이렇게 출력할경우 NullPointerException 오류가뜬다 
		}  catch (ArithmeticException e) { // 10 / 0 을 못나누니 에러가뜬 ArithmeticException 의 값을 예외처리했다
			System.out.println("수 익셉션 처리");
		}  catch (ArrayIndexOutOfBoundsException e) { // 위에 arr 배열값을 0으로 지정해주고 배열 1번을 불렀으니 ArrayIndexOutOfBoundsException 에러뜸 그것을 처리하기위해 캐치함
			System.out.println("인덱스 예외처리");
		}  catch (Exception e) { // Exception : 모든예외를 처리하는 기능 (밑에 주석처리한 예외처리값 대신해서 모두 처리할수있음)
			System.out.println("모든예외는 여기서 잡힘.");
		} // Exception 는 모든예외를 처리하는 값이라서 ★부모★ 의값이다 부모의값을 맨밑에 놔둬야 프로그램 흐름대로 위에서 아래로 내려오는 오류들을 캐치하여 예외처리하는 방식이다.  ★Exception 는 항상 맨 밑에 둬야한다 꼭★ 
		System.out.println("정상 종료");
	}
}
