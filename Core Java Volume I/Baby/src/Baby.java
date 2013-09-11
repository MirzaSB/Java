public class Baby {
	int servings;
	void feed(int servings) {
		this.servings = servings + servings;
		System.out.println(servings);
	}
	void poop() {
		System.out.println("All better!");
		servings = 0;
	}
	public static void main(String[] args) {
		Baby test = new Baby();
		test.feed(5);
		test.poop();
	}
}