package com.soal1.main;

import java.util.Scanner;

public class Muhammad_FIrza_Arie_Perdana_Soal4 {
	public static void main(String[] args) {

		int i, j;        
		int tinggi, lebar;
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan tinggi piramida :");
		tinggi = input.nextInt();
		System.out.println("Masukkan tinggi piramida :");
		lebar = input.nextInt();
		for (i=0; i<tinggi; i++){      
				for (j=lebar-i; j>1; j--){   
				System.out.print(" ");   
				}    
					for (j=0; j<=i; j++ ){        
					System.out.print("* ");   
					}    
			System.out.println();   
			}   

	}
}
