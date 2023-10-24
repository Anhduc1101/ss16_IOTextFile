package bt3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        B1: tạo file và cho sẵn dữ liệu(có thêt coppy đề bài cho vào file)
        File file = new File("BTVN/src/bt3/text.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Như ở bài giới thiệu về loạt bài Kotlin, mình đã có nói là chúng ta sẽ sử dụng IntelliJ IDEA như 1 IDE chính để code các demo. Hôm nay mình sẽ hướng dẫn các bạn cài đặt và sử dụng IDE này 1 cách cơ bản. Qua bài viết này, các bạn sẽ được trang bị những kỹ năng sử dụng IDE. Những kỹ năng đủ để chúng ta sử dụng trong suốt loạt bài hướng dẫn Kotlin của mình.");
        bufferedWriter.close();
//        B2: viết hàm đọc file.
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str = bufferedReader.readLine();

//        B3: convert file đọc được thành mảng string với mỗi từ là 1 phần tử
        String[] arrStr = str.split(" ");
//        B4: sử dụng vòng lặp để tìm kiếm các phần tử xuất hiện nhiều hơn 1 lần và add những phần tử đó vào 1 list
        int count=0;
        List<String>stringList=new ArrayList<>();
        for (int i = 0; i < arrStr.length-1; i++) {
            for (int j = i+1; j < arrStr.length ; j++) {
                if(arrStr[i].equals(arrStr[j])){
                    stringList.add(arrStr[i]);
                }
            }
        }
//        B5: hiển thị kết quả.
        System.out.println(stringList);
    }
}
