/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritma;
import java.util.*;
/**
 *
 * @author User
 */
public class Aplikasi {
    
    public static void main(String[] args) {
        String nimScan = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan NIM anda : ");
        nimScan = scan.next();

        NIM nim = new NIM (nimScan);
        

        System.out.println("==========================");
        System.out.println("NIM \t\t\t: " + nimScan);
        System.out.println("Jenjang Pendidikan \t: " + nim.jenjangPendidikan());
        System.out.println("Angkatan \t\t: " + nim.angkatan());
        System.out.println("Fakultas \t\t: " + nim.fakultas());
        System.out.println("Jurusan \t\t: " + nim.jurusan());
        System.out.println("Jenis Kelamin \t\t: " + nim.jenisKelamin());
        System.out.println("No Urut Mahasiswa \t: " + nim.nourut());
    }
}


