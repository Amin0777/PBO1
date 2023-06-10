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
public class datasetKota {
    private ArrayList<String>idkota; 
    private ArrayList<String>nmkota; 
    private ArrayList<String>ongkir;
    
    public datasetKota(){
        idkota= new ArrayList<>();
        nmkota= new ArrayList<>();
        ongkir= new ArrayList<>();
    }
    
    public void addIdkota(String value){
        this.idkota.add(value);
    }
    
    public ArrayList<String> getDataidkota(){
        return this.idkota;
    }
    
    public void addNmkota(String value){
        this.nmkota.add(value);
    }
    
    public ArrayList<String> getDatanmkota(){
        return this.nmkota;
    }
    
    public void addOngkir(String value){
        this.ongkir.add(value);
    }
    
    public ArrayList<String> getDataOngkir(){
        return this.ongkir;
    }
}
