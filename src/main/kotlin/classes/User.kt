package classes

open class User(val name: String, val surname: String, val email: String, var age: Int) {
    override fun toString(): String {
        return "Name='$name', Surname='$surname', Email='$email', Age=$age"
    }
}