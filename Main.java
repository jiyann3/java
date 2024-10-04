import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        kitaplık();
        System.out.println("1-Kitap al\n2-Kitap bırak\n 3-Çıkış");
        System.out.print("İşlem seç:");
        int seçim = input.nextInt();

        switch (seçim){
            case 1: System.out.println("kitap ismi giriniz:");
                    String kitapad = input.nextLine();
                    input.nextLine();
                    System.out.print(kitapad+"kitabını okuyabilirsiniz");break;
            case 2: System.out.println("Bırakacağınız kitabın ismi :");
                    String kitapisim = input.nextLine();
                    input.nextLine();
                    System.out.println(kitapisim+"kitabi bırakıldı,teşekkür ederiz");break;
            case 3:System.out.println("Çıkış yapıldı,iyi günler dileriz.");



        }





    }
    public static void kitaplık(){
        System.out.println("Kitaplık uygulamasına hoşgeldiniz.");
        System.out.println("Kitaplık");
    }
}