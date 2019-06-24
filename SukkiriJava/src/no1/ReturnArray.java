package no1;

public class ReturnArray {

	public static int[] makeArray(int size){


		int[] newArray=new int[size];
		for(int i=0; i<newArray.length; i++){
			newArray[i] = i;
		}
		return newArray;
	}

	public static void main(String[] args){
		int[] array=makeArray(3);
		for(int i:array){
			System.out.println(i);
		}
	}
}
/*  ①mainメソッドが実行され、makeArrayメソッドを参照する。
*　　②makeArrayメソッドに処理が移り、要素数『size』の 配列（配列名：newArray）が作られる。
*　　③その際、for文により値が初期化される。
*	④returnにより makeArray　が　newArray　に『化け』、mainメソッドに処理が戻る。
*	⑤返ってきた newArray が　arrayに格納される。要素数：３として実行され、拡張for文により要素の数だけ値が出力される。
*	＊この時、格納される配列は、値がそれぞれ格納されるわけではなく、『値の先頭アドレス』が格納される。
*/
