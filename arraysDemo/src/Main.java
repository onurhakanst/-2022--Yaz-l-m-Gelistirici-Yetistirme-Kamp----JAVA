
public class Main {

	public static void main(String[] args) {
		String ogrenci1="engin";
		String ogrenci2="derin";
		String ogrenci3="salih";
		String ogrenci4="ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("*****************************");
	
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]="ENGİN";
		ogrenciler[1]="DERİN";
		ogrenciler[2]="SALİH";
		ogrenciler[3]="AHMET";
		
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
			
		
		
		}
				
		System.out.println("*****************************");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	}
	

	
	
}
