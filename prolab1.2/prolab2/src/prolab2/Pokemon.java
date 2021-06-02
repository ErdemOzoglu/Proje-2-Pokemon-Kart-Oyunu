
package prolab2;

public class Pokemon {
    
   private String pokemonadi;
   private String pokemontip;
   public boolean kartKullanildiMi;
   
  public Pokemon(String pokemonadi,String pokemontip){
      this.pokemonadi=pokemonadi;
      this.pokemontip=pokemontip;
      this.kartKullanildiMi=false;
  } 
  public Pokemon(){
      this.pokemonadi="Bilgi Yok ";
      this.pokemontip="Bilgi Yok ";
      this.kartKullanildiMi=false;
  } 
   public void setpokemonadi(String pokemonadi){
       this.pokemonadi=pokemonadi;
   }
   public String getpokemonadi(){
       return this.pokemonadi;
   } 
    public void setpokemontip(String pokemontip){
       this.pokemontip=pokemontip;
   }
   public String getpokemontip(){
       return this.pokemontip;
   } 
    public void setkartKullanildiMi(boolean kartKullanildiMi){
       this.kartKullanildiMi=kartKullanildiMi;
   }
   public boolean getkartKullanildiMi(){
       return this.kartKullanildiMi;
   } 
  
  public int hasarpuanigoster(){
       return 0;
  }  
  
    
}
