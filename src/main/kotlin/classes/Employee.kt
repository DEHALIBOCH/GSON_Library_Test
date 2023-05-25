package classes

open class Employee(
    name: String,
    surname: String,
    email: String,
    age: Int,
    address: Address,
    private val jobPosition: String
) : UserWithAddress(name, surname, email, age, address) {

    override fun toString(): String {
        return super.toString() + ", Job position=$jobPosition"
    }
}