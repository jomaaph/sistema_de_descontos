import java.util.Scanner;

public class App {
    public static void main(String[] args){

        // Inicializar variáveis
        float valor_compra;
        float valor_pagar;  
        float desconto = 0;
        float taxa_desconto;


        // Definir o Scanner
        Scanner input = new Scanner(System.in);

        // Pedir o valor da compra do cliente
        System.out.print("🛒 Digite o valor total da compra: $ ");
        valor_compra = input.nextFloat();

        /*
        Condições para atribuição de desconto:
        compras superior a 999.999,99 desconoto de 10%
        compras entre 500.000,00 - 999.999,99 desconto de 7%
        compras entre 100.000,00 - 499.999.99 desconto de 4%
        compras entre  50.000,00 - 99.999,99 desconto de 2%
        compras inferior 50.000,00 sem desconto.

        */
        if (valor_compra >= 1_000_000) {
            taxa_desconto = 0.1f;
            desconto = valor_compra * taxa_desconto;
            System.out.printf("🧾 Com uma compra de $ %.2f o cliente garantiu um desconto de $ %.2f no valor que será pago.%n",valor_compra,desconto);

        }else if (valor_compra >= 500_000) {
            taxa_desconto = 0.07f;
            desconto = valor_compra * taxa_desconto;
            System.out.printf("🧾 Com uma compra de $ %.2f o cliente garantiu um desconto de $ %.2f no valor que será pago.%n",valor_compra,desconto);

        }else if (valor_compra >= 100_000) {
            taxa_desconto = 0.04f;
            desconto = valor_compra * taxa_desconto;
            System.out.printf("🧾 Com uma compra de $ %.2f o cliente garantiu um desconto de $ %.2f no valor que será pago.%n",valor_compra,desconto);

        } else if (valor_compra >= 50_000) {
            taxa_desconto = 0.02f;
            desconto = valor_compra * taxa_desconto;
            System.out.printf("🧾 Com uma compra de $ %.2f o cliente garantiu um desconto de $ %.2f no valor que será pago.%n",valor_compra,desconto);
            
        }else{
            System.out.printf("🧾 Com uma compra de $ %.2f o cliente não tem direito a desconto.%n",valor_compra);
        }

        // Calcular e Exibir o valor a ser pago.
        valor_pagar = valor_compra - desconto;
        System.out.printf("💰 Total a ser pago: $ %.2f.%n " ,valor_pagar);

        // Fechar o Scanner.
        input.close();
    }
}
