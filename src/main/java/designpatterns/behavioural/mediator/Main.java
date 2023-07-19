package designpatterns.behavioural.mediator;

public class Main {

    /**
     * Kelime anlamı olarak aracı , ara bulucu dır.
     *
     * Birbiriyle ilişkili nesneler arasında ilişkiyi direk kurmak yerine bir aracı koyarak bu aracı sayesinde
     * esnek bağlı olur bunlar. Bakım onarım ve değişiklik maliyetleri azalır bu tasarım deseni ile.
     *
     *
     * Mediator design patternini birbirleriyle ilişkili eş görevli bir grup nesneyi tek merkezden yönetmek ve aralarında gevşek bağlı(loosely coupled) sistemler kurmak istediğimiz durumlarda kullanabiliriz. Tanımı netleştirebilmek adına bir örnek üzerinden devam edelim.
     *
     * Birbiriyle konuşması gereken bir grup nesnemiz olduğunu varsayalım. Genelde bu varsayım için iki klasik örnek vardır. Biri chatbot örneği diğeri ise hava yolu örneği.
     *
     * Chatbot örneği üzerinden gidersek, birbiriyle konuşması gereken bir grup nesnemiz chatleşecek olan kişileri temsil eden nesneler, mediator classımızda bu kişilerin bir arada bulunup birbirleriyle ilişki kurduğu chatroomdur. Normal şartlarda chatgrupları, chatleşecek kişiler vs için ayrı nesneler yarattığımzda bu kişileri birbiriyle konuşturabilmek için birbirine referans vermemiz gerekir. Ancak bu classların birbirine sıkı sıkıya bağlı olması (Tightly coupling) demektir ve istemediğimiz bir durumdur. Sistemlerimizi olabildiğince gevşek bağlı inşa etmeliyiz. Chat örneği için bütün kullanıcıların birbirleriyle olan ilişkisini ve mesajlaşmasını, kullanıcıları birbirine dokundurmadan bir ara katman yani mediator class üzerinden yönetiriz.
     *
     * Ya da bir diğer örnek olan havayolu örneği, gün içerisinde havaalanına iniş kalkış yapan onlarca hatta yüzlerce uçak vardır ve bunların birbirleriyle senkron hareket etmesi yani birbirlerinden haberdar olması gerekir. Ancak bu birbirlerinden haberdar olma durumu için bütün uçakların direkt olarak birbirleriyle iletişim kurdukları senaryoyu bir düşünün. Tamamen bir kaos ve spagetti durum. Bunun yerine bir kule uçaklar arasındaki iletişimi ve organizasyonu sağlar ki bu kule tam olarak mediator classtır.
     *
     * Sonuç olarak Mediator design patterninin bize söylediği şey, bu birbiriyle ilişki içinde olması gereken nesneleri ki bunlar birbirleriyle chatleşecek userlar olabilir, birbirleriyle iniş kalkış için iletişim kurması gereken uçak nesneleri olabilir, tek bir merkez içerisinde (mediator classta) birbiriyle konuşturun. Böylece nesneler arasında gevşek bağlı sistemler kurmuş olursunuz ve karmaşıklığı minimuma indirirsiniz.
     *
     * Mediator patterni kullanabileceğimiz caseleri madde madde sıralarsak ;
     *
     * Birbirine gönderme yapan,interaction içinde olan birden fazla objectiniz varsa
     * Bu ilişkileri farklı bir katmanda yönetmek istiyorsak
     * Bu sayede nesneler birbirine referans vermez ve uzun vadede genişletilebilir bakımı kolay bir kod oluşmuş olur. Ancak mediator design patterninin faydaları olduğu gibi endişe veren noktaları da vardır. Mesela, bu gibi kritik işleri tek bir mediator class üzerinden yönetmek bize single point of failure yani tek nokta sıkıntısı yaşatabilir. Yani mediator classındaki herhangi bir sıkıntı tüm sistemi çökertir.
     *
     * */
}
