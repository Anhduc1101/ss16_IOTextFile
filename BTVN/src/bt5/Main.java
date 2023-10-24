package bt5;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        B1: đọc file thành String.
        File text=new File("BTVN/src/bt5/text.txt");
        text.createNewFile();
        FileWriter fileWriter=new FileWriter(text);
        fileWriter.write("file convert thành mảng string với mỗi từ là 1 phần tử");
        fileWriter.close();
        FileReader fileReader=new FileReader(text);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String str= bufferedReader.readLine();

//        B2: convert thành mảng string với mỗi từ là 1 phần tử.
        String[] strArr=str.split(" ");

//        B3: tạo 1 list string để lưu các từ tìm được.
        List<String> stringList=new ArrayList<>();
//        stringList.add(Arrays.toString(strArr));

//        B4: duyệt mảng tìm length lớn nhất, nếu leng của phần tử = leng lớn nhất thì add vào list, nếu lớn hơn length lớn nhất thì đổi list list mới và gán lại.
        int maxLength = 0;
        for (String word : strArr) {
            int length = word.length();
            if (length > maxLength) {
                maxLength = length;
                stringList.clear();
                stringList.add(word);
            } else if (length == maxLength) {
                stringList.add(word);
            }
        }

//        B5: tạo vòng lặp in ra các từ có độ dài lớn nhất, và độ dài của chúng.
        System.out.println("Các từ có độ dài lớn nhất (" + maxLength + " ký tự):");
        for (String word : stringList) {
            System.out.println(word);
        }

    }
}
