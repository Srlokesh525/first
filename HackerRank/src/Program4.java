
public class Program4 {

	public static void main(String[] args) {
		String str = "welcometojava";
		int k = 3;
		String substring2 = str.substring(0, k);
		String smallest = substring2;
		String largest = substring2;
		for (int i = 0; i <=str.length() - k ; i++) {
			String substring = str.substring(i,i+ k);
			System.out.println(substring);
			if (smallest.compareTo(substring) > 0) {
				smallest = substring;
			}
			if (largest.compareTo(substring) < 0) {
				largest = substring;
			}
		}
		System.out.println(smallest + " " + largest);
	}
}
