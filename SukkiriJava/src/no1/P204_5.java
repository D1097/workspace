package no1;

public class P204_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

			String title="こんにちは";
			String address="xxx@gmail.com";
			String text="hello,world";
			email(title, address, text);
	}
	public static void email(String address, String text){
			System.out.println("from:"+address);
			System.out.println("<h1>title: 無題</h1>");
			System.out.println("text: "+text);
			email(address, text);
	}
}

