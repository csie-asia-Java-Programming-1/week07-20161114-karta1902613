package hw;

import java.util.Scanner;

public class hw04 {
	/*
	 * Date: 2016/11/14
	 * 寫一遞迴函數，求 m、n 兩數的最大公因數 gcd(m,n)由鍵盤輸入
	 * Author: 105021043 劉凱文
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m=scn.nextInt();
		int n=scn.nextInt();
		System.out.print(gcd(m,n));
	}
    public static int gcd(int m,int n){
    if(n==0)
    	return m;
    else
    	return gcd(n,m%n);
    }
    
}
