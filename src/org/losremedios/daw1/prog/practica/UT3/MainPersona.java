package org.losremedios.daw1.prog.practica.UT3;

public class MainPersona {

    public static void main (String[] args){

        Persona Persona1 = new Persona();
        System.out.println("Persona 1");
        System.out.println("Edad: " + Persona1.getAge());
        System.out.println("Nombre: " + Persona1.getName());
        System.out.println("Primer apellido " + Persona1.getSurname1());
        System.out.println("Segundo apellido " + Persona1.getSurname2());
        Persona1.CalculoMayorDeEdad();

        Persona Persona2 = new Persona("Francisco", "Gómez");
        System.out.println("Persona 2");
        System.out.println("Edad: " + Persona2.getAge());
        System.out.println("Nombre: " + Persona2.getName());
        System.out.println("Primer Apellido: " + Persona2.getSurname1());
        Persona2.CalculoMayorDeEdad();

        Persona Persona3 = new Persona();
        System.out.println("Persona 3");
        Persona3.setAge(25);
        System.out.println("Edad: " + Persona3.getAge());
        Persona3.setName("Jorge");
        Persona3.setSurname1("Coronil");
        Persona3.setSurname2("Villalba");
        Persona3.CalculoMayorDeEdad();
        System.out.println("Nombre y apellidos: ");
        Persona3.MostrarNombreCompleto();
        System.out.println("Iniciales: ");
        Persona3.MostrarIniciales();

    }
}