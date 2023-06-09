<h2>Java'da Pivot Seçimine Göre QuickSort Algoritmasının Karmaşıklık Analizi</h2>
<p>Öncelikle bu yazıda, Quick Sort'un nasıl çalıştığını, algoritmanın zaman ve alan karmaşıklığını,algoritmayı uygulamak için adımları ve birkaç örnek kullanarak Quick Sort'un nasıl uygulandığını açıklayacağım.</p>
<p>Sonrasında ile yazımızın başlığı olan pivot seçmine göre Quick Sort algoritmasının karmaşıklık analizini yapacağız.</p>
<hr>
<h3>Quick Sort Nedir?</h3>
<p>Quick Sort, verileri sıralamak için kullanılan bir algoritmadır. Bu algoritma, bir dizi veya listedeki elemanları küçükten büyüğe veya büyükten küçüğe sıralamak için kullanılır. Quick Sort, özellikle büyük veri setlerinde hızlı bir şekilde çalışır.Quick Sort, parçalama işlemi adı verilen bir yöntem kullanır. Bu yöntem, verileri küçük ve büyük olmak üzere iki bölüme ayırır ve ardından bu işlemi tekrarlayarak sıralama işlemi gerçekleştirir.</p>
<hr>
<h3>Quick Sort Nasıl Çalışır?</h3>
<p>Quick Sort algoritması, bir dizi veya liste üzerinde çalışır. İlk olarak dizinin ortasındaki bir eleman, yani pivot seçilir. Bu eleman seçimi,dizinin herhangi bir yerinde olabilir.Pivot seçimi,algoritmanın performansını etkileyebilir,ancak genellikle rastgele bir eleman seçmek uygun bir yaklaşımdır.</p>
<p>Pivot seçildikten sonra, dizinin geri kalan elemanları, pivot elemanına göre iki parçaya ayrılır. Bu ayrım işlemi, pivot elemanın sol tarafındaki elemanları pivot elemanından küçük, sağ tarafındaki elemanların ise pivot elemanından büyük olduğu şekilde yapılır.</p>
<p>Bu ayrım işlemi tamamlandıktan sonra, her iki parça için aynı işlem tekrarlanır.Yani,her bir parça için bir pivot elemanı seçilir ve parçalar tekrar iki bölüme ayrılır. Bu işlem, elemanlar sıralanana kadar tekrarlanır.</p>
<p>Sıralama işlemi tamamlandıktan sonra, elemanlar pivot elemanına göre sıralanır. Solda kalan elemanlar, pivot elemanından küçük ve sağda kalan elemanlar pivot elemanından büyük olduğu için, pivot elemanı da doğru pozisyonda yer alır.</p>
<hr>
<p>Örnek olarak: Dizimiz: [1,3,2,4,5] olsun.Quick Sort ile sıralama yapalım.<br>

<pre><img src="1.png"><br>Pivot seçelim.</pre><br>
<pre><img src="2.png"><br>Pivotu sonuna kadar hareket ettirelim.</pre><br>
<pre><img src="3.png"><br>Alt diziyi bölümlere ayıralım.</pre><br>
<pre>Pivota eşit veya ondan büyük bir değere ulaşana kadar sol sınırı sağa hareket ettirelim.</pre><br>
<pre><img src="4.png"><br>Burada 3'ü seçtik çünkü pivot olan elemanımızdan büyük</pre><br>
<pre>Sağ sınırı, sol sınırı geçene veya pivottan daha küçük bir değer bulana kadar sola hareket ettirelim.</pre><br>
<pre><img src="5.png"><br>2 den küçük değer bulana kadar sola geldiğimizde 1 ile karşılaştık ve sınırı geçtik.</pre><br>
<pre>Sağ sınır sol sınırı geçtiğinde, sol sınırın solundaki tüm öğeler pivottan küçüktür <br>ve sağdaki tüm öğeler pivottan büyük veya ona eşittir.</pre><br>
<pre><img src="6.png"><br>Bu yüzden pivotu nihai konumuna taşıyalım.</pre><br>
<pre>Pivot elemanın(2) solunu ve sağını birer alt liste olarak bölelim.Sol alt liste, sıralandığı anlamına gelen tek bir öğe içerir.<br>Bu yüzden sağ alt listeye geçelim.</pre><br>
<pre><img src="7.png"><br>Sağ alt listemiz için pivot seçelim.</pre><br>
<pre><img src="8.png"><br>Pivotu sona kadar hareket ettirelim.</pre><br>
<pre>Pivota eşit veya ondan büyük bir değere ulaşana kadar sol sınırı sağa hareket ettirelim.</pre><br>
<pre><img src="9.png"><br>Burada 5 i seçtik çünkü pivot elemanımızdan büyük.</pre><br>
<pre>Sağ sınırı, sol sınırı geçene veya pivottan daha küçük bir değer bulana kadar sola hareket ettirelim.</pre><br>
<pre><img src="10.png"><br>3'ü seçtik çünkü pivot elemanımızdan küçük.</pre><br>
<pre><img src="11.png"><br>Seçilen değerlerin yerlerini değiştirelim.</pre><br>
<pre>Pivota eşit veya ondan büyük bir değere ulaşana kadar sol sınırı sağa hareket ettirmeye devam ettiğimizde ve sağ sınırı da <br>sol sınıra hareket ettirmeye devam ettirdiğimizde sınırı geçtiğini görüyoruz.</pre><br>
<pre><img src="12.png"><br>Pivot elemanımızı nihai konumuna taşıyalım.</pre>
<pre>Pivotun solunu ve sağını alt listelere böldüğümüzde tek bir öğe içerdiği için sıralandığı anlamına gelir.</pre>
<pre><img src="13.png"><br>Ve böylece Quick Sort ile dizimizi sıralamış olduk.</pre><br>
</p>
<hr>
<h3>Quick Sort Zaman Karmaşıklığı</h3>
<p>Quick Sort'un zaman karmaşıklığı,pivot seçimine bağlı olarak değişebilir.Eğer pivot her zaman orta eleman seçilirse, Quick Sort'un zaman karmaşıklığı nlogn olacaktır. Ancak,pivot seçimi doğru yapılmazsa, Quick Sort'un zaman karmaşıklığı n^2'ye kadar yükselebilir.</p>
<p>Örneğin, pivot olarak her zaman dizinin en küçük veya en büyük elemanı seçilirse, algoritma en kötü durumda n^2 zaman karmaşıklığına sahip olacaktır. Bunun sebebi, böyle bir pivot seçimiyle, sıralanmış bir dizi için her seferinde sadece bir elemanın doğru konumuna yerleştirilmesidir. Bu durumda, algoritmanın çalışması için n adet parçalama işlemi yapılması gerekecektir. Her bir parçalama işlemi, n elemanlı bir dizi üzerinde lineer zaman karmaşıklığına sahiptir. Bu neden, pivot olarak en küçük veya en büyük elemanın seçilmesi durumunda, Quick Sort'un zaman karmaşıklığı n^2 olacaktır.</p>
<p>Diğer yandan, pivot seçiminde rastgele bir elemanın seçilmesi durumunda, Quick Sort'un ortalama zaman karmaşıklığı nlogn olacaktır. Çünkü rastgele seçilen bir elemanın ortalama olarak dizinin ortasına denk geleceği kabul edilebilir. Böylece parçalama işlemi n elemanlı bir dizi üzerinde lineer zaman karmaşıklığına sahip olduğundan, Quick Sort'un ortalama zaman karmaşıklığı nlogn olacaktır.</p>
<hr>
<p>Bu yazımızda asıl değindiğimiz konuya gelecek olursak: Kullanıcının belirlediği pivot indekse göre QuickSort algoritmasının performansını analiz edelim.</p>
<p>Program, önce kullanıcıdan bir dizi boyutu ve bir pivot indeksi alır. Ardından, bir rastgele dizi oluşturur ve kullanıcının belirlediği pivot indeksi için QuickSort işlemini gerçekleştirir.Bu sırada, yapılan karşılaştırma ve swap(Yer değiştirme) işlemleri sayılır. Daha sonra, tüm pivot indeksleri için QuickSort işlemi yapalım ve yapılan karşılaştırma ve swap işlemleri toplamı hesaplayarak ne kadar işlem yaptığını yazdıralım.</p>
<p>Program,"quickSort","partition","swap" ve "createRandomArray" adında dört farklı fonksiyon kullanır:
<pre><b>createRandomArray</b>:Verilen boyutta bir rastgele dizi oluşturur ve dizi olarak döndürür.<br><br><b>swap</b>:Verilen dizideki iki elemanın yerlerini değiştirir.<br><br><b>partition</b>: Verilen dizinin belirtilen aralığını bölümlendirir ve pivot elemanı bulur.<br> Bölümlendirme işlemi,pivot elemanından küçük  olan elemanları sol tarafa,<br> pivot elemanından büyük olanları ise sağ tarafa yerleştirir.Bu işlem sırasında yapılan karşılaştırma ve swap işlemleri sayılır.<br><br><b>quickSort</b>:Verilen diziyi pivot indeksi kullanarak QuickSort algoritmasıyla sıralar.<br>Bu işlem sırasında yapılan karşılaştırma ve swap işlemleri sayılır.</pre></p>
<hr>
<p>Özetle, QuickSort algoritmasının pivot seçimine ve pivot indeksine bağlı olarak zaman karmaşıklığı değişebilir. Doğru pivot seçimi ve pivot indeksi seçimi yaparak, QuickSort algoritmasının en iyi performansı elde edilebilir.</p><p>Bu yazıda elimden geldiğince algoritmanın karmaşıklık analizini uygulamaya dönüştürdüm.Uygulamayı GitHub üzerinden yayınladım. Kodları incelemek isterseniz,buraya tıklayabilirsiniz.</p>
<p>Bir sonraki çalışmamızda görüşmek üzere!</p>
