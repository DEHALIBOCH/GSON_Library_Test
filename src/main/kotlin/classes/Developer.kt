package classes

class Developer(
    name: String,
    surname: String,
    email: String,
    age: Int,
    address: Address,
    jobPosition: String,
    private val responsibilities: List<String>
) : Employee(name, surname, email, age, address, jobPosition) {

    override fun toString(): String {
        return super.toString() + ", Responsibilities=$responsibilities"
    }
}