package springstart;

public class TrackCoach implements Coach {
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}
	public TrackCoach(FortuneService theFortuneService) {
		this.fortuneService= theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Run hard";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "you will do it "+fortuneService.getFortune();
	}
	public void doStartUpStuff() {
		
		System.out.println("Trackcoach inside init method doStartUpStuff");
	}
public void doCleanUpStuff() {
		
		System.out.println("Trackcoach inside destroy method doCleanUpStuff");
	}
	

}
