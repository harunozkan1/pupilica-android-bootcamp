package com.example.kotlindersleri.odev

fun main() {
    val odev = Odev2()

    println("Celsius -> Fahrenheit: ${odev.celsiusToFahrenheit(30.0)}")
    println(odev.celsiusToFahrenheitFormatted(30.0))

    println("Dikdörtgen Çevre: ${odev.dikdortgenCevre(5.0, 10.0)}")
    println("Dikdörtgen Çevre (Int): ${odev.dikdortgenCevreInt(5, 10)}")

    println("Faktöriyel (Döngü): ${odev.faktoriyelDongu(5)}")
    println("Faktöriyel (Özyineleme): ${odev.faktoriyelRecursive(5)}")

    println("Kelimede 'a' harfi sayısı: ${odev.kelimedeAHarfiSayisi("Ankara")}")

    println("İç Açı Toplamı: ${odev.icAcilarToplami(5)}")
    println(odev.icAcilarToplamiFormatted(5))

    println("Maaş Hesapla: ${odev.maasHesapla(22)}")
    println(odev.maasBilgi(22))

    println("Kota Ücreti: ${odev.kotaUcretiHesapla(70)}")
    println(odev.kotaUcretiBilgi(70))
}
