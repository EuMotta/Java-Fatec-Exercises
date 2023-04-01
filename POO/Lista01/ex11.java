/*
 * ex09.java
 * 
 * Copyright 2023 hyper <hyper@DESKTOP-7PSM5PP>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */
import java.util.Scanner;

public class ex11 {
	
	public static void main (String[] args) {
		Scanner num = new Scanner(System.in);
		
		System.out.print("Insira um tamanho: ");
		int tam = num.nextInt();
		int[][] arr = new int[tam][tam];
		
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				int valor = (int) (Math.random() * 100);
				arr[i][j] = valor;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
			
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				if (i<=j)
				{
					System.out.print(arr[i][j] + " ");
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
			
		}
		num.close();
		
	}
}

