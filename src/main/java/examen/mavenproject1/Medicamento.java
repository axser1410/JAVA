package examen.mavenproject1;

public class Medicamento {
    private String nombre;
    private String ID;
    private String fechaExp;
    private int cant;
    private String ubicacion;
    private String especialidad;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getID() { return ID; }
    public void setID(String ID) { this.ID = ID; }
    public String getFechaExp() { return fechaExp; }
    public void setFechaExp(String fechaExp) { this.fechaExp = fechaExp; }
    public int getCant() { return cant; }
    public void setCant(int cant) { this.cant = cant; }
    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }
    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + ID);
        System.out.println("Fecha de expiración: " + fechaExp);
        System.out.println("Cantidad: " + cant);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Especialidad: " + especialidad);
    }
}
