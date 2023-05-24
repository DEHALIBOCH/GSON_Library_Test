package classes

class UserWithAddress(name: String, surname: String, email: String, age: Int, val address: Address) :
    User(name, surname, email, age) {
    override fun toString(): String {
        return super.toString() + ", Address=$address"
    }
}