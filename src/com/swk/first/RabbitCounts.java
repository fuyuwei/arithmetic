package com.swk.first;

/**
 * 有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 * 假如兔子都不死，问每个月的兔子总数为多少？ 
 * 1,1,2,3,5,8,13,21..
 * @author fuyuwei
 *
 */
public class RabbitCounts {
	public static int calRabbits(int month){
		if(month ==1 || month == 2){
			return 1;
		}
		int count = calRabbits(month-1)+calRabbits(month-2);
		return count;
		
	}
	
	public static void main(String[] args) {
		for(int i=1;i<10;i++){
			System.out.println(calRabbits(i));
		}
	}
}
