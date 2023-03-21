package LogicalProgramTest;

public class Find_All_The_Paire_Of_Sum_Given_Number {
	public static void main(String[] args) {
		int[] given = { 4, 6, 5, -10, 8, 5, 20 };
		int total = 10;
		for (int i = 0; i < given.length; i++) {
			for (int j = 0; j < given.length; j++) {
				if (given[i] + given[j] == total) {
					System.out.println(given[i]);
					System.out.println(given[j]);
					System.out.println(given[i] + " " + given[j]);

				}

			}
		}

	}

}
