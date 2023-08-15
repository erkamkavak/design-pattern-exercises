# State and Strategy

## Strategy Challenge

Mühendis borsada faliyet gösteren 3 adet Player vardır. Bu playerların her birinin günde 1 emir verme hakkı vardır. Emirler örnek olarak aşağıdaki gibidir.

90 altına düşerse al, 95 üstüne çıkarsa sat.

Sizden her bir kullanıcı için bir strateji objesi oluşturup borsada bu stratejinin sonucunda elde edilecek kârı hesaplamanız isteniyor.

Yani öneri olarak bir borsa classı, borsa classının bir strategy objesi ve yine borsa classının execute isimli bir methodu olabilir.

Player1: 101 altına düşerse al, 110 üstüne çıkarsa sat.

Player2: 110 altına düşerse al, 130 üstüne çıkarsa sat.

Player3: 101 altına düşerse al, 5 fazlası olunca sat. Sattığın değerin 3 eksiği olunca al 5 fazlası olunca sat. Bunu sürekli tekrarla.

MühendisCoin seyri: 100, 104, 98, 97, 87, 92, 85, 95, 86, 89, 90, 81, 89, 80, 88, 81, 80, 82, 73, 79, 74, 84, 94, 101, 104, 111, 120, 122, 121, 118, 127, 119, 109, 115, 122, 128, 126, 129, 127, 118, 109, 113, 104, 104, 98, 99, 107, 102, 109, 118, 108, 117, 120, 128, 132, 142, 146, 146, 151, 145, 147, 138, 144, 150, 150, 157, 163, 167, 177, 172, 179, 171, 166, 176, 170, 161, 152, 142, 141, 143, 135, 140, 132, 138, 143, 140, 132, 134, 143, 140, 133, 127, 130, 136, 130, 139, 148, 153, 143, 142, 133

## State Challenge

Tasarladığınız mobil uygulama için bildirim göndermeniz gerekiyor. Telefon 3 farklı state'de bulunabilir. Bunlar sesli, titreşim ve sessizdir.

Telefonun içinde bulunduğu state'e uygun bildirim gönderin. (Bunu print edebilirsiniz, titreşim gönderildi, ekranda bildirim çıktı, bildirim çaldı gibi)

State değiştiren fonksiyonları yazın.

Sessiz modda 3 kere bildirime cavap gelmezse telefonu titreşime alın.

Titreşim modunda 3 kere cevap gelmezse sesli moda alın.
