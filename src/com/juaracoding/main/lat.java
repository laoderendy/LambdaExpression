package com.juaracoding.main;

import java.util.Scanner;

interface Karyawan{
	public void identity();
}

public class lat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int id, salary; 
		String nama,jabatan;
		id = scan.nextInt();
		nama = scan.next();
		jabatan = scan.next();
		salary = scan.nextInt();
		
		Karyawan id1 = () -> {
			System.out.println("ID: "+id);
			System.out.println("Nama: "+nama);
			System.out.println("Jabatan: "+jabatan);
			System.out.println("Salary: "+salary);
		};
		id1.identity();	

	}

}
