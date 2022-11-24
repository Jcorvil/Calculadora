package org.losremedios.daw1.prog.practica.UT3;

public class EjercicioRandom {
    public static void main(String[] args){
        java.util.Random utilRandom = new java.util.Random();
        int random1 = utilRandom.nextInt(100);
        System.out.println(random1);

        double random2 = Math.random() * 100;
        System.out.println(random2);
    }
}