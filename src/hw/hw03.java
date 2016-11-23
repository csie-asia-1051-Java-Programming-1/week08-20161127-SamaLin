package hw;
/*
 * Topic: 請寫一個遞迴程式，輸入一個 int 型態的資料，並回傳該資料在二進制下有多少個位元是 1，例如: 輸入 13 得到結果為 3
 * Date: 2016/11/21
 * Author: 105021058 蕭懋霖
 */
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a =scn.nextInt();
		System.out.println(tentwo(a));
	}

	public static int tentwo(int a) {
		if(a==0){
		return 0;
		
		}else{
			if(a%2==1){
				return tentwo(a/2)+1; //是1的話+1
			}else{
				return tentwo(a/2);
			}
		}
	}
}
