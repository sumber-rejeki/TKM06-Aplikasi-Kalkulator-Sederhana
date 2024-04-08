import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val kalkulator = Kalkulator()

    var lanjut = true
    while (lanjut) {
        println("Pilih operasi matematika:")
        println("1. Tambah")
        println("2. Kurang")
        println("3. Kali")
        println("4. Bagi")
        println("5. Keluar")

        print("Masukkan pilihan Anda: ")
        val pilihan = scanner.nextInt()

        if (pilihan in 1..4) {
            print("Masukkan dua bilangan: ")
            val bilangan1 = scanner.nextDouble()
            val bilangan2 = scanner.nextDouble()

            when (pilihan) {
                1 -> println("Hasil tambah: ${kalkulator.tambah(bilangan1, bilangan2)}")
                2 -> println("Hasil kurang: ${kalkulator.kurang(bilangan1, bilangan2)}")
                3 -> println("Hasil kali: ${kalkulator.kali(bilangan1, bilangan2)}")
                4 -> {
                    try {
                        println("Hasil bagi: ${kalkulator.bagi(bilangan1, bilangan2)}")
                    } catch (e: ArithmeticException) {
                        println(e.message)
                    }
                }
            }
        } else if (pilihan == 5) {
            lanjut = false
            println("Terima kasih telah menggunakan kalkulator ini.")
        } else {
            println("Pilihan tidak valid. Silakan pilih 1-5.")
        }
    }
}