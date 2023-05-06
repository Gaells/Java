
package com.mycompany.listadeexerc1;

/**
 *
 * E4) Faça um programa que apresente os números primos menores que 100.
 * 
 */
public class ListadeExerc4 {
      public static void main (String[] args) {
        int primo = 0;
        
        for (int i = 0; i < 100; i++){
            for (int j = 1; j <= i; j++) { //ele verifica quantos divisores cada número tem, sempre que um divisor é encontrado.
                if((i % j) == 0){ // Se um número tem exatamente dois divisores (o próprio número e 1), então ele é um número primo
                    primo++;
            }   
        }
            if(primo == 2) {
                System.out.println("O numero " + i + "  eh Primooo!");
            }
            primo = 0; // reinicia para 0 no final do loop, para ser usada no próximo número
    }
        
  }

    
}
