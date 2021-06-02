
package prolab2;

public class Jigglypuff extends Pokemon{
    private int hasarpuani=70;
    public boolean kartkullanidimi=false;
    
    public Jigglypuff(String pokemonadi,String pokemontip){
        
        super(pokemonadi,pokemontip);
    }
    public Jigglypuff(){
      
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
