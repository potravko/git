public class Main {

	public static void main(String[] args) {
//		int a = 15;
//		byte b = 123;
//		short c = 1200;
//		long d = 4502254L;
//		float f = 15.56F;
//		double l = 25.63584;
//		char x = '/';
//		boolean y = true;
		System.out.println(oper(100, 65, 185, 178));
		summ(7, 1);
		defined();
		name();
		System.out.println(negative (-125));
	}


	public static int oper(int a, int b, int c, int d) {
		int x = a * (b + (c / d));
		return x;
	}

	public static void summ(int j, int y) {
		int s = j + y;
		if ((s >= 10) && (s <= 20)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static void defined() {
		int v = -125;
		if (v >= 0) {
			System.out.println("Положительное");
		} else {
			System.out.println("Отрицательное");
		}
	}

	public static void name() {
		String g = "Иван";
		System.out.println("Привет, Иван");
	}

	public static boolean negative(int i) {
		if (i < 0){
			return true;
		}else {
			return false;
		}
	}
}

