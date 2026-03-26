import java.util.Scanner;

public class CardapioLanchonete {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Codigo    Produto    Preço");
        System.out.println("[100]      Cachorro Quente   R$19,00");
        System.out.println("[101]      Bauru Simples    R$15,00");
        System.out.println("[102]      Bauru com ovo       R$33,00");
        System.out.println("[103]      Hamburguer    R$35,00");
        System.out.println("[104]      Cheeseburguer     R$5,00");
        System.out.println("[105]      Refrigerante     R$60,00");
        String codigo = sc.next().toUpperCase();

        System.out.println("Digite quantos você quer");
        int quantidade = sc.nextInt();

        double calculo;

        switch (codigo){
            case "100":
                calculo = (quantidade * 19);
                System.out.println("O valor do Cachorro Quente é:"+ calculo);
                break;
                case "101":
                    calculo = (quantidade * 15);
                    System.out.println("O valor do Bauru Simples é:"+calculo);
                    break;
                    case "102":
                        calculo = (quantidade * 33);
                        System.out.println("O valor do Bauru com ovo é:"+calculo);
                        break;
                        case "103":
                            calculo = (quantidade * 35);
                            System.out.println("O valor do Hambúrguer é"+calculo);
                            break;
                            case "104":
                                calculo = (quantidade * 5);
                                System.out.println("O valor do Cheesebuguer é:"+calculo);
                                break;
                                case "105":
                                    calculo = (quantidade * 60);
                                    System.out.println("O valor do refrigerante é:"+calculo);
                                    break;

                                    default:


        }
        sc.close();
    }
    }
