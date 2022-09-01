import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mybeans.MyBean;
import mybeans.MyLogic;
import mybeans.MyStatefulObj;

public class IOC_Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("myconfig.xml");
		
		MyStatefulObj fourth = context.getBean("fourth", MyStatefulObj.class);
		System.out.println(fourth.toString());
		
		
		
		
		
		
//		MyStatefulObj third = context.getBean(MyStatefulObj.class);
//		System.out.println(third.toString());
//		third.setName("new-name");
//		third.setNumber(200);
//		
//		MyStatefulObj oneMoretime = context.getBean(MyStatefulObj.class);
//		System.out.println(oneMoretime.toString());
//		System.out.println(third == oneMoretime);
		
		
//		MyLogic logic = context.getBean(MyLogic.class);
//		logic.someMethod();
		
		
//		MyBean b = context.getBean(MyBean.class);
//
//		b.hello();
//		
////		MyBean b2 = (MyBean) context.getBean("first"); // 다운캐스팅 or 인자값으로 넘겨줘서 활용할수있다
//		MyBean b2 = context.getBean("first" , MyBean.class);
//		b2.hello();
//		
//		System.out.println(b == b2); // 같은 값이 true 인 이유는 같은 인스턴스화가 서로 참조하는 값이 같기 때문이다.
	}
}
