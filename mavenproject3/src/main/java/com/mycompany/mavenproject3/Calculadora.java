package com.mycompany.mavenproject3;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;
        
        do {
            // MENÚ PRINCIPAL
            System.out.println("\n=== CALCULADORA 3/3 ===");
            System.out.println("1. SUMA");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.println("7. Módulo");
            System.out.println("8. Logaritmo");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            
            opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1: // SUMA
                    System.out.print("Numero 1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Numero 2: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                    
                case 2: // RESTA
                    System.out.print("Numero 1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Numero 2: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                    
                case 3: // MULTIPLICACIÓN
                    System.out.print("Numero 1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Numero 2: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                    
                case 4: // DIVISIÓN
                    System.out.print("Numero 1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Numero 2: ");
                    num2 = scanner.nextDouble();
                    if(num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir por cero");
                    }
                    break;
                    
                case 5: // POTENCIA
                    System.out.print("Base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Exponente: ");
                    num2 = scanner.nextDouble();
                    resultado = Math.pow(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                    
                case 6: // RAÍZ CUADRADA
                    System.out.print("Número: ");
                    num1 = scanner.nextDouble();
                    if(num1 >= 0) {
                        resultado = Math.sqrt(num1);
                        System.out.println("Raíz cuadrada: " + resultado);
                    } else {
                        System.out.println("Error: No existe raíz de número negativo");
                    }
                    break;
                    
                case 7: // MÓDULO
                    System.out.print("Numero 1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Numero 2: ");
                    num2 = scanner.nextDouble();
                    if(num2 != 0) {
                        resultado = num1 % num2;
                        System.out.println("Resultado (módulo): " + resultado);
                    } else {
                        System.out.println("Error: No se puede calcular módulo con divisor cero");
                    }
                    break;
                    
                case 8: // LOGARITMO
                    System.out.println("1. Logaritmo natural (ln)");
                    System.out.println("2. Logaritmo base 10 (log)");
                    System.out.print("Elige una opción: ");
                    int subOpcion = scanner.nextInt();
                    System.out.print("Número: ");
                    num1 = scanner.nextDouble();
                    if(num1 > 0) {
                        if(subOpcion == 1) {
                            resultado = Math.log(num1);
                            System.out.println("ln(" + num1 + ") = " + resultado);
                        } else if(subOpcion == 2) {
                            resultado = Math.log10(num1);
                            System.out.println("log(" + num1 + ") = " + resultado);
                        } else {
                            System.out.println("Opción no válida");
                        }
                    } else {
                        System.out.println("Error: El logaritmo solo está definido para números positivos");
                    }
                    break;
                    
                case 0:
                    System.out.println("¡Gracias por usar la calculadora!");
                    break;
                    
                default:
                    System.out.println("Opción no válida");
            }
            
        } while(opcion != 0);
        
        scanner.close();
    }
    
    // Métodos originales (por si acaso)
    public int sumar(int a, int b) {
        return a + b;
    }
    
    public int restar(int a, int b) {
        return a - b;
    }
    
    public int multiplicar(int a, int b) {
        return a * b;
    }
    
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        return a / b;
    }
}
