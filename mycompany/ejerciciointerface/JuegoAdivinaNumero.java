package com.mycompany.ejerciciointerface;

import javax.swing.JOptionPane;

public class JuegoAdivinaNumero implements Jugable {

    private int num;
    private int intentos = 3;
    private int adivinar = 0;

    public void iniciar() {
        num = (int) (Math.random() * 10);

    }

    public void jugar() {
        int contador = 1;
        adivinar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        while ((num != adivinar) && (contador < intentos)) {
            adivinar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            contador++;
        }
        this.finalizar();
    }

    public void finalizar() {
        if (num == adivinar) {
            System.out.println("Ganaste!");
        } else {
            System.out.println("Game over");
        }
    }
}
