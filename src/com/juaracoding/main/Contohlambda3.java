package com.juaracoding.main;

//import java.util.Scanner;

interface Penjumlahan{
	int tambah (int a, int b);
}

public class Contohlambda3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan = new Scanner(System.in);
//		int  ang1 = scan.nextInt();
//		int  ang2 = scan.nextInt();
		
		//Lambda tanpa tipe data
		Penjumlahan jumlahkan1 = (a, b) -> (a+b);
		System.out.println(jumlahkan1.tambah(2,2));
		
		//Lambda use tipe data
		Penjumlahan jumlahkan2 = (int a, int b) -> (a+b);
		System.out.println(jumlahkan2.tambah(289, 200));
		
		//contoh ke 3
		Penjumlahan jumlahkan3 = (int a, int b) -> { 
		return a+b;
		
		};
		
		System.out.println(jumlahkan3.tambah(899,783));

	}

}
