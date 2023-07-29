# Decorator Ödevi

Car isimli bir classımız var. İçinde her arabanın sahip olduğu weight, number of tyres, number of doors, model gibi fieldlar var.

Amacımız arabanın fiyatını hesaplamak bunun için de calculate_price fonksiyonumuz var. Default olarak 100k değeri var her arabanın.

Bu classa decoratorlar ekleyerek farklı işlevler kazandırmak istiyoruz. Arabayı modifiye ediyoruz gibi düşünebiliriz.

3 tane decoratorumuz var.

Cam tavan fiyatı 50k artırıyor.
Deri koltuk 30k artırıyor.
Katlanır ayna 10k artırıyor.

Calculate_price fonksiyonun doğru çalışması lazım.
