/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sfauzi.quis1_a_3015;

/**
 *
 * @author S FAUZI
 */

//Sub-Class Penduduk
public class Mahasiswa_3015 extends Penduduk_3015{
    String nim_3015;
    float ipk_3015;
    
    public void tampilDataMahasiswa_3015(){
        tampilDataPenduduk_3015();
        System.out.println("NIM         : "+nim_3015);
        System.out.println("IPK         : "+ipk_3015);
    }
    public void tampilDataBeasiswa_3015(){
        if(ipk_3015 > 3.5){
            System.out.println("Mahasiswa bernama "+nama_3015+" berhak mendapatkan beasiswa");
        }else{
            System.out.println("Mahasiswa bernama "+nama_3015+" tidak berhak mendapatkan beasiswa");
        }
    }
}
