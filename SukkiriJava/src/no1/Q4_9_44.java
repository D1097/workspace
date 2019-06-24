package no1;

public class Q4_9_44 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numbers={3,4,9};

		System.out.println("１桁の数字を入力してください");

		int input=new java.util.Scanner(System.in) .nextInt();

		/*外れ　for(int i=0; i<10; i++){
			if(i==3||4||9){
				System.out.println("アタリ！");
			}*/

		for(int n:numbers){
			if(n == input){
				System.out.println("アタリ！");
			}
	}
	}
}
