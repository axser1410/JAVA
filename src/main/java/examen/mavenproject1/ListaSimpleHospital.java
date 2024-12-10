package examen.mavenproject1;

public class ListaSimpleHospital {
    protected NodoHospital P;

    public ListaSimpleHospital() {
        P = null;
    }

    public boolean esVacia() {
        return P == null;
    }

    public void adiFinal(Hospital hospital) {
        NodoHospital nuevo = new NodoHospital();
        nuevo.setHospital(hospital);
        if (esVacia()) {
            P = nuevo;
        } else {
            NodoHospital aux = P;
            while (aux.getSig() != null) {
                aux = aux.getSig();
            }
            aux.setSig(nuevo);
        }
    }

    public void mostrar() {
        NodoHospital aux = P;
        while (aux != null) {
            aux.getHospital().mostrar();
            aux = aux.getSig();
        }
    }
}

