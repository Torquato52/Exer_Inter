package Imposto;

public class MainImpos {
    public static void main(String[] args) {
        ImposInter saoPaulo = new SaoPaulo(); ImposInter beloHorizonte = new BeloHorizonte();

        CalculadorImposto calculadorImposto = new CalculadorImposto(saoPaulo);
        double impostoSaoPaulo = calculadorImposto.calcularImposto(100, 25, 4, 2, 0);
    
        calculadorImposto = new CalculadorImposto(beloHorizonte);
        double impostoBeloHorizonte = calculadorImposto.calcularImposto(120, 30, 5, 3, 0);
    
        System.out.println("Imposto em São Paulo: R$ " + impostoSaoPaulo);
        System.out.println("Imposto em Belo Horizonte: R$ " + impostoBeloHorizonte);  
    }
}