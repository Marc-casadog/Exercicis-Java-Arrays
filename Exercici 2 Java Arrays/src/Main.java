import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);
    int[] numeros = new int[5];

    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = sc.nextInt();
        System.out.println("Introdueix un nombre:");
    }

    System.out.println("Recorregut invers:");

    for (int i = 0; i < numeros.length; i--) {
        numeros[i] = sc.nextInt();

    }

    System.out.println("Recorregut original");

    for (int i = 0; i < numeros.length; i++) {
        
    }



}