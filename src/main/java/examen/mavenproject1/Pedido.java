package examen.mavenproject1;

public class Pedido {
    private String IDmedicamento;
    private Farmaceutico farmaceutico;

    public String getIDmedicamento() { return IDmedicamento; }
    public void setIDmedicamento(String IDmedicamento) { this.IDmedicamento = IDmedicamento; }
    public Farmaceutico getFarmaceutico() { return farmaceutico; }
    public void setFarmaceutico(Farmaceutico farmaceutico) { this.farmaceutico = farmaceutico; }

    public void mostrar() {
        System.out.println("ID Medicamento: " + IDmedicamento);
        farmaceutico.mostrar();
    }
}

