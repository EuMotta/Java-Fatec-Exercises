public class ex01 {
	
	public static void main (String[] args) {
		int[][] arr = new int[5][6];
		
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
}

