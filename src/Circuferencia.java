import java.util.Scanner;

public class Circuferencia {
    public static void main(String[] args) throws Exception {
        double raio;
        double diametro;
        double comprimento;
        double area;

        Scanner circulo = new Scanner(System.in);

        System.out.println("Qual o raio da circuferência?"); 
        raio = circulo.nextDouble();

        if(raio >= 0){
            diametro = raio + raio;
            comprimento = 2 * 3.14 * raio;
            area = 3.14 * raio * raio;
            System.out.println("O raio digitado foi "+ raio + ", então o diâmetro é " + diametro + ", o comprimento é " + comprimento + " e por fim a área é " + area + ".");
        }
        else{
            System.out.println("Número inválido");
        }
        circulo.close();
    }
}