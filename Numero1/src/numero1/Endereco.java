package numero1;

public class Endereco {

    private String CEP;
    private String rua;
    private int numero;

    public Endereco(String CEP, String rua, int numero) {
        this.CEP = CEP;
        this.rua = rua;
        this.numero = numero;
    }

    public String getCEP() {
        return CEP;
    }

    public String getRua() {
        return rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

}
