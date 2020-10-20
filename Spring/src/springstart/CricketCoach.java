 package springstart;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	
	private String emailAddress;
	
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmail");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

	

	
	public CricketCoach() {
		System.out.println("CricketCoach : inside No-arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach : inside Setter method");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice batting for 1 hr  Daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}


}
