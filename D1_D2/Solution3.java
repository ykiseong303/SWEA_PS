package day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int i=0;i<T;i++) {
			String lst [] = br.readLine().split(" ");
			int num1 = Integer.parseInt(lst[0]);
			int num2 = Integer.parseInt(lst[1]);
			if (num1>num2) System.out.printf("#%d >\n",i+1);
			else if (num1 < num2) System.out.printf("#%d <\n",i+1);
			else System.out.printf("#%d =\n", i+1);
		}
	}

}
