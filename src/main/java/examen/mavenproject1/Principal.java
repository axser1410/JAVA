package examen.mavenproject1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Principal {
    public static void main(String[] args) {
        // Crear lista de medicamentos
        LS_NormalMedicamento listaMedicamentos = new LS_NormalMedicamento();
        LS_NormalMedicamento antibioticos = new LS_NormalMedicamento();
        LS_NormalMedicamento analgesicos = new LS_NormalMedicamento();
        LS_NormalMedicamento antihistaminicos = new LS_NormalMedicamento();

        // Agregar medicamentos de ejemplo
        Medicamento med1 = new Medicamento();
        med1.setNombre("Amoxicilina");
        med1.setID("MED001");
        med1.setFechaExp("2024-12-05");
        med1.setCant(5);
        med1.setUbicacion("Estante A");
        med1.setEspecialidad("Antibiotico");
        listaMedicamentos.adiFinal(med1);

        Medicamento med2 = new Medicamento();
        med2.setNombre("Ibuprofeno");
        med2.setID("MED002");
        med2.setFechaExp("2025-01-15");
        med2.setCant(50);
        med2.setUbicacion("Estante B");
        med2.setEspecialidad("Analgesico");
        listaMedicamentos.adiFinal(med2);

        Medicamento med3 = new Medicamento();
        med3.setNombre("Loratadina");
        med3.setID("MED003");
        med3.setFechaExp("2025-12-01");
        med3.setCant(20);
        med3.setUbicacion("Estante C");
        med3.setEspecialidad("Antihistaminico");
        listaMedicamentos.adiFinal(med3);

        System.out.println("\n=== Lista de Medicamentos ===");
        //listaMedicamentos.mostrar();

        //verificarMedicamentosCercaDeExpirar(listaMedicamentos, 30);
        //reabastecerInventario(listaMedicamentos);
        //redistribuirMedicamentos(listaMedicamentos, antibioticos, 10);
        //gestionarEspecialidadMedicamento(listaMedicamentos, antibioticos, analgesicos, antihistaminicos, "Antibiotico", "Analgesico", "Antihistaminico");
    }

    public static void verificarMedicamentosCercaDeExpirar(LS_NormalMedicamento lista, int diasLimite) {
    System.out.println("\n=== Medicamentos Cerca de Expirar ===");
    LS_NormalMedicamento aux = new LS_NormalMedicamento();
    LocalDate fechaActual = LocalDate.now();
    System.out.println("Fecha actual del sistema: " + fechaActual);

    while (!lista.esVacia()) {
        NodoMedicamento nodo = lista.eliPrincipio();
        Medicamento med = nodo.getMedicamento();

        System.out.println("Revisando medicamento: " + med.getNombre() + " con fecha: " + med.getFechaExp());

        if (med.getFechaExp() != null && med.getFechaExp().matches("\\d{4}-\\d{2}-\\d{2}")) {
            // Convertir la fecha de expiración de String a LocalDate
            LocalDate fechaExp = LocalDate.parse(med.getFechaExp(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            // Mostrar la fecha procesada
            System.out.println("Fecha procesada: " + fechaExp);

            // Calcular la diferencia de días
            long diasRestantes = ChronoUnit.DAYS.between(fechaActual, fechaExp);
            System.out.println("Dias restantes para " + med.getNombre() + ": " + diasRestantes);

            // Verificar si el medicamento está dentro del límite de días
            if (diasRestantes <= diasLimite && diasRestantes >= 0) {
                System.out.println("Medicamento: " + med.getNombre() + ", dias restantes: " + diasRestantes);
            } else {
                System.out.println("El medicamento " + med.getNombre() + " no esta dentro del rango de dias.");
            }
        } else {
            System.out.println("Fecha invalida para el medicamento: " + med.getNombre());
        }

        // Agregar el medicamento a la lista auxiliar para restaurar después
        aux.adiFinal(med);
    }

    // Restaurar la lista original
    while (!aux.esVacia()) {
        NodoMedicamento nodo = aux.eliPrincipio();
        lista.adiFinal(nodo.getMedicamento());
    }
}


    public static void reabastecerInventario(LS_NormalMedicamento lista) {
        System.out.println("\n=== Reabastecimiento Automatico ===");
        LS_NormalMedicamento aux = new LS_NormalMedicamento();

        while (!lista.esVacia()) {
            NodoMedicamento nodo = lista.eliPrincipio();
            Medicamento med = nodo.getMedicamento();

            if (med.getCant() < 10) {
                System.out.println("Reabasteciendo " + med.getNombre() + " con ID: " + med.getID());
                med.setCant(med.getCant() + 50);
            }

            aux.adiFinal(med);
        }

        // Restaurar lista original
        while (!aux.esVacia()) {
            NodoMedicamento nodo = aux.eliPrincipio();
            lista.adiFinal(nodo.getMedicamento());
        }
    }

    public static void redistribuirMedicamentos(LS_NormalMedicamento almacen, LS_NormalMedicamento departamento, int cantRedistribuir) {
        System.out.println("\n=== Redistribucion de Medicamentos ===");
        LS_NormalMedicamento aux = new LS_NormalMedicamento();

        while (!almacen.esVacia() && cantRedistribuir > 0) {
            NodoMedicamento nodo = almacen.eliPrincipio();
            Medicamento med = nodo.getMedicamento();

            if (med.getCant() >= cantRedistribuir) {
                System.out.println("Redistribuyendo " + cantRedistribuir + " unidades de " + med.getNombre());
                med.setCant(med.getCant() - cantRedistribuir);

                Medicamento redistribuido = new Medicamento();
                redistribuido.setNombre(med.getNombre());
                redistribuido.setID(med.getID());
                redistribuido.setFechaExp(med.getFechaExp());
                redistribuido.setCant(cantRedistribuir);
                redistribuido.setUbicacion("Departamento");

                departamento.adiFinal(redistribuido);
                cantRedistribuir = 0;
            }

            aux.adiFinal(med);
        }

        // Restaurar lista original
        while (!aux.esVacia()) {
            NodoMedicamento nodo = aux.eliPrincipio();
            almacen.adiFinal(nodo.getMedicamento());
        }
    }

    public static void gestionarEspecialidadMedicamento(LS_NormalMedicamento lista, LS_NormalMedicamento antibioticos, LS_NormalMedicamento analgesicos, LS_NormalMedicamento antihistaminicos, String X, String Y, String Z) {
        System.out.println("\n=== Gestion de Medicamentos por Especialidad ===");
        LS_NormalMedicamento aux = new LS_NormalMedicamento();

        while (!lista.esVacia()) {
            NodoMedicamento nodo = lista.eliPrincipio();
            Medicamento med = nodo.getMedicamento();

            if (med.getEspecialidad().equals(X)) {
                antibioticos.adiFinal(med);
            } else if (med.getEspecialidad().equals(Y)) {
                analgesicos.adiFinal(med);
            } else if (med.getEspecialidad().equals(Z)) {
                antihistaminicos.adiFinal(med);
            } else {
                System.out.println("Medicamento sin especialidad: " + med.getNombre());
            }

            aux.adiFinal(med);
        }

        // Restaurar lista original
        while (!aux.esVacia()) {
            NodoMedicamento nodo = aux.eliPrincipio();
            lista.adiFinal(nodo.getMedicamento());
        }

        // Mostrar medicamentos clasificados
        System.out.println("\nAntibioticos:");
        antibioticos.mostrar();
        System.out.println("\nAnalgesicos:");
        analgesicos.mostrar();
        System.out.println("\nAntihistaminicos:");
        antihistaminicos.mostrar();
    }
}



