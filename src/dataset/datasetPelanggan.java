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
public class datasetPelanggan {
    private ArrayList<String>id; 
    private ArrayList<String>email; 
    private ArrayList<String>pass;
    private ArrayList<String>namaplg; 
    private ArrayList<String>alamatplg; 
    private ArrayList<String>kotaplg;
    private ArrayList<String>kodeposplg;
    private ArrayList<String>teleponplg;
    
    public datasetPelanggan(){
        id= new ArrayList<>();
        email= new ArrayList<>();
        pass= new ArrayList<>();
        namaplg= new ArrayList<>();
        alamatplg= new ArrayList<>();
        kotaplg= new ArrayList<>();
        kodeposplg= new ArrayList<>();
        teleponplg= new ArrayList<>();
    }
    
    public void addId(String value){
        this.id.add(value);
    }
    
    public ArrayList<String> getDataid(){
        return this.id;
    }
    
    public void addEmail(String value){
        this.email.add(value);
    }
    
    public ArrayList<String> getDataEmail(){
        return this.email;
    }
    
    public void addPass(String value){
        this.pass.add(value);
    }
    
    public ArrayList<String> getDatapass(){
        return this.pass;
    }
    
    public void addNamaplg(String value){
        this.namaplg.add(value);
    }
    
    public ArrayList<String> getDatanamaplg(){
        return this.namaplg;
    }
    public void addAlamtplg(String value){
        this.alamatplg.add(value);
    }
    
    public ArrayList<String> getDataalamatplg(){
        return this.alamatplg;
    }
    
    public void addKotaplg(String value){
        this.kotaplg.add(value);
    }
    
    public ArrayList<String> getDataKotaplg(){
        return this.kotaplg;
    }
    
    public void addKodeposplg(String value){
        this.kodeposplg.add(value);
    }
    
    public ArrayList<String> getDatakodeposplg(){
        return this.kodeposplg;
    }
    
    public void addTeleponplg(String value){
        this.teleponplg.add(value);
    }
    
    public ArrayList<String> getDatateleponplg(){
        return this.teleponplg;
    }
}
