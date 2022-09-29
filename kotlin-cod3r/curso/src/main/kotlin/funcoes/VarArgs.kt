package funcoes

fun ordernar(vararg nums: Int): IntArray {
  return nums.sortedArray()
}

fun main() {
  for(n in ordernar(3, 31,5 ,8,5 ,1524 , 2 , 521 , 42 ,442 , 252, 52)) {
    println("$n ")
  }
}