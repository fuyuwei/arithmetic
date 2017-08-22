package com.swk.first;

/**
 * 打印出所有的"水仙花数(narcissus number)"，所谓"水仙花数"是指一个三位数，
	其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。 
	打印1000内所有水仙花数
 * @author fuyuwei
 *
 */
public class Narcissus {

	public static void printNarcissus(){
		// 123
		for(int i=100;i<1000;i++){
			int d3 = i/100;
			int d2 = (i%100)/10;
			int d1 = (i%100)%10;
			if(d3*d3*d3+d2*d2*d2+d1*d1*d1 == i){
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		printNarcissus();
	}
}
