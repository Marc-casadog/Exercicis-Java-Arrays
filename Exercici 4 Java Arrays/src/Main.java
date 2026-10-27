import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    int[] numeros = new int[8];

    int positius = 0;
    int negatius = 0;
    int zeros = 0;

    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Introdueix un nombre:");
        numeros[i] = sc.nextInt();

    }
    
    for (int i = 0; i < numeros.length; i++) {
        if (numeros[i] > 0) {
            positius++;
        } else if (numeros[i] < 0) {
            negatius++;


        } else {
            zeros++;

        }
    }
    System.out.println("Positius: " + positius);
    System.out.println("Negatius: " + negatius);
    System.out.println("Zeros: " + zeros);
     

    }



