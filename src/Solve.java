//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Operación de suma de enteros y flotantes");
            System.out.println("2. Convertir char a su valor ASCII");
            System.out.println("3. Convertir double a int");
            System.out.println("4. Convertir String a int");
            System.out.println("5. Operación con tipos primitivos");
            System.out.println("6. Convertir número a char");
            System.out.println("7. Asignar long a int");
            System.out.println("8. Convertir float a String");
            System.out.println("9. Redondear número");
            System.out.println("10. Convertir byte a short");
            System.out.println("11. Operación con asignación compuesta");
            System.out.println("12. Incremento y Decremento");
            System.out.println("13. Ejercicios Combinados");
            System.out.println("0. Salir");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Main.operacion();
                    break;
                case 2:
                    Main.convertirCharASCII();
                    break;
                case 3:
                    Main.convertirDoubleToInt();
                    break;
                case 4:
                    Main.convertirStringToInt();
                    break;
                case 5:
                    Main.operacionesConTiposPrimitivos();
                    break;
                case 6:
                    Main.convertirNumeroAChar();
                    break;
                case 7:
                    Main.asignacionLongAInt();
                    break;
                case 8:
                    Main.convertirFloatAString();
                    break;
                case 9:
                    Main.redondeoMathRound();
                    break;
                case 10:
                    Main.convertirByteAShort();
                    break;
                case 11:
                    SubMenuOperadores();
                    break;
                case 12:
                    SubMenuIncrementoDecremento();
                    break;
                case 13:
                    SubMenuEjerciciosCombinados();
                    break;
                case 0:
                    System.out.println("Salió");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }

    private static void SubMenuOperadores() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Seleccione una opción de los Operadores de Asignación:");
            System.out.println("1. Operación 1");
            System.out.println("2. Operación 2");
            System.out.println("3. Operación 3");
            System.out.println("4. Operación 4");
            System.out.println("5. Operación 5");
            System.out.println("0. Volver al menú principal");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Main.operacion1();
                    break;
                case 2:
                    Main.operacion2();
                    break;
                case 3:
                    Main.operacion3();
                    break;
                case 4:
                    Main.operacion4();
                    break;
                case 5:
                    Main.operacion5();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal.");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
                    break;
            }
        } while (choice != 0);
    }

    private static void SubMenuIncrementoDecremento() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Seleccione una opción de los Operadores de Incremento y Decremento:");
            System.out.println("1. Incremento 1");
            System.out.println("2. Incremento 2");
            System.out.println("3. Decremento 1");
            System.out.println("4. Diferencia de Incremento");
            System.out.println("5. Incremento 3");
            System.out.println("0. Volver al menú principal");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Main.incremento1();
                    break;
                case 2:
                    Main.incremento2();
                    break;
                case 3:
                    Main.decremento1();
                    break;
                case 4:
                    Main.diferenciaIncremento();
                    break;
                case 5:
                    Main.incremento3();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal.");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
                    break;
            }
        } while (choice != 0);
    }

    private static void SubMenuEjerciciosCombinados() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Seleccione una opción de los ejercicios combinados:");
            System.out.println("1. Combinado 1");
            System.out.println("2. Combinado 2");
            System.out.println("3. Combinado 3");
            System.out.println("4. Combinado 4");
            System.out.println("5. Combinado 5");
            System.out.println("6. Combinado 6");
            System.out.println("7. Combinado 7");
            System.out.println("8. Combinado 8");
            System.out.println("9. Combinado 9");
            System.out.println("10. Combinado 10");
            System.out.println("0. Volver al menú principal");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Main.combinado1();
                    break;
                case 2:
                    Main.combinado2();
                    break;
                case 3:
                    Main.combinado3();
                    break;
                case 4:
                    Main.combinado4();
                    break;
                case 5:
                    Main.combinado5();
                    break;
                case 6:
                    Main.combinado6();
                    break;
                case 7:
                    Main.combinado7();
                    break;
                case 8:
                    Main.combinado8();
                    break;
                case 9:
                    Main.combinado9();
                    break;
                case 10:
                    Main.combinado10();
                    break;
                case 0:
                    System.out.println("Volviendo al menú principal.");
                    break;
                default:
                    System.out.println("Opción inválida, intenta de nuevo.");
                    break;
            }
        } while (choice != 0);
    }
}
