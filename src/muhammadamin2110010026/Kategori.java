/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammadamin2110010026;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Kategori {
    private ArrayList<String> namaKategori;
    
    public Kategori(){
        namaKategori = new ArrayList<>();
    }    
     public void addNamaKategori(String namakategori){
        if(namakategori.equals("Monitor")){
        this.namaKategori.add("Armageddon");
        this.namaKategori.add("Zowie");
        this.namaKategori.add("Benq");
        }else{
          this.namaKategori.add("Pilihan Tidak Ada");
       }
     }
    public ArrayList<String> getNamaKategori(){
        return this.namaKategori;
    }
}
