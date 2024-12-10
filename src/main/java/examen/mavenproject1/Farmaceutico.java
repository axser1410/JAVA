package examen.mavenproject1;

public class Farmaceutico {
    private String nombre;
    private String CI;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCI() { return CI; }
    public void setCI(String CI) { this.CI = CI; }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("CI: " + CI);
    }
}

