package springstart;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class BeanLifeCycleTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		Coach bc = context.getBean("myCoach",Coach.class);
		System.out.println(bc.getDailyWorkout());
		 context.close();
	}

}
