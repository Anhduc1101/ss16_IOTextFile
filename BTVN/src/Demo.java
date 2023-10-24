import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
//        Tạo 1 thư mục đặt tên là data nằm ngoài cùng project
        File file = new File("data");
        file.mkdir();
//        Trong thư mục này chứa các tệp và thư mục sau
//        tệp input.txt
        File input = new File("data/input.txt");
        input.createNewFile();
//        tệp Demo.java
        File demo = new File("data/Demo.java");
        demo.createNewFile();
//        thư mục sub1. chứa các tệp con là output.txt, student.dat
        File sub1 = new File("data/sub1");
        sub1.mkdirs();
        File output = new File("data/sub1/output.txt");
        output.createNewFile();
        File student = new File("data/sub1/student.dat");
        student.createNewFile();
//        thư mục sub2
        File sub2 = new File("data/sub2");
        sub2.mkdir();
//
//        Sau khi tạo xong thì hiển thị hết cả cây thư mục vừa tạo theo dạng sau:
        System.out.println(file);
        File subDir = new File("data");
        File[] subArr = subDir.listFiles();
        for (File sub : subArr) {
                System.out.println("-" + sub.getName());
            if (sub.isDirectory()) {
                File[] subArr1=sub.listFiles();
                for (File f:subArr1) {
            System.out.println("--" + f.getName());
                }
            }
        }
    }
//        data
//                -input.txt
//                -Demo.java
//                -sub1
//                --output.txt
//                --student.dat
//                -sub2
}

