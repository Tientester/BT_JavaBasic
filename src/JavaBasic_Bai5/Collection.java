package JavaBasic_Bai5;

import java.util.ArrayList;
import java.util.Arrays;

public class Collection {

    private static ArrayList<String> addEmployee(String name, String age, String jobTile, String exp) {
        ArrayList<String> employeeinfo = new ArrayList<>();
        employeeinfo.add(name);
        employeeinfo.add(age);
        employeeinfo.add(jobTile);
        employeeinfo.add(exp);

        return employeeinfo;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i<100; i++){
            if (i % 2 == 0){
                list.add(i);
            }
        }
        System.out.println("************* Duyệt giá trị trong ArrayList ***************");
        //Duyệt giá trị trong ArrayList
        for (int i : list) {
            System.out.print(i + "\t");
        }

        System.out.println();
        System.out.println("\n************** Thông tin nhân viên **************");

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Selenium", "Test Automation"));
        ArrayList<String> list1 = list2;
        System.out.println(list1);

        ArrayList<String> employee = addEmployee(
                "Nguyen Anh Tien",
                "25",
                "Design",
                "5 years"
        );

        for (String value : employee){
            System.out.println(value);
        }
    }
}
