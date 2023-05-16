/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package muhammadamin2110010026;

/**
 *
 * @author ACER
 */
public class Pelanggan extends Kategori {
    private String id, email, pass, namaplg, alamatplg, kotaplg, teleponplg;
    
    public Pelanggan(){}
    
    public void setIDPLG(String id){
        this.id = id;
    }
    
    public String getIDPLG(){
        return this.id;
    }
    
    public void setEMAIL(String email){
        this.email = email;
    }
    
    public String getEMAIL(){
        return this.email;
    }
    
    public void setPASS(String pass){
        this.pass = pass;
    }
    
    public String getPASS(){
        return this.pass;
    }
    
    public void setNAMAPLG(String namaplg){
        this.namaplg = namaplg;
    }
    
    public String getNAMAPLG(){
        return this.namaplg;
    }
    public void setALAMATPLG(String alamatplg){
        this.alamatplg = alamatplg;
    }
    
    public String getALAMATPLG(){
        return this.alamatplg;
    }
    
    public void setKOTAPLG(String kotaplg){
        this.kotaplg = kotaplg;
    }
    
    public String getKOTAPLG(){
        return this.kotaplg;
    }
    
    public void setTELEPONPLG(String teleponplg){
        this.teleponplg = teleponplg;
    }
    
    public String getTELEPONPLG(){
        return this.teleponplg;
    }
}
