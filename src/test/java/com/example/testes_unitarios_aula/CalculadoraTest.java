package com.example.testes_unitarios_aula;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


class CalculadoraTest {


    @Test
    void deveSomar () {
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.somar(4,2);
        assertEquals(6,resultado);
    }


    @Test
    void deveSubtrair () {
        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.subtrair(4,2);
        assertEquals(2,resultado);

    }

    @Test
    void deveMultiplicar () {
        fail("Teste não implementado");

    }

    @Test
    void deveDividir () {
        fail("Teste não implementado");
    }



}
