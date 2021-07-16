package sweaPS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputExample {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 1. 정수 > 문자열 입력받는 경우 
		
		// nextInt로 정수+\n을 입력받고
		// 정수는 N으로, 버퍼에는 분리자(개행문자)만 남긴다
		// int N = sc.nextInt(); 
		 
		// nextLine은 개행문자까지 입력을 받기 때문에 
		// 앞에서 nextInt()이후 버퍼에 남아있던 \n을 입력받고 
		// 별도의 입력과정이 진행되지 않고 명령이 종료된다.
		// String s = sc.nextLine();  
		// System.out.println(N+" "+s); // 입력받은 정수만 출력됨을 알 수 있다.
		
		// 1.1 그럼 해결책은?
		
		// 1) 임의로 nextInt()를 한번 더 실행시켜서 버퍼의 값을 없앤다.
		//	int N = sc.nextInt();
		//	sc.nextLine(); // 버퍼에 남아있는 개행문자 처리 
		//	String s = sc.nextLine();
		//	System.out.println(N+" "+s);
		
		// 2) next()를 사용한다. 
		//	단, next()는 개행문자, 탭 이전까지만 입력받기 때문에
		//	입력으로 ABC DE를 받으면, next()는 ABC까지만 입력받고 
		// 	버퍼에는 \tDE\n가 남게 된다. 
			
		//  next는 공백문자 앞까지, nextLine은 \n을 입력받을 때까지 
		//	String s = sc.next();
		//	System.out.println(N+" "+s);  
		//	System.out.println(sc.nextLine()); // next이후 버퍼에 남은 값을 확인할 수 있다.

		// --------------------------------------------------------------	
		// 2. 버퍼를 사용한 데이터 입력방법
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 버퍼리더는 엔터만을 경계로 입력값을 인식한다. 그러므로 별도의 split과정이 필요
		// 또한 모두 String으로 입력받기 때문에, 자료형에 맞는 파싱작업이 필요 
		//	int T = Integer.parseInt(br.readLine());
		//	String s = br.readLine();
		//	System.out.println(T+" "+s); // 띄어쓰기를 무시하고, 개행문자(엔터)를 받을때까지를 모두 입력받
			
		// 2.1 공백을 두고 여러개의 입력이 한번에 주어지는 경우
		// 	알고리즘 문제를 풀 때 주로 마주하게 될 유형인데,split과정을 수행하면 된다.
		//	String[] s = br.readLine().split(" ");
		//	for (int i=0;i<s.length;i++) System.out.println(s[i]);

		// 2.2 공백을 두고 숫자 데이터가 한번에 주어지는 경우 
		// 현재 생각나는 방법은 스트링으로 입력받은 배열의 길이만큼 정수형 배열을 선언하고
		// 정수배열에다 입력받은 스트링 배열을 Integer로 파싱 
		// 데이터의 길이 N개만큼 반복을 수행해야 하는데, 시간효율성에 문제가 없는지?
		// 더 나은 방법이 있는지? 계속 알아보기 
		//	String[] s = br.readLine().split(" ");
		//	int [] num = new int[s.length];
		//	for (int i=0;i<s.length;i++) num[i] = Integer.parseInt(s[i]);
		//	System.out.printf("s[0] + s[1] = %d",num[0]+num[1]);

		// 2.3 공백없이 데이터가 한번에 주어지는 경우 
		// ex) ABCD, 1234 등 
		// split옵션을 ""으로 주면 한칸씩 입력을 받음 
		//	String[] s = br.readLine().split("");
		//	System.out.print(Integer.parseInt(s[0])+Integer.parseInt(s[1]));

	}

}
