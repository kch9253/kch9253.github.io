

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mybeans.FirstComponent;
import mybeans.SecondComponent;
import mybeans.ThirdComponent;

public class TestComponent {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("myconfig.xml");
		ThirdComponent third = context.getBean(ThirdComponent.class);
		third.printValue();
		
		
//		SecondComponent second = context.getBean(SecondComponent.class);
//		System.out.println(second);
//		
//		FirstComponent comp = context.getBean(FirstComponent.class);
//		second.setNeed(comp);
//		
//		second.myServiceMethod();
		
//		FirstComponent comp = context.getBean(FirstComponent.class);
//		comp.Hello();
//		
//		FirstComponent byName = context.getBean("firstComp" , FirstComponent.class);
//		byName.Hello();
//		
//		System.out.println(comp == byName);
	}
}
