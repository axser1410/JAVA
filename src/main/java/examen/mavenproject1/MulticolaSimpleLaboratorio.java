package examen.mavenproject1;

public class MulticolaSimpleLaboratorio {
    private ColaSimpleLaboratorio[] colas;
    private int n;

    public MulticolaSimpleLaboratorio(int n) {
        this.n = n;
        colas = new ColaSimpleLaboratorio[n];
        for (int i = 0; i < n; i++) {
            colas[i] = new ColaSimpleLaboratorio();
        }
    }

    public void adi(int i, Pedido pedido) {
        if (i >= 0 && i < n) {
            colas[i].adicionar(pedido);
        } else {
            System.out.println("Índice fuera de rango");
        }
    }

    public Pedido eli(int i) {
        if (i >= 0 && i < n) {
            return colas[i].eliminar();
        } else {
            System.out.println("Índice fuera de rango");
            return null;
        }
    }

    public void mostrar() {
        for (int i = 0; i < n; i++) {
            System.out.println("Cola " + i + ":");
            colas[i].mostrar();
        }
    }
}

