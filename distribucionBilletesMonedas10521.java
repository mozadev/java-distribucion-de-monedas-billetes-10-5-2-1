package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

public class ejercicios {

    public static void main(String[] args) {

        //declaracion de variable

        int sueldoTrabajador;
        int billetesDe100;
        int billetesDe50;
        int billetesDe20;
        int billetesDe10;
        int monedasDe5;
        int monedasDe2;
        int monedasDe1;
        int loQueQuedoDeLos100soles;
        int loQueQuedoDeLos50soles;
        int loQueQuedoDeLos20soles;
        int loQueQuedoDeLos10soles;
        int loQueQuedoDeLos5soles;
        int loQueQuedoDeLos2soles;

        // ingreso de datos del usuario

        sueldoTrabajador = Integer.parseInt(JOptionPane.showInputDialog("Digite el sueldo del trabajador: "));

        // procesamiento de datos

        billetesDe100 = sueldoTrabajador / 100; // obtenemos la parte entera de la division entre 100, es decir los billetes de 100
        loQueQuedoDeLos100soles = sueldoTrabajador % 100; // % significa el residuo de la division entre 100

        billetesDe50 = loQueQuedoDeLos100soles / 50; // el residuo de la division anterior lo dividimos entre 50 para obtener los billetes de 50
        loQueQuedoDeLos50soles = (loQueQuedoDeLos100soles % 50); // obtiene el residuio de dividir entre 50

        billetesDe20 = (loQueQuedoDeLos50soles) / 20;// 
        loQueQuedoDeLos20soles = loQueQuedoDeLos50soles % 20;

        billetesDe10 = loQueQuedoDeLos20soles / 10;
        loQueQuedoDeLos10soles = loQueQuedoDeLos20soles % 10;

        monedasDe5 = (sueldoTrabajador % 10) / 5; // el residuo de dividir entre 10 simpre sera menor que 10
        loQueQuedoDeLos5soles =(sueldoTrabajador % 10) % 5;
        
        monedasDe2 = loQueQuedoDeLos5soles / 2;
        loQueQuedoDeLos2soles=loQueQuedoDeLos5soles%2;
        
        
        monedasDe1 = loQueQuedoDeLos2soles / 1;

        // impresion de informacion

        System.out.println("distribucion de billetes y monedas para pagar el sueldo: ");
        System.out.println("suedo a distribuir:  " + sueldoTrabajador);
        System.out.println("cantidad de billetes de 100: " + billetesDe100);
        System.out.println("cantidad de billetes de 50: " + billetesDe50);
        System.out.println("cantidad de billetes de 20: " + billetesDe20);
        System.out.println("cantidad de billetes de 10: " + billetesDe10);
        System.out.println("cantidad de billetes de 5: " + monedasDe5);
        System.out.println("cantidad de billetes de 2: " + monedasDe2);
        System.out.println("cantidad de billetes de 1: " + monedasDe1);

    }
}
