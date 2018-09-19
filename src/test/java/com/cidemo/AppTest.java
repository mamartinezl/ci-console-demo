package com.cidemo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.cidemo.service.Calculator;
import org.junit.Test;


public class AppTest 
{
    private Calculator calculator = new Calculator();

    @Test
    public void SiElMayorNumeroEsElPrimerParámetro_Deberia_DevolverElPrimerParametro()
    {
        int nromayor = calculator.calcularMayor(5,2,4);
        assertEquals(5, nromayor);
    }

    @Test
    public void SiElMayorNumeroEsElSegundoParámetro_Deberia_DevolverElSegundoParametro()
    {
        int nromayor = calculator.calcularMayor(6,10,2);
        assertEquals(10, nromayor);
    }

    @Test
    public void SiElMayorNumeroEsElTercerParámetro_Deberia_DevolverElTercerParametro()
    {
        int nromayor = calculator.calcularMayor(5,2,9);
        assertEquals(9, nromayor);
    }


}
