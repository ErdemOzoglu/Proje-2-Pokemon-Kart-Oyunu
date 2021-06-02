
package prolab2;

public class Bulbasaur extends Pokemon{
    
    private int hasarpuani=50;
    public boolean kartkullanidimi=false;
    
    public Bulbasaur(String pokemonadi,String pokemontip){
        
        super(pokemonadi,pokemontip);
    }
    public Bulbasaur(){
      
        super();  
    }
    public void sethasarpuani(int hasarpuani){
        this.hasarpuani=hasarpuani;
    }
     public int gethasarpuani(){
       return this.hasarpuani;
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
