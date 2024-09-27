import java.util.Scanner;

public class java{
    public  static void main(String[]args){
        int seçim,yatır,çek;
        int para=1200;

        System.out.println("Hoşgeldiniz");
        System.out.println("hesabınızda 1200 tl var");
        Scanner scan = new Scanner(System.in);

        System.out.println("İşlem menüsü \n 1-Para çek\n 2-Para yatır");
        System.out.print("işlem seç:");
        seçim = scan.nextInt();
        if(seçim ==1){
            System.out.print("Çekmek istediğiniz tutar:");
            çek = scan.nextInt();
            System.out.print("Kalan para:");
            System.out.print(para-çek);


        }
        else if(seçim==2){
            System.out.print("Yatırmak istediğiniz tutar:");
            yatır = scan.nextInt();
            System.out.print("Hesaptaki güncel para:");
            System.out.print(para+yatır);
        }
        else{
            System.out.println("Geçersiz bir işlem yaptınız");
        }






    }

}
