
public class Application {

	public static void main(String[] args) {

		int loop = 0;

		while (loop < 5) {
			System.out.println("lopping" +loop);

			if (loop == 5) {
				break;
			}

			loop++;
			System.out.println("loop Is Running");
		}
	}

}
