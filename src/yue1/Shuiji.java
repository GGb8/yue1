package yue1;

import java.util.Random;

public class Shuiji {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		Random random=new Random();
		
		int i=random.nextInt(b)%(b-a+1)+a;
		System.out.println(i);
		// TODO Auto-generated method stub

	}

}
