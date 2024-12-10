package examen.mavenproject1;

public class ListaSimpleCuenta {
    private NodoCuenta P;

    public ListaSimpleCuenta() {
        P = null;
    }

    public boolean esVacia() {
        return P == null;
    }

    public void adiFinal(int CI, float saldo) {
        NodoCuenta nuevo = new NodoCuenta();
        nuevo.setCI(CI);
        nuevo.setSaldo(saldo);

        if (esVacia()) {
            P = nuevo;
        } else {
            NodoCuenta aux = P;
            while (aux.getSig() != null) {
                aux = aux.getSig();
            }
            aux.setSig(nuevo);
        }
    }

    public void mostrar() {
        NodoCuenta aux = P;
        while (aux != null) {
            System.out.println("CI: " + aux.getCI() + ", Saldo: " + aux.getSaldo());
            aux = aux.getSig();
        }
    }
}
