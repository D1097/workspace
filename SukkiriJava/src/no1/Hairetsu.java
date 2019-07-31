package no1;

public class Hairetsu {

	public static void main(String[] args){
		double x=30;
		for(double i=1; i<=x; i++){
			if(40*i +  60*(x-i) == 1444){
				System.out.println("40円が"+i+"本");
				System.out.println("60円が" + (x-i) + "本" );
			}
		}
	}
}


