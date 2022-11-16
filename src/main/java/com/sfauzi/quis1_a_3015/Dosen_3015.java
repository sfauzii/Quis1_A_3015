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
public class Dosen_3015 extends Penduduk_3015 {
    String NIDN_3015,gol_3015;
    int gajiPokok_3015,tunjangan_3015;
    double gajitotal_3015;
    
    public double totalPendapatan_3015(){
        switch(gol_3015){
            case "IIIA":
                tunjangan_3015 = 300000;
            break;
            case "IIIB":
                tunjangan_3015 = 500000;
            break;
            case "IIIC":
                tunjangan_3015 = 700000;
            break;
        }
        gajitotal_3015 = gajiPokok_3015 + tunjangan_3015;
        return gajitotal_3015;
    }
    public void tampilDataDosen_3015(){
        tampilDataPenduduk_3015();
        System.out.println("NIDN        : "+NIDN_3015);
        System.out.println("Golongan    : "+gol_3015);
        System.out.println("Gaji Pokok  : "+gajiPokok_3015);
    }
}
