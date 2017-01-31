
public class Human {
	private String name;
	public final int grownUpAge = 18;
	private static int countHumans = 0;
	
	public Human(String name) {		
		this.name = name;
		countHumans++;
	}

	public String getName() {
		return this.name;
	}

	public static int getCountHumans() {
		return countHumans;
	}	
}
