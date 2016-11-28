package hw;
/*
 * Topic: 撠��憿�撥��隞亙��10隞乩���車�摮頂蝯梯��� (敹�蝙���艘)
 * Date: 2016/11/21
 * Author: 1050210XX �瘞豢�葦
 */
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long a=scn.nextInt();
		long a1=scn.nextInt();//���脣
		long a2=scn.nextInt();//閬���脣
		String c="";
		System.out.println(to(toten(a,a1,0),a2,c));//����(���脣)�頧��(�隞�脣)
	}

	public static long toten(long a,long a1,int c) {//c�蝚砍嗾頛�(敺�0����)//if 1011 ��敺���2���0甈⊥ 
		if(a==0){
			
		return 0;
		}else{
		return toten(a/10,a1,c+1)+(a%10)*(int)Math.pow(a1, c);//��艘撠����蜇
		}
		
	}
	public static String to(long a,long a1,String c) {
		if(a==0){
			
		return "";
		
		}else{
		c=Long.toString(a%a1);//撠摮�銝�蝞頧��葡
		return to(a/a1,a1,c)+c;
		}
	}

}
