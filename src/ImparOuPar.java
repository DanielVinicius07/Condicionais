import java.util.Scanner;
public class ImparOuPar {
    public static void main(String[] args) throws Exception {
    int num;

    Scanner numero = new Scanner(System.in);

        System.out.println("Digite um número para saber se é impar ou par");
        num = numero.nextInt();
        num = num % 2;
        if(num == 0){
            System.out.println("O número é par!!");
        }
        else{
            System.out.println("O número é impar");
        }
        numero.close();
    }
}
