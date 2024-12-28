package task3;
import java.util.Scanner;

//10.Write a java Program to multiply two matrices
public class MatrixMultiplication 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows in the first matrix: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the number of columns in the first matrix: ");
        int c1 = sc.nextInt();
        System.out.print("Enter the number of rows in the second matrix: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the number of columns in the second matrix: ");
        int c2 = sc.nextInt();
        if (c1 != r2) 
        {
            System.out.println("Matrices cannot be multiplied");
            return;
        }
        int[][] m1 = new int[r1][c1];
        int[][] m2 = new int[r2][c2];
        System.out.println("Enter elements of the first matrix:");
        for (int i = 0; i < r1; i++) 
        {
            for (int j = 0; j < c1; j++) 
            {
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of the second matrix:");
        for (int i = 0; i < r2; i++) 
        {
            for (int j = 0; j < c2; j++) 
            {
                m2[i][j] = sc.nextInt();
            }
        }

        int[][] result = multiplyMatrices(m1, m2, r1, c1, c2);
        System.out.println("Resulting matrix:");
        for (int i = 0; i < result.length; i++) 
        {
            for (int j = 0; j < result[0].length; j++) 
            {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
	}

	private static int[][] multiplyMatrices(int[][] m1, int[][] m2, int r1, int c1, int c2) {
		int[][] result = new int[r1][c2];
        for (int i = 0; i < r1; i++) 
        {
            for (int j = 0; j < c2; j++) 
            {
                for (int k = 0; k < c1; k++) 
                {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return result;

	}

}
