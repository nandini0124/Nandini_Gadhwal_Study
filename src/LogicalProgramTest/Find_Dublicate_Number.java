package LogicalProgramTest;

import java.util.ArrayList;

public class Find_Dublicate_Number {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 2, 3, 4, 3, 6, 5, 4, 6, 4, 8, 8, 5, 6, 3, 2 };

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {

					System.out.print(a[j] + " ");
				}

			}

		}

		/*
		 * HashSet<String> hs = new HashSet<>(); for(int n:a) { if(hs.add("n")==false) {
		 * System.out.println(n); }
		 */
	}

}
