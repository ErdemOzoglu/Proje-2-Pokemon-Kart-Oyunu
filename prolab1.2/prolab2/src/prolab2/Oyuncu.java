    
package prolab2;

import java.util.ArrayList;


public abstract class Oyuncu {
    
    private int oyuncuid ;
    private String oyuncuadi ;
    private int skor ;
    public ArrayList<Pokemon> kartlistesi= new ArrayList<>();
    
    
    
     abstract void skorgoster();
     abstract Pokemon kartsec(int x);
    
    public Oyuncu(){
        this.oyuncuid=0;
        this.oyuncuadi="Belirlenmedi...";
        this.skor=0;
        
    }
    public Oyuncu(int oyuncuid,String oyuncuadi,int skor){
        this.oyuncuid=oyuncuid;
        this.oyuncuadi=oyuncuadi;
        this.skor=skor;
        
    }
    
   public void setoyuncuid(int oyuncuid){
       this.oyuncuid=oyuncuid;
   }
   public int getoyuncuid(){
       return this.oyuncuid;
   } 
   
     public void setoyuncuadi(String oyuncuadi){
       this.oyuncuadi=oyuncuadi;
   }
   public String getoyuncuadi(){
       return this.oyuncuadi;
   } 
   
   
   public void setskor(int skor){
       this.skor=skor;
   }
   public int getskor(){
       return this.skor;
   } 
   
   public void setkartlistesi(Pokemon pokemon){
       kartlistesi.add(pokemon);
   }
   public Pokemon getkartlistesi(int indis){
       return kartlistesi.get(indis);
   } 
   public void silkartlistesi(Pokemon poke){
        kartlistesi.remove(poke);
   }
}
