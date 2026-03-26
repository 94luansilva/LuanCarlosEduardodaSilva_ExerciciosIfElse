import java.util.Scanner;
public class CalculoEscolhido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a opção:");
        System.out.println("[M] Média entre os número digitados");
        System.out.println("[S] Diferença do maior pelo menor");
        System.out.println("[P] Produto entre os números digitados");
        System.out.println("[D] Divisão do primeiro pelo segundo");
        String opcao = sc.nextLine().toLowerCase();

        System.out.println("Digite o primeiro número");
        float num1 = sc.nextFloat();
        System.out.println("Digite o segundo número");
        float num2 = sc.nextFloat();

        float calculo;
        float diferenca;

        switch (opcao){
            case "m":
                calculo = (num1 + num2)/2;
                System.out.println("Esse foi o resultado do calculo solicitado:" +calculo);
                break;
            case "s":
                if (num1 > num2) {
                    diferenca = num1 - num2;
                } else {
                    diferenca = num2 - num1;
                }
                System.out.println("Esse foi o resultado do calculo solicitado " + diferenca);
                break;
            case "p":
                calculo = (num1 * num2);
                System.out.println("Esse foi o resultado do calculo solicitado:" +calculo);
                break;
            case "d":
                calculo = (num1 / num2);
                System.out.println("Esse foi o resultado do calculo solicitado:" +calculo);
                break;
            default:
                System.out.println("Inválido");
        }


        }


    }


