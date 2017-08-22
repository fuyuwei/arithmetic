package com.swk.first;

/**
 *  判断101-200之间有多少个素数，并输出所有素数。 素数又名质数
 * @author fuyuwei
 *
 */
public class PrimeNumber {

	public static void findPrimeNum1(){
		int count = 0;
		for(int i=101;i<200;i++){
			int tmp=0;
			for(int j= 2;j<i;j++){
				if(i%j == 0){
					tmp ++ ;
				}
			}
			if(tmp == 0){
				count ++;
				System.out.println(i);
			}
		}
		System.out.println("总共："+count);
	}
	
	/**
	 * 优化后，质数（素数）不包括1
	 * 一个数在2到 math.sqrt(n) 之间的所有整数去除，均无法整除，则n为质数。
	 */
	public static void findPrimeNum2(){
		int count = 0;
		for(int i=101;i<200;i++){
			if(isPrime(i)){
				count++;
				System.out.print(i+" ");
			}
		}
		System.err.println("共："+count);
	}
	
	public static boolean isPrime(int n){
		if(n <= 3){
			return n > 1;
		}
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		findPrimeNum2();
	}
}
