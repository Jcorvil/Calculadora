public class Main {

    //Calculadora con suma, resta, división y multiplicación.
    final static Integer a = 2;
    final static Integer b = 3;
    enum Operacion{
        suma, resta, division, multiplicacion
    }

    public static void main(String[] args) {
        CalculadoraBasica basica = new CalculadoraBasica();
        Operacion operacionSeleccionada = Operacion.multiplicacion;

        switch(operacionSeleccionada) {
            case suma:
                System.out.println("La suma de " + a + " + " + b + " = " + basica.suma(a, b));
                break;

            case resta:
                System.out.println("La resta de " + a + " - " + b + " = " + basica.resta(a, b));
                break;

            case division:
                System.out.println("La disivion de " + a + " / " + b + " = " + basica.division(a, b));
                break;

            case multiplicacion:
                System.out.println("La multiplicacion de " + a + " * " + b + " = " + basica.multiplicacion(a, b));
                break;
        }
    }
}