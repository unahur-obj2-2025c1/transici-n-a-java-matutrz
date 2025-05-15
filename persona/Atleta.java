package persona;

public class Atleta extends Persona{

    private Integer masaMuscular = 4;

    private Integer tecnicasConocidas = 2;

    public Atleta(Integer edad){
        super(edad);
    }

    public Atleta(Integer edad, Integer masaMuscular, Integer tecnicasConocidas){
        super(edad);
        this.masaMuscular = masaMuscular;
        this.tecnicasConocidas = tecnicasConocidas;
    }

    @Override
    public Integer potencia(){
        return super.potencia() + (masaMuscular * tecnicasConocidas);
    }

    @Override
    public Boolean esDestacada(){
        return super.esDestacada() || tecnicasConocidas > 5;
    }

    public Integer getMasaMuscular(){
        return masaMuscular;
    }

    public Integer getTecnicasConocidas(){
        return tecnicasConocidas;
    }

    public void entrenar(Integer dias){
        masaMuscular += dias / 5;
    }

    public void aprenderUnaTecnica(){
        tecnicasConocidas += 1;
    }

}
