public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[]{1,2,5,7,9,0};
        int searchingNumber = 10;
        boolean isNumberInArray = false;

        for (int number:numbers){
            if (searchingNumber == number){
                isNumberInArray = true;
                break;
            }
        }

        if (isNumberInArray) {
            System.out.println(searchingNumber + " sayısı dizide bulunmaktadır");
        }else {
            System.out.println(searchingNumber + " sayısı dizide bulunamadı");
        }
    }
}