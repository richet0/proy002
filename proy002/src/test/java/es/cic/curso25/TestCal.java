package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCal {
    @Test
    public static void testSuma(){
        int a=5;
        int b=3;
        int resultado=a+b;
        assertEquals(resultado, Calculadora.Sumar(a, b));
    }
     @Test
    public static void testMultiplicacion(){
        int a=5;
        int b=3;
        int resultado=a*b;
        assertEquals(resultado, Calculadora.Multiplicar(a, b));
    }
     @Test
    public static void testResta(){
        int a=5;
        int b=3;
        int resultado=0;
        if(a>b){
            resultado=a-b;
        }else{
            resultado=b-a;
        }
        assertEquals(resultado, Calculadora.Restar(a, b));
    }
      @Test
    public static void testDividir(){
        int a=5;
        int b=3;
        int resultado=a/b;
      
        assertEquals(resultado, Calculadora.Dividir(a, b));
    }
    
}
