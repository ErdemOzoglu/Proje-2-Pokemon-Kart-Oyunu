
package prolab2;

public class Charmander extends Pokemon {
    
    private int hasarpuani=65;
    public boolean kartkullanidimi=false;
    
    public Charmander(String pokemonadi,String pokemontip){
        
        super(pokemonadi,pokemontip);
    }
    public Charmander(){
      
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
