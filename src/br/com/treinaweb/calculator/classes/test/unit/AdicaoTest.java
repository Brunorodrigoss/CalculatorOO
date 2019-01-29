package br.com.treinaweb.calculator.classes.test.unit;

import br.com.treinaweb.calculator.classes.Adicao;
import org.junit.Assert;
import org.junit.Test;

public class AdicaoTest {

    @Test
    public void testAddZerosTest(){
        Adicao adicao = new Adicao(0,0);
        Assert.assertEquals(0, adicao.calcular());
    }

    @Test
    public void testAddNegativeNumbersTest(){
        Adicao adicao = new Adicao(-10,-20);
        Assert.assertEquals(-1, adicao.calcular());
    }

}
