package classes

import com.google.gson.Gson
import java.io.File
import java.io.FileInputStream
import java.io.FileOutputStream

class UserFromJsonFile<out T : User> {
    fun deserializeUser(file: File, classOf: Class<@UnsafeVariance T>): T {
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
        return gson.fromJson(jsonString.toString(), classOf)
    }
}

class UserToJsonFile<in T : User> {
    fun serializeUser(user: T, file: File) {
        val gson = Gson()
        val userGson = gson.toJson(user)
        val fos = FileOutputStream(file)
        fos.use {
            val byteArray = userGson.toByteArray()
            it.write(byteArray)
        }
    }
}
