package es.cic.curso25;

public class Calculadora {
    public static double Sumar(double a, double b){
        return a+b;
    }

    public static double Restar(double a, double b){
        if(a>b){
            return a-b;
        }else{
            return b-a;
        }
    }
    public static double Multiplicar(double a,double b){
        return a*b;
    }
    public static double Dividir(double a,double b){
        return a/b;
    }
}
