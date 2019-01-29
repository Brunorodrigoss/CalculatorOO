package br.com.treinaweb.calculator.fabricas;

import br.com.treinaweb.calculator.classes.Adicao;
import br.com.treinaweb.calculator.classes.Divisao;
import br.com.treinaweb.calculator.classes.Multiplicacao;
import br.com.treinaweb.calculator.classes.Subtracao;
import br.com.treinaweb.calculator.interfaces.CalculadorMatematico;

public class FabricasCalculosMatematicos {

    public CalculadorMatematico criarCalculador(int numero1, int numero2, String calculo){
        if (calculo.equals("+")){
            return new Adicao(numero1, numero2);
        } else if (calculo.equals("-")){
            return new Subtracao(numero1, numero2);
        } else if (calculo.equals("*")){
            return new Multiplicacao(numero1,numero2);
        } else if (calculo.equals("/")){
            return new Divisao(numero1, numero2);
        } else {
            return null;
        }
    }
}
