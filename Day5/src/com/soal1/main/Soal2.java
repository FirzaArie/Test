package com.soal1.main;

public class Soal2 {
public static void main(String[] args) {
     for (int i = 1; i <= 4; i++){
    	 for (int j = 1; j <= 3; j++){
             if(j == 2 && i == 2 ) {
             System.out.print(" ");
             }
             else if(j == 3 && i == 3) {
            	 System.out.print(" ");	 	    	 
             } 
             else if(j == 2 && i == 3) {
            	 System.out.print(" ");	 	    	 
             } 	
             else if(j == 3 && i == 2) {
            	 System.out.print(" ");	 	    	 
             } 	
             else {
                 System.out.print("#");	 
             }
         }
         System.out.println("#");
     }

}
}
