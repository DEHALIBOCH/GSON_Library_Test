package classes

open class User(
    private val name: String,
    private val surname: String,
    private val email: String,
    private var age: Int
) {

    override fun toString(): String {
        return "Name='$name', Surname='$surname', Email='$email', Age=$age"
    }
}