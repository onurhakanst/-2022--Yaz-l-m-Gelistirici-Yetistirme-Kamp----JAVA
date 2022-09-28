
public class Main {

	public static void main(String[] args) {
		//6--> 1,2,3
		//28-->1,2,4,7,14
		
		int number = 28 ;
		int bolenlerinToplamı = 0 ;
		for(int i = 1 ; i< number ;i++ ) {
			if(number % i==0) {
				bolenlerinToplamı= bolenlerinToplamı+i;
			}
			
		}

System.out.println("tam bölenlerin toplamı " + bolenlerinToplamı);
if(bolenlerinToplamı==number) {
	System.out.println("sayı mükemmel sayıdır");
}else {
	System.out.println("Sayı mükemmel sayı değildir");
}
	}

}
