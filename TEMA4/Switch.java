package TEMA4;

public class Switch {
    
    public static void main(String[] args) {

        var estacion = "INVIERNO";

        switch(estacion) {
            case "PRIMAVERA":
                System.out.println("PRIMAVERA");
            case "VERANO":
                System.out.println("VERANO");
            case "OTOÑO":
                System.out.println("OTOÑO");
            case "INVIERNO":
                System.out.println("INVIERNO");
                break;
            default:
                System.out.println("Esto no es una estacion.");
        }
    }
}
