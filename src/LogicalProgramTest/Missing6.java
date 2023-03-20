package LogicalProgramTest;

public class Missing6 {
public static void main(String[] args) {
		
		int[] n = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		int missingnumber = n[0];
		for (int i = 0; i < n.length; i++) {
			if(missingnumber != n[i]) {
				System.out.println(missingnumber);
				break;
			}
			missingnumber++;
			
		}
		

}
}


