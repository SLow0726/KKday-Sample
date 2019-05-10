package com.example.myapplication

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
//        assertEquals(4, 2 + 2)
        var test = subTest()
        var test1 = subTest()
        test.k = 100
        System.out.println("test k "+test.k+" test1 k "+test1.k)
        test.setSK(10)
        test1.setSK(20)
        System.out.println("test k "+test.getSK()+" test1 k "+test1.getSK())

        System.out.println(test.k == test1.k)
    }

    open class TestV {
        var k = 10
        companion object {
            var sk=10
        }
    }
    class subTest: TestV() {
        fun setSK( input:Int){
            sk=input
        }
        fun getSK():Int{
            return sk
        }
    }
}
