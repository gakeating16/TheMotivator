
public class TheMotivator {
	public void feedback(int score) {
		if (score == 100)
			System.out.println("test was not hard enough");
		else if (score > 90)
			System.out.println("That's great");
		else if (score > 60)
			System.out.println("That's good ");
		else
			System.out.println("that is a huge bummer there :/");
	}
	public static void main(String[] args) {
		TheMotivator tm = new TheMotivator();
		tm.feedback(100);
	}
}