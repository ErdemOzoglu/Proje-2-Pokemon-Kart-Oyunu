
package prolab2;

public class Pikachu extends Pokemon {
   
    private int hasarpuani=40;
    public boolean kartkullanidimi=false;
     public int ara=1;
    
    public Pikachu(String pokemonadi,String pokemontip){
        
        super(pokemonadi,pokemontip);
    }
    public Pikachu(){
      
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
