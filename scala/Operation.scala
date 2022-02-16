// 8 kyu Simple multiplication
object Operation {

    def multiply(n: Int): Int = {
        if (n % 2 == 0) {
            n * 8
        } else {
            n * 9
        }
    }
}
