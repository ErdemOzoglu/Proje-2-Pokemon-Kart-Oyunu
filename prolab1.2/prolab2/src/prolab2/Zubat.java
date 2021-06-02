
package prolab2;

public class Zubat extends Pokemon {
    
    private int hasarpuani=50;
    public boolean kartkullanidimi=false;
    
     public Zubat(String pokemonadi,String pokemontip){
        
        super(pokemonadi,pokemontip);
    }
    public Zubat(){
      
        super();  
    }
    public void setkartkullanidimi(boolean kartkullanidimi){
        this.kartkullanidimi=kartkullanidimi;
    }
     public boolean getkartkullanidimi(){
       return this.kartkullanidimi;
    }

    @Override
   public int hasarpuanigoster(){
     return this.hasarpuani;
  }  
    
    
}
