package person;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PersonValidator {
    // 이름, 성 10자 [가-힣] // 자음으로 설정하면안된다.
//	public void isValidName(String name) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("이름입력하세요");
//		String line = scan.next();
//		Pattern p = Pattern.compile("^[가-힣]*$");
//		Matcher m = p.matcher(line);
//		System.out.println(m.matches());
//	}
//	
//	// 나이 정수
//	public void isValidAge(String age) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("나이입력하세요");
//		String line2 = scan.next();
//		Pattern p2 = Pattern.compile("^[0-9]{1,3}$");
//		Matcher m2 = p2.matcher(line2);
//		System.out.println(m2.matches());
//	}
//	
//	// 이메일 50자
//	public void isValidEmail(String email) {
//		Scanner scan = new Scanner(System.in);
//		System.out.println("이메일입력하세요");
//		String line3 = scan.next();
//		Pattern p3 = Pattern.compile("^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$");
//		Matcher m3 = p3.matcher(line3);
//		System.out.println(m3.matches());
//	}
	
	public Map<String, String> isValidName(String name) {
		Map<String, String> map = new HashMap<>();
		if (name != null) {
			int length = name.length();
			if (length == 0 || length > 10) {
				map.put("nameLength", "이름의 글자수는 1 ~ 10자여야 합니다.");
			}
			
			if (name.contains(" ")) {
				map.put("nameSpace", "이름에 공백을 포함할 수 없습니다.");
			}
			
			Pattern p = Pattern.compile("[a-zA-Z가-힣]+");
			Matcher m = p.matcher(name);
			
			if (!m.matches()) {
				map.put("nameChar", "이름은 한글 또는 영문자여야합니다.");
			}
		} else {
			map.put("nameNull", "이름을 입력해주세요.");
		}
		return map;
	}
	
	// 나이 정수
	public Map<String, String> isValidAge(String age) {
		Map<String, String> map = new HashMap<>();
		
		if (age != null) {
			Pattern p = Pattern.compile("\\d+");
			Matcher m = p.matcher(age);
			
			if (!m.matches()) {
				map.put("ageFormat", "나이는 숫자만 허용됩니다.");
			}
			
			int num = Integer.valueOf(age);
			
			if (num < 15 || num > 99) {
				map.put("ageRange", "나이의 범위는 15 - 99세입니다.");
			}
		} else {
			map.put("ageNull", "나이를 입력해주세요.");
		}
		return map;
	}
	
	// 이메일 50자
	public Map<String, String> isValidEmail(String email) {
		Map<String, String> map = new HashMap<>();
		if (email != null) {
			if (email.length() > 50) {
				map.put("emailLength", "이메일은 최대 50자 입니다.");
			}

			Pattern p = Pattern.compile("\\w+@\\w+.\\w+");
			Matcher m = p.matcher(email);
			
			if (!m.matches()) {
				map.put("emailFormat", "이메일 양식이 올바르지 않습니다.");
			}
		} else {
			map.put("emailNull", "이메일을 입력해주세요.");
		}
		return map;
	}
}
