package es.cic.curso25;
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        mostrarMenu( ent);
    }

    public static void mostrarMenu(Scanner ent){
         int opcion=0;
         int a=0;
         int b=0;
        do{
        System.out.println("¿Que operacion quieres realizar?");
        System.out.println("1:Sumar");
        System.out.println("2:Restar");
        System.out.println("3:Multiplicar");
        System.out.println("4:Dividir");
        System.out.println("5:Salir");

       
        opcion=ent.nextInt();

        switch(opcion){
            case 1:
            
            System.out.println("Introduce los operandos");
             a=ent.nextInt();
             b=ent.nextInt();
             System.out.println("Suma = " + Calculadora.Sumar(a, b));
            break;
            case 2: 
             System.out.println("Introduce los operandos");
             a=ent.nextInt();
             b=ent.nextInt();
             System.out.println("Resta = " + Calculadora.Restar(a, b));
            break;
            case 3: 
             System.out.println("Introduce los operandos");
             a=ent.nextInt();
             b=ent.nextInt();
             System.out.println("Multiplicar = " + Calculadora.Multiplicar(a, b));
            break;
            case 4:
             System.out.println("Introduce los operandos");
             a=ent.nextInt();
             b=ent.nextInt();
             System.out.println("Dividir = " + Calculadora.Dividir(a, b));
            break;
            case 5: System.out.println("Saliendo");
            break;
        }
    }while(opcion !=5);

    }

    

}


