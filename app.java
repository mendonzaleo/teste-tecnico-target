import java.util.Scanner;
import java.util.Arrays;
public class App {
    public static void main(String[] args) {
        //QUESTÃO 1
        /* int indice = 13, soma = 0, k = 0;

        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }
        System.out.print(soma); // RESPOSTA: SOMA = 91
        */
        //QUESTÃO 2
        Scanner teclado = new Scanner(System.in);
        //SEQUÊNCIA DE FIBONACCI
        System.out.println("Digite o número de elementos da sequência de Fibonacci!");
        int numeroElementos = teclado.nextInt();
        int[] fibonacci = new int[numeroElementos];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < numeroElementos; i++){
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        for (int i = 0; i < fibonacci.length; i++){
            System.out.println(fibonacci[i]);
        }
        // VERIFICANDO SE O ELEMENTO ESTÁ NA SEQUÊNCIA DE FIBONACCI
        System.out.println("Digite o número que gostaria de verificar se está na sequência de Fibonacci: ");
        int elementoProcurado = teclado.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < fibonacci.length; i++) {
            if (fibonacci[i] == elementoProcurado) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("O elemento " + elementoProcurado + " está presente na sequência de Fibonacci.");
        } else {
            System.out.println("O elemento " + elementoProcurado + " não está presente na sequência de Fibonacci.");
        }
        //QUESTÃO 3
        /*
        a) 1, 3, 5, 7, 9;
        b) 2, 4, 8, 16, 32, 64, 128;
        c) 0, 1, 4, 9, 16, 25, 36, 49;
        d) 4, 16, 36, 64, 100;
        e) 1, 1, 2, 3, 5, 8, 13;
        f) 2,10, 12, 16, 17, 18, 19, 20;
        */
        //QUESTÃO 4
        /*Eu ligaria 2 interruptores e daria a primeira ida para ver quais salas estão com a lâmpada acessa.
        Voltaria para a sala dos interruptores e desligaria um dos interruptores que estava ligado e daria a segunda ida para ver qual sala que estava com a lâmpada acesa apagou.
        Assim conseguiria saber quais interruptores controlam cada sala.
        */
        //QUESTÃO 5
        System.out.println("Digite a palavra que será revertida!");
        String palavra = teclado.next();
        String palavraInvertida = " ";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida = palavraInvertida + palavra.charAt(i);
        }
        System.out.println("A palavra informada é " + palavra + "!");
        System.out.println("A palavra revertida é " + palavraInvertida + "!");
        teclado.close();
    }
}
