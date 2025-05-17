package desafios_introducao;

import java.util.Locale;

public class Linguagem{

    public static void main(String[] args){

        Locale idioma = Locale.getDefault();
        System.out.print("A sua linguagem é: ");
        System.out.println(idioma.getDisplayLanguage());
    }
}