package debug;

public class Teste {
	public static void main(String[] args) {
		Debug.off();
		Debug.Message("1st", false);
		Debug.Message("2nd", true);
	}
}
