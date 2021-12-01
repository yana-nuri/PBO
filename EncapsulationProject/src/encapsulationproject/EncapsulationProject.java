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
        MemberSilver silver = new MemberSilver();
        MemberGold gold = new MemberGold();
        MemberPlatinum platinum = new MemberPlatinum();

        inputMember();

        String idMember;
        int tanggalPenyewaan, bulanPenyewaan, tahunPenyewaan, tanggalPengembalian, bulanPengembalian, tahunPengembalian;
        Scanner input = new Scanner(System.in);

        System.out.println(" ###################### Program Pengembalian Rental Game Console ######################");
        
        System.out.print("Masukkan ID Member                  : ");
        idMember = input.nextLine();
        
        System.out.print("Masukkan Tanggal Pinjam (1 - 31)    : ");
        tanggalPenyewaan = input.nextInt();
        
        System.out.print("Masukkan Bulan Pinjam (1 - 12)      : ");
        bulanPenyewaan = input.nextInt();
        
        System.out.print("Masukkan Tahun Pinjam (xxxx)        : ");
        tahunPenyewaan = input.nextInt();
        
        System.out.println("\n");
        System.out.print("Masukkan Tanggal Kembali (1 - 31)   : ");
        tanggalPengembalian = input.nextInt();
        
        System.out.print("Masukkan Bulan Kembali (1 - 12)     : ");
        bulanPengembalian = input.nextInt();
        
        System.out.print("Masukkan Tahun Kembali (xxxx)       : ");
        tahunPengembalian = input.nextInt();

        System.out.println("\n #########################################################################################");
        cariMember(idMember);

        System.out.println("\n #########################################################################################");
        System.out.println("Tanggal Peminjaman                    : " + tanggalPenyewaan + " - " + bulanPenyewaan + " - " + tahunPenyewaan);
        System.out.println("Tanggal Pengembalian                   : " + tanggalPengembalian + " - " + bulanPengembalian + " - " + tahunPengembalian);

        int durasiRental = durasiRental(tanggalPenyewaan, bulanPenyewaan, tahunPenyewaan, tanggalPengembalian, bulanPengembalian, tahunPengembalian);
        System.out.println("Lama Penyewaanm00                         : " + durasiRental + " hari");

        String jenisMember = dapatJenisMember(idMember);
        if(jenisMember == "Silver") {
            System.out.println("Total Sewa                    : Rp. " + silver.jumlahBiaya(durasiRental));
            System.out.println("Jumlah Poin                   : " + silver.dapatPoin(durasiRental));
        
        } else if(jenisMember == "Gold") {
            System.out.println("Total Sewa                    : Rp. " + gold.jumlahBiaya(durasiRental));
            System.out.println("Jumlah Poin                   : " + gold.dapatPoin(durasiRental));
            System.out.println("Jumlah Cashback               : Rp. " + gold.getuangKembali());
            
        } else if(jenisMember == "Platinum") {
            System.out.println("Total Sewa                    : Rp. " + platinum.jumlahBiaya(durasiRental));
            System.out.println("Jumlah Poin                   : " + platinum.dapatPoin(durasiRental));
            System.out.println("Jumlah Cashback               : Rp. " + platinum.getuangKembali());
            System.out.println("Bonus Pulsa                   : Rp. " + platinum.dapatBonus(durasiRental));
            
        } else {
            System.out.println("");
        }
    }
}
