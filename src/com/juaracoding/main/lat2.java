package com.juaracoding.main;

import java.util.Scanner;

interface BangunDatar{
	public int persegipanjang(int p,int l);
	
}

public class lat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int panjang,lebar;
		int alas,tinggi,sisi;
		
		BangunDatar bangun1 = (p,l)-> {
			return p*l;
		};
		
		panjang = scan.nextInt();
		lebar = scan.nextInt();
		System.out.println("Luas Persegi Panjang = " +panjang);
		System.out.println("Lebar Persegi Panjang = " +lebar);
		System.out.println(bangun1.persegipanjang(panjang, lebar));
		
	}

}
