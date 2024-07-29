//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }

    // 1.¿Cuál será el resultado de la siguiente operación?
    public static void operacion() {
        int x = (int) 5.89 + (int) 3.45;
        System.out.println(x); // Su resultado es: 8
    }

    // 2.Dado char c = 'A';, ¿cómo convertirías c a su valor ASCII como un int?
    public static void convertirCharASCII() {
        char myChar = 'A';
        int myInt = (int) myChar;
        System.out.println(myInt); // Su resultado es: 65
    }

    // 3.¿Qué valor se imprimirá?
    public static void convertirDoubleToInt() {
        double d = 100.04;
        long l = (long) d;
        int i = (int) l;
        System.out.println(i); // Su resultado es: 100
    }

    // 4.Escribe código para convertir un String que contiene un número a un int.
    public static void convertirStringToInt() {
        String numberStr = "852";
        int numberInt = Integer.parseInt(numberStr);
        System.out.println(numberInt); // Su resultado es: 852
    }

    // 5.¿Cuál es el resultado de (int) (char) (byte) -1?
    public static void operacionesConTiposPrimitivos() {
        int result = (int) (char) (byte) -1;
        System.out.println(result); // Su resultado es: 65535
    }

    // 6.Convierte el número 65 a un char. ¿Qué carácter obtienes?
    public static void convertirNumeroAChar() {
        int numberIn = 65;
        char numberCh = (char) numberIn;
        System.out.println(numberCh); // Su resultado es: A
    }

    // 7.¿Qué sucede si intentas asignar un long a un int sin casteo explícito?
    public static void asignacionLongAInt() {
        long largo = 10000000000L;
        // int entero = largo; // Esto causa un error de compilación
        System.out.println(largo);
    }

    // 8.Escribe código para convertir un float a un String.
    public static void convertirFloatAString() {
        float numberFl = 96.4657f;
        String text = Float.toString(numberFl);
        System.out.println(text); // Su resultado es: 96.4657
    }

    // 9.¿Cuál es el resultado de (int) Math.round(3.7)?
    public static void redondeoMathRound() {
        double number = 3.7;
        int roundedInt = (int) Math.round(number);
        System.out.println(roundedInt); // Su resultado es: 4
    }

    // 10.Dado byte b = 50;, ¿cómo lo convertirías a short?
    public static void convertirByteAShort() {
        byte b = 50;
        short a = b;
        System.out.println(a); // Su resultado es: 50
    }


    // Operadores de Asignación
    //1. ¿Cuál es el valor de x después de la siguiente operación? int x = 10; x += 5;
    public static void operacion1() {
        int x = 10;
        x += 5;
        System.out.println(x); // Su resultado es: 15
    }

    //2. Simplifica la siguiente expresión usando un operador de asignación compuesta: y = y * (x + 5);
    public static void operacion2() {
        int y = 10;
        int x = 5;
        y *= (x + 5);
        System.out.println(y); // Su resultado es: 100
    }

    //3. ¿Cuál es el valor de a después de estas operaciones? int a = 15; a %= 4;
    public static void operacion3() {
        int a = 15;
        a %= 4;
        System.out.println(a); // Su resultado es: 3
    }

    //4. Escribe una expresión equivalente a x = x + y usando un operador de asignación compuesta.
    public static void operacion4() {
        int x = 10;
        int y = 5;
        x += y;
        System.out.println(x); // Su resultado es: 15
    }

    //5. ¿Qué hace la siguiente operación? x ^= 2;
    public static void operacion5() {
        int x = 10;
        x ^= 2;
        System.out.println(x); // Su resultado es: 8
    }


    // Operadores de Incremento y Decremento
    //1. ¿Cuál es el valor de x e y después de estas operaciones? int x = 5; int y = ++x;
    public static void incremento1() {
        int x = 5;
        int y = ++x;
        System.out.println("x: " + x + ", y: " + y); // Su resultado es: x: 6, y: 6
    }

    //2. ¿Qué se imprimirá en la consola? int a = 5; System.out.println(a++); System.out.println(a);
    public static void incremento2() {
        int a = 5;
        System.out.println(a++); // Su resultado es: 5
        System.out.println(a);   // Su resultado es: 6
    }

    //3.Escribe código que use el operador de decremento para disminuir una variable count en 1.
    public static void decremento1() {
        int count = 10;
        count--;
        System.out.println(count); // Su resultado es: 9
    }

    //4.¿Cuál es la diferencia entre ++i y i++?
    public static void diferenciaIncremento() {
        int i = 5;
        int preIncremento = ++i; // preIncremento es 6, i es 6
        i = 5;
        int postIncremento = i++; // postIncremento es 5, i es 6
        System.out.println("preIncremento: " + preIncremento + ", postIncremento: " + postIncremento);
    }

    //¿Qué valor tendrá x después de esta operación? int x = 3; x = x++;
    public static void incremento3() {
        int x = 3;
        x = x++;
        System.out.println(x); // Su resultado es: 3
    }


    // Ejercicios Combinados
    //1.¿Cuál es el resultado de la siguiente expresión?
    public static void combinado1() {
        int i = 5;
        i += ++i + i++ + ++i;
        System.out.println(i); // Su resultado es: 23
    }

    //2.Escribe código para convertir un double a un int, y luego incrementa el resultado en 1 usando el operador de postincremento.
    public static void combinado2() {
        double d = 5.7;
        int i = (int)d;
        i++;
        System.out.println(i); // Su resultado es: 6
    }

    //3.¿Qué se imprimirá en la consola?
    public static void combinado3() {
        double d = 5.7;
        int i = (int)d;
        i *= 2;
        System.out.println(i--); // Su resultado es: 10
        System.out.println(i);   // Su resultado es: 9
    }

    //4.Crea una expresión que use casteo y un operador de asignación compuesta para dividir un int por 2.0 y asignar el resultado a una variable double.
    public static void combinado4() {
        int n = 10;
        double result = n;
        result /= 2.0;
        System.out.println(result); // Su resultado es: 5.0
    }

    //5.¿Cuál es el resultado de la siguiente operación?
    public static void combinado5() {
        char c = 'X';
        c += 32;
        System.out.println(c); // Su resultado es: 'x'
    }

    //6.Escribe código para convertir un long a un short, y luego usa un operador de asignación compuesta para multiplicarlo por 3.
    public static void combinado6() {
        long l = 100L;
        short s = (short)l;
        s *= 3;
        System.out.println(s); // Su resultado es: 300
    }

    //7.¿Qué valor tendrá x después de estas operaciones?
    public static void combinado7() {
        int x = 10;
        x += (x++) + (++x);
        System.out.println(x); // Su resultado es: 32
    }

    //  8.Crea una expresión que use casteo para convertir un float a un byte, y luego usa el operador de predecremento.
    public static void combinado8() {
        float f = 3.5f;
        byte b = (byte)f;
        --b;
        System.out.println(b); // Su resultado es: 2
    }
    //9. ¿Cuál es el resultado de la siguiente operación?
    public static void combinado9() {
        int i = 257;
        byte b = (byte)i;
        System.out.println(b); // Su resultado es: 1
    }

    //10. Escribe una expresión que combine casteo, un operador de asignación compuesta y un operador de incremento para convertir un double a un int, sumarle 5 y luego incrementarlo en 1.
    public static void combinado10() {
        double d = 7.8;
        int i = (int)d;
        i += 5;
        i++;
        System.out.println(i); // Su resultado es: 13
    }
}