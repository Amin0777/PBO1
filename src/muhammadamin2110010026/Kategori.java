/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammadamin2110010026;

/**
 *
 * @author ACER
 */
public class Kategori {
    private int pilKategori;
    
    public Kategori(){}
    
     public Kategori(String value){
        System.out.print(value);
    }
     
     public void setPilKategori(int kategori){
        if(kategori == 1){
            System.out.print("ACER");
            pilKategori = 3500000;
        }else if(kategori == 2){
            System.out.print("ASUS");
            pilKategori = 4000000;
        }else{
            System.out.println("PILIHAN TIDAK ADA");
        }
    }
    public int getPilKategori(){
        return this.pilKategori;
    }
}
