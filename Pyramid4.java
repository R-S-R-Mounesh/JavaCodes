public class RightDecreasingPattern {
	public static void main(String[] args) {
		int rows = 9;
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			for (int k = i; k <= rows; k++) {
				System.out.print(k + " ");
			}
			for (int k = rows - 1; k >= i; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
}
