package examen.mavenproject1;

public class NodoMedicamento {
    private Medicamento medicamento;
    private NodoMedicamento sig;

    public NodoMedicamento() {
        this.sig = null;
    }

    public Medicamento getMedicamento() { return medicamento; }
    public void setMedicamento(Medicamento medicamento) { this.medicamento = medicamento; }
    public NodoMedicamento getSig() { return sig; }
    public void setSig(NodoMedicamento sig) { this.sig = sig; }
}
