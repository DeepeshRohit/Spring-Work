package springstart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
	
		Coach bc=  context.getBean("myCoach",Coach.class);
	
	System.out.println(bc.getDailyWorkout());
	
	System.out.println(bc.getDailyFortune());
	
	context.close();
	 }

}
 