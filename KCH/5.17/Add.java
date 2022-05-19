// Add

public class Add {
    public static void main(String args[]) {
          // 변수이름 = 소문자로시작 (대소문자 구별)
          // 변수에 숫자도올수있음
          // 공백 X
          // 같은 이름의 변수를 만들수없다 
          


       int x; // 변수 선언 (variable declare) 변수 = 기억을 위한공간 //
       int y; // int = 공간의 크기 = data type (자료형)
       int sum;

       // 초기화 (initialize)
       x = 100; // = 대입연산자 (assignment) 오른쪽값이 왼쪽으로 집어넣어줌 / = (같다) 의미X
       y = 200;
       sum = x + y;
 
       System.out.println(sum);
       return; // return 밑에는 어떠한 문장도 적으면안됨 에러뜸
       //  System.out.println(); = ()안에 마지막값을 입력해주면 return은 생략해도됨


       System.out.println(x - y);

       int minus;
       minus = x - y;
       System.out.println(minus);
    }
}