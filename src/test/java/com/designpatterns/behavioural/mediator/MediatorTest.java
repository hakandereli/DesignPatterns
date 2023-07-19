package com.designpatterns.behavioural.mediator;

import designpatterns.behavioural.mediator.Colleague;
import designpatterns.behavioural.mediator.ConcreteColleague1;
import designpatterns.behavioural.mediator.ConcreteColleague2;
import designpatterns.behavioural.mediator.ConcreteMediator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author hdereli
 * @since 7/19/2023
 */
public class MediatorTest {

    @Test
    public void testMediator(){

        //Mesajlama Ortamı oluşturuldu.
        ConcreteMediator mediator = new ConcreteMediator();

        //Kullanıcılar tanımlandı.
        Colleague colleague1 = new ConcreteColleague1(mediator);
        Colleague colleague2 = new ConcreteColleague2(mediator);

        //Kuleye merkeze kullacılar bildirildi.
        mediator.addColleaque(colleague1);
        mediator.addColleaque(colleague2);

        //Kullanıcı 1 kendisi hariç herkese mesajını yollar.
        colleague1.notifyColleague("Hello from ConcreteColleague1");
        //Kullanıcı 2 kendisi hariç herkese mesajını yollar.
        colleague2.notifyColleague("Hello from ConcreteColleague2");

        //Kullanıcı 2 nin yolladığı mesajı kullanıcı 1 in alıp almadığı kontrol ediliyor.
        assertEquals("Hello from ConcreteColleague2",((ConcreteColleague1) colleague1).getReceivedMessage());
        //Kullanıcı 1 nin yolladığı mesajı kullanıcı 2 in alıp almadığı kontrol ediliyor.
        assertEquals("Hello from ConcreteColleague1",((ConcreteColleague2) colleague2).getReceivedMessage());
    }
}
