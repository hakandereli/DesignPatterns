package designpatterns.behavioural.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hdereli
 * @since 9/4/2023
 */
// Caretaker: Memento nesnelerini saklayan ve geri yükleyen sınıf
public class Caretaker {

    private List<Memento> mementoList = new ArrayList<>();

    public  void addMemento(Memento memento){
        mementoList.add(memento);
    }

    public Memento getMemento(int index){
        return mementoList.get(index);
    }
}
