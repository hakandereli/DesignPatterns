package designpatterns.behavioural.visitor;

public class Main {
    /**
     *
     Visitor tasarım deseni, GoF (Gang of Four) tarafından tanımlanan ve nesne yapısını sürdürmek istediğiniz bir nesne
     ailesi üzerinde işlem yapmanıza olanak tanıyan bir davranışsal tasarım desenidir. Bu desen, bir nesne yapısı içindeki
     nesneleri değiştirmek veya yeni işlevsellik eklemek istediğinizde kullanışlıdır. Visitor deseni,
     "açık kapalı prensibi"ni uygular ve yeni işlevselliği eklemek için mevcut nesneleri değiştirmeniz gerekmez.
     Bu, özellikle karmaşık nesne yapıları veya sınıf hiyerarşileri üzerinde işlem yapmanız gerektiğinde faydalıdır.

     Visitor tasarım deseni, şu temel bileşenlerden oluşur:

     Visitor (Ziyaretçi): Bu arayüzdür ve nesne yapısı içindeki farklı nesne türlerini ziyaret etmek için gerekli işlevleri tanımlar.

     ConcreteVisitor (SomutZiyaretçi): Visitor arayüzünü uygular ve her nesne türü için özelleştirilmiş işlevleri içerir.

     Element (Eleman): Bu, nesne yapısındaki temel arayüzü temsil eder. Visitor tarafından ziyaret edilen nesnelerin ortak bir arayüzüdür.

     ConcreteElement (SomutEleman): Element arayüzünü uygular ve ziyaretçinin işlevlerini çağıran metotları içerir.

     ObjectStructure (NesneYapısı): Bu, ziyaret edilecek nesnelerin bir koleksiyonunu tutar ve Visitor'ı kullanarak bu nesneleri ziyaret eder.
     * */

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.addElement(new ConcreteElement(2));
        objectStructure.addElement(new ConcreteElement(3));

        Visitor visitor = new ConcreteVisitor();
        objectStructure.accept(visitor);
    }
}
