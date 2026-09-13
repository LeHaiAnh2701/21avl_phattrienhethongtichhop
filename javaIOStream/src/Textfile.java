import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Textfile {
public static void main(String[] args) {
    Path file = Path.of("data","ghichu.txt");
    try {
        Files .createDirectories(file.getParent());
    try (BufferedWriter writer = Files.newBufferedWriter(file,StandardCharsets.UTF_8)){
      writer.write("Java IO làm việc với các luồng dữ liệu.");
      writer.newLine();
      writer.write("BufferedReader giúp ghi văn bản hiệu quả");
      writer.newLine();
      writer.write("UTF-8 hỗ trợ tiếng việt ổn định" );


    }
    try(BufferedReader reader = Files.newBufferedReader(file,StandardCharsets.UTF_8)){
     String line;
     int number =1;
    while((line = reader.readLine())!= null){
System.out.printf("%d. %s%n",number++,line);

    }
     }
    } catch (Exception e) {
    System.err.println("Lỗi xử lí tệp"+file+":"+e.getMessage());
    }
}
    
}