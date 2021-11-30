/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulationproject;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Period;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 *
 * @author Acer
 */
public class Others {
    static Map<String, List<String>> yanaMember = new HashMap<String, List<String>>();
    static int jamRental;
    
    // Memasukkan data member 
    static void inputMember() {
        
        // insert M001 
        List<String> valueOne = new ArrayList<String>();
        valueOne.add("Mr. X");
        valueOne.add("Silver");
        
        // insert M002 
        List<String> valueTwo = new ArrayList<String>();
        valueTwo.add("Mr. Y");
        valueTwo.add("Gold");
        
        // insert M003 to value list
        List<String> valueThree = new ArrayList<String>();
        valueThree.add("Mr. Z");
        valueThree.add("Platinum");
        
        // insert all values paired to key
        yanaMember.put("M001", valueOne);
        yanaMember.put("M002", valueTwo);
        yanaMember.put("M003", valueThree);
    }
    
    
    // Mencari data di arrayList
    static void cariMember(String idMember) {       
         
        if(yanaMember.containsKey(idMember)) {
            
            for(Map.Entry<String, List<String>> entry : yanaMember.entrySet()) {
                if(entry.getKey().equals(idMember)) {
                    
                String key = entry.getKey();
                List<String> values = entry.getValue();
                
                System.out.println("ID Member                        : " + key);
                System.out.println("Nama Member                      : " + values.get(0));
                System.out.println("Jenis Member                     : " + values.get(1));
                
                }
            }
        } else {
                System.out.println("Belum terdaftar sebagai member");
        }
    }
    
    static String dapatJenisMember(String idMember) {
        
        String jenisMember = null;
        if(yanaMember.containsKey(idMember)) {
            for(Map.Entry<String, List<String>> entry : yanaMember.entrySet()) {
                if(entry.getKey().equals(idMember)) {
                    
                List<String> values = entry.getValue();               
                jenisMember = values.get(1);
                }
            }
        }
        return jenisMember;
    }
    
    static int durasiRental(int tglRent, int blnRent, int thnRent, int tglKembali, int blnKembali, int thnKembali) {
        
        if(thnKembali >= thnRent) {
            if(blnKembali >= blnRent) {
                LocalDateTime rent = LocalDateTime.of(thnRent, blnRent, tglRent, 23, 59, 59);
                LocalDateTime returned = LocalDateTime.of(thnKembali, blnKembali, tglKembali, 23, 59, 59);

                    Duration duration = Duration.between(rent, returned);
        
                    jamRental = (int) duration.toDays();
                 
            } else {
                System.out.println("Tanggal kembali tidak valid, silakan ulangi program");
            }
        } else {
            System.out.println("Tanggal kembali tidak valid, silakan ulangi program");
        }
        
        return jamRental;
    }
}

