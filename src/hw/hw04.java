package hw;
/*
 * Topic: 請寫以類別方式寫一個程式可顯示四位數字的 LED 燈一組，可根據輸入的四位數字顯示數字。比如說， 由鍵盤輸入 1234 ，則可在螢幕上顯示如圖
 * Date: 2016/11/21
 * Author: 105021058 蕭懋霖
 */
import java.util.Scanner;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int cach=0;
		int caca[]=new int [4];
		for(int k=0;k<4;k++){
			caca[3-k]=(a/(int)Math.pow(10, k))%10;//抓4數字
			}
		String led[][]={//存取輸出資料
				
				{"*****",//led[0][0]
				 "*   *",//led[0][1]
				 "*   *",
				 "*   *",
				 "*****"},
				 
				 {"    *",//led[1][0]
				  "    *",//led[1][1]
				  "    *",
				  "    *",
				  "    *"},
				  
				 {"*****",
				  "    *",
				  "*****",
				  "*    ",
				  "*****"},
				  
				 {"*****",
				  "    *",
				  "*****",
				  "    *",
			      "*****"},
			      
				 {"*   *",
			      "*   *",
			      "*****",
				  "    *",
				  "    *"},
				  
				 {"*****",
				  "*    ",
				  "*****",
				  "    *",
				  "*****"},
				  
				 {"*****",
				  "*    ",
				  "*****",
				  "*   *",
				  "*****"},
				  
				 {"*****",
				  "    *",
				  "    *",
				  "    *",
				  "    *"},
				  
				 {"*****",
				  "*   *",
				  "*****",
				  "*   *",
				  "*****"},
				  
				  {"*****",
				   "*   *",
				   "*****",
				   "    *",
				   "*****"}
				  
		};
//		System.out.println(led[0][1]);
//		System.out.println(led[1][0]);
//		for(int k=0;k<4;k++){
			for(int i=0;i<5;i++){//分五行輸出
				for(int j=0;j<4;j++){//一次輸出其中一數的5分之一
				System.out.print(led[caca[j]][i]+" ");
				}
				System.out.println();//換行
			}
//		}
	}

}
