package com.tistory.heowc.gettingstarted

class BasicSyntax {

	fun sum(a: Int, b: Int): Int {
		return a + b
	}
//	==
//	fun sum(a: Int, b: Int) = a + b


	fun printSum(a: Int, b: Int): Unit {
		print(a + b)
	}
//	==
//	fun printSum(a: Int, b: Int) {
//		print(a + b)
//	}


	fun main(args: Array<String>) {
		val a: Int = 1
		val b = 1
		val c: Int
		c = 1

		var x = 5
		x += 1

		print("result a = $a")
	}

	fun parseInt(str: String): Int? {
		return str.toIntOrNull()
	}

	fun printMultiple(str1: String, str2: String) {
		val x = parseInt(str1)
		val y = parseInt(str2)

		if (x != null && y != null) {
			print(x * y)
		}
	}

	fun max(a: Int, b: Int): Int {
		if (a > b) {
			return a
		} else {
			return b
		}
	}
//	=
//	fun max(a: Int, b: Int) = if (a > b) a else b


	fun getStringLength(obj: Any): Int? {
		if (obj is String) {
			return obj.length
		}

		return null
	}


	fun printLoop() {
		val items = listOf("apple", "banana", "kiwi")
		for (item in items) {
			print(item)
		}
	}
//	=
//	fun printLoop() {
//		val items = listOf("apple", "banana", "kiwi")
//		for (index in items.indices) {
//			print(items[index])
//		}
//	}


	fun printWhile() {
		val items = listOf("apple", "banana", "kiwi")
		var index = 0
		while (index < items.size) {
			print(items[index++])
		}
	}


	fun cases(obj: Any) {
		when (obj) {
			1           -> print("One")
			"Hello"     -> print("Greeting")
			is Long     -> print("Long")
			!is String  -> print("Not a string")
			else        -> print("Unknown")
		}
	}


	fun checkRange() {
		val x = 5
		val y = 10
		if (x in 1..y-1) {
			print("OK")
		}
	}

	fun printRange() {
		val list = listOf("a", "b", "c")

		if (-1 !in 0..list.lastIndex) {
			println("-1 is out of range")
		}
		if (list.size !in list.indices) {
			println("list size is out of valid list indices range too")
		}
	}

	fun printDetailRange() {
		for (x in 1..10 step 2) {
			print(x)
		}
		for (x in 9 downTo 0 step 3) {
			print(x)
		}
	}

	fun printCollectionWithLambdaExpression() {
		val fruits = listOf("apple", "banana", "kiwi", "orange")

		fruits
				.filter { it.endsWith("e") }
				.reversed()
				.map { it.toUpperCase() }
				.forEach { println(it) }
	}
}