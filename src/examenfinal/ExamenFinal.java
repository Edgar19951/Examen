/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal;

import java.util.Scanner;

/**
 *
 * @author lorda
 */
public class ExamenFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese la cantidad de números a ordenar: ");
        num=sc.nextInt();
int tamañoArreglo[]=new int[num];
System.out.println("Ingrese los "+num+" valores enteros: ");
for(int i=0;i<num;i++)
{         
    tamañoArreglo[i]=sc.nextInt();
    
}
int aux=0;

for(int entero=0;entero<num;entero++)
{
for(int i=0;i<num-1;i++)
{ 
    if(tamañoArreglo[i]>tamañoArreglo[i+1])
    {
     aux=tamañoArreglo[i];
     tamañoArreglo[i]=tamañoArreglo[i+1];
     tamañoArreglo[i+1]=aux;
    }
}
    
}
int r=0;
System.out.println("Números Ordenados: ");


while(r<num)
{
    System.out.println(tamañoArreglo[r]);
    r++;
}

        
    }
    
    
}