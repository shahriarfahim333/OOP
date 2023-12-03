class lamp {
    private var ison = true

    fun turnOn(){
        ison = true
    }
    fun turnOff(){
        ison = false
    }
    fun display(){
        println(ison)
    }
}
