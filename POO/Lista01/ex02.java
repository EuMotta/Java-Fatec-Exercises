public class ex02 {

	public static void main(String[] args) {
		int arr[][] = new int[6][3];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int randomNum = (int) (Math.random() * 100);
				System.out.print(randomNum + " ");
			}
			System.out.println();
		}

	}
}
