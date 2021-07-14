package day01;

import java.util.Scanner;

public class Solution6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] lst = sc.nextLine().split("");
		int sum = 0;
		for(int i = 0;i<lst.length;i++) sum += Integer.parseInt(lst[i]);
		System.out.print(sum);
		
	}

}
