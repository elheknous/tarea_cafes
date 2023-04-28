import java.util.ArrayList;

public class Cafeteria {
    private String nombre;
    private String direccion;
    private ArrayList<String > redesSocioales;
    private ArrayList<Cafe> cafes;

    public Cafeteria(String nombre, String direccion, ArrayList<String> redesSocioales, ArrayList<Cafe> cafes) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.redesSocioales = redesSocioales;
        this.cafes = cafes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<String> getRedesSocioales() {
        return redesSocioales;
    }

    public ArrayList<Cafe> getCafes() {
        return cafes;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setRedesSocioales(ArrayList<String> redesSocioales) {
        this.redesSocioales = redesSocioales;
    }

    public void setCafes(ArrayList<Cafe> cafes) {
        this.cafes = cafes;
    }

    public void eliminarCafe(int posicion){
        this.cafes.remove(posicion);
    }
    public void agregarCafe(Cafe cafe){
        this.cafes.add(cafe);
    }
    public ArrayList<Cafe> buscarCafe(String tamano){
        ArrayList<Cafe> elementos = new ArrayList<>();
        for (int i = 0; i < cafes.size(); i++) {
            if (tamano.equals(cafes.get(i).getTamano())){
                elementos.add(cafes.get(i));
            }
        }
        return elementos;

    }



    @Override
    public String toString() {
        return "Cafeteria{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", redesSocioales=" + redesSocioales +
                ", cafes=" + cafes +
                '}';
    }
}