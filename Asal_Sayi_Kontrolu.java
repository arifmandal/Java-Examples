package java_ornekler;

import java.util.Scanner;

//Herkese merhaba bugun asal sayi kontrolu yapacagiz...baslayalim...eger bir sayi 1 e ve kendisine tam
//bolunebiliyorsa asal sayidir ...0 ve 1 asal sayi degildir en kucuk asal sayi 2 dir...simdede kullanicidan
//sayi alarak asal olup olmadigini belirleyelim...

public class Asal_Sayi_Kontrolu {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);//scanner sinifimizi import ediyoruz.
		int sayi,bolunen=0; //sayi ve bolunen adinda iki degisken belirledik...
		System.out.print("Lutfen bir sayi giriniz: ");
		sayi=sc.nextInt();// sayimizi kullanicidan aldik simdi ise kullanici 1 veya birden kucuk sayi 
		//girerse program kabul etmemesi icin while dongusunu kullaniyoruz.
		while(sayi<2){
			System.out.println("0 ve 1 asal sayi degildir...Lutfen 2 den buyuk asal sayi giriniz: ");
			sayi=sc.nextInt();
		}
		for(int i=2; i<sayi;i++){//burda ikiden baslattik cunku her sayi 1 e tam bolunur.
			if(sayi%i==0){
				bolunen++;//bolunen sayiyi her seferinde bir arttirdik.
				
			}}
		if(bolunen==0)	{
			
			System.out.println(sayi+ " asal sayidir.");
		}else 
			System.out.println(sayi+ " asal sayi degildir.");
		
	}//simdi ise programimizi test edelim.Programimiz calisiyor... beni dinlediginiz icin tesekkur ederim
	//begenmeyi ve kanalima abone olmayi unutmayin... iyi gunlerrr...

}
