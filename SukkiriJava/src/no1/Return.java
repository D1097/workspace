package no1;

public class Return {

		public static int add(int x, int y){
			int ans=x+y;
			return ans;
		}

		public static void main(String[] args){
			System.out.println(add(add(1,2),add(3,4)));
			/*						|_____|    |____|
			 * 						3に化ける、　　７に化ける
			 * 					｜_____________________｜
			 * 					３＋７になる
			 */
		}
}
