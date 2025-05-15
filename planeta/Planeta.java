package planeta;

import java.util.List;

import persona.*;

public class Planeta {
    
    private List<Persona> habitantes;

    private Integer cantMuseos = 0;

    
    public Planeta(List<Persona> habitantes){
        this.habitantes = habitantes;
    }
    
    public Planeta(List<Persona> habitantes, Integer cantMuseos){
        this.habitantes = habitantes;
        this.cantMuseos = cantMuseos;
    }
    
    public List<Persona> delegacionDestacada(){
    	return habitantes.stream().
    			filter(habitante -> habitante.esDestacada()).
    			toList();
    }
    
    public Integer valorInicialDeDefensa() {
    	return habitantes.stream().
    			filter(habitante -> habitante.potencia() > 30).
    			toList().size();
    }
    
    public Boolean esCulto() {
    	return cantMuseos >= 2 && 
    			habitantes.stream().
    			allMatch(habitante -> habitante.inteligencia() >= 10);
    }
    
    public Integer potenciaReal() {
    	return habitantes.stream().
    			mapToInt(habitante -> habitante.potencia()).sum();
    }


}
