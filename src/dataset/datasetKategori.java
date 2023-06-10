/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dataset;

import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class datasetKategori {
    private ArrayList<String> idkategori;
    private ArrayList<String> namakategori;
    
    public datasetKategori(){
        idkategori = new ArrayList<>();
        namakategori = new ArrayList<>();
    }

    public void addIdKategori(String value){
        this.idkategori.add(value);
     }
    public ArrayList<String> getDataidkategori(){
        return this.idkategori;
    }
    
    public void addNamaKategori(String value){
        this.namakategori.add(value);
     }
    public ArrayList<String> getDataNamaKategori(){
        return this.namakategori;
    }
}
