package day01;

import java.util.Scanner;

public class Solution {
	static int T;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int i = 1; i<=T;i++) {
			int sum = 0;
			for (int j = 0; j<10;j++) { 
				int a = sc.nextInt();
				if (a%2==1) { 
					sum+= a;
				}
			}
			System.out.printf("#%d %d\n",i,sum);
		}
		
	}

}
