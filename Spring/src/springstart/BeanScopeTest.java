package springstart;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class BeanScopeTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach bc = context.getBean("myCoach",Coach.class);
		Coach theCoach = context.getBean("myCoach",Coach.class);
		 boolean results =(bc==theCoach);
		 System.out.println("\n point to same object" + results);
		 System.out.println("\nMemory Location thecoach"+bc);
		 System.out.println("\nMemory Location thecoach"+theCoach);
		 context.close();
	}

}
