package ex;
/*
 * Date: 2016/11/14
 * 承上題，除了var() 函數之外，再用建立一個 std() 函數，程式在接收完使用者輸入的一維整數陣列之後，
 * 呼叫std()函式可得到陣列的標準差，特別注意，不要只用 std() 函數算結果，必須由std()去呼叫 var() 函數之後回到 std() 
 * 函式處理完再傳回給主程式，主程式再把結果印出。
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);	 	
		int n=scn.nextInt();
		System.out.println(std(var(n)));}
		
    public static float var(int n){
	Scanner scn=new Scanner(System.in);
	int []data=new int[n];
     for(int i=0;i<n;i++){
    	 data[i] =scn.nextInt();}
     int us =0;
 	 int sum=0;
 for(int i=0;i<n;i++){
	 us+=data[i];}
 float u=us/n;
 for(int i=0;i<n;i++){
	 data[i]=(int) ((data[i]-u)*(data[i]-u));}
 for(int i=0;i<n;i++){
	 sum+=data[i];}
     float ans=0;
 ans=(float)sum/n;
      return ans;}
        
    public static float std(float ans){
		float la=(float) Math.sqrt(ans);
		return la;}}

