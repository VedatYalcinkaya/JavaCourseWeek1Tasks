public class Main {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        System.out.println(message);

        System.out.println("Eleman Sayısı : " + message.length());
        System.out.println("5. Eleman : " + message.charAt(4));

        System.out.println(message.concat(" Yaşasın!"));

        System.out.println(message.startsWith("B"));
        System.out.println(message.endsWith((".")));

        char[] characters = new char[5];
        message.getChars(0,5,characters,0);             // 0 dan başla 5'e kadar (5 dahil değil)
        System.out.println(characters);

        System.out.println(message.indexOf('a'));                           // Aramaya soldan başlar
        System.out.println(message.indexOf("hava"));
        System.out.println(message.lastIndexOf("a"));                   // Aramaya sağdan başlar

        System.out.println("----------------------------------------------------------------------");

        String newMessage = message.replace(" ","-");
        System.out.println(newMessage);
        System.out.println(message.substring(2,4));                         // 2'den başla 4'e kadar al (4 dahil değil)

        for (String word : message.split(" ")){
            System.out.println(word);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(("    "+message.concat(" ")).trim());        //
    }
}