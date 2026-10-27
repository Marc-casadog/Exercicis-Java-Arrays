import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    int[] numeros = new int[5];
    double suma = 0;
    double mitjana;

    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Introdueix un nombre:");
        numeros[i] = sc.nextInt();
    }

    for  (int i = 0; i < numeros.length; i++) {
       suma = suma + numeros[i];

    }

    mitjana = suma / numeros.length;

    System.out.println("La mitjana es: " + mitjana);
    System.out.println("La suma es: " + suma);
    
}