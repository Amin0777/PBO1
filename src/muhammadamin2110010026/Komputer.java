/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammadamin2110010026;

import java.util.ArrayList;
import forms.formUtama;

/**
 *
 * @author ACER
 */
public class Komputer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pelanggan obj = new Pelanggan();
        System.out.println("Pelanggan :");
        obj.setIDPLG("01");
        obj.setEMAIL("amin123@gmail.com");
        obj.setPASS("0000");
        obj.setNAMAPLG("Amin");
        obj.setALAMATPLG("JL.Gerilya");
        obj.setKOTAPLG("Banjarmasin");
        obj.setTELEPONPLG("081234");
        System.out.println("ID : "+obj.getIDPLG()+"\n Email : "+obj.getEMAIL() +"\n PASS : "+obj.getPASS() +"\n NAMA PELANGGAN : "+obj.getNAMAPLG()+ "\n ALAMAT PELANGGAN: "+obj.getALAMATPLG() +"\n KOTA PELANGGAN : "+obj.getKOTAPLG() +"\n TELEPON PELANGGAN : "+obj.getTELEPONPLG());
        //Kategori
        System.out.println("\nKategori :");
        obj.addNamaKategori("Monitor");
        System.out.println("Kategori : "+obj.getNamaKategori());
        //Barang
        Barang barang1 = new Barang();
        System.out.println("\nBarang :");
        barang1.setIdbrg("Brg01");
        barang1.setNmbrg("Acer");
        System.out.println("ID Barang : "+barang1.getIdbrg()+"\nNama Barang : "+barang1.getNmbrg());
        //Invd
        Invd invdobj = new Invd();
        System.out.println("\nInvd :");
        invdobj.setIddetail("Invd001");
        System.out.println("ID Detail : "+invdobj.getIddetail());
        //Invh
        Invh invhobj = new Invh();
        System.out.println("\nInvh :");
        invhobj.setIdinvoice("Invoice01");
        System.out.println("ID Invoice : "+invhobj.getIdinvoice());
        //tes
        ArrayList<String> nmbarang = new ArrayList<>();
        nmbarang.add("Acer");
        nmbarang.add("Asus");
        nmbarang.add("Lenovo");
        nmbarang.add("HP");
        
        System.out.println(String.valueOf(nmbarang.size()));
        System.out.println(nmbarang.get(3));
        
        new formUtama().setVisible(true);
    }
    
    
}
