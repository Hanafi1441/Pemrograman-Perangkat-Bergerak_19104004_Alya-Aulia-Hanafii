fun Fungsi () {
  val openHours = 7
  // inisiasi val openHours 
        val now = 7
        //inisiasi val now
        var kata = ""

        if (now > 7) {
            kata = "Kantin sedang buka"
        } else if (now == openHours){
            kata = "Mohon tunggu, kantin sedang disiapkan"
        } else {
            kata = "Kantin sedang tutup"
        }
        println(kata)//output memanggil var kata

        var kata2 = if (now > 7){
                        "Kantin Buka"
                    } else if (now == openHours) {
                       "Mohon tunggu, kantin sedang disiapkan"
                    }
                    else  {
                        "Kantin Tutup"
                    }
        println(kata2)//output memanggil var kata
}