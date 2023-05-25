import classes.*
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.File
import java.io.FileReader
import java.util.*

class Main {}

fun main() {/*
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


    val userFromJsonFile = UserFromJsonFile<UserWithAddress>()
    val optimusPrime = userFromJsonFile.deserializeUser(file, UserWithAddress::class.java)
    println(optimusPrime)
    */

    /*
    val responsibilities = listOf<String>(
        "Meeting with development managers to discuss the scope of software projects.\n",
        "Analyzing existing programs for modification purposes.\n",
        "Researching and designing new software systems, websites, programs, and applications.\n",
        "Writing and implementing, clean, scalable code.\n",
        "Troubleshooting and debugging code.\n",
        "Verifying and deploying software systems.\n",
        "Evaluating user feedback.\n",
        "Recommending and executing program improvements.\n",
        "Maintaining software code and security systems.\n",
        "Creating technical documents and training staff."
    )
    val tonyHoareAddress = Address(
        "College town",
        "1",
        "Oxford",
        "England"
    )
    val dev = Developer(
        "Tony",
        "Hoare",
        "tony_hoare@cambridge.com",
        88,
        tonyHoareAddress,
        "Leading researcher in Microsoft Research",
        responsibilities
    )
    val userToJson = UserToJsonFile<Developer>()
    val file = File("C:\\projects\\kotlin\\GsonTest\\src\\main\\kotlin\\json\\SerializedEmployee.json")
    userToJson.serializeUser(dev, file)
     */
    /*
    val file = File("C:\\projects\\kotlin\\GsonTest\\src\\main\\kotlin\\json\\OsList.json")
    val arrOS = deserializeOsToArray(file)
    println(arrOS.contentToString())
     */
}



private fun deserializeOsToArray(file: File): Array<OS> {
    val gson = Gson()
    val reader = FileReader(file)
    val str = StringBuilder()
    reader.use {
        while (true) {
            val i = it.read()
            if (i == -1) {
                break
            }
            str.append(i.toChar())
        }
    }
    return gson.fromJson(str.toString(), Array<OS>::class.java)
}
