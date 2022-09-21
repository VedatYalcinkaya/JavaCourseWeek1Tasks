public class Main {
    public static void main(String[] args) {
        // Mükemmel Sayı (Perfect Number) : Kendisinden başka pozitif tüm bölenlerinin toplamı kendisine eşit olan sayılardır.

        // 6 --> 1,2,3      28 --> 1,2,4,7,14

        int number = 28;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }
        if (total == number) {
            System.out.println(number + " bir mükemmel sayıdır");
        } else {
            System.out.println(number + " mükemmel  sayı değildir");
        }


    }
}