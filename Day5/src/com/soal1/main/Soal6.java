package com.soal1.main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Soal6 {
public static void main(String[] args) {

    ArrayList<Integer> numbers = new ArrayList<>(); 
    Scanner scan = new Scanner(System.in); 
    System.out.println("Masukkan angka yang akan di sort. Ketika sudah ketik x : "); 
    int i = 0;
    while (scan.hasNextInt()) {//                 
        numbers.add(scan.nextInt());
        i++;                 
    } 
    scan.close();
    Collections.sort(numbers);
    System.out.println("Hasil sort : "); 
    for (int n : numbers) {
    	System.out.println(n);
    }
}
}
