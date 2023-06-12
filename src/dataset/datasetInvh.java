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
public class datasetInvh {
    private ArrayList<String> idinvoice;
    private ArrayList<String> tglinvh;
    private ArrayList<Integer> jumlah; 
    private ArrayList<String> ongkirinvh; 
    private ArrayList<String> total; 
    private ArrayList<String> statinv; 
    private ArrayList<String> alamat; 
    private ArrayList<String> kotainvh; 
    private ArrayList<String> kodeposinvh; 
    private ArrayList<String> tlpinvh; 
    private ArrayList<String> tarif; 
    private ArrayList<Integer> jmlhberat; 
    private ArrayList<String> nmpenerima;
   
    public datasetInvh(){
        idinvoice = new ArrayList<>();
        tglinvh = new ArrayList<>();
        jumlah = new ArrayList<>();
        ongkirinvh = new ArrayList<>();
        total = new ArrayList<>();
        statinv = new ArrayList<>();
        alamat = new ArrayList<>();
        kotainvh = new ArrayList<>();
        kodeposinvh = new ArrayList<>();
        tlpinvh = new ArrayList<>();
        tarif = new ArrayList<>();
        jmlhberat = new ArrayList<>();
        nmpenerima = new ArrayList<>();
    }
    
    public void addIdInvoice(String value){
        this.idinvoice.add(value);
     }
    public ArrayList<String> getDataidInvoice(){
        return this.idinvoice;
    }
    
    public void addTglinvh(String value){
        this.tglinvh.add(value);
     }
    public ArrayList<String> getDataTglinvh(){
        return this.tglinvh;
    }
    
    public void addJumlah(int value){
        this.jumlah.add(value);
     }
    public ArrayList<Integer> getDataJumlah(){
        return this.jumlah;
    }
    
    public void addtOngkirinvh(String value){
        this.ongkirinvh.add(value);
    }
    
    public ArrayList<String> getDataOngkirinvh(){
        return this.ongkirinvh;
    }
    
    public void addTotal(String value){
        this.total.add(value);
    }
    
    public ArrayList<String> getDataTotal(){
        return this.total;
    }
    
    public void addStatinv(String value){
        this.statinv.add(value);
    }
    
    public  ArrayList<String> getDataStatinv(){
        return this.statinv;
    }
    
    public void addAlamat(String value){
        this.alamat.add(value);
    }
    
    public  ArrayList<String> getDataAlamat(){
        return this.alamat;
    }
    
    public void addKotaInvh(String value){
        this.kotainvh.add(value);
    }
    
    public  ArrayList<String> getDataKotaInvh(){
        return this.kotainvh;
    }
    public void addKodeposInvh(String value){
        this.kodeposinvh.add(value);
    }
    
    public  ArrayList<String> getDataKodepos(){
        return this.kodeposinvh;
    }
    
    public void addTlpInvh(String value){
        this.tlpinvh.add(value);
    }
    
    public  ArrayList<String> getDataTlpinvh(){
        return this.tlpinvh;
    }
    
    public void addTarif(String value){
        this.tarif.add(value);
    }
    
    public  ArrayList<String> getDataTarif(){
        return this.tarif;
    }
    
    public void addJmlhberat(int value){
        this.jmlhberat.add(value);
    }
    
    public  ArrayList<Integer> getDataJmlhberat(){
        return this.jmlhberat;
    }
    
    public void addNmpenerima(String value){
        this.nmpenerima.add(value);
    }
    
    public ArrayList<String> getDataNmpenerima(){
        return this.nmpenerima;
    }
}
