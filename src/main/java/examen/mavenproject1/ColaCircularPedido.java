package examen.mavenproject1;

public class ColaCircularPedido {
    private int fr, fi;
    private Pedido[] pedidos = new Pedido[50];

    public ColaCircularPedido() {
        fr = fi = -1;
    }

    public boolean esVacia() {
        return fr == fi;
    }

    public void adicionar(Pedido pedido) {
        if ((fi + 1) % pedidos.length == fr) {
            System.out.println("Cola llena");
        } else {
            fi = (fi + 1) % pedidos.length;
            pedidos[fi] = pedido;
        }
    }

    public Pedido eliminar() {
        if (esVacia()) {
            System.out.println("Cola vacía");
            return null;
        } else {
            fr = (fr + 1) % pedidos.length;
            Pedido eliminado = pedidos[fr];
            pedidos[fr] = null;
            return eliminado;
        }
    }

    public void mostrar() {
        int i = (fr + 1) % pedidos.length;
        while (i != (fi + 1) % pedidos.length) {
            pedidos[i].mostrar();
            i = (i + 1) % pedidos.length;
        }
    }
}

