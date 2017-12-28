package eulersayisininbulunmasi;
//Herkese merhaba arkadaslar bugun birlikte euler sayisini java programiyla bulmaya calisacagiz...bildiginiz gibi euler sayisi
// e=2.7182... gibi devam etmektedir.
//bu sayinin kurali soyledir....e= 1/0!+1/1!+1/2!+1/3!+... ile devam etmektedir. simdi hesaplamaya baslayalim...simdiden iyi seyirler...
public class EulerSayisininBulunmasi {

    public static void main(String[] args) {
        double euler=1;
        for (int i = 1; i < 100; i++) {// burada sayinin en dogru sekilde cikmasi icin 100 kadar aldik...
                                       //burda istediginiz sayiya kadar alabilirsiniz...
            double fact=1;// burda faktoriyel hesaplamak icin ilk degeri 1 e esitledik...
            for (int j = i; j > 1; j--) {// burda 100den baslayarak 1 e kadar carpmasini sagladik...
                fact=fact*j;
                
            }
            euler =euler+1/fact;// burda ise euler sayimizi yukarida yazdigim kurala gore yazdirdik.
                                
            
        }
        
        System.out.println("Euler sayisi= "+euler);//burda ise en son olarak yazdirdik...simdi calistiralim...
                                                 //gordugunuz gibi euler sayimizi bulduk... begenmeyi ve abone olmayi unutmayin 
                                                 //tesekkur ederim...
    }

}
