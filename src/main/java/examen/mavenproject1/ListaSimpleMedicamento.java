package examen.mavenproject1;

public class ListaSimpleMedicamento {
    protected NodoMedicamento P;

    public ListaSimpleMedicamento() {
        P = null;  // Lista vacía
    }

    public boolean esVacia() {
        return P == null;
    }

    public void adiFinal(Medicamento medicamento) {
        NodoMedicamento nuevo = new NodoMedicamento();
        nuevo.setMedicamento(medicamento);
        if (esVacia()) {
            P = nuevo;
        } else {
            NodoMedicamento R = P;
            while (R.getSig() != null) {
                R = R.getSig();
            }
            R.setSig(nuevo);
        }
    }

    public NodoMedicamento eliPrincipio() {
        NodoMedicamento x = null;
        if (!esVacia()) {
            x = P;
            P = P.getSig();
            x.setSig(null);
        }
        return x;
    }

    public void mostrar() {
        NodoMedicamento R = P;
        while (R != null) {
            R.getMedicamento().mostrar();
            R = R.getSig();
        }
    }
    public int contar() {
    int count = 0;
    NodoMedicamento aux = P;
    while (aux != null) {
        count++;
        aux = aux.getSig();
    }
    return count;
}

}
