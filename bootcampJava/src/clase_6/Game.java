package clase_6;

import java.util.Scanner;

public class Game {
    private Scanner userInput;
    public Game  (){ //este es el constructor
        userInput = new Scanner(System.in);
    }
    public void rockPaperScissors() {
        System.out.println("Ingrese el numero que corresponda: ");
        System.out.println("1 == Piedra: ");
        System.out.println("2 == Papel: ");
        System.out.println("3 == Tijera: ");
        System.out.println("Ingrese 'q' para salir.");

        while (true) {
            if (userInput.hasNextInt()) {
                int opcionDelUsuario = userInput.nextInt();
                int opcionCpu = (int) (Math.random() * 3) + 1;

                if (opcionDelUsuario >= 1 && opcionDelUsuario <= 3) {
                    if (opcionCpu == 1) {
                        if (opcionDelUsuario == 1) {
                            System.out.println("Hay empate, ambos eligieron Piedra");
                        } else if (opcionDelUsuario == 2) {
                            System.out.println("Felicitaciones, has ganado a la PC. Tu opción fue Papel y la PC eligió Piedra");
                        } else if (opcionDelUsuario == 3) {
                            System.out.println("La puta madre che!  la PC eligió Piedra y tú Tijera");
                        }
                    } else if (opcionCpu == 2) {
                        if (opcionDelUsuario == 1) {
                            System.out.println("Pero PC pinche! ella eligió Papel y tú Piedra");
                        } else if (opcionDelUsuario == 2) {
                            System.out.println("Hay empate, ambos eligieron Papel");
                        } else if (opcionDelUsuario == 3) {
                            System.out.println("Felicitaciones, has ganado a la PC. Tu opción fue Tijera y la PC eligió Papel");
                        }
                    } else if (opcionCpu == 3) {
                        if (opcionDelUsuario == 1) {
                            System.out.println("Felicitaciones, has ganado a la PC. Tu opción fue Piedra y la PC eligió tijera");
                        } else if (opcionDelUsuario == 2) {
                            System.out.println("La pucha che! , la PC eligió Tijera y tú Papel cagaste!");
                        } else if (opcionDelUsuario == 3) {
                            System.out.println("Hay empate, ambos eligieron Tijera");
                        }
                    }

                } else {
                    System.out.println("Opción inválida. Por favor, ingrese un número válido del (1 al 3).");
                }
            } else {
                String input = userInput.next();
                if (input.equals("q")) {
                    System.out.println("Saliendo del programa...");
                    break; // Sale del bucle while
                } else {
                    System.out.println("Valor ingresado no válido: " + input);
                    System.out.println("Ingrese un número del 1 al 3 o presione 'q' para salir.");
                }
            }

        }
    }
}
//1. usuario ingresa valor.
//2. si el valor es correcto
//2.a si es correcto, computadora genera randdom
//2.b si no es correcto se pide que ingrese dato nuevamente o se da opcion de salir del programa.
//3. computadora compara con usuario segun las reglas 1. piedra, 2. papel 3. tijera.
//4. muestra el resultado.