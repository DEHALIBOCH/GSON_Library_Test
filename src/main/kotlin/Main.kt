import classes.*
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File
import java.io.FileReader
import java.io.FileWriter
import java.util.*

class Main {}

fun main() {
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
    /*
//    val captainAmerica = Employee(
//        "Steve",
//        "Rogers",
//        "steve_rogers@avengers.com",
//        107,
//        null,
//        null
//    )
//    val file = File("C:\\projects\\kotlin\\GsonTest\\src\\main\\kotlin\\json\\CaptainAmerica.json")
    val gson = Gson()
//    val writer = FileWriter(file)
//    val jsonString = gson.toJson(captainAmerica)
//    writer.use {
//        writer.write(jsonString)
//    }

    val file = File("C:\\projects\\kotlin\\GsonTest\\src\\main\\kotlin\\json\\Hulk.json")
    val str = StringBuilder()
    FileReader(file).use {
        while (true) {
            val i = it.read()
            if (i == -1) {
                break
            }
            str.append(i.toChar())
        }
    }
    // Age isn`t defined in Hulk.json => hulk.age = 0
    val hulk = gson.fromJson<Employee>(str.toString(), Employee::class.java)
    println(hulk)

    // By default, properties with null values not includes in json.
    // If we need to include nulls in json file, we can use GsonBuilder().serializeNulls().
    val gsonSerializedNulls = GsonBuilder().serializeNulls().create()
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
