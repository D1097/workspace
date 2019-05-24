package jp.co.internous.action;
//演習１
public class Test {

	public static void main(String[]args) {
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
//演習４
		taro.phoneNumber="00-1111-1111";
		taro.address="Tokyo";

		System.out.println(taro.name);
		System.out.println(taro.age);
//演習４
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
//演習６
		taro.talk();
		taro.walk();
		taro.run();
//演習２
		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="22-3333-3333";
		hanako.address="Saitama";


		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);


		Person ziro=new Person();
		ziro.name="木村次郎";
		ziro.age=18;
		ziro.phoneNumber="44-555-6666";
		ziro.address="Chiba";

		System.out.println(ziro.name);
		System.out.println(ziro.age);
		System.out.println(ziro.phoneNumber);
		System.out.println(ziro.address);

		Person daisuke=new Person();
		daisuke.name="伊藤太亮";
		daisuke.age=28;
		daisuke.phoneNumber="55-6666-7777";
		daisuke.address="Tokyo";

		System.out.println(daisuke.name);
		System.out.println(daisuke.age);
		System.out.println(daisuke.phoneNumber);
		System.out.println(daisuke.address);

//	演習８
		Robot aibo=new Robot();
		aibo.name="aibo";
		System.out.println(aibo.name);
		aibo.run();

		Robot asimo=new Robot();
		asimo.name="asimo";
		asimo.walk();

		Robot pepper=new Robot();
		pepper.name="pepper";
		pepper.talk();

	}
}
