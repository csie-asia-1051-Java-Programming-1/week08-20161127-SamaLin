package ex;
/*
 * Topic: 請用類別撰寫一個計算機，透過計算機物件可以計算 加、減、乘、除、平方、立方、開根號的功能
 * Date: 2016/11/21
 * Author: 105021058 蕭懋霖
 */
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		Compute cpe=new Compute();
		float a =scn.nextFloat();
		char c =scn.next().charAt(0);
		float b = 0;
		if(c=='+'|| c=='-'||c=='*'||c=='/'){
			b =scn.nextFloat();	
		}
		System.out.println(cpe.computer(a,b,c));
		
	}
}
class Compute {
	
//	public compute{
//		
//	} 

	public static float computer(float a,float b,char c) {
		// TODO Auto-generated method stub
		float sum=0;
		switch(c){
		
		case '+':
			sum=a+b;
			break;
		case '-':
			sum=a-b;
			break;
		case '*':
			sum=a*b;
			break;
		case '/':
			sum=a/b;
			break;
		case '²':
			sum=(float)Math.pow(a,2);
			break;
		case '³':
			sum=(float)Math.pow(a,3);
			break;
		case '√':
			sum=(float)Math.sqrt(a);
			break;
		default:
			System.out.println("錯誤");
			break;
		}
		
		
		return sum;
	}
}

