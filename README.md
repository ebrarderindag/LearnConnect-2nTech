# LearningConnect


Bu uygulama, video tabanlı eğitim içeriklerine kolay erişim sağlayan ve kullanıcıların eğitim deneyimlerini kişiselleştirmelerine olanak tanıyan bir platformdur. Kullanıcılar, favorilere ekleme, video hız kontrolü gibi özelliklerle uygulama üzerinden daha verimli bir öğrenme deneyimi yaşayabilirler.

## İçindekiler
- [Kurulum Adımları](#kurulum-adımları)
- [Kullanılan Mimari ve Teknolojiler](#kullanılan-mimari-ve-teknolojiler)
- [Bonus Özellikler](#bonus-özellikler)
- [Kullanıcı Arayüzü (UI) Özellikleri](#kullanıcı-arayüzü-ui-özellikleri)


## Kurulum Adımları

### 1. Kullanıcı Hesabı Oluşturma veya Giriş Yapma
- İlk defa kullanıyorsanız, bir hesap oluşturmanız gerekecek. Mevcut hesabınızla da giriş yapabilirsiniz.
- Hesap oluştururken, sosyal medya hesaplarınızı (Google, Facebook vb.) kullanarak hızlıca kaydolabilirsiniz.

### 2. İçerik Erişimi
- Uygulama kaydolduğunuz kurslara göre içeriklere erişim sağlar. Favori kurslarınızı ekleyebilir ve izlemeye başlayabilirsiniz.


## Kullanılan Mimari ve Teknolojiler

### Mimari Yapı
- **Clean Architecture:** Uygulamanın iş mantığı, veri katmanları ve kullanıcı arayüzü arasındaki bağımlılıkları minimize etmek için Clean Architecture kullanılır. Bu yapı, modülerlik ve test edilebilirliği artırır.
- **MVVM:** kullanıcı arayüzü ile iş mantığını birbirinden ayıran ve uygulama geliştirmede yüksek esneklik sağlayan bir mimaridir.

### Kullanılan Teknolojiler
- **Jetpack Compose:** Modern Android UI geliştirme için kullanılan, deklaratif bir framework'tür. Hızlı ve etkili bir kullanıcı arayüzü oluşturmayı sağlar.
- **Hilt:** Android uygulamalarında bağımlılık yönetimi için kullanılan bir kütüphanedir. Kodun daha test edilebilir ve bakımı kolay olmasını sağlar.
- **Room Database:** Android uygulamaları için kullanılan bir veritabanı kütüphanesidir. Uygulama verilerini yerel olarak saklamak için kullanılır.
- **Flow & StateFlow:** Jetpack'den gelen asenkron veri akışını yöneten Flow, ve durum yönetimi için kullanılan StateFlow, UI'nin durumunu daha etkin bir şekilde yönetir.
- **ExoPlayer:** Android için yüksek kaliteli medya oynatma yetenekleri sunan bir kütüphanedir. Video akışı için güçlü bir çözüm sağlar.
- **Jetpack Navigation:** Uygulama içindeki farklı ekranlar arasında navigasyonu kolaylaştıran bir kütüphanedir. Kullanıcı deneyimini basitleştirir ve navigation graph kullanımı ile daha organize bir yapı sunar.
- **Material Design 3:** Uygulamanın görsel tasarımını, modern ve kullanıcı dostu bir şekilde yapılandırmak için kullanılan Google tarafından geliştirilmiş tema ve UI kütüphanesidir.


## Bonus Özellikler

### Favoriler (Watchlist)
- **İşlev:** Kullanıcılar, ilgi duydukları ve gelecekte tekrar izlemek istedikleri kursları favorilere ekleyebilir. Bu özellik, kullanıcıların ilgilerini çeken içeriklere kolayca erişebilmesine olanak tanır.
  
- **Kullanıcı Deneyimi:** 
  - Favorilere eklenen kurslar, kullanıcı profilinde bir liste olarak görünür. Kullanıcılar bu listeyi düzenleyebilir, kursları ekleyebilir veya çıkarabilirler.

- **Veritabanı Yönetimi:** 
  - Kullanıcının favori kursları, kullanıcının profil bilgileriyle ilişkilendirilerek veritabanında saklanır.

### Video Hız Kontrolü
- **İşlev:** Kullanıcılar, video içeriklerinin oynatma hızını 1x, 1.5x, 2x gibi farklı hızlarda değiştirebilirler. Bu özellik, özellikle hızlı bir şekilde video içeriğini izlemek isteyen kullanıcılar için faydalıdır.
  
- **Kullanıcı Deneyimi:** 
  - Video izlerken, hız kontrolü genellikle video oynatıcı arayüzünde bulunan bir kontrol paneli üzerinden yapılır. Kullanıcılar istedikleri hızda video izleyebilir ve eğitimi daha verimli hale getirebilirler.

- **Teknolojik Uygulama:**
  - **HTML5 Video API** veya **Video.js** gibi popüler video oynatıcı kütüphaneleri kullanılarak video hız kontrolü sağlanabilir.


## Kullanıcı Arayüzü (UI) Özellikleri

### Kullanıcı Profili
- Kullanıcılar, profil sayfalarından favori kurslarını görebilir ve izledikleri içerikleri takip edebilirler.

### Video İzleme Deneyimi
- Video içerikleri, kullanıcıların tercihine göre hızlandırılabilir veya yavaşlatılabilir. Bu özellik, video içeriklerinin daha verimli izlenmesini sağlar.


