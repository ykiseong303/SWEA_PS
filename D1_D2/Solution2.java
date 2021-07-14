package day01;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0;i<T;i++) {
			int sum = 0;
			for(int j=0;j<10;j++) sum += sc.nextInt();
			System.out.printf("#%d %.0f\n",i+1,sum/10.0);
		}
	}

}
