public class Alfajor {
    private String sabor;
    private String tamano;

    public Alfajor(String sabor, String tamano) {
        this.sabor = sabor;
        this.tamano = tamano;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Alfajor{" +
                "sabor='" + sabor + '\'' +
                ", tamano='" + tamano + '\'' +
                '}';
    }
}
