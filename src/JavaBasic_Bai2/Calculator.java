package JavaBasic_Bai2;

public class Calculator {

    public int cong2so(int a, int b){
        return (a + b);
    }

    public double tich2sothuc(double a, double b){
        return (a * b);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.cong2so(15,15));
        System.out.println(calculator.tich2sothuc(5,2));
    }

}
