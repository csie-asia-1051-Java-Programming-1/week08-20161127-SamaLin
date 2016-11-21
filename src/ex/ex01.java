package ex;
/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021058 蕭懋霖
 */
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long now=scn.nextLong();
		String after="";
		while(now!=0){
			after=Long.toString(now%2)+after;
			now=now/2;
		}
		System.out.println(after);
	}

}
