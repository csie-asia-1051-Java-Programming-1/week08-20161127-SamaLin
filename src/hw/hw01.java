package hw;

import java.util.Scanner;

/*
 * Topic: 請寫一個 遞迴函式)進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long now=scn.nextLong();
		String after="";
//		while(now!=0){
//			after=Long.toString(now%2)+after;
//			now=now/2;
//		}
		System.out.println(tentwo(now,after));
		
	}
	public static String tentwo(long now, String after) {
		if(now==0){
			
			return "";
			
		}else{
			after=Long.toString(now%2);
			return tentwo(now/2,after)+after;
		}
		

	}

}
