package ex;

/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 1050210XX 周永振老師
 */
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入");
		int a = scn.nextInt();
		int n = scn.nextInt();
		fun(a, n);

	}

	public static void fun(int a, int n) {
		String num = "　";
		while (a != 0) {
			num = a % n + num;
			a = a / n;
		}
		System.out.println(num);
	}

}
