package yue1;

import java.util.Scanner;

public class Yue1 {
	public static void main(String[] args) {

		int a = (int) (Math.random()*10+1);
		//System.out.println(a * 100);
		System.out.println("猜数字游戏开始");
		System.out.println("请输入一个1-10之间的数");
		while(true){
			Scanner ac=new Scanner(System.in);
			System.out.println("请输入一个数");
			int as=ac.nextInt();
			if(as>a){
				System.out.println("你猜大了，请加油");
			}else if(as==a){
				System.out.println("恭喜你猜对了");
				break;
			}else{
				System.out.println("你猜小了，请加油");
				
			}
		}

	}
}