package interface1

class apple: fruit {
    override var color: String = "sweet"
    override var test: String = "red"
    override fun size() {
       println("size of a apple")
    }

    override fun tree() {
        super.tree()
        println("Apple tree is huge")
    }
}