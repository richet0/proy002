package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCal {
    @Test
    public  void testSuma(){
        double a=5;
        double b=3;
        double resultado=a+b;
        assertEquals(resultado, Calculadora.Sumar(a, b));
    }
     @Test
    public  void testMultiplicacion(){
        double a=5;
        double b=3;
        double resultado=a*b;
        assertEquals(resultado, Calculadora.Multiplicar(a, b));
    }
     @Test
    public  void testResta(){
        double a=5;
        double b=3;
        double resultado=0;
        if(a>b){
            resultado=a-b;
        }else{
            resultado=b-a;
        }
        assertEquals(resultado, Calculadora.Restar(a, b));
    }
      @Test
    public  void testDividir(){
        double a=5;
        double b=3;
        double resultado=a/b;
      
        assertEquals(resultado, Calculadora.Dividir(a, b));
    }
    
}
