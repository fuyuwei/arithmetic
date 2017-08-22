package com.swk.first;

import java.util.ArrayList;

public class AllStr {

	public static void getAllStr(char[] str,int start){
		char tmp;
		ArrayList<String> list = new ArrayList<String>();
		if(start == str.length){
			list.add(String.valueOf(str));
		}else{
			for(int i=start;i<str.length;i++){
				tmp = str[start];
				str[start] = str[i];
				str[i] = tmp;
				getAllStr(str,start+1);
				tmp = str[start];
				str[start] = str[i];
				str[i] = tmp;
			}
		}
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	
	
	
	public static void main(String[] args) {
		String str = "bc";
		getAllStr(str.toCharArray(),0);
	}
}
