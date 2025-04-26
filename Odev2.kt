package com.example.kotlindersleri.odev

class Odev2 {

    fun celsiusToFahrenheit(celsius: Double): Double {
        return celsius * 1.8 + 32
    }

    fun celsiusToFahrenheitFormatted(celsius: Double): String {
        val fahrenheit = celsiusToFahrenheit(celsius)
        return "%.2f°F".format(fahrenheit)
    }

    fun dikdortgenCevre(kenar1: Double, kenar2: Double): Double {
        return 2 * (kenar1 + kenar2)
    }

    fun dikdortgenCevreInt(kenar1: Int, kenar2: Int): Int {
        return 2 * (kenar1 + kenar2)
    }

    fun faktoriyelDongu(sayi: Int): Long {
        if (sayi < 0) {
            println("Negatif sayıların faktöriyeli olmaz.")
            return 1
        }
        var sonuc = 1L
        for (i in 1..sayi) {
            sonuc *= i
        }
        return sonuc
    }

    fun faktoriyelRecursive(sayi: Int): Long {
        if (sayi < 0) {
            println("Negatif sayıların faktöriyeli yoktur.")
            return 1
        }
        return if (sayi == 0) 1 else sayi * faktoriyelRecursive(sayi - 1)
    }

    fun kelimedeAHarfiSayisi(kelime: String): Int {
        return kelime.count { it == 'a' || it == 'A' }
    }

    fun icAcilarToplami(kenarSayisi: Int): Int {
        return if (kenarSayisi >= 3) (kenarSayisi - 2) * 180
        else {
            println("Geçerli bir çokgen için en az 3 kenar olmalı.")
            -1
        }
    }

    fun icAcilarToplamiFormatted(kenarSayisi: Int): String {
        return if (kenarSayisi >= 3) {
            val toplam = (kenarSayisi - 2) * 180
            "$kenarSayisi kenarlı çokgenin iç açıları toplamı: $toplam°"
        } else {
            "Hatalı giriş! En az 3 kenar olmalı."
        }
    }

    fun maasHesapla(calisilanGun: Int): Double {
        val saatlikUcret = 10.0
        val mesaiSaatlikUcret = 20.0
        val normalSaatLimit = 160
        val toplamSaat = calisilanGun * 8

        return if (toplamSaat <= normalSaatLimit) {
            toplamSaat * saatlikUcret
        } else {
            val mesaiSaat = toplamSaat - normalSaatLimit
            (normalSaatLimit * saatlikUcret) + (mesaiSaat * mesaiSaatlikUcret)
        }
    }

    fun maasBilgi(calisilanGun: Int): String {
        val saatlikUcret = 10.0
        val mesaiSaatlikUcret = 20.0
        val normalSaatLimit = 160
        val toplamSaat = calisilanGun * 8

        val maas = if (toplamSaat <= normalSaatLimit) {
            toplamSaat * saatlikUcret
        } else {
            val mesaiSaat = toplamSaat - normalSaatLimit
            (normalSaatLimit * saatlikUcret) + (mesaiSaat * mesaiSaatlikUcret)
        }

        return "Çalışılan Gün: $calisilanGun, Toplam Saat: $toplamSaat, Maaş: %.2f TL".format(maas)
    }

    fun kotaUcretiHesapla(kullanilanGB: Int): Double {
        val temelKota = 50
        val sabitUcret = 100.0
        val asimUcreti = 4.0

        return if (kullanilanGB <= temelKota) {
            sabitUcret
        } else {
            sabitUcret + ((kullanilanGB - temelKota) * asimUcreti)
        }
    }

    fun kotaUcretiBilgi(kullanilanGB: Int): String {
        val temelKota = 50
        val sabitUcret = 100.0
        val asimUcreti = 4.0

        return if (kullanilanGB <= temelKota) {
            "Kullanılan GB: $kullanilanGB, Ücret: $sabitUcret TL (Kota aşılmadı)"
        } else {
            val ekstra = kullanilanGB - temelKota
            val ekstraUcret = ekstra * asimUcreti
            val toplamUcret = sabitUcret + ekstraUcret
            "Kullanılan GB: $kullanilanGB, Ücret: %.2f TL (Ekstra: $ekstra GB için %.2f TL)".format(toplamUcret, ekstraUcret)
        }
    }
}
