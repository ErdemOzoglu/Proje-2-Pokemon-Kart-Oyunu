
package prolab2;

public class Psyduck extends Pokemon{
    
    private int hasarpuani=20;
    public boolean kartkullanidimi=false;
    
    public Psyduck(String pokemonadi,String pokemontip){
        
        super(pokemonadi,pokemontip);
    }
    public Psyduck(){
      
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
