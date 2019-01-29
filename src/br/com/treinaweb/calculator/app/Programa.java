package br.com.treinaweb.calculator.app;

import br.com.treinaweb.calculator.fabricas.FabricasCalculosMatematicos;
import br.com.treinaweb.calculator.interfaces.CalculadorMatematico;

public class Programa {
    public static void main(String[] args) {
        String calculo = "+";
        int numero1 = 2;
        int numero2 = 2;


        FabricasCalculosMatematicos fabrica = new FabricasCalculosMatematicos();
        CalculadorMatematico calculador = fabrica.criarCalculador(numero1, numero2, calculo);

        if(calculador != null){
            System.out.println(calculador.calcular());
        } else {
            System.out.println("Calculo inválido!");
        }
    }
}
