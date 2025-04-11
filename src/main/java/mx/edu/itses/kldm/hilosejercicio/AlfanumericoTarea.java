/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.edu.itses.kldm.hilosejercicio;

/**
 *
 * @author karin
 */
public class AlfanumericoTarea implements Runnable{

    
    public enum Tipo{
        NUMERO,LETRA
    }
    
    private Tipo tipo;

    public AlfanumericoTarea(Tipo tipo) {
        this.tipo = tipo;
    }
    
    
    
    @Override
    public void run() {
        try {
            if(tipo==tipo.NUMERO){
                System.out.println("Hilo"+ Thread.currentThread().getName());
                for (int i = 1; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + i);        
                    Thread.sleep(2000);
                }
            }else if(tipo == tipo.LETRA){
                System.out.println("Hilo" + Thread.currentThread().getName());
                for (char x = 'a'; x <='z'; x++) {
                    
                     System.out.println(Thread.currentThread().getName() + x);        
                    Thread.sleep(2000); 
                }
            }
        } catch (InterruptedException e) {
            
        }
    }
    
}
