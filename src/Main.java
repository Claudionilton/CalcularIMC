import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Pessoa objetoPessoa = new Pessoa();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o seu peso");
        objetoPessoa.setPeso(leitor.nextFloat());
        System.out.println("Digite a sua altura");
        objetoPessoa.setAltura(leitor.nextFloat());

        System.out.println(objetoPessoa.tabelaIMC());
        System.out.println("IMC = " + objetoPessoa.calcularIMC());
    }
}