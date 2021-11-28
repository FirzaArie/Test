package com.soal1.main;

public class Muhammad_FIrza_Arie_Perdana_Soal1 {
	public static void main(String[] args) {
		int temp;    
		int a[]={200, 100, 75, 150, 50};  
		for (int i = 0; i < a.length; i++)   
		{  
			for (int j = i + 1; j < a.length; j++)   
			{  
				if (a[i] < a[j])   
				{  
					temp = a[i];  
					a[i] = a[j];  
					a[j] = temp;  
				}  
			}  
		}    
		
		for (int i = 0; i <=a.length - 1; i++)   
		{  
		System.out.println("Rp. "+a[i]+ ",000.00");  
		}  
		}
}
