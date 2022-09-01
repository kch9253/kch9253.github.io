package mybeans;

import org.springframework.stereotype.Component;

@Component("firstComp")
public class FirstComponent {
	public void Hello() {
			System.out.println("어노테이션으로 bean 설정하기 연습");
	}
}









