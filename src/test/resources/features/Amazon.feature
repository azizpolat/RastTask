@amazonTesting
  Feature: Login_Test


    @TC_001
      Scenario:This is  a test  for the login feature
      Given Kullanici Amazon URL Gider
      When Kullanici Giris Yapin Sekmesine Tiklar
      When Kullanici Giris Yap Sayfasini Gorur
      When Kullanici E-posta veya Telefon Alanina Bilgileri Girer
      When Kullanici Devam Et Butonuna Tiklar
      When Kullanici Sifre Alanına Bilgilerini Girer
      When Kullanici Giris Yap Butonuna Tiklar
      When Kullanici Login Oldugunu Dogrular


    @TC_002
      Scenario: This is a test  for the Add to Cart
      Given Kullanici Search Alanina Skechers Erkek Ayakkabisi yazar
      When Kullanici Search Butonuna Tiklar
      When Kullanici Sonuclar Sayfasında Urunleri Gorur
      When Kullanici Herhangi Bir Ayakkabi Secimi Yapar
      When Kullanici Numara Secimi Yapar
      When Kullanici Sepete Ekle Butonuna Tıklar
      And Kullanici Ekledigi Urunu Sepette Gorur

    @TC_003
    Scenario: This is a test  for the Add to Address
    Given Kullanici Alisverisi Tamamla Butonuna Tiklar
    When Kullanici Odeme Sayfasinda Oldugunu Gorur
    When Kullanici Sisteme Kayitli Adreslerden Secim yapar
    When Kullanici Gumrukleme icin Simdilik Atla Butonunu Tiklar
    And Kullanici Gumrukleme Icin Devam Et Butonuna Tiklar
    And Kullanici Kredi karti veya banka karti ekleyin Linkine Tiklar

    @TC_004
    Scenario: This is a test  for the payment Error
      Given Kullanici Kredi karti veya banka karti ekleyin Linkine Tiklar
      When Kullanici Kredi Karti veya Banka Karti Ekleme Sayfasini Gorur
      When Kullanici Kart Numarasi Alanina Harfler Girer
      When Kullanici Kart Ad Alanina Ad Isim ve Soyisim Girer
      When Kullanici Kart Son Kullanma Tarihi Girer
      When Kullanici Kartinizi Ekleyin Butonuna Tiklar
      When Kullanici Kart Numarasi Dogru Degil Alert Gorur

    @TC_005
    Scenario: This is a test  for the payment Error

      Given Kullanici Kredi karti veya banka karti ekleyin Linkine Tiklar
      When Kullanici Kredi Karti veya Banka Karti Ekleme Sayfasini Gorur
      When Kullanici Kart Numarasi Alanina Sembol Girer
      When Kullanici Kart Ad Alanina Ad Isim ve Soyisim Girer
      When Kullanici Kart Son Kullanma Tarihi Girer
      When Kullanici Kartinizi Ekleyin Butonuna Tiklar
      When Kullanici Kart Numarasi Dogru Degil Alert Gorur


    @TC_006
    Scenario: This is a test  for the payment Error

      Given Kullanici Kredi karti veya banka karti ekleyin Linkine Tiklar
      When Kullanici Kredi Karti veya Banka Karti Ekleme Sayfasini Gorur
      When Kullanici Kart Numarasi Alanina Noktalama Isaretleri Girer
      When Kullanici Kart Ad Alanina Ad Isim ve Soyisim Girer
      When Kullanici Kart Son Kullanma Tarihi Girer
      When Kullanici Kartinizi Ekleyin Butonuna Tiklar
      When Kullanici Kart Numarasi Dogru Degil Alert Gorur

    @TC_007
    Scenario: This is a test  for the payment Error

      Given Kullanici Kredi karti veya banka karti ekleyin Linkine Tiklar
      When Kullanici Kredi Karti veya Banka Karti Ekleme Sayfasini Gorur
      When Kullanici Kart Numarasi Alanina Kart Numarasını Girer
      When Kullanici Kart Ad Alanina Sayı Girer
      When Kullanici Kart Son Kullanma Tarihi Girer
      When Kullanici Kartinizi Ekleyin Butonuna Tiklar
      When Kullanici Kart Numarasi Dogru Degil Alert Gorur

    @TC_008
    Scenario: This is a test  for the payment Error

      Given Kullanici Kredi karti veya banka karti ekleyin Linkine Tiklar
      When Kullanici Kredi Karti veya Banka Karti Ekleme Sayfasini Gorur
      When Kullanici Kart Numarasi Alanina Kart Numarasını Girer
      When Kullanici Kart Ad Alanina Sembol Girer
      When Kullanici Kart Son Kullanma Tarihi Girer
      When Kullanici Kartinizi Ekleyin Butonuna Tiklar
      When Kullanici Kart Numarasi Dogru Degil Alert Gorur


    @TC_009
    Scenario: This is a test  for the payment Error

      Given Kullanici Kredi karti veya banka karti ekleyin Linkine Tiklar
      When Kullanici Kredi Karti veya Banka Karti Ekleme Sayfasini Gorur
      When Kullanici Kart Numarasi Alanina Kart Numarasını Girer
      When Kullanici Kart Ad Alanina Noktalama Isareti Girer
      When Kullanici Kart Son Kullanma Tarihi Girer
      When Kullanici Kartinizi Ekleyin Butonuna Tiklar
      When Kullanici Kart Numarasi Dogru Degil Alert Gorur


