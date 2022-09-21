public class Main {
    public static void main(String[] args) {
        String student1 = "Vedat";
        String student2 = "Emre";
        String student3 = "Okan";
        String student4 = "Enes";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);

        System.out.println("*--------------------------*");

        String[] students = new String[4];
        students[0] = "Vedat";
        students[1] = "Emre";
        students[2] = "Okan";
        students[3] = "Enes";

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("*--------------------------*");

        for (String student : students) {
            System.out.println(student);
        }


    }
}