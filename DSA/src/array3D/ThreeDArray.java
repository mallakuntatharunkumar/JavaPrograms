package array3D;

import java.util.Arrays;

public class ThreeDArray {
	public static void main(String[] args) {
		int[][][][] arr = {
				{ 
				{
					{ 1, 2, 3 ,6,7}, 
					{ 4, 5, 6 }, 
					{ 7, 8, 9 }
				},
		
				{
					{ 1, 2, 3 },
					{ 4, 5, 6 }, 
					{ 7, 8, 9 }
				}, 
				{
					{ 1, 2, 3 },
					{ 4, 5, 6 },
					{ 7, 8,9}
				} 
			},
				{ 
					{
						{ 1, 2, 3 ,6,7}, 
						{ 4, 5, 6 }, 
						{ 7, 8, 9 }
					},
			
					{
						{ 1, 2, 3 },
						{ 4, 5, 6 }, 
						{ 7, 8, 9 }
					}, 
					{
						{ 1, 2, 3 },
						{ 4, 5, 6 },
						{ 7, 8,9}
					} 
				},
				{ 
					{
						{ 1, 2, 3 ,6,7}, 
						{ 4, 5, 6 }, 
						{ 7, 8, 9 }
					},
			
					{
						{ 1, 2, 3 },
						{ 4, 5, 6 }, 
						{ 7, 8, 9 }
					}, 
					{
						{ 1, 2, 3 },
						{ 4, 5, 6 },
						{ 7, 8,9}
					} 
				}
		};
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					for(int k=0;k<arr[i][j].length;k++) {
						for(int l=0;l<arr[i][j][k].length;l++) {
							System.out.print(arr[i][j][k][l]+" ");
						}
						System.out.println();
					}
					System.out.println("----------------");
				}
				System.out.println();
			}
		
		for(int[][][] a:arr) {
			for(int[][] b:a) {
				for(int[] c:b)
				System.out.println(Arrays.toString(c));
				System.out.println();
			}
			System.out.println("-----------------");
			
		}
		
	}
}
