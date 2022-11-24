import java.util.stream.Stream;

public class Persona {
    private String name;
    private String surname1;
    private String surname2;
    private int age;

    Persona(){
        name = "anonimo";
    }

    Persona (String name, String surname1){
        this.name = name;
        this.surname1 = surname1;
    }

    public void CalculoMayorDeEdad(){
        if (age > 18){
            System.out.println("Es mayor de edad");
        } else{
            System.out.println("Es menor de edad");
        }
    }
    public void MostrarNombreCompleto(){
        System.out.println(name+ " " + surname1 + " " + surname2);
    }
    public void MostrarIniciales(){
        System.out.println((this.name.charAt(0)) + "." + (this.surname1.charAt(0)) + "." + (this.surname2.charAt(0)));
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getSurname1(){
        return surname1;
    }
    public void setSurname1(String surname1){
        this.surname1 = surname1;
    }
    public String getSurname2(){
        return surname2;
    }
    public void setSurname2(String surname2){
        this.surname2 = surname2;
    }
    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age = age;
    }

}
