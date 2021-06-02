
package prolab2;

public class Meowth extends Pokemon {
     
    private int hasarpuani=40;
    public boolean kartkullanidimi=false;
    
    public Meowth(String pokemonadi,String pokemontip){
        
        super(pokemonadi,pokemontip);
    }
    public Meowth(){
      
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
