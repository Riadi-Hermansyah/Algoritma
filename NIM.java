/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algoritma;

/**
 *
 * @author User
 */
public class NIM {

   
    private String nim;

    public NIM(String nim) {
        this.nim = nim;
    }

    

    // jejang pendidikan
    public String jenjangPendidikan() {
        String jenjang = this.nim.substring(0, 1);

        if (jenjang.equalsIgnoreCase("1")) {
            return "S1 (Sarjana)";
        }else if (jenjang.equalsIgnoreCase("2")) {
            return "S2 (Magister)";
        }else if (jenjang.equalsIgnoreCase("3")) {
            return "S3 (Doktor)";
        }
        return "NOT FOUND";
    }

    // angkatan 
    public String angkatan() {
        if (this.nim.substring(1,3).equalsIgnoreCase("18")) {
            return "2018";
        }else if (this.nim.substring(1,3).equalsIgnoreCase("19")) {
            return "2019";
        }else if (this.nim.substring(1,3).equalsIgnoreCase("20")) {
            return "2020";
        }else {
            return "NOT FOUND";
        }
    }

    // fakultas
    public String fakultas() {
        String fac =  this.nim.substring(3,4);
        if (fac.equalsIgnoreCase("1")) {
            return "Tarbiyah dan keguruan";
        }else if (fac.equalsIgnoreCase("2")) {
            return "Syari'ah dan Hukum";
        }else if (fac.equalsIgnoreCase("3")) {
            return "Ushuluddin";
        }else if (fac.equalsIgnoreCase("4")) {
            return "Dakwah dan Kounikasi";
        }else if (fac.equalsIgnoreCase("5")) {
            return "Sains dan Teknologi";    
        }else {
            return "NOT FOUND";
        }
    }


    // jurusan
    public String jurusan() {
        if (this.nim.substring(4, 6).equalsIgnoreCase("01")) {
            return "Teknik Informatika";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("02")) {
            return "Teknik Industri";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("03")) {
            return "Sistem Informasi";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("04")) {
            return "Matematika";
        }else if (this.nim.substring(4, 6).equalsIgnoreCase("05")) {
            return "Teknik Elektro";
        }
        return "NOT FOUND";
    }

    // jeniskelain
    public String jenisKelamin() {
        if (this.nim.substring(6, 7).equalsIgnoreCase("1")) {
            return "Laki-Laki";
        }else if (this.nim.substring(6, 7).equalsIgnoreCase("2")){
            return "Perempuan";
        }
        return "NOT FOUND";
    }

    // no urut 
    public String nourut() {
        return this.nim.substring(7,11);
    }
}
