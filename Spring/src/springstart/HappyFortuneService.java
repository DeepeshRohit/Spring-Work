package springstart;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Today you will do better ";
	}

}
