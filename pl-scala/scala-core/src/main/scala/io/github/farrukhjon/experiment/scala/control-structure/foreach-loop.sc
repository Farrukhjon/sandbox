val inclusiveIntRange = 1 to 10

inclusiveIntRange.foreach(print) // foreach loop over 1 to 10 int range and print each item

inclusiveIntRange foreach print // omit parentheses and dot for `foreach` and `print` methods

inclusiveIntRange.foreach({
  item =>
    val doubleItem = item * 2
    print(doubleItem)
})

inclusiveIntRange foreach { // omit parentheses and dot for `foreach` method
  item =>
    print(item)
}

inclusiveIntRange foreach { // with `_` item placeholder and omit parentheses and dot for `foreach` method
  print(_)
}