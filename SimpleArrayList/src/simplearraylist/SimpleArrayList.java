/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class SimpleArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    SimpleArrayMachine simple = new SimpleArrayMachine();
        while(true){
            int in;
            System.out.println("Menu Data ArrayList:");
            System.out.println("<1> Tambah data");
            System.out.println("<2> Cari Data");
            System.out.println("<3> Hapus Data");
            System.out.println("<4> Tampil Data");
            System.out.println("<5> Keluar");
            
            Scanner input = new Scanner(System.in);
            System.out.println("");
            System.out.println("Pilih nomor berapa = ");
            in = input.nextInt();

            switch (in) {
                case 1:
                    simple.addData();
                    break;
                case 2:
                    simple.findData();
                    break;
                case 3:
                    simple.deleteData();
                    break;
                case 4:
                    simple.viewData();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
