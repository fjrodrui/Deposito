package cuentas;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Clase principal que ejecuta el programa de gestión de cuentas bancarias.
 * Realiza operaciones de ingreso y retiro sobre una cuenta específica.
 * 
 * @author [Tu Nombre]
 * @version 1.0
 * @since 2024
 * @see CCuenta
 */
public class Main {

    /**
     * Método principal que inicia la aplicación.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Configurar la consola para usar UTF-8
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        // Creación de la cuenta
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);

        // Mostrar saldo inicial con formato mejorado
        imprimirLinea();
        System.out.println("        ESTADO INICIAL DE LA CUENTA       ");
        imprimirLinea();
        mostrarSaldo(cuenta1);

        // Realizar operaciones bancarias
        operaciones(cuenta1);

        // Mostrar saldo final con formato mejorado
        System.out.println();
        imprimirLinea();
        System.out.println("        ESTADO FINAL DE LA CUENTA         ");
        imprimirLinea();
        mostrarSaldo(cuenta1);
    }

    /**
     * Realiza una serie de operaciones en la cuenta.
     * 
     * @param cuenta1 Cuenta sobre la cual se realizarán las operaciones.
     */
    private static void operaciones(CCuenta cuenta1) {
        System.out.println();
        imprimirLinea();
        System.out.println("      REALIZANDO OPERACIONES BANCARIAS    ");
        imprimirLinea();

        // Operaciones de ingreso y retiro
        cuenta1.retirar(2300);
        cuenta1.ingresar(685);
        cuenta1.ingresar(200);

        System.out.println();
        imprimirLinea();
        System.out.println("       OPERACIONES COMPLETADAS            ");
        imprimirLinea();
    }

    /**
     * Muestra el saldo actual de la cuenta con formato mejorado.
     * 
     * @param cuenta Cuenta a consultar.
     */
    private static void mostrarSaldo(CCuenta cuenta) {
        System.out.printf("| %-15s: %s%n", "Titular", cuenta.getNombre());
        System.out.printf("| %-15s: %s%n", "Número de Cuenta", cuenta.getCuenta());
        System.out.printf("| %-15s: %.2f EUR%n", "Saldo Disponible", cuenta.getSaldo());
        imprimirLinea();
    }

    /**
     * Imprime una línea de separación para mejorar la visualización.
     */
    private static void imprimirLinea() {
        System.out.println("+----------------------------------------+");
    }
}
