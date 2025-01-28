package com.example.testes_unitarios_aula;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class CalculadoraTest {
    private Calculadora calculadora;

    @BeforeEach
    void setup() {
        calculadora = new Calculadora();
    }


    @Test
    void deveSomar() {

        int resultado = calculadora.somar(4, 2);
        Assertions.assertThat(resultado).isEqualTo(6);
    }


    @Test
    void deveSubtrair() {

        int resultado = calculadora.subtrair(4, 2);
        Assertions.assertThat(resultado).isEqualTo(2);

    }

    @Test
    void deveMultiplicar() {

        int resultado = calculadora.multiplicar(4, 2);
        Assertions.assertThat(resultado).isEqualTo(8);

    }

    @Test
    void deveDividir() {

        int resultado = calculadora.dividir(4, 2);
        assertEquals(2, resultado);
    }

    @Test
    void deveDividir_GerarExecaoQuandoDividirPorZero() {

        assertThrows(ArithmeticException.class, () -> calculadora.dividir(4, 0));

    }


}
