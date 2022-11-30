package org.losremedios.daw1.prog.practica.UT3.Calculadora;
import org.losremedios.daw1.prog.Matematicas;
public class MainCalculadora {

    //Calculadora con suma, resta, división, multiplicación, factorial y mayor.
    final static Integer a = 2;
    final static Integer b = 3;
    final static Integer c = 6;
    final static Double d = 2.5d;
    final static Double e = 3.0d;
    enum Operacion{
        suma, resta, division, multiplicacion,
    }

    public static void main(String[] args) {

        Operacion operacionSeleccionada = Operacion.suma;

        Matematicas.suma(2, 3);
        Matematicas.suma(2, 3 ,6);

        Matematicas.resta(2, 3);
        Matematicas.resta(2, 3 ,6);

        Matematicas.suma (d, e);
        Matematicas.resta (d, e);
        System.out.println(Matematicas.resta(d, e));

        System.out.println("El mayor de los dos digitos es: " + Matematicas.mayor(a, c));
        System.out.println("El mayor de los tres digitos es: " + Matematicas.mayor(a, b, c));

        switch(operacionSeleccionada) {
            case suma:
                System.out.println("La suma de " + a + " + " + b + " = " + Matematicas.suma(a, b));
                System.out.println("La suma de " + a + " + " + b + " + " + c + " = " + Matematicas.suma(a, b, c));
                System.out.println("La suma de " + d + " + " + e + " = " + Matematicas.suma(d, e));
                break;

            case resta:
                System.out.println("La resta de " + a + " - " + b + " = " + Matematicas.resta(a, b));
                break;

            case division:
                System.out.println("La disivion de " + a + " / " + b + " = " + Matematicas.division(a, b));
                break;

            case multiplicacion:
                System.out.println("La multiplicacion de " + a + " * " + b + " = " + Matematicas.multiplicacion(a, b));
                break;
        }
    }
}