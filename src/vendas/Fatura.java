/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendas;

import java.io.Serializable;

/**
 *
 * @author kiDDing
 */
public class Fatura implements Serializable{
    private String produto;
    private float subtotal;
    private int quantidade;

    public Fatura(String produto, float subtotal, int quantidade) {
        this.produto = produto;
        this.subtotal = subtotal;
        this.quantidade = quantidade;
    }
    
    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    

}
