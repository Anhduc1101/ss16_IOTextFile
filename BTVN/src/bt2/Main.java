package bt2;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File countLine = new File("BTVN/src/bt2/countLine.txt");
        countLine.createNewFile();
        FileWriter fileWriter = new FileWriter(countLine);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.newLine();
        bufferedWriter.write("Như ở bài giới thiệu về loạt bài Kotlin, mình đã có nói là chúng ta sẽ sử dụng IntelliJ IDEA như 1 IDE chính để code các demo.");
        bufferedWriter.newLine();
        bufferedWriter.write("Hôm nay mình sẽ hướng dẫn các bạn cài đặt và sử dụng IDE này 1 cách cơ bản.");
        bufferedWriter.newLine();
        bufferedWriter.write("Qua bài viết này, các bạn sẽ được trang bị những kỹ năng sử dụng IDE.");
        bufferedWriter.newLine();
        bufferedWriter.write("Những kỹ năng đủ để chúng ta sử dụng trong suốt loạt bài hướng dẫn Kotlin của mình.");
        bufferedWriter.close();

        FileReader fileReader = new FileReader(countLine);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str ;
        int count = 0;
        while ((str=bufferedReader.readLine()) != null) {
            System.out.println(str);
            count++;
        }
        System.out.println("Số dòng là: " + count);

    }
}
