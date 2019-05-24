//演習１
public class Person {

	public String name = null;
	public int age = 0;

//演習２
	public Person() {} //コンストラクタ１
	public Person(String name,int age) {	//コンストラクタ２
		this.name = name;
		this.age = age;
	}
//	演習４
	public Person(String name) { //コンストラクタ３
		this.name = name;
		this.age =0;
	}

	public Person(int age) {  //コンストラクタ４
		this.name = "名前なし";
		this.age = age;
	}


	public Person(int age,String name) {  //コンストラクタ５
		this.name = name;
		this.age = age;
	}
}