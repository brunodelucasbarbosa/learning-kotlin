fun main() {
    val numeros:IntArray = intArrayOf(1,2,3,4,5)
    val arr = ArrayList<Int>()
    arr.add(1)
    arr.add(9)
    print(arr.map { num -> num + 10 })
    numeros.forEach { num -> println(num) }

    print("OI")
}
