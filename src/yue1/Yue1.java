package yue1;

import java.util.Scanner;

public class Yue1 {
	public static void main(String[] args) {

		int a = (int) (Math.random()*10+1);
		//System.out.println(a * 100);
		System.out.println("��������Ϸ��ʼ");
		System.out.println("������һ��1-10֮�����");
		while(true){
			Scanner ac=new Scanner(System.in);
			System.out.println("������һ����");
			int as=ac.nextInt();
			if(as>a){
				System.out.println("��´��ˣ������");
			}else if(as==a){
				System.out.println("��ϲ��¶���");
				break;
			}else{
				System.out.println("���С�ˣ������");
				
			}
		}

	}
}