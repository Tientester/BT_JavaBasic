package JavaBasic_Bai4;

public class ForAndArray {
    public static void main(String[] args) {
        int mangSoNguyen[] = new int[30];
        int index = 0;
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
                mangSoNguyen[index] = i;
                index++;
            }
        }
        System.out.println("");
        for (int value: mangSoNguyen){
            System.out.println(value);
        }
    }
}
