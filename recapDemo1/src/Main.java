public class Main {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 25;
        int num3 = 2;

        int max = 0;

        if (num1 > num2){
            max = num1;
        } else if (num1 < num2) {
            max = num2;
        }else {
            max = num1;
        }

        if (max < num3) {
            max = num3;
        }

        System.out.println("En büyük sayı : " + max);
    }
}