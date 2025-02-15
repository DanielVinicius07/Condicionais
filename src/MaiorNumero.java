import java.util.Scanner;
public class MaiorNumero {
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
        if (num1 > num2 && num1 > num3) {
            System.out.println("O número " + num1 + " é maior que " + num2 + " e " + num3);
        }
        else if (num2 > num1 && num1 > num3) {
            System.out.println("O número " + num2 + " é maior que " + num1 + " e " + num3);
        }
        else {
            System.out.println("O número " + num3 + " é maior que " + num1 + " e " + num2);
    }
    numeros.close();
}
}