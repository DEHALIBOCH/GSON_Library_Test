import com.google.gson.Gson
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream

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
    */


}

private fun serializeUser(user: User) {
    val gson = Gson()
    val userGson = gson.toJson(user)
    val file = File("C:\\projects\\kotlin\\GsonTest\\src\\main\\kotlin\\json\\SerializedUser.json")
    val fos = FileOutputStream(file)
    fos.use {
        val byteArray = userGson.toByteArray()
        it.write(byteArray)
    }
}

private fun deserializeUser(file: File): User {
    val gson = Gson()
    val fis = FileInputStream(file)
    val jsonString = StringBuilder()
    fis.use {
        while (true) {
            val i = fis.read()
            if (i == -1) {
                break
            }
            jsonString.append(i.toChar())
        }
    }
    return gson.fromJson(jsonString.toString(), User::class.java)
}

