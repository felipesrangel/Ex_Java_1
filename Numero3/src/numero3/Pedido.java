package numero3;

import java.util.*;

public class Pedido {
    private Loja loja;
    private int id;
    private Date dataEmissao;
    private float valorTotalCalculado;
    
    public Pedido(Loja loja, int pedidoId, Date dataEmissão, float valorTotalCalculado) {
        this.loja = loja;
        this.id = pedidoId;
        this.dataEmissao = dataEmissão;
        this.valorTotalCalculado = valorTotalCalculado;
    }
    
    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissão) {
        this.dataEmissao = dataEmissão;
    }
    
    public Loja getLoja() {
        return loja;
    }

    public int getPedidoId() {
        return id;
    }
 

    public float getValorTotalCalculado() {
        return valorTotalCalculado;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public void setPedidoId(int pedidoId) {
        this.id = pedidoId;
    }


    public void setValorTotalCalculado(float valorTotalCalculado) {
        this.valorTotalCalculado = valorTotalCalculado;
    }
    
    
}
