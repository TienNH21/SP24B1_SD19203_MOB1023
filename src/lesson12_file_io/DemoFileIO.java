package lesson12_file_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoFileIO {
    public static void main(String[] args) {
        String filename = "file1.txt";
        System.out.println("Bắt đầu ghi file");
        ghiFile(filename);
        System.out.println("Kết thúc ghi file");
        System.out.println("Bắt đầu đọc file");
        docFile(filename);
        System.out.println("Kết thúc đọc file");
    }
    
    public static void ghiFile(String filename)
    {
        String s = "Hello SD19203";
        File f = new File(filename);
        if (f.exists() == false) {
            System.out.println("File không tồn tại");
            return ;
        }
        
        System.out.println("File tồn tại");
        
        try {
            FileOutputStream fos = new FileOutputStream(f);
            byte[] b = s.getBytes();
            fos.write(b);
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không mở được file");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void docFile(String filename)
    {
        File f = new File(filename);
        if (f.exists() == false) {
            System.out.println("File không tồn tại");
            return ;
        }
        
        System.out.println("File tồn tại");
        try {
            FileInputStream fis = new FileInputStream(f);
        
            while (true) {
                int i = fis.read();
                if (i == -1) {
                    break;
                }
                
                System.out.println( (char) i );
            }
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không mở được file");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
