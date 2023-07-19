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

        ConcreteMediator mediator = new ConcreteMediator();

        Colleague colleague1 = new ConcreteColleague1(mediator);
        Colleague colleague2 = new ConcreteColleague2(mediator);

        mediator.addColleaque(colleague1);
        mediator.addColleaque(colleague2);

        colleague1.notifyColleague("Hello from ConcreteColleague1");
        colleague2.notifyColleague("Hello from ConcreteColleague2");

        assertEquals("Hello from ConcreteColleague2",((ConcreteColleague2) colleague2).getReceivedMessage());
        assertEquals("Hello from ConcreteColleague1",((ConcreteColleague1) colleague1).getReceivedMessage());
    }
}
