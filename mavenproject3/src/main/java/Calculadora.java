import java.util.Scanner;



public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        double num1, num2, resultado;
        
        do {
            // MENÚ PRINCIPAL
            System.out.println("\n=== CALCULADORA 3/3 ===");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potencia");
            System.out.println("6. Raíz cuadrada");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            
            opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1: // SUMA
                    System.out.print("Número 1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Número 2: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                    
                case 2: // RESTA
                    System.out.print("Número 1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Número 2: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                    
                case 3: // MULTIPLICACIÓN
                    System.out.print("Número 1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Número 2: ");
                    num2 = scanner.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                    
                case 4: // DIVISIÓN
                    System.out.print("Número 1: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Número 2: ");
                    num2 = scanner.nextDouble();
                    if(num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir por cero");
                    }
                    break;
                    
                case 5: // POTENCIA (nueva función)
                    System.out.print("Base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Exponente: ");
                    num2 = scanner.nextDouble();
                    resultado = Math.pow(num1, num2);
                    System.out.println("Resultado: " + resultado);
                    break;
                    
                case 6: // RAÍZ CUADRADA (nueva función)
                    System.out.print("Número: ");
                    num1 = scanner.nextDouble();
                    if(num1 >= 0) {
                        resultado = Math.sqrt(num1);
                        System.out.println("Raíz cuadrada: " + resultado);
                    } else {
                        System.out.println("Error: No existe raíz de número negativo");
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