package java_ornekler;

import java.util.Scanner;

public class Mukemmel_Sayi_Kontrolu {
//Herkese tekrar merhaba bugun mukemmel sayi kontrolu yapacagiz...baslayalim
	//tum positif tam sayi bolenleri toplami kendine esit olan sayilara mukemmel sayi denir. ornegin 
	//6 'nin bolenleri 1, 2, 3 bu sayilarin toplami 1+2+3=6'dir.simdi ise mukemmel sayilarin programini 
	//yazalim.
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);//kullanicidan veri almak icin scanner sinifimizi import ettik.
		 int girdi, toplam=0;              //bunu ctrl+shift+o ile yapabilirsiniz.
		 System.out.println("                         Mukemmel Sayi KOntrol Programi: ");
		 System.out.println("Test etmek istediginiz sayiyi giriniz:");
		 girdi=sc.nextInt();
		 for (int i=1; i<girdi; i++){//eger iyi sifirdan baslatirsaniz sorunla karsilasirsiniz.cunku bir sayi 
			 //sifira bolunmeyecektir.
			 if(girdi%i==0){
				 
				 toplam=toplam+i;// eger i ye tam bolunuyorsa topla dedik.
			 } }
			 if (toplam == girdi){//toplam girdimize esit ise programi durdurduk.
				 
				 System.out.println(girdi+ " Mukemmel sayidir.");
			 }else
				 System.out.println(girdi+ " Mukemmel sayi degildir.");
			 
		//simdi deneyelim...
			 //program calisiyor. beni dinlediginiz icin tesekkur ederim...begenmeyi ve takip etmeyi 
			 //unutmayin...
	}

}
