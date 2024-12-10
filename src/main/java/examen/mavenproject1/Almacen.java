package examen.mavenproject1;

public class Almacen {
    private ListaSimpleMedicamento medicamentos;

    public Almacen() {
        medicamentos = new ListaSimpleMedicamento();
    }

    public ListaSimpleMedicamento getMedicamentos() { return medicamentos; }
    public void setMedicamentos(ListaSimpleMedicamento medicamentos) { this.medicamentos = medicamentos; }

    public void mostrar() {
        medicamentos.mostrar();
    }
}
