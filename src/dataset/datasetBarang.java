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
public class datasetBarang {
    private ArrayList<String> idbrg;
    private ArrayList<String> nmbrg;
    private ArrayList<String> satuan;
    private ArrayList<String> hrg;
    private ArrayList<String> ktrg;
    private ArrayList<Integer> berat; 
    private ArrayList<Integer> dilihat;
    private ArrayList<Integer> dibeli; 
    private ArrayList<String> katakunci; 
    private ArrayList<Integer> stok;
    
    public datasetBarang(){
        idbrg = new ArrayList<>();
        nmbrg = new ArrayList<>();
        satuan = new ArrayList<>();
        hrg = new ArrayList<>();
        ktrg = new ArrayList<>();
        berat = new ArrayList<>();
        dilihat = new ArrayList<>();
        dibeli = new ArrayList<>();
        katakunci = new ArrayList<>();
        stok = new ArrayList<>();
    }
    
    public void addIdbarang(String value){
        this.idbrg.add(value);
    }
    
    public ArrayList<String> getDataIdbarang(){
        return this.idbrg;
    }
    
    public void addNmbrg(String value){
        this.nmbrg.add(value);
    }
    
    public ArrayList<String> getDataNmbrg(){
        return this.nmbrg;
    }
    
    public void addSatuan(String value){
        this.satuan.add(value);
    }
    
    public ArrayList<String> getDataSatuan(){
        return this.satuan;
    }
    
    public void addHrg(String value){
        this.hrg.add(value);
    }
    
    public ArrayList<String> getDataHrg(){
        return this.hrg;
    }
    
    public void addKtrg(String value){
        this.ktrg.add(value);
    }
    
    public ArrayList<String> getDataKtrg(){
        return this.ktrg;
    }
    
    public void addBerat(int value){
        this.berat.add(value);
    }
    
    public ArrayList<Integer> getDataBerat(){
        return this.berat;
    }
    
    public void addDilihat(int value){
        this.dilihat.add(value);
    }
    
    public ArrayList<Integer> getDataDilihat(){
        return this.dilihat;
    }
    
    public void addDibeli(int value){
        this.dibeli.add(value);
    }
    
    public ArrayList<Integer> getDataDibeli(){
        return this.dibeli;
    }
    
    public void addKatakunci(String value){
        this.katakunci.add(value);
    }
    
    public ArrayList<String> getDataKatakunci(){
        return this.katakunci;
    }
    
    public void addStok(int value){
        this.stok.add(value);
    }
    
    public ArrayList<Integer> getDataStok(){
        return this.stok;
    }
}
