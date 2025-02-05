package JavaBasic_Bai1;

public class SinhVien {

    String studentName = "Nguyễn Anh Tiến";
    String university = "Vietnam-Korea University of Information and Communication Technology";

    public static void main(String[] args) {

        SinhVien sinhVien = new SinhVien();
        System.out.println(sinhVien.studentName);
        System.out.println(sinhVien.university);

        int mathScore = 8;
        int englishScore = 7;
        int literatureScore = 7;

        System.out.println("mathScore: " + mathScore);
        System.out.println("englishScore: " + englishScore);
        System.out.println("literatureScore: " + literatureScore);

        System.out.println(ThongTin.email);
        System.out.println(ThongTin.telephoneNo);
        System.out.println("totalScore: "+ThongTin.totalScore);

    }

}
