public class Main {
    public static void main(String[] args) {
        // Arkadaş sayılar: Kendileri hariç bölenleri toplamı birbirine eşit sayılar arkadaş sayılar olarak tanımlanır.
        // 220-284

        // Bu proje sürmekte olan bir kamp ödevidir.
        // Bu kampta metodlar ve mantıksal operatörler henüz işlenmediği için bu konular kullanılmamıştır.

        int num1 = 220;
        int num2 = 284;
        int totalForNum1 = 0;
        int totalForNum2 = 0;


        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                totalForNum1 += i;
            }
        }

        for (int j = 1; j < num2; j++) {
            if (num2 % j == 0) {
                totalForNum2 += j;
            }
        }

        if (totalForNum1 == num2) {
            if (totalForNum2 == num1) {
                System.out.println(num1 + " ve " + num2 + " Sayıları, Arkadaş Sayılardır.");
            } else {
                System.out.println(num1 + " ve " + num2 + " Sayıları, Arkadaş Sayı Değildir.");
            }
        } else {
            System.out.println(num1 + " ve " + num2 + " Sayıları, Arkadaş Sayı Değildir.");
        }
    }
}