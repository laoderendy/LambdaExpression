package com.juaracoding.main;

interface UcapanDua{
	public String salam(String nama);
}
public class contohLambda2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UcapanDua ucapan1 = (nama) -> {
			return "Selamat Sore, "+nama;
		};
		
		System.out.println(ucapan1.salam("Laode"));

		UcapanDua ucapan2 = (nama) -> {
			return "Selamat Sore, "+nama;
		};
	
		System.out.println(ucapan2.salam("LaOdE"));

	}
}
