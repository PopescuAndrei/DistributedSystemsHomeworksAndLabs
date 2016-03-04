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
public class Consumer extends Thread{
    private Cookie cookie;
    private int number;
    
    public Consumer(Cookie cookie, int number){
        this.cookie = cookie;
        this.number = number;
    }
    
    public void run(){
        int value = 0;
        for(int i=0;i<10;i++){
            value = cookie.get();
            System.out.println("Consumer#" + this.number + " got: " + value);
        }
    }

    public Cookie getCookie() {
        return cookie;
    }

    public void setCookie(Cookie cookie) {
        this.cookie = cookie;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    
}
