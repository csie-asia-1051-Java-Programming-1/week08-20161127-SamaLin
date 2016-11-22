package ex;
/*
 * Topic:  寫一程式計算兩個矩陣的乘法，例如 A 是 n1 x m1 的矩陣， B 是 n2 x m2 的矩 陣，C=AB 為 n1 x m2 矩陣
	第一列輸入 n1, m1, n2 及 m2 等 4 個整數，n1, m1 是第一個陣列的列(row)與行 (column)，而 n2, m2 則是第二個陣列的列(row)與行(column)，其中 m2 = n2。接著輸 入兩個陣列的內容。
 * Date: 2016/11/21
 * Author: 105021058 蕭懋霖
 */
import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		int m1=scn.nextInt();
		int m2=scn.nextInt();
		int data1[][]=new int[m1][m2];
		int data2[][]=new int[m2][m1];
		int a=Math.min(m1,m2);
		int b=Math.max(m1,m2);
		int sum=0;
		int data3[][]=new int[a][a];
		for(int i=0;i<m1;i++){
			for(int j=0;j<m2;j++){
				data1[i][j]=scn.nextInt();
			}
		}
		for(int i=0;i<m2;i++){
			for(int j=0;j<m1;j++){
				data2[i][j]=scn.nextInt();
			}
		}
		for(int k=0;k<a;k++){
			for(int i=0;i<a;i++){
				sum=0;
				for(int j=0;j<b;j++){
					sum=sum+data1[k][j]*data2[j][i];
				}
				data3[k][i]=sum;
			}
		}
		
		
		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++){
				System.out.print(data3[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
