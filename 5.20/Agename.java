
// 사용자의 나이와 이름을 입력받아서
// 자기랑 같으면 true 출력하기

import java.util.Scanner;

public class Agename {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// System.out.print("나이를 입력하세요");
		// int age = scan.nextInt();
		
		
		// System.out.print("이름을 입력하세요");
		// String name = scan.nextString();
		
		// System.out.print("이름을 입력하세요");
		// String name2 = scan.nextString();
		
		// // String name3 = (name == name2);
		
		// // System.out.println("나이가 같나요?" + age == age)
		// System.out.println("이름이 같나요?" + (name == name2));
		
		System.out.println("나이를 입력?");
		int age = scan.nextInt();
		// scan.nextLine(); 정수값을 먼저 넣고 스트링 "" 값을 넣을경우 문구열 입력값 자체가 먹지않아서 scan.nextLine(); 을통해
		// 임의로 한칸을 띄어서 스트링 "" 입력값을 먹게해주는데 scan.nextLine(); 이 위로가든 밑으로가든 상관없다
		System.out.println("이름을 입력?");                
		scan.nextLine(); 
		String name = scan.nextLine();
		
		// String name = scan.next(); 문자열을 가지고옴 한줄의 문자열이 아닌 "c h" 이런식으로 스페이스값이 들어간경우 c앞에것만 가져옴 
		
		System.out.println((age == 18) && name.equals("김창희")); // name.equals("") == ""안의 문구가 같은지확인해줌
		
	}
}