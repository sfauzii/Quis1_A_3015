/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.sfauzi.quis1_a_3015;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author S FAUZI
 */
public class Quis1_A_3015 {

    public static void main(String[] args) {
//        Membuat Objek Baru
        Mahasiswa_3015 A = new Mahasiswa_3015();
        Mahasiswa_3015 B = new Mahasiswa_3015();
        Dosen_3015 C = new Dosen_3015();
        Dosen_3015 D = new Dosen_3015();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //input data dari user

        try {
//            Mahasiswa A
            System.out.println("NIK     : ");
            A.NIK_3015 = br.readLine();
            System.out.println("Nama    : ");
            A.nama_3015 = br.readLine();
            System.out.println("Umur    : ");
            A.umur_3015 = Integer.parseInt(br.readLine());
            System.out.println("Alamat  : ");
            A.alamat_3015 = br.readLine();
            System.out.println("NIM     : ");
            A.nim_3015 = br.readLine();
            System.out.println("IPK     : ");
            A.ipk_3015 = Float.parseFloat(br.readLine());
            System.out.println();
            
//            Mahasiswa B
            System.out.println("NIK     : ");
            B.NIK_3015 = br.readLine();
            System.out.println("Nama    : ");
            B.nama_3015 = br.readLine();
            System.out.println("Umur    : ");
            B.umur_3015 = Integer.parseInt(br.readLine());
            System.out.println("Alamat  : ");
            B.alamat_3015 = br.readLine();
            System.out.println("NIM     : ");
            B.nim_3015 = br.readLine();
            System.out.println("IPK     : ");
            B.ipk_3015 = Float.parseFloat(br.readLine());
            System.out.println();
            
//            Dosen C
            System.out.println("NIK             : ");
            C.NIK_3015 = br.readLine();
            System.out.println("Nama            : ");
            C.nama_3015 = br.readLine();
            System.out.println("Umur            : ");
            C.umur_3015 = Integer.parseInt(br.readLine());
            System.out.println("Alamat          : ");
            C.alamat_3015 = br.readLine();
            System.out.println("NIDN            : ");
            C.NIDN_3015 = br.readLine();
            System.out.println("Golongan        : ");
            C.gol_3015 = br.readLine();
            System.out.println("Gaji Pokok      : ");
            C.gajiPokok_3015 = Integer.parseInt(br.readLine());
            System.out.println("");
            
//            Dosen D
            System.out.println("NIK             : ");
            D.NIK_3015 = br.readLine();
            System.out.println("Nama            : ");
            D.nama_3015 = br.readLine();
            System.out.println("Umur            : ");
            D.umur_3015 = Integer.parseInt(br.readLine()); 
            System.out.println("Alamat          : ");
            D.alamat_3015 = br.readLine();
            System.out.println("NIDN            : ");
            D.NIDN_3015 = br.readLine();
            System.out.println("Golongan        : ");
            D.gol_3015 = br.readLine();
            System.out.println("Gaji Pokok      : ");
            D.gajiPokok_3015 = Integer.parseInt(br.readLine());
            System.out.println("");
            
            System.out.println("==== DATA MAHASISWA ====");
            A.tampilDataMahasiswa_3015();
            A.tampilDataBeasiswa_3015();
            System.out.println("");
            B.tampilDataMahasiswa_3015();
            B.tampilDataBeasiswa_3015();
            
            System.out.println("====== DATA DOSEN ======");
            C.tampilDataDosen_3015();
            System.out.println("Total Pendapatan    : Rp "+C.totalPendapatan_3015());
            System.out.println("");
            System.out.println("Total Pendapatan    : Rp "+D.totalPendapatan_3015());
        }
        catch(IOException eox){
            System.out.println(eox); //berguna dalam menangkap kesalahan
        }
    }
}
