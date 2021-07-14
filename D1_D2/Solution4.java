package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution4 {
	public static void main(String args[]) throws NumberFormatException, IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i=0;i<T;i++) {
			String[] lst = br.readLine().split(" ");
			int start = Integer.parseInt(lst[0]);
			for (int j = 1;j<10;j++) {
				int num = Integer.parseInt(lst[j]);
				if (start < num) start = num; 
			}
			System.out.printf("#%d %d\n", i+1,start);
		}
	}
}
