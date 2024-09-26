import java.util.Scanner;

public  class Main{
    public static void main(String[]args){
        int x,y,z;
        Scanner scan = new Scanner(System.in);
        System.out.print("İlk sayiyi gir:");
        x = scan.nextInt();
        System.out.print("İkinci sayıyı gir:");
        y = scan.nextInt();
        System.out.print("Üçüncü sayıyı gir:");
        z = scan.nextInt();

        if(x>y && x>z){
            System.out.println("En büyük sayi:"+x);
        } else if (y>x && y>z) {
            System.out.println("En büyük sayi:"+y);


        }
        else{
            System.out.println("En büyük sayı:"+z);
        }


    }
}
