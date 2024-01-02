package lesson1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
//        // Khai báo biến
//        DongVat dv; // NULL
//        
//        // Khởi tạo đối tượng
//        dv = new DongVat();

        DongVatService serv = new DongVatService();
        Scanner sc = new Scanner(System.in);
        while (true) {
            // In ra menu.
            System.out.println("---------------------");
            System.out.println("Nhập:");
            System.out.println("\t1. Nhập thông tin");
            System.out.println("\t2. Xuất danh sách");
            System.out.println("\t0. Dừng");
            System.out.println("---------------------");
            
            int chon = Integer.parseInt( sc.nextLine() );
            
            if (chon == 0) {
                break;
            }
            
            switch (chon) {
                case 1:
                    System.out.println("Nhập tên:");
                    String ten = sc.nextLine();
                    
                    System.out.println("Chọn giới tính:");
                    System.out.println("1 - Đực, 0 - Cái");
                    int gt = Integer.parseInt( sc.nextLine() );
                    
                    System.out.println("Nhập cân nặng:");
                    int canNang = Integer.parseInt( sc.nextLine() );
                    
                    DongVat dv = new DongVat(ten, gt, canNang);
                    serv.add(dv);
                    break;
                case 2:
                    ArrayList<DongVat> ds = serv.getDs();
                    for (DongVat d : ds) {
                        //
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
