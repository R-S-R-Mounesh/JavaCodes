public class RightDecreasingPattern {
	public static void main(String[] args) {
		int rows = 9;
		for (int i = 1; i <= rows; i++) {
			for (int j = i; j < rows; j++) {
				System.out.print("  ");
			}
			for (int k= 1;  k<=i; k++) {
				System.out.print(k+" ");
			}
	for (int k =i- 1; k >=1; k--) {
			System.out.print(k + " ");
		}
			System.out.println();
		}
	}
}
