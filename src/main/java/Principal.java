import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Cafe> cafes1 = crearCafes();
        ArrayList<Alfajor> alfajores = crearAlfajores();
        ArrayList<String> redesSocilaes = crearSocilaes();
        Cafeteria cafeteria1 = new Cafeteria("Las arucarias","UFRO",redesSocilaes,cafes1);
        Cafeteria cafeteria2 = new Cafeteria("Procofe","Javiera Carrera 4539",redesSocilaes,cafes1,alfajores);
        System.out.println(cafeteria1.toString());
        System.out.println(cafeteria2.toString());
        eleccion(cafeteria1,cafeteria2);


    }

    private static void eleccion(Cafeteria cafeteria1, Cafeteria cafeteria2) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que cafeteria desea manipular: ");
        System.out.println("1." +cafeteria1.getNombre());
        System.out.println("2." +cafeteria2.getNombre());
        int opcion = sc.nextInt();
        if (opcion == 1){
            eliminarCafe(cafeteria1);
            agregarCafe(cafeteria1);
            buscarCafes(cafeteria1);
        }else {
            eliminarCafe(cafeteria2);
            agregarCafe(cafeteria2);
            buscarCafes(cafeteria2);
        }



    }

    private static ArrayList<Alfajor> crearAlfajores() {
        Alfajor alfajores1 = new Alfajor("Manjar","chico");
        Alfajor alfajores2 = new Alfajor("Chocolate","chico");
        Alfajor alfajores3 = new Alfajor("Chocolate Blanco","Grande");
        ArrayList<Alfajor> aux = new ArrayList<>();
        aux.add(alfajores1);
        aux.add(alfajores2);
        aux.add(alfajores3);
        return aux;
    }

    private static void agregarCafe(Cafeteria cafeteria1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Agrege un cafe: ");
        System.out.println("Gramos: ");
        String g = sc.next();
        System.out.println("Agua: ");
        String a = sc.next();
        System.out.println("Tamaño: ");
        String t = sc.next();

        cafeteria1.agregarCafe(new Cafe(g,a,t));
        System.out.println(cafeteria1.toString());
    }

    private static void eliminarCafe(Cafeteria cafeteria1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que cafe desea eliminar: ");
        for (int i = 0; i < cafeteria1.getCafes().size(); i++) {
            System.out.println(i+1+". "+cafeteria1.getCafes().get(i));
        }
        int opcion = sc.nextInt();

        cafeteria1.eliminarCafe(opcion-1);
        System.out.println(cafeteria1.toString());
    }

    private static void buscarCafes(Cafeteria cafeteria1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("que cafe quiere buscar (chico,mediano,grande)");
        System.out.println("Escribalo bien porfavor :D");
        String tamano = sc.next();
        ArrayList<Cafe> cafesEncontrados = cafeteria1.buscarCafe(tamano);
        imprimirCafes(cafesEncontrados);
    }

    private static void imprimirCafes(ArrayList<Cafe> cafesEncontrados) {
        for (Cafe i: cafesEncontrados){
            System.out.println(i.toString());
        }
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