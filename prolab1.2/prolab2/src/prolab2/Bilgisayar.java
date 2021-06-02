
package prolab2;

import java.util.Random;

public class Bilgisayar extends Oyuncu {
   
    public  Bilgisayar(int oyuncuid,String oyuncuadi,int skor){
        super(oyuncuid,oyuncuadi,skor);
    }
    public Bilgisayar(){
        super();
    }
    
    @Override
    void skorgoster() {
        System.out.println("Bilgisayarın Puanı = " + Bilgisayar.super.getskor());
    }
     int a=0;
     Random rand = new Random();
    @Override
    Pokemon kartsec(int x) {
       int b=rand.nextInt(x);
       return this.getkartlistesi(b);
    }
    
}
