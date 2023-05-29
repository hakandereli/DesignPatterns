/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatterns.creational.singleton.main;


import designpatterns.creational.singleton.EagerInitialization.EagerInitialization;
import designpatterns.creational.singleton.LazyInitialization.LazyInitialization;
import designpatterns.creational.singleton.StaticBlockInitialization.StaticBlockInitialization;
import designpatterns.creational.singleton.ThreadSafeInitialization.ThreadSafeInitialization;
import designpatterns.creational.singleton.ThreadSafeDoubleCheck.ThreadSafeDoubleCheckInitialization;


import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadTest {

    public static void main(String[] args) {

        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    //Genelde 1 saniye uyuttuğunda diğer thread ile aynı anda çağırır metodu.
                    Thread.sleep(1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("HashCode of Lazy: " + LazyInitialization.getInstance().hashCode());
                System.out.println("HashCode of Eager: " + EagerInitialization.getInstance().hashCode());
                System.out.println("HashCode of StaticBlock: " + StaticBlockInitialization.getInstance().hashCode());
                System.out.println("HashCode of ThreadSafe: " + ThreadSafeInitialization.getInstance().hashCode());
                System.out.println("HashCode of ThreadSafeDoubleCheck: " +ThreadSafeDoubleCheckInitialization.getInstance().hashCode());

            }

        }).start();

        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("HashCode of Lazy: " + LazyInitialization.getInstance().hashCode());
                System.out.println("HashCode of Eager: " + EagerInitialization.getInstance().hashCode());
                System.out.println("HashCode of StaticBlock: " + StaticBlockInitialization.getInstance().hashCode());
                System.out.println("HashCode of ThreadSafe: " +ThreadSafeInitialization.getInstance().hashCode());
                System.out.println("HashCode of ThreadSafeDoubleCheck: " + ThreadSafeDoubleCheckInitialization.getInstance().hashCode());
            }

        }).start();
        
         new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadSafeInitialization.getInstance().sampleMethodA();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                ThreadSafeInitialization.getInstance().sampleMethodB();
            }
        }).start();
        
    }

}
