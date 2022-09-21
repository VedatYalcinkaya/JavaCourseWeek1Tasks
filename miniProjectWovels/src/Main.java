public class Main {
    public static void main(String[] args) {
        // Kodun amacı harfin sesli veya sessiz olduğunu bulmaktır.
        char letter = 'O';
        boolean isWovel = false;

        char[] wovels = {'A','a','E','e','I','ı','İ','i','O','o','Ö','ö','U','u','Ü','ü'};

        for (char wovel: wovels){
            if (letter == wovel) {
                isWovel = true;
                break;
            }
        }
        if (isWovel){
            System.out.println(letter + " sesli harfdir");
        }else {
            System.out.println(letter + " sessiz harfdir");
        }
    }
}