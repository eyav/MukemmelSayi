import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, n, total;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        a = input.nextInt();
        total =0;

        for(n = 1; n < a; n++ ){
            if(a%n ==0){
                total = total + n;
            }

        }

        if(a == total){
            System.out.println(a + "  Mükemmel bir sayidir.");
        }else{
            System.out.println(a + "  Mükemmel bir sayi değildir.");
        }

    }
}
