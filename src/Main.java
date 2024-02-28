import java.util.Scanner;

public class Main {
    // Recursive Metot: Girilen sayıya göre desen oluşturan metot
    static int design(int n, boolean control, int flag) {
        // Kontrol true ise, n'nin değeri pozitif olduğu anlamına gelir
        if (control) {
            // n'nin değeri 0'dan büyük olduğu sürece devam eder
            if (n > 0) {
                System.out.print(n + " "); // n'i ekrana yazdır
                flag++; // flag arttır
                return design(n - 5, true, flag); // Recursive olarak devam et
            } else {
                // n 0'a eşit olduğunda kontrolü değiştir
                return design(n, false, flag);
            }
        } else {
            System.out.print(n + " "); // n'i ekrana yazdır
            // flag değeri pozitifse, flag'i azalt ve geriye doğru devam et
            if (flag > 0) {
                flag--;
                return design(n + 5, false, flag);
            } else {
                // flag 0 ise, işlemi sonlandır
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--------------------------------------");
        System.out.println("Recursive Desene Göre Metot Oluşturma");
        System.out.println("--------------------------------------");
        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();
        System.out.println("---------------------------------------");

        // Metot çağrısı ve oluşturulan desenin ekrana yazdırılması
        System.out.println(design(n, true, 0));
        System.out.println("---------------------------------------");
    }
}
