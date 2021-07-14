package day01;

import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i=0;i<T;i++) {
			int N = sc.nextInt();
			int lst [] = new int[N];
			for (int j=0;j<N;j++) lst[j] = sc.nextInt();
			int sum = 0;
			int target = lst[N-1];
			for (int j=N-2;j>-1;j--) {
				if (lst[j] > target) { 
					target = lst[j];
				} else {
					sum += target - lst[j];
				}
			}
			System.out.printf("#%d %d\n",i+1,sum);
		}
	}

}
