import java.util.Date;

public class Cartão {
    private int numero;
    private String nomeImpresso;
    private Date validade;
    private int codigoDeSeguranca;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNomeImpresso() {
        return nomeImpresso;
    }
    public void setNomeImpresso(String nomeImpresso) {
        this.nomeImpresso = nomeImpresso;
    }
    public Date getValidade() {
        return validade;
    }
    public void setValidade(Date validade) {
        this.validade = validade;
    }
    public int getCodigoDeSeguranca() {
        return codigoDeSeguranca;
    }
    public void setCodigoDeSeguranca(int codigoDeSeguranca) {
        this.codigoDeSeguranca = codigoDeSeguranca;
    }
}
