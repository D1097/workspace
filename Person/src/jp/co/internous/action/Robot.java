package jp.co.internous.action;

public class Robot {
//演習７
	public String name = null;
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
