package springstart;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterCoach {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach bc =  context.getBean("myCricketCoach",CricketCoach.class);
		
		context.close();
	}

}
