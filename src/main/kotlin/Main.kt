import classes.Address
import classes.UserFromJsonFile
import classes.UserToJsonFile
import classes.UserWithAddress
import java.io.File

class Main {
}

fun main() {
    /*
    val bumblebee = User(
        "Bumblebee",
        "Autobot",
        "bumblebee@autobot.cybertron",
        700
    )
    serializeUser(bumblebee)
    val user = deserializeUser(file)
    println(user)
    */

    /*
    val address = Address(
        "Ingram Street",
        "20",
        "New York City",
        "The United States of America"
    )
    val peterParker = UserWithAddress(
        "Peter",
        "Parker",
        "not_spiderman@gmai.com",
        17,
        address
    )

    val userToJsonFile = UserToJsonFile<UserWithAddress>()
    userToJsonFile.serializeUser(peterParker)

    val file = File("C:\\projects\\kotlin\\GsonTest\\src\\main\\kotlin\\json\\User.json")
    val userFromJsonFile = UserFromJsonFile<UserWithAddress>()
    val optimusPrime = userFromJsonFile.deserializeUser(file, UserWithAddress::class.java)
    println(optimusPrime)
    */
}




