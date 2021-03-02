import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap


fun main() {

    var ingredientes: List<String> =
        listOf("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")
    val menuI: String = """
        :: Bienvenido a Recipe Maker ::


        Selecciona la opción deseada
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent()
    var listaRecetas = arrayListOf<HashMap<String?, ArrayList<String>>>()
    var stringInput : String
    do {
        println(menuI);
        stringInput = readLine().toString()

        when(stringInput){
            "1"-> listaRecetas.add(doReceta())
            "2"-> listaRecetas.forEachIndexed { index, hashMap ->  println("$index. $hashMap")}
            "3"-> finish()
        }

    }while (!stringInput.equals("3"))



}

fun doReceta(): HashMap<String?, ArrayList<String>> {
    val menuR = """
        Indicar el numero para agregar el ingrediente:

        1. Agua
        2. Leche
        3. Carne
        4. Verduras
        5. Frutas
        6. Cereal
        7. Huevos
        8. Aceite
        0. Terminar
    """.trimIndent()

    var ingredientes: List<String> =
        listOf("Agua", "Leche", "Carne", "Verduras", "Frutas", "Cereal", "Huevos", "Aceite")
    var recetas = arrayListOf<String>()
    println("Bienvenido indique el nombre de la receta")
    var nameImput = readLine()
    println("Excelente el nombre es: $nameImput")
    var ingredienteInput : String
    val reader = Scanner(System.`in`)
    do{
        println(menuR)
        var ingredienteInput : Int = reader.nextInt()
        when(ingredienteInput){
            0-> {
                println("Receta Terminada")
                readLine()
            }
            in 1..8->{
                recetas.add(ingredientes.get(ingredienteInput))
                print("Receta $nameImput ingredientes:")
                recetas.forEachIndexed { index, s ->
                    println("$index. $s")
                }
            }
            else->{
                println("Valor Invalido")
            }

        }

    }
    while (!ingredienteInput.equals(0))
    var resultado = hashMapOf(nameImput to recetas)
    return resultado
}

fun finish() {

    println("Programa construido por Alejandro Daza un feliz dia")
    var anyInput = readLine().toString()
}
