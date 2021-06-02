
package prolab2;

public class Butterfree extends Pokemon {
    
    private int hasarpuani=10;
    public boolean kartkullanidimi=false;
    
    public Butterfree(String pokemonadi,String pokemontip){
        
        super(pokemonadi,pokemontip);
    }
    public Butterfree(){
      
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
