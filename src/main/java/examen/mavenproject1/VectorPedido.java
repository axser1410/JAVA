package examen.mavenproject1;

public class VectorPedido {
    private int max = 50;
    private Pedido[] pedidos;
    private int tope;

    public VectorPedido() {
        pedidos = new Pedido[max];
        tope = -1;
    }

    public boolean esVacio() {
        return tope == -1;
    }

    public boolean esLleno() {
        return tope == max - 1;
    }

    public void adi(Pedido pedido) {
        if (!esLleno()) {
            pedidos[++tope] = pedido;
        } else {
            System.out.println("Vector de pedidos lleno");
        }
    }

    public Pedido eli() {
        if (!esVacio()) {
            return pedidos[tope--];
        } else {
            System.out.println("Vector de pedidos vacío");
            return null;
        }
    }

    public void mostrar() {
        for (int i = 0; i <= tope; i++) {
            pedidos[i].mostrar();
        }
    }
}

