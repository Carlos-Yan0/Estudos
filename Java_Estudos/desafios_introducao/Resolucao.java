package desafios_introducao;

import java.awt.Dimension;
import java.awt.Toolkit;


public class Resolucao {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension resolucao = toolkit.getScreenSize();

        int largura = (int) resolucao.getWidth();
        int altura  = (int) resolucao.getHeight();

        System.out.println("A sua resolução é " +largura+ "X" +altura);
    }
}    
