/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammadamin2110010026;
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
        obj.setIDPLG("01");
        obj.setEMAIL("amin123@gmail.com");
        obj.setPASS("0000");
        obj.setNAMAPLG("Amin");
        obj.setALAMATPLG("JL.Gerilya");
        obj.setKOTAPLG("Banjarmasin");
        obj.setTELEPONPLG("081234");
        System.out.println("ID : "+obj.getIDPLG()+"\n Email : "+obj.getEMAIL() +"\n PASS : "+obj.getPASS() +"\n NAMA PELANGGAN : "+obj.getNAMAPLG()+ "\n ALAMAT PELANGGAN: "+obj.getALAMATPLG() +"\n KOTA PELANGGAN : "+obj.getKOTAPLG() +"\n TELEPON PELANGGAN : "+obj.getTELEPONPLG());
        obj.setPilKategori(1);
        System.out.println(" Harga : "+obj.getPilKategori());
    }
    
    
}
