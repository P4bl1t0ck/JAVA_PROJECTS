import java.sql.SQLOutput;
public class PABLOMONTALVO {
    public static void main(String[] args) {
        /*Autos*///Instanciar
        Autos chrevrolet = new Autos();
        Autos Toyota = new Autos();
        Autos Jtejour = new Autos();
        chrevrolet.marca= " chevrolet ";/// Heredando rpopiedades
        chrevrolet.modelo=" Aveo ";///
        chrevrolet.color=" ROJO ";
        chrevrolet.cilindraje= 3.7;
        Toyota.marca=" TOYOTA ";
        Toyota.modelo=" Furtuner ";
        Toyota.color=" NEGRO ";
        Toyota.cilindraje=4.0;
        Jtejour.marca=" JETJOUR ";
        Jtejour.modelo=" Sport ";
        Jtejour.color=" AZUL ";
        Jtejour.cilindraje=3.5;
        System.out.println("\nCHREVROLET\n");
        System.out.println(chrevrolet.detalleAuto());
        System.out.println(chrevrolet.acelerar(3500));
        System.out.println(chrevrolet.frenar(210,200,62));
        System.out.println(chrevrolet.Combustible(3,980));
        System.out.println("\nTOYOTA\n");
        System.out.println(Toyota.detalleAuto());
        System.out.println(Toyota.acelerar(4000));
        System.out.println(Toyota.frenar(120,500,40));
        System.out.println(Toyota.Combustible(5,2100));
        System.out.println("\nJETJOUR\n");
        System.out.println(Jtejour.detalleAuto());
        System.out.println(Jtejour.acelerar(104));
        System.out.println(Jtejour.frenar(130,400,56));
        System.out.println(Jtejour.Combustible(3 ,1000));
    }
}

