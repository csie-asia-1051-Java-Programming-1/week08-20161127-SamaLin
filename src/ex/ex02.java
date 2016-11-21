package ex;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 105021058 蕭懋霖
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long now=scn.nextLong();
		int a=scn.nextInt();
		int b=scn.nextInt();
		int i=0;
		long total=0;
		String after="";
		
		while(now!=0){
			total=total+(now%10)*(int)Math.pow(a,i);
			now=now/10;
			i++;
		}
//		System.out.println(total);
		
		while(total!=0){
			after=Long.toString(total%b)+after;
			total=total/b;
		}
		System.out.println(after);
	}

}
