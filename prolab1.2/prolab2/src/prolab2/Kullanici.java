
package prolab2;

import java.util.Random;

public class Kullanici extends Oyuncu {

      public  Kullanici(int oyuncuid,String oyuncuadi,int skor){
        super(oyuncuid,oyuncuadi,skor);
      }
      public Kullanici(){
        super();
      }  
    
    @Override
    void skorgoster() {
        System.out.println("Kullanıcının Puanı = " + Kullanici.super.getskor());
    }
    Random rand = new Random();
    @Override
    Pokemon kartsec(int x) {
        int b=rand.nextInt(x);
       return this.getkartlistesi(b);
    }
    
}
