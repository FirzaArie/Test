package com.soal1.main;

import java.util.Scanner;

public class Muhammad_FIrza_Arie_Perdana_Soal5 {
	public static void main(String[] args) {
		int angka;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan angka sepuasnya, jika sudah puas masukkan x :");
	    while (scan.hasNextInt()) 
	    {
	    angka = scan.nextInt();                     
	    total += angka;
	    } 
	    scan.close();
		System.out.println("Total : " +total);

		}
}
