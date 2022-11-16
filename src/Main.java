public class Main {

    //Calculadora con suma, resta, división y multiplicación.
    final static Integer a = 2;
    final static Integer b = 3;

    public static void main(String[] args) {

        CalculadoraBasica basica = new CalculadoraBasica();

        Integer resultadoSuma = basica.suma(a, b);
        System.out.println("La suma de " + a + " + " + b + " = " + basica.suma(a,b));

        Integer resultadoResta = basica.resta(a, b);
        System.out.println("La resta de " + a + " - " + b + " = " + basica.resta(a,b));

        Integer resultadoDivision = basica.division(a, b);
        System.out.println("La disivion de " + a + " / " + b + " = " + basica.division(a,b));

        Integer resultadoMultiplicacion = basica.multiplicacion(a, b);
        System.out.println("La multiplicacion de " + a + " * " + b + " = " + basica.multiplicacion(a,b));
    }
}