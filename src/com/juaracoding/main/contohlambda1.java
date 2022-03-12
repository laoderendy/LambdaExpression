package com.juaracoding.main;


interface Person{
	public void identity();
}

interface Ucapan{
	public String salam();
}

public class contohlambda1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nama = "Laode";
		
		Person id1 = () -> {
			System.out.println("Nama :"+nama);
		};
		
		id1.identity();
		
		Ucapan ucapan = () -> {
			return "Salam Mantap";
		};
		
		System.out.println(ucapan.salam());
		
}
}