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
public class Producer extends Thread {

    private Cookie cookie;
    private int number;

    public Producer(Cookie cookie, int number) {
        this.cookie = cookie;
        this.number = number;

    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            cookie.put(i);
            System.out.
                    println("Producer #" + this.number + " put: " + i);
            try {
                sleep((int) (Math.random() * 100));
            } catch (InterruptedException e) {
            }
        }
    }
}
