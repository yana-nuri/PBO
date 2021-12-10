/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;
import java.util.ArrayList;
import java.util.Scanner;
import static java.util.Collections.binarySearch;
/**
 *
 * @author Acer
 */
public class SimpleArrayMachine {
    ArrayList<String> x = new ArrayList<>();
    
    void addData() {
        Scanner tambah = new Scanner(System.in);
        System.out.println("Masukkan data string: ");
        x.add(tambah.nextLine());
        System.out.println("Daftar string dalam array list:" + x);
        tambah.nextLine();
    }
    void findData() {
        Scanner search = new Scanner(System.in);
        System.out.println("String yang mau dicari: ");
        String cari = search.nextLine();
        if(binarySearch(x,cari) > -1){
            System.out.println("String " + cari + " ada di index ke " + binarySearch(x,cari) +" di dalam data");
        } else {
            System.out.println("String " + cari + " tidak ada dalam data");
        }
    }
    void deleteData() {
        Scanner delete = new Scanner(System.in);
        System.out.println("String yang mau dihapus: ");
        String del = delete.nextLine();
        if(binarySearch(x,del) > -1){
            x.remove(binarySearch(x,del));
            System.out.println("String " + del + " sudah dihapus dari dalam data");
        } else {
            System.out.println("String " + del + " tidak ada dalam data");
        }
    }
    void viewData() {
        System.out.println("Daftar string dalam array list:" + x);
    }
}

