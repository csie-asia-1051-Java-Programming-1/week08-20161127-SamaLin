package hw;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換 (必須使用遞迴)
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long a=scn.nextInt();
		long a1=scn.nextInt();//原進制
		long a2=scn.nextInt();//要轉的進制
		String c="";
		System.out.println(to(toten(a,a1,0),a2,c));//先轉(十進制)在轉成(其他進制)
	}

	public static long toten(long a,long a1,int c) {//c為第幾輪(從0開始)//if 1011 最後一個數為2的0次方 
		if(a==0){
			
		return 0;
		}else{
		return toten(a/10,a1,c+1)+(a%10)*(int)Math.pow(a1, c);//遞迴將每個數加總
		}
		
	}
	public static String to(long a,long a1,String c) {
		if(a==0){
			
		return "";
		
		}else{
		c=Long.toString(a%a1);//將數字一一算出轉成字串
		return to(a/a1,a1,c)+c;
		}
	}

}
