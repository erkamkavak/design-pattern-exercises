# Memento ve Observer

## Memento

Memento is a behavioral design pattern that lets you save and restore the previous state of an object without revealing the details of its implementation.

Use the Memento pattern when you want to produce snapshots of the object’s state to be able to restore a previous state of the object: The Memento pattern lets you make full copies of an object’s state, including private fields, and store them separately from the object. While most people remember this pattern thanks to the “undo” use case, it’s also indispensable when dealing with transactions (i.e., if you need to roll back an operation on error).

Use the pattern when direct access to the object’s fields/getters/setters violates its encapsulation: The Memento makes the object itself responsible for creating a snapshot of its state. No other object can read the snapshot, making the original object’s state data safe and secure.

The Memento pattern delegates creating the state snapshots to the actual owner of that state, the originator object. Hence, instead of other objects trying to copy the editor’s state from the “outside,” the editor class itself can make the snapshot since it has full access to its own state.

The pattern suggests storing the copy of the object’s state in a special object called memento. The contents of the memento aren’t accessible to any other object except the one that produced it. Other objects must communicate with mementos using a limited interface which may allow fetching the snapshot’s metadata (creation time, the name of the performed operation, etc.), but not the original object’s state contained in the snapshot.

## Observer

Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.



## Memento ve Observer Design Pattern Alıştırma

MuhendisCoin adında bir kripto para bulunmaktadır. Bunun seyrini takip eden MuhendisCoinManager adında bir classımız vardır. Zamanla MuhendisCoin’in değeri değişmektedir (aşağıdaki listeyi her gün olarak düşünebilirsiniz (1. gün 100, 2. gün 104 vs)).

MuhendisCoin ile trade etmek isteyen kullanıcılar vardır. Bu kullanıcılar MuhendisCoin belli threshold’ları geçtiği zaman bilgilendirilmek istemektedir. Bu sebeple MuhendisCoinManager’a “Coin x değerini geçtiği zaman haber ver, y değerinin altına düşünce haber ver” gibi direktifler vermektedir.

Ancak bu kullanıcılar kararsız oldukları için ara sıra verdiği direktifleri geri almak isteyebilmektedirler. En son direktifinin silinip ondan önceki direktifinin geçerli olmasını istemektedirler. 

Bunları implement ediniz. Kullanıcıların yaptıkları alım ve satımları hiçliğe yapıyor gibi düşünün, yani sadece alım satım yapan kullanıcı etkileniyor. Ayrıca alım yapmak için yeterli parası yoksa alım iptal olur. Satış yaparken de yeterli coini yoksa iptal olur.

MühendisCoin seyri: 100, 104, 98, 97, 87, 92, 85, 95, 86, 89, 90, 81, 89, 80, 88, 81, 80, 82, 73, 79, 74, 84, 94, 101, 104, 111, 120, 122, 121, 118, 127, 119, 109, 115, 122, 128, 126, 129, 127, 118, 109, 113, 104, 104, 98, 99, 107, 102, 109, 118, 108, 117, 120, 128, 132, 142, 146, 146, 151, 145, 147, 138, 144, 150, 150, 157, 163, 167, 177, 172, 179, 171, 166, 176, 170, 161, 152, 142, 141, 143, 135, 140, 132, 138, 143, 140, 132, 134, 143, 140, 133, 127, 130, 136, 130, 139, 148, 153, 143, 142, 133

Kullanici1, Kullanici2 ve Kullanici3 adında 3 adet kullanıcımız var. Hepsinin başlangıçta 1000 lirası var.

Kullanıcı1: x altında haber geldiği zaman 1 coin alır, x üstünde haber geldiği zaman 1 coin satar.
Kullanıcı2: x altında haber geldiği zaman 3 coin alır, x üstünde haber geldiği zaman 2 coin satar.
Kullanıcı3: x altında haber geldiği zaman 5 coin alır, x üstünde haber geldiği zaman 5 coin satar.

Kullanıcı1: 95 altında haber ver.
2 gün geçer
Kullanıcı2: 100 üstünde haber ver.
4 gün geçer
Kullanıcı3: 105 üstünde ve 90 altında haber ver.
1 gün geçer
Kullanıcı1: 100 üstünde ve 80 altında haber ver.
2 gün geçer.
Kullanıcı2: 90 üstünde haber ver.
10 gün geçer.
Kullanıcı2 geri alır.
Kullanıcı1: 110 üstünde haber ver.
20 gün geçer.
Kullanıcı1 geri alır.
4 gün geçer.
Kullanıcı3: 120 üstünde ve 100 altında haber ver.
10 gün geçer.
Kullanıcı1 geri alır.
20 gün geçer.
Kullanıcı2: 150 üstünde ve 120 altında haber ver.

en son her kullanıcının parasını ve coinlerini bastırınız.

Not: ilk kullanıcı 1. günün öncesinde haber ver demiştir (yani ilk günkü değer kullanıcıya uyuyorsa haber edilmesi gerekir.)
