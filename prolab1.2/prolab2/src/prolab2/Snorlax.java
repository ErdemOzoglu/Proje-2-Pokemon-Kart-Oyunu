
package prolab2;

public class Snorlax extends Pokemon{
    
    private int hasarpuani=30;
    public boolean kartkullanidimi=false;
    
    public Snorlax(String pokemonadi,String pokemontip){
        
        super(pokemonadi,pokemontip);
    }
    public Snorlax(){
      
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
