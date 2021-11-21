package debug;

public class Teste {
	public static void main(String[] args) {
		Debug.off();
		Debug.message("1st", false);
		Debug.message("2nd", true);
	}
}
