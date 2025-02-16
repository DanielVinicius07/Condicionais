import java.util.Scanner;
public class MaiorEMenor {
    public static void main(String[] args) throws Exception {
        int num1;
        int num2;
        int num3;
        
        Scanner numeros = new Scanner(System.in);
        System.out.println("Digite o primeiro número ");
        num1 = numeros.nextInt();
        System.out.println("Digite o segundo número ");
        num2 = numeros.nextInt();
        System.out.println("Digite o terceiro número ");
        num3 = numeros.nextInt();

        if (num1 > num2 && num1 > num3 && num2 > num3) {
            System.out.println("O número " + num1 + " é o maior número e o " + num3 + " é o menor número ");// 1 e 3
        }
        else if (num1 > num2 && num1 > num3 && num3 > num2) {
            System.out.println("O número " + num1 + " é o maior número e o " + num2 + " é o menor número "); // 1 e 2
        }
        else if (num2 > num1 && num2 > num3 && num1 > num3) {
            System.out.println("O número " + num2 + " é o maior número e o " + num3 + " é o menor número "); // 2 e 3
        }
        else if (num2 > num1 && num2 > num3 && num3 > num1) {
            System.out.println("O número " + num2 + " é o maior número e o " + num1 + " é o menor número "); // 2 e 1
        }
        else if (num3 > num1 && num3 > num2 && num2 > num1) {
            System.out.println("O número " + num3 + " é o maior número e o " + num1 + " é o menor número "); // 3 e 1
        }
        else if (num3 > num1 && num3 > num2 && num1 > num2) {
            System.out.println("O número " + num3 + " é o maior número e o " + num2 + " é o menor número "); // 3 e 2
        }
        else {
            System.out.println("Digite um número inteiro");
    }
    numeros.close();
}
}