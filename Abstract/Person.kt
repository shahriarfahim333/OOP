package Abstract

abstract class  person(var name: String){
    fun display(name: String){
        println(name)
    }
    abstract fun personJob()
}