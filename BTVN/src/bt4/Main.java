package bt4;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("BTVN/src/bt4/text.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("tạo file text có sẵn dữ liệu văn bản ");
        fileWriter.close();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str = bufferedReader.readLine();
        String[] arrStr=str.split(" ");
        List<String> stringList=Arrays.asList(arrStr);
//        cách 1: dùng Collection.sort();
        Collections.sort(stringList);
        System.out.println("mảng sau khi sắp xếp là: "+stringList);
//        cách 2: dùng Array.sort()
        Arrays.sort(arrStr,(String s1,String s2)->s2.compareTo(s1));
        System.out.println("mảng sau khi sắp xếp là: "+Arrays.toString(arrStr));
    }

}
