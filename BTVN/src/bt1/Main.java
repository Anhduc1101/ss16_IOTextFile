package bt1;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        B1: tạo file text có sẵn dữ liệu văn bản (data có thể là đề bài này)
        File text=new File("BTVN/src/bt1/text.txt");
        text.createNewFile();
        FileWriter fileWriter=new FileWriter(text);
        fileWriter.write("tạo file text có sẵn dữ liệu văn bản (data có thể là đề bài này)");
        fileWriter.close();

//        B2: Tạo hàm đọc file trên và trả ra String.
        FileReader fileReader=new FileReader(text);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String str= bufferedReader.readLine();

//        B3: convert String ở bước 2 thành mảng string, mỗi từ là 1 phần tử
        String[] arrStr=str.split(" ");

//        B4: length của mảng trên chính là số lượng từ trong file.
        System.out.println(arrStr.length);
    }
}
