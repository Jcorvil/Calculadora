public class CalculadoraBasica {

        Integer suma (Integer a, Integer b){
            return a+b;
        }

        Integer suma (Integer a, Integer b, Integer c){
            return suma(a,b)+c;
        }

        Double suma (Double a, Double b){
            return a+b;
        }

        Integer resta (Integer a, Integer b){
            return a-b;
        }

        Integer resta (Integer a, Integer b, Integer c){
            return a-b-c;
        }

        Double resta (Double a, Double b){
            return a-b;
        }

        Integer division (Integer a, Integer b){
            return a/b;
        }
        Integer multiplicacion (Integer a, Integer b){
            return a*b;
        }
}
