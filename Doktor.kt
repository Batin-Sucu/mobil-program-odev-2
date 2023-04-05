class Doktor (
    val adi: String,
    val soyadi: String,
    val bransi: String,
    val departman: String,
    val dtarihi: String)
    {
        fun yazdir(): String
        {
            return "Doktor $adi $soyadi, $bransi $departman departmanında çalışmaktadır."
        }
    }
  fun main()
  {
      val doktor = Doktor("Mehmet", "Bandırma", "Çocuk", "Polikinliğinde", "10.12.1975" )
      println(doktor.yazdir())
  }