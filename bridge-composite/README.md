### Bridge-Composite Exercise

Bir düzgün şekil class'ı düşünelim. Bu class içerisinde şekil ve renk class'larını barındırsın. Bu class java.awt.Component classından extend etsin ve bir draw fonksiyonu bulundursun. Bu draw fonksiyonunu aşağıda bulabilirsiniz.

```java
import java.util.ArrayList;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

public class RegularPolygon extends Component {
    public Color color;
    public Shape shape;

    public ArrayList<Point> getCorners(int center) {
        ArrayList<Point> corners = new ArrayList<>();
        double theta = 2 * Math.PI / this.shape.sides;

        int radius = 40; 
        for (int i = 0; i < this.shape.sides; ++i) {
            double x = center + radius * Math.cos(theta * i);
            double y = center + radius * Math.sin(theta * i);
            corners.add(new Point(x, y));
        }
        return corners;
    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Polygon polygon = new Polygon(); 

        int center = g2d.getClipBounds().width / 2;
        ArrayList<Point> corners = this.getCorners(center);
        for (Point corner : corners) {
            polygon.addPoint((int)corner.x, (int)corner.y);
        }
        g2d.setColor(this.color.awtColor);
        g2d.fillPolygon(polygon);
    }
}
```

Aşağıdaki şekillerin ve renklerin tümünün kombinasyonunu oluşturacak şekilde RegularPolygon class'ını tamamlayın.

Şekiller:

- Üçgen
- Kare
- Beşgen
- Altıgen
- Yedigen
- Sekizgen
- Yuvarlak

Renkler:

- Kırmızı
- Yeşil
- Mavi
- Sarı

Elimizde birçok görüntünün bulunduğu bir container olduğunu düşünün. Görüntüler rgb yapısında yani resim olarak ya da
renklendirilmiş 2d point cloud yapısında olabilir. Her bir görüntü ise patch'lerden(daha küçük görüntüler) oluşur.
Bir patch'den görüntü işleme sonucu patch içerisindeki düzgün şekil elde edilebilir. Rgb ve 2d point cloud
için görüntü işleme fonksiyonlarını farklı olarak düşünün(bu fonksiyonları implementasyona gerek yok, random bir düzgün şekil
döndüren fonksiyonlar yazabilirsiniz).

Composite yapısını kullanarak container içerisindeki tüm patch'lerin görüntü işlemesini yapıp bu container içerisindeki
tüm renkli şekilleri tespit edecek bir fonksiyon hazırlayın.
