package java_ornekler;

import java.util.Scanner;

//herkese merhaba arkadaslar bugun konsoldan girilen bir sayinin kuplerinin toplamini bulmayi anlatacagim.
// ornegin 512=5*5*5+1*1*1+2*2*2=134'u bulmaya calisacagiz...simdiden iyi seyirler

public class GirilenSayininKuplerininToplaminiBulma {
   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//scanner sinifimizi import ettik.
		String myString;
		int sum=0;//toplamini kaydetmek icin sum belirledik ve 0'a esitledik.
		System.out.println("Sayinizi giriniz: ");
		myString=sc.nextLine();//sayimizi aldik
		for (int i = 0; i < myString.length(); i++) {
			sum=(int) ((int)sum+Math.pow((myString.charAt(i)-48), 3));//burda math sinifini  kullanarak 
			                                                     //kuplarinin toplamini bulmaya calisacagiz 
			                       //48 cikarmamizin nedeni cikarmazsak program kodu gosterecektir.
			
		}System.out.println("Sayinizin kuplerinin toplami= "+sum);//programimiz biiti calistiralim...
	}

}
