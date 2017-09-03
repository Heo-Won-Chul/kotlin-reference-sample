package com.tistory.heowc.gettingstarted

import java.io.File
import java.nio.file.Files
import java.nio.file.Paths

class Idioms {

	/*
	*    DTO 만들기
	*    1. 모든 속성에 대해 getter/setter
	*    2. equals()
	*    3. hashCode()
	*    4. toString()
	*    5. copy()
	*    6. 모든 속성에 대해 component1(), component2()
	*/

	data class Customer(var name: String, var email: String)


	fun getFunctionWithDefaultArgument(a: Int = 0, b: String = "") {

	}


	fun getFilteredFruits(): List<String> {
		return listOf("apple", "orange", "banana")
					.filter { fruit -> fruit.length > 5 }
//					.filter { it.length > 5 }

	}


	fun getHelloMessage(name : String): String {
		return "Hello $name"
	}


	fun checkInstance(obj: Any) {
		when (obj) {
			is Long     -> println("obj is Long")
			is String   -> println("obj is String")
			else        -> println("obj is not found type")
		}
	}


	fun printMap(map: Map<String, String>) {
		for((key, entry) in map) {
			println("$key -> $entry")
		}
	}


	fun accessRange() {
		for(i in 1..100) { // 100 포함
			// ...
		}

		for(i in 1 until 100) { // 100 미포함
			// ...
		}

		for(i in 1..10 step 2) {
			// ...
		}

		for(i in 10 downTo 1) {
			// ...
		}

		val x = 0
		if(x in 1..10) {
			// ...
		}
	}


	fun readOnlyCollection() {
		val list = listOf("a", "b", "c")
		val map = mapOf("a" to 1, "b" to 2, "c" to 3)
	}


	fun accessMap() {
		val map = mapOf("a" to 1, "b" to 2, "c" to 3)
		print(map["a"])
	}


	val KOTLIN = "KOTLIN"

	val kotlinLowerCase: String by lazy {
		KOTLIN.toLowerCase()
	}


	fun String.spaceToConvertValue(convertValue: String): String? {
		return this.replace(" ", convertValue)
	}

	fun callStringExtensionFunction() {
		print("AAA BBB CCC".spaceToConvertValue("%20"))
	}


	object resourceSingleton {
		val name = "Name"
	}

	fun callResourceSingleton() {
		println(resourceSingleton.name)
	}


	fun getFileCount(directory: File): Int? {
		return directory.listFiles().size
	}


	fun getFileCountOrDefault(directory: File): Int {
		return directory.listFiles()?.size ?: 0
	}


	fun getValueOrDefault(key: String): String {
		val map = mapOf("a" to "1", "b" to "2")
		return map.get(key) ?: throw IllegalStateException("$key is missing")
	}


	fun execute(value: String): String {
		return value?.let {
			// execute this block if not null
			it.toUpperCase()
		} ?: ""
	}


	fun transform(color: String): Int {
		return when (color) {
			"Red" -> 0
			"Green" -> 1
			"Blue" -> 2
			else -> throw IllegalArgumentException("Invalid color param value")
		}
	}
//	=
//	fun transform(color: String): Int = when (color) {
//		"Red" -> 0
//		"Green" -> 1
//		"Blue" -> 2
//		else -> throw IllegalArgumentException("Invalid color param value")
//	}


	fun getCount(): Int {
		return try {
			// ...
			1
		} catch (e: ArithmeticException) {
			throw IllegalStateException(e)
		}
	}


	fun toStringValue(param: Int): String {
		return if (param == 1) {
			"one"
		} else if (param == 2) {
			"two"
		} else {
			"three"
		}
	}


	fun createIntArray(size: Int): IntArray{
		return IntArray(size).apply { fill(-1) }
	}


	fun getDefaultValue(): Int {
		return 42
	}
//	=
//	fun getDefaultValue(): Int = 42


	class Turtle {
		fun penDown() { /*...*/ }
		fun penUp() { /*...*/ }
		fun turn(degrees: Double) { /*...*/ }
		fun forward(pixels: Double) { /*...*/ }
	}

	fun createTurtleExtension(): Turtle {
		val myTurtle = Turtle()
		with(myTurtle) { //draw a 100 pix square
			penDown()
			for(i in 1..4) {
				forward(100.0)
				turn(90.0)
			}
			penUp()
		}
		return myTurtle
	}


	fun printFile(filePath: String) {
		val stream = Files.newInputStream(Paths.get(filePath))
		stream.buffered().reader().use { println(it.readText()) }
	}


//  public final class Gson {
//     ...
//     public <T> T fromJson(JsonElement json, Class<T> classOfT) throws JsonSyntaxException {
//     ...

//	inline fun <reified T: Any> Gson.fromJson(json: JsonElement): T = this.fromJson(json, T::class.java)


	fun test(bool: Boolean?) {
		if (bool == true) {

		} else {

		}
	}
}