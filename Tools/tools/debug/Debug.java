package debug;

public class Debug {
	private static int debug = 0;
	private static int group1 = 0;
	private static int group2 = 0;
	private static int group3 = 0;
	private static int group4 = 0;

	// Debug of an Attribute

	public static <T> void attribute(String txt, T var, boolean special) {
		if(special == true)
			System.out.println(txt + ": " +var);
		else if(debug == 1)
			System.out.println(txt + ": " +var);
	}

	public static <T> void attribute(T var, boolean special) {
		if(special == true)
			System.out.println(var);
		else if(debug == 1)
			System.out.println(var);
	}

	public static <T> void attribute(String txt, T var, int number) {
		if(debug == 1)
			System.out.println(txt + ": " +var);
		else if(checkGroup(number) == 1)
			System.out.println(txt + ": " +var);
	}

	public static <T> void attribute(T var, int number) {
		if(debug == 1)
			System.out.println(var);
		else if(checkGroup(number) == 1)
			System.out.println(var);
	}



	// Debug Message

	public static void message(String texto, boolean special) {
		if(special == true)
			System.out.println(texto);
		else if(debug == 1)
			System.out.println(texto);
	}

	public static void message(String texto, int number) {
		if(debug == 1)
			System.out.println(texto);
		else if(checkGroup(number) == 1)
			System.out.println(texto);
	}



	// Debug Check if reached

	public static void check(String place, boolean special) {
		if(special == true)
			System.out.println("Entered "+ place);
		else if(debug == 1)
			System.out.println("Entered "+ place);
	}

	public static void check(String place, int number) {
		if(debug == 1)
			System.out.println("Entered "+ place);
		else if(checkGroup(number) == 1)
			System.out.println("Entered "+ place);
	}



	// Debug Message Equals

	public static <T> void equals(T n1, T n2, boolean special) {
		if(special == true)
			System.out.println("Number "+n1+"= Number "+n2);
		else if(debug == 1)
			System.out.println("Number "+n1+"= Number "+n2);
	}

	public static <T> void equals(T n1, T n2, int number) {
		if(debug == 1)
			System.out.println("Number "+n1+"= Number "+n2);
		else if(checkGroup(number) == 1)
			System.out.println("Number "+n1+"= Number "+n2);
	}

	// Debug line

	public static void line(boolean special) {
		if(special == true)
			System.out.println("=============================================");
		else if(debug == 1)
			System.out.println("=============================================");
	}

	public static void line(int number) {
		if(debug == 1)
			System.out.println("=============================================");
		else if(checkGroup(number) == 1)
			System.out.println("=============================================");

	}


	public static void line2(boolean special) {
		if(special == true)
			System.out.println("---------------------------------------------");
		else if(debug == 1)
			System.out.println("---------------------------------------------");	}

	public static void line2(int number) {
		if(debug == 1)
			System.out.println("---------------------------------------------");		
		else if(checkGroup(number) == 1)
			System.out.println("---------------------------------------------");
	}

	
	
	// Helper Functions

	private static int checkGroup(int group) {
		if(group > 4 || group < 1)
			throw new IllegalArgumentException();
		switch(group) {
		case 1 : return group1;
		case 2 : return group2;
		case 3 : return group3;
		case 4 : return group4;

		default: throw new IllegalArgumentException();
		}

	}



	// Ons and Offs	

	public static void on() {
		debug = 1;
	}

	public static void off() {
		debug = 0;
	}

	public static void on(int type) {
		switch(type) {
		case 0 : debug = 1; return;
		case 1 : group1 = 1; return;
		case 2 : group2 = 1; return;
		case 3 : group3 = 1; return;
		case 4 : group4 = 1; return;

		default: throw new IllegalArgumentException();
		}
	}

	public static void off(int type) {
		switch(type) {
		case 0 : debug = 0; return;
		case 1 : group1 = 0; return;
		case 2 : group2 = 0; return;
		case 3 : group3 = 0; return;
		case 4 : group4 = 0; return;

		default: throw new IllegalArgumentException();
		}
	}
}
