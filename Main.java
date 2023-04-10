public class Main {
    public static void main(String[] args) {
        suma(0, 4, 4);

        Coche miCoche = new Coche();
        miCoche.AñadirPuertas();
        miCoche.AñadirPuertas();
        miCoche.AñadirPuertas();
        miCoche.AñadirPuertas();
        System.out.println("Numero de puertas: " + miCoche.puertas);
    }

    public static void suma(int a, int b, int c) {
        System.out.println("Suma: " + (a + b + c));
    }

}
class Coche{
    int puertas = 0;
    public void AñadirPuertas() { 
            this.puertas++; 
        }
}