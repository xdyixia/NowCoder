package com.Sep21;

import java.util.Scanner;

public class array_search2 {

	 public boolean Find(int target, int [][] array) {
	        int i;
	        int j;
	        for(i=array.length-1,j=0; i>=0&&j<array[0].length;){
	            if(target == array[i][j])
	                return true;
	            if(target < array[i][j]){
	                i--;
	                continue;
	            }
	            if(target > array[i][j]){
	                j++;
	                continue;
	            }
	        }  
	        return false;
	    }
	
	public static void main(String[] args) {
		System.out.println("输入矩阵行数：");
	 	Scanner in = new Scanner(System.in);
	 	int m=in.nextInt();
	 	
	 	System.out.println("输入矩阵列数：");
	 	int n=in.nextInt();
	 	
	 	int[][] array = new int[m][n];
	 	System.out.println("输入矩阵各元素：");
	 	for(int i = 0 ; i < m ; i++){
	 		for(int j = 0 ; j < n ; j++){
	 			array[i][j] = in.nextInt();
	 		} 
	 	}
	 	
	 	System.out.println("输入目标数：");
	 	int target=in.nextInt();
	 	
	 	array_search2 ar = new array_search2();
	 	boolean sol = ar.Find(target, array);
	 	System.out.println(sol);

	}

}
//ok