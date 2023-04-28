import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Cafe> cafes1 = crearCafes();
        ArrayList<String> redesSocilaes = crearSocilaes();
        Cafeteria cafeteria1 = new Cafeteria("Las arucarias","UFRO",redesSocilaes,cafes1);
        System.out.println(cafeteria1.toString());
        cafeteria1.eliminarCafe(2);
        System.out.println(cafeteria1.toString());
        cafeteria1.agregarCafe(new Cafe("30","45","grande"));
        System.out.println(cafeteria1.toString());
        buscarCafes(cafeteria1);
    }

    private static void buscarCafes(Cafeteria cafeteria1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("que cafe quiere buscar (chico,mediano,grande)");
        System.out.println("Escribalo bien porfavor :D");
        String tamano = sc.next();
        cafeteria1.buscarCafe(tamano);
    }

    private static ArrayList<String> crearSocilaes() {
        ArrayList<String> aux = new ArrayList<>();
        aux.add("Instagram");
        aux.add("Facebook");
        return aux;
    }

    private static ArrayList<Cafe> crearCafes() {
        Cafe cafe1 = new Cafe("50","100","mediano");
        Cafe cafe2 = new Cafe("43","150","grande");
        Cafe cafe3 = new Cafe("60","300","chico");
        ArrayList<Cafe> aux = new ArrayList<>();
        aux.add(cafe1);
        aux.add(cafe2);
        aux.add(cafe3);
        return aux;
    }
}