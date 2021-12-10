/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingproject;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class SortingMachine {
    int [] x = new int [100];
    int y;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Banyak Input data(n) : ");
        this.y = input.nextInt();
            for(int i = 0; i < y; i++){
                System.out.println("Masukan bilangan ke - " + (i+1) + " : ");
                this.x[i] = input.nextInt();
            }
    }
    double hitungRerata(int[] data){
        double sum = 0;
        for(int i = 0; i < y; i++){
            sum += data[i];
        }
        double rerata = sum / this.y;
        return rerata;
    }
    int bilMin(int[] data){
        int min = data[0];
        for(int i = 0; i < this.y; i++){
            if (min > data[i]){
                min = data[i];
            }
        }
        return min;
    }
    int bilMax(int[] data){
        int max = data[0];
        for(int i = 0; i < this.y; i++){
            if (max < data[i]){
                max = data[i];
            }
        }
        return max;
    }
    void sorting(int[]data){
        for (int i = 0; i < y; i++){
            for (int k = 1; k < (y-i); k++){
                if (data[k-1] > data[k]){
                    int swap = data[k-1];
                    data[k-1] = data[k];
                    data[k] = swap;
                }
            }
        }      
        for (int i = 0; i < y; i++){
            System.out.print(data[i] +" ");
        }  
    }
    void output(){
    System.out.println("______________________________");
    System.out.println("Nilai Rata-Rata  : " + hitungRerata(x));
    System.out.println("Nilai Minimum    : " + bilMin(x));
    System.out.println("Nilai Maximum    : " + bilMax(x));
    System.out.print("Hasil Sorting Nilai    : "); sorting(x);
    System.out.println("______________________________");
    }   
}

