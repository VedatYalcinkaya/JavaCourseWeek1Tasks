public class Main {

    public static void main(String[] args) {

        /*
        ---------------------------------Primitive Types--------------------------------------------------------------------------

        TYPE NAME           KIND OF VALUE           MEMORY USED         SIZE RANGE

        boolean             true or false           1 byte              not applicable

        char                integer                 2 byte              all Unicode characters

        byte                integer                 1 byte              -128 to 127

        short               integer                 2 byte              -32768 to 32767

        int                 integer                 4 byte              -2147483648 to 2147483647

        long                integer                 8 byte              -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        float               floating-point          4 byte              -2^149 to (2-2^(-23))·2^127
                            number

        double              floating-point          8 byte              -2^1074 to (2-2^(-52))·2^1023
                            number

       ---------------------------------------------------------------------------------------------------------------------------
         */

        boolean isTrue = true;

        char letter = 'V';

        int num = 42;

        double num2 = 5.45;

        float num3 = 5.55f;

        System.out.println(num3+num2);



    }
}