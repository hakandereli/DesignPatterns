package designpatterns.behavioural.memento;

public class Main {
    /**
     * Memento tasarım kalıbı, davranışsal bir tasarım kalıbıdır ve nesnelerin iç durumlarını kaydetmek ve geri yüklemek için kullanılır.
     * Bu tasarım kalıbı, özellikle bir nesnenin geçmiş durumlarına dönme veya geri alma (undo) işlemlerini desteklemek için kullanılır.
     * Aynı zamanda nesne durumu üzerinde dışarıdan erişimi sınırlar ve böylece nesnenin bütünlüğünü korur.
     *
     *
     *
     * Memento tasarım kalıbı, aşağıdaki ana bileşenlerden oluşur:
     *
     * Originator (Oluşturucu): Durumu kaydeden ve geri yükleyen nesnedir.
     * Memento: Durumu temsil eden nesnedir. Bu nesne, originator nesnesinin iç durumunu saklayan bir yapı içerir.
     * Caretaker (Koruyucu): Memento nesnelerini saklayan ve gerektiğinde originator nesnesine geri yüklemek için kullanılan bir yapıdır.
     *
     *
     * Memento tasarım kalıbı, aşağıdaki senaryoları çözmek için kullanılabilir:
     *
     * Geri alma (undo) işlemlerini desteklemek.
     * Bir nesnenin geçmiş durumlarına göz atmak veya geçmişteki bir duruma dönmek.
     * Nesne durumunu korurken nesnenin bütünlüğünü sağlamak.
     *
     * */


    public static void main(String[] args){
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        //İlk Durumu kaydet
        originator.setState("Durum 1");
        caretaker.addMemento(originator.saveStateToMemento());
        System.out.println(originator.getState());

        //Durum Değiştir
        originator.setState("Durum 2");
        caretaker.addMemento(originator.saveStateToMemento());
        System.out.println(originator.getState());

        //Geri alma işlemi
        originator.getStateFromMemento(caretaker.getMemento(0));
        System.out.println(originator.getState());

        /**
         *
         * Bu örnekte, Originator sınıfı durumu kaydeder ve geri yükler, Memento sınıfı durumu temsil eder,
         * ve Caretaker sınıfı Memento nesnelerini saklar. Ana programda, bir durum kaydedilir,
         * durum değiştirilir ve ardından geri alınan durum görüntülenir.
         * Bu, Memento tasarım kalıbının temel kullanımını göstermektedir.
         * */
    }
}
