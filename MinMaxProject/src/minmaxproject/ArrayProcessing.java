/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmaxproject;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class ArrayProcessing {
    int [] x  = new int[100];
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
        for(int i=0; i < this.y;i++){
            if (min > data[i]){
                min = data[i];
            }
        }
        return min;
    }
    int bilMax(int[] data){
        int max = data[0];
        for(int i = 0; i < this.y;i++){
            if (max < data[i]){
                max = data[i];
            }
        }
        return max;
    }
    void output(){
    System.out.println("__________________________");
    System.out.println("Nilai Rata-Rata  : " + hitungRerata(x));
    System.out.println("Nilai Minimum    : " + bilMin(x));
    System.out.println("Nilai Maximum    : " + bilMax(x));
    System.out.println("__________________________");
    }
}

