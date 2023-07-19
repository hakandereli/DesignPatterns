package designpatterns.behavioural.mediator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author hdereli
 * @since 7/19/2023
 */
//Mesajlama Ortamı
public class ConcreteMediator implements Mediator {

    private List<Colleague> colleagueList;

    public ConcreteMediator() {
        colleagueList = new ArrayList<>();
    }

    //Kullanıcıları ekler.
    public void addColleaque(Colleague colleague) {
        colleagueList.add(colleague);
    }

    //Sahibine mesaj yollar.
    @Override
    public void notifyColleague(Colleague colleague, String message) {

        for (Iterator iterator = colleagueList.iterator(); iterator.hasNext(); ) {
            Colleague receiverColleague = (Colleague) iterator.next();

            //Kullanıcı 1 kendisi hariç herkese bu mesajı yollar.
            if (colleague != receiverColleague){
                receiverColleague.receive(message);
            }

        }

    }
}
