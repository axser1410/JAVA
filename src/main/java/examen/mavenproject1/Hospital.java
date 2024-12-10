package examen.mavenproject1;

public class Hospital {
    private String nombre;
    private int codigo;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }

    public void mostrar() {
        System.out.println("Nombre del hospital: " + nombre);
        System.out.println("Código del hospital: " + codigo);
    }
}
