package capitulo_4.ejercicio_15;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String ... args) {
        double PESO_A, PESO_B, PESO_C, PESO_D;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el peso de las esferas \n");

        System.out.println("A: ");
        PESO_A = scanner.nextDouble();

        System.out.println("B: ");
        PESO_B = scanner.nextDouble();

        System.out.println("C: ");
        PESO_C = scanner.nextDouble();

        System.out.println("D: ");
        PESO_D = scanner.nextDouble();

        if ((PESO_A == PESO_B) && PESO_A == PESO_C) {
            System.out.println("La esfere D es la diferente y");
        } else {
            if ((PESO_A == PESO_B) && (PESO_A == PESO_D)) {
                System.out.println("La esfere C es la diferente");

                if (PESO_C > PESO_A) {
                    System.out.println("y es de mayor peso");
                } else {
                    System.out.println("y es de menor peso");
                }
            } else {
                if ((PESO_A == PESO_C) && (PESO_A == PESO_D)) {
                    System.out.println("La esfere B es la diferente");

                    if (PESO_B > PESO_D) {
                        System.out.println("y es de mayor peso");
                    } else {
                        System.out.println("y es de menor peso");
                    }
                } else {
                    System.out.println("La esfera A es la diferente");

                    if (PESO_A > PESO_B) {
                        System.out.println("y es de mayor peso");
                    } else {
                        System.out.println("y es de menor peso");
                    }

                }
            }
        }
    }
}
