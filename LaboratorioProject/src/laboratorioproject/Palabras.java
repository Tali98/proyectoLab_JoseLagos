/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorioproject;

/**
 *
 * @author tali_
 */
public class Palabras {
    private String palabras;
    private int num;

    public Palabras(String palabras, int num) {
        this.palabras = palabras;
        this.num = num;
    }

    public String getPalabras() {
        return palabras;
    }

    public void setPalabras(String palabras) {
        this.palabras = palabras;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return palabras+" "+num+"\n";
    }
    
}
