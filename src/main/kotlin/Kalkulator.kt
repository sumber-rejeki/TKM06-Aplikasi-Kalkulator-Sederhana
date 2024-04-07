class Kalkulator {
    // Metode untuk operasi tambah
    fun tambah(a: Double, b: Double): Double {
        return a + b
    }

    // Metode untuk operasi kurang
    fun kurang(a: Double, b: Double): Double {
        return a - b
    }

    // Metode untuk operasi kali
    fun kali(a: Double, b: Double): Double {
        return a * b
    }

    // Metode untuk operasi bagi
    fun bagi(a: Double, b: Double): Double {
        if (b != 0.0) {
            return a / b
        } else {
            throw ArithmeticException("Tidak dapat membagi dengan nol")
        }
    }
}