package examen.mavenproject1;

public class Laboratorio {
    private String numLab;
    private String medicamento;
    private ColaCircularPedido colaPedidos;

    public String getNumLab() { return numLab; }
    public void setNumLab(String numLab) { this.numLab = numLab; }
    public String getMedicamento() { return medicamento; }
    public void setMedicamento(String medicamento) { this.medicamento = medicamento; }
    public ColaCircularPedido getColaPedidos() { return colaPedidos; }
    public void setColaPedidos(ColaCircularPedido colaPedidos) { this.colaPedidos = colaPedidos; }

    public void mostrar() {
        System.out.println("Número de laboratorio: " + numLab);
        System.out.println("Medicamento: " + medicamento);
        colaPedidos.mostrar();
    }
}
