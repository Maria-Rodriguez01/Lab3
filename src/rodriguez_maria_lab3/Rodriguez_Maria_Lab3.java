
package rodriguez_maria_lab3;

import java.util.Random;
import java.util.Scanner;

public class Rodriguez_Maria_Lab3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        int Menu, opcion1 = 0, opcion2 = 0, opcion3 = 0, opcion4 = 0, contador;
        String palabra, pinvertida = "";
        int primo = 0;
        int naleatorio = random.nextInt(101);
        int numperfecto = 0;
        int personas, personastotal;
        String voto, ganador = "";
        int azul = 0, rojo = 0, amarillo = 0, negro = 0, nulo = 0, vvalido, validos, max = 0;

        while (true) {
            while (true) {
                System.out.println(".....Menu.....");
                System.out.println("1. Palabra Alreves");
                System.out.println("2. Número Perfecto");
                System.out.println("3. Números Primos");
                System.out.println("4. Votaciones");
                System.out.println("5. Salir");
                System.out.println("...............");
                System.out.println("Ingresar que opcion desea realizar:");
                Menu = entrada.nextInt();
                if (Menu < 6 && Menu > 0) {
                    break;
                } else {
                    System.out.println("Favor ingrese unicamente las opciones sugeridas en el menu.");
                }
            }

            if (Menu == 1) {
                System.out.println("Has escogido Palabra Alreves!");
                System.out.println("");
                System.out.println("Favor ingrese palabra que desea que se imprima al reves: ");
                palabra = entrada.next();
                contador = palabra.length() - 1;

                while (contador >= 0) {
                    pinvertida += palabra.substring(contador, contador + 1);
                    contador--;
                }
                System.out.println("La palabra " + palabra + " invertida es " + pinvertida);
                System.out.println("");
                opcion1++;
            }
            if (Menu == 2) {
                System.out.println("Has escogido Números Perfectos!");
                System.out.println("");
                System.out.println("Favor ingrese un número:");
                int numero = entrada.nextInt();

                for (int i = 1; i < numero; i++) {
                    if (numero % i == 0) {
                        numperfecto += i;
                    }
                }
                if (numero == numperfecto) {
                    System.out.println("El numero ingresado si es un numero perfecto!");
                    System.out.println("");
                } else {
                    System.out.println("El numero ingresado no es un numero perfecto");
                    System.out.println("");
                            
                }
                opcion2++;

            }
            if (Menu == 3) {
                System.out.println("Has elegido Números Primos!");
                System.out.println("El número aleatorio es " + naleatorio);
                System.out.println("");

                int cantdivisores = 0;
                String divisores = "";

                for (int i = 1; i <= naleatorio; i++) {
                    if (naleatorio % i == 0) {
                        cantdivisores++;
                        divisores += i + " ";
                    }
                }

                for (int i = 1; i <= naleatorio; i++) {
                    if (naleatorio % i == 0) {
                        primo++;
                    }
                }

                if (cantdivisores == 2) {
                    System.out.println("El número es primo porque solo tiene dos divisores.");
                    System.out.println("");

                } else {
                    System.out.println("El número no es primo.");
                    System.out.println("La cantidad de divisores que tiene son " + cantdivisores);
                    System.out.println("Los numeros divisores son: " + divisores);
                    System.out.println("");

                }
                opcion3++;

            }
            if (Menu == 4) {
                System.out.println("Has escogido Votación!");
                while (true) {
                    System.out.println("¿Cuantas personas van a votar?");
                    personas = entrada.nextInt();
                    if (personas > 0) {
                        break;
                    } else {
                        System.out.println("Favor ingresar numeros positivos unicamente.");
                        System.out.println("");
                    }
                }
                personastotal = personas;
                while (personas > 0) {
                    System.out.println("Favor ingrese por que planilla desea votar:");
                    System.out.println("Las planillas son Rojo, Azul, Amarillo o Negro; si ingresa otro nombre, se considerara nulo.");
                    voto = entrada.next();
                    if (voto.equalsIgnoreCase("Azul")) {
                        azul++;
                    }
                    if (voto.equalsIgnoreCase("Rojo")) {
                        rojo++;
                    }
                    if (voto.equalsIgnoreCase("Amarillo")) {
                        amarillo++;
                    }
                    if (voto.equalsIgnoreCase("Negro")) {
                        negro++;
                    } else {
                        nulo++;
                    }
                    personas--;
                }
                vvalido = azul + rojo + amarillo + negro;
                validos = vvalido / personastotal;
                if (validos > 0.60) {
                    if (azul > max) {
                        max = azul;
                        ganador = "Azul";
                    }
                    if (amarillo > max) {
                        max = amarillo;
                        ganador = "Amarillo";
                    }
                    if (rojo > max) {
                        max = rojo;
                        ganador = "Rojo";
                    }
                    if (negro > max) {
                        max = negro;
                        ganador = "Negro";
                    }
                    System.out.println("La planilla ganadora es " + ganador + " con " + max + " votos!");
                    System.out.println("");
                } else {
                    System.out.println("VOTACIÓN FALLIDA");
                    System.out.println("");
                }
                opcion4++;
            }
            if (Menu == 5) {
                System.out.println("Has escogido Salida!");
                System.out.println("Elegiste la opcion 1: " + opcion1 + " veces");
                System.out.println("Elegiste la opcion 2: " + opcion2 + " veces");
                System.out.println("Elegiste la opcion 3: " + opcion3 + " veces");
                System.out.println("Elegiste la opcion 4: " + opcion4 + " veces");
                break;
            }
        }
    }
}
