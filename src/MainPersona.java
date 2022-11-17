public class MainPersona {

    public static void main (String[] args){

        Persona Persona1 = new Persona();
        System.out.println("Persona 1");
        System.out.println("Edad: " + Persona1.age);
        System.out.println("Nombre: " + Persona1.name);
        System.out.println("Primer apellido " + Persona1.surname1);
        System.out.println("Segundo apellido " + Persona1.surname2);

        Persona Persona2 = new Persona();
        System.out.println("Persona 2");
        System.out.println("Edad: " + Persona2.age);
        System.out.println("Nombre: " + Persona2.name);
        System.out.println("Primer apellido " + Persona2.surname1);
        System.out.println("Segundo apellido " + Persona2.surname2);


        Persona Persona3 = new Persona("Fran", "Gómez");
        System.out.println("Persona 3");
        System.out.println("Edad: " + Persona3.age);
        System.out.println("Nombre: " + Persona3.name);
        System.out.println("Primer apellido: " + Persona3.surname1);
        System.out.println("Segundo apellido " + Persona3.surname2);

        Persona Persona4 = new Persona();
        System.out.println("Persona 4");
        System.out.println("Edad: " + Persona4.age);
        System.out.println("Nombre: " + Persona4.name);
        System.out.println("Primer apellido " + Persona4.surname1);
        System.out.println("Segundo apellido " + Persona4.surname2);

    }
}