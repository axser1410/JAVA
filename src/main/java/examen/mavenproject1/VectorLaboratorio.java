package examen.mavenproject1;

public class VectorLaboratorio {
    private int max = 50;
    private Laboratorio[] laboratorios;
    private int tope;

    public VectorLaboratorio() {
        laboratorios = new Laboratorio[max];
        tope = -1;
    }

    public boolean esVacio() {
        return tope == -1;
    }

    public boolean esLleno() {
        return tope == max - 1;
    }

    public void adi(Laboratorio laboratorio) {
        if (!esLleno()) {
            laboratorios[++tope] = laboratorio;
        } else {
            System.out.println("Vector de laboratorios lleno");
        }
    }

    public Laboratorio eli() {
        if (!esVacio()) {
            return laboratorios[tope--];
        } else {
            System.out.println("Vector de laboratorios vacío");
            return null;
        }
    }

    public void mostrar() {
        for (int i = 0; i <= tope; i++) {
            laboratorios[i].mostrar();
        }
    }
}


