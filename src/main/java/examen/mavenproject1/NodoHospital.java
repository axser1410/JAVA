package examen.mavenproject1;

public class NodoHospital {
    private Hospital hospital;
    private NodoHospital sig;

    public NodoHospital() {
        this.sig = null;
    }

    public Hospital getHospital() { return hospital; }
    public void setHospital(Hospital hospital) { this.hospital = hospital; }
    public NodoHospital getSig() { return sig; }
    public void setSig(NodoHospital sig) { this.sig = sig; }
}

