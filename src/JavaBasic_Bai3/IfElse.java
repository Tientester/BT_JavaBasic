package JavaBasic_Bai3;

public class IfElse {
    static int number = 100;

    public static void main(String[] args) {
        compareNumber(80);
    }

    public static void compareNumber(int n) {
        if (n == number) {
            System.out.println("n equal 100");
        } else if (n < number) {
            System.out.println("n smaller 100");
        }else {
            System.out.println("n bigger 100");
        }
    }
}
