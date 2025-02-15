import java.util.Scanner;
public class Notas {
    public static void main(String[] args) throws Exception {
        Scanner CalcularMedia = new Scanner(System.in);
        double AV1;
        double AV2;
        double AV3;
        double Media;
        
        System.out.println("Seja Bem Vindo a plataforma aluno!!"); 
        System.out.println("Para saber sua média digite as suas 3 notas logo a seguir"); 
        System.out.println("Digite a nota da sua AV1"); 
        AV1 = CalcularMedia.nextDouble();
        System.out.println("Digite a nota da sua AV2");
        AV2 = CalcularMedia.nextDouble();
        System.out.println("Digite a nota da sua AV3"); 
        AV3 = CalcularMedia.nextDouble();
        Media = (AV1+AV2+AV3)/3;
        System.out.println("A sua média foi: " + Media);
        CalcularMedia.close();


    }
}
