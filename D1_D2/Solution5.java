package day01;

import java.util.Arrays;
import java.util.Scanner;

public class Solution5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] lst = new int[N];
		for (int i=0;i<N;i++) lst[i] = sc.nextInt();
		Arrays.sort(lst);
		System.out.print(lst[N/2]);
	}

}
