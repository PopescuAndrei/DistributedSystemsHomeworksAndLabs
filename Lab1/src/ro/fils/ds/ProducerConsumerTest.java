/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.fils.ds;

/**
 *
 * @author epopean
 */
public class ProducerConsumerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cookie c = new Cookie();
        Producer p1 = new Producer(c,1);
        Consumer c1 = new Consumer(c,1);
        p1.start();
        c1.start();
    }
    
}
