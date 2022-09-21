public class Main {
    public static void main(String[] args) {
        int number = 11;
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime && number > 2) {                           // 2'den küçük sayılar asal değildir
            System.out.println(number + " Asal Sayıdır");
        } else {
            System.out.println(number + " Asal Değildir");
        }

    }
}