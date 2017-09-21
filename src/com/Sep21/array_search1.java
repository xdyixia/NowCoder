package com.Sep21;

import java.util.Scanner;

public class array_search1 {

	public boolean Find(int target, int [][] array) {
        int i;
        int j;
        boolean temp = false;
        boolean flag = false;
        for(i=0;i<array.length;i++){
            for(j=0;j<array[0].length;j++){
                if(array[i][j]==target){
                    temp=true;
                    flag=true;
                    break;
                }
            }
            if(flag==true) break;
        }
        return temp;
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
	 	
	 	array_search1 ar = new array_search1();
	 	boolean sol = ar.Find(target, array);
	 	System.out.println(sol);

	}

}
