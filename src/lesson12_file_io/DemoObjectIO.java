package lesson12_file_io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import lesson1.DongVat;

public class DemoObjectIO {
    private static DongVat pet = new DongVat("A", 1, 10);

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
        File f = new File(filename);
        if (f.exists() == false) {
            System.out.println("File không tồn tại");
            return ;
        }
        
        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(pet);
            oos.close();
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
        
        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
        
            DongVat p = (DongVat) ois.readObject();
            ois.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không mở được file");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
}
