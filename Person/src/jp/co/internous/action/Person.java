package jp.co.internous.action;
//演習１
public class Person {

	public String name = null;
	public int age = 0;
//演習３
	public String phoneNumber=null;
	public String address=null;
//演習５
	public void talk() {
		System.out.println(this.name + "が話す");
	}
	public void walk() {
		System.out.println(this.name + "が歩く");
	}
	public void run() {
		System.out.println(this.name + "が走る");
	}
}
