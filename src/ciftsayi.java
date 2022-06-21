import java.util.Scanner;
public class ciftsayi {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz :");
        a = input.nextInt();

        for (int i=1 ; i <= a;i++){
            if (i % 3 ==0 && i%4 ==0){
                System.out.println(i);

            }
        }

    }
}
