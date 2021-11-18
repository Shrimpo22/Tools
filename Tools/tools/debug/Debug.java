package debug;

public class Debug {
	private static int debug = 1;

	public static <T> void Attribute(String txt, T var, boolean special) {
		if(special == true)
			System.out.println(txt + ": " +var);
		else if(debug == 1)
			System.out.println(txt + ": " +var);
	}
	
	public static void Message(String texto, boolean special) {
		if(special == true)
			System.out.println(texto);
		else if(debug == 1)
			System.out.println(texto);
		}
	
	public static void Check(String place, boolean special) {
		if(special == true)
			System.out.println("Entered "+ place);
		else if(debug == 1)
			System.out.println("Entered "+ place);
	}
	
	public static void off() {
		debug = 0;
	}
	
	public static void on() {
		debug = 1;
	}
}
