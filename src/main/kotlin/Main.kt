fun main() {
    test8()
}
fun test8(){
    val list = listOf(2,3,1,6,9)
    val firstElementOfList = list.first()
    val lastElementOfList = list.last()
    val oddList = list.filter { element -> element % 2 != 0}
    val firstOddElementOfList = oddList.first()
    val secondOddElementOfList = oddList.elementAt(1)
    val lastOddElementOfList = oddList.last()
    println("First Element of the list is $firstElementOfList\n" +
            "Last element of the list is $lastElementOfList\n" +
            "First odd element of the list is $firstOddElementOfList\n" +
            "Second odd element of the list is $secondOddElementOfList\n" +
            "Last odd element of the list is $lastOddElementOfList")
}
