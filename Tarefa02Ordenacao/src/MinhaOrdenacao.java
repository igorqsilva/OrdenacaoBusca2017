/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IGOR-ASUS
 */
import java.io.*;

public class MinhaOrdenacao implements Vetor {

    private int chave;

    public MinhaOrdenacao(int chave) {
        this.chave = chave;
    }

    @Override
    public int compara(Vetor it) {
        MinhaOrdenacao item = (MinhaOrdenacao) it;
        if (this.chave < item.chave) {
            return -1;
        } else if (this.chave > item.chave) {
            return 1;
        }
        return 0;
    }

    @Override
    public void alteraChave(Object chave) {
        Integer ch = (Integer) chave;
        this.chave = ch.intValue();
    }

    @Override
    public Object recuperaChave() {
        return new Integer(this.chave);
    }

    @Override
    public String toString() {
        return "" + this.chave;
    }

} // fim da classe MinhaOrdenacao
