package NEASTEDCLASS

//class Outer {
//    val a = "Outer neasted Class"
//    class Neasted{
//        val b = "Inside Neasted Class"
//        fun callme() = "Function call from inside neasted"
//
//        }
//    }

class Outer {
    val wtf = "what up homei?"

    inner class Inner{
        val wth = wtf
        fun callme() = "new around?"

        }
    }