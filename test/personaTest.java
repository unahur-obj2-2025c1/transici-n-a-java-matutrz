package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import persona.*;

import planeta.*;

import java.util.List;


public class personaTest {
    private Persona Julieta = new Persona(42);

    private Persona Ana = new Atleta(25);

    private Persona Rosa = new Atleta(45,4, 8);

    private Persona Perla = new Atleta(28, 6, 4);

    private Persona Mónica = new Docente(45, 6);

    private Persona Luisa = new Docente(35, 1);

    @Test
    public void testJulieta(){
        assertEquals(42, Julieta.getEdad());
    }

}
