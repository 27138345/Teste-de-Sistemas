public class Pagamento {
    private Boleto boleto;
    private Cartão cartao;

    public Boleto getBoleto() {
        return boleto;
    }
    public void setBoleto(Boleto boleto) {
        this.boleto = boleto;
    }
    public Cartão getCartao() {
        return cartao;
    }
    public void setCartao(Cartão cartao) {
        this.cartao = cartao;
    }
}