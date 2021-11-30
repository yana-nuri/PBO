/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationproject;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class EncapsulationProject extends Others{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        MemberSilver SMember = new MemberSilver();
        MemberGold GMember = new MemberGold();
        MemberPlatinum PMember = new MemberPlatinum();

        inputMember();

        String idMember;
        int tglRent, blnRent, thnRent, tglKembali, blnKembali, thnKembali;
        Scanner input = new Scanner(System.in);

        System.out.println(" ###################### Program Pengembalian Rental Game Console ######################");
        
        System.out.print("Masukkan ID Member                  : ");
        idMember = input.nextLine();
        
        System.out.print("Masukkan Tanggal Pinjam (1 - 31)    : ");
        tglRent = input.nextInt();
        
        System.out.print("Masukkan Bulan Pinjam (1 - 12)      : ");
        blnRent = input.nextInt();
        
        System.out.print("Masukkan Tahun Pinjam (xxxx)        : ");
        thnRent = input.nextInt();
        
        System.out.println("\n");
        System.out.print("Masukkan Tanggal Kembali (1 - 31)   : ");
        tglKembali = input.nextInt();
        
        System.out.print("Masukkan Bulan Kembali (1 - 12)     : ");
        blnKembali = input.nextInt();
        
        System.out.print("Masukkan Tahun Kembali (xxxx)       : ");
        thnKembali = input.nextInt();

        System.out.println("\n #########################################################################################");
        cariMember(idMember);

        System.out.println("\n #########################################################################################");
        System.out.println("Tanggal Pinjam                    : " + tglRent + " - " + blnRent + " - " + thnRent);
        System.out.println("Tanggal Kembali                   : " + tglKembali + " - " + blnKembali + " - " + thnKembali);

        int durasiRental = durasiRental(tglRent, blnRent, thnRent, tglKembali, blnKembali, thnKembali);
        System.out.println("Lama Sewa                         : " + durasiRental + " hari");

        String jenisMember = dapatJenisMember(idMember);
        if(jenisMember == "Silver") {
            System.out.println("Total Sewa                    : Rp. " + SMember.jumlahBiaya(durasiRental));
            System.out.println("Jumlah Poin                   : " + SMember.dapatPoin(durasiRental));
        
        } else if(jenisMember == "Gold") {
            System.out.println("Total Sewa                    : Rp. " + GMember.jumlahBiaya(durasiRental));
            System.out.println("Jumlah Poin                   : " + GMember.dapatPoin(durasiRental));
            System.out.println("Jumlah Cashback               : Rp. " + GMember.getuangKembali());
            
        } else if(jenisMember == "Platinum") {
            System.out.println("Total Sewa                    : Rp. " + PMember.jumlahBiaya(durasiRental));
            System.out.println("Jumlah Poin                   : " + PMember.dapatPoin(durasiRental));
            System.out.println("Jumlah Cashback               : Rp. " + PMember.getuangKembali());
            System.out.println("Bonus Pulsa                   : Rp. " + PMember.dapatBonus(durasiRental));
            
        } else {
            System.out.println("");
        }
    }
}
