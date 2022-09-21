public class Main {
    public static void main(String[] args) {
        String[][] citys = new String[3][3];

        citys[0][0] = "İstanbul";
        citys[0][1] = "Bursa";
        citys[0][2] = "Bilecik";
        citys[1][0] = "Ankara";
        citys[1][1] = "Konya";
        citys[1][2] = "Kayseri";
        citys[2][0] = "Antalya";
        citys[2][1] = "Adana";
        citys[2][2] = "Mersin";

        for (int i = 0; i < citys.length; i++) {
            if (i == 0) {
                System.out.println("----Marmara----");
            } else if (i == 1) {
                System.out.println("----İç Anadolu----");
            } else {
                System.out.println("----Akdeniz----");
            }
            for (int j = 0; j < 3; j++) {
                System.out.println(citys[i][j]);
            }
        }


    }
}