package com.mycompany.jogodamemoria;

public class JogoDaMemoria {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new TelaPrincipal().setVisible(true);
        });
    }
}
