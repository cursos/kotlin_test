const val PI =3.1416

fun main(args: Array<String>) {

    //variablesAndwhen()

    //nullable()

    //listas()

    //fnListas()

    //maps()

    //sets()

   // println("Pedro".ramdomCase())

   // imprimirNombre(nombre ="Carlos", segundoNombre = "", apellido = "Rey")

//lambdas()

    //highOrderFunctions()

}

fun highOrderFunctions() {
val largoValorInicial = superFunction(valorInicial = "Hola", block = {valor -> valor.length})
    println(largoValorInicial)

    val lambda: () -> String = funsionIncepsion("Enrique")
    val valorLambda: String = lambda()
    println(valorLambda)
}

fun superFunction(valorInicial: String, block : (String) -> Int): Int {
return block(valorInicial)
}

fun funsionIncepsion(nombre : String): () -> String {
    return {
        "Hola desde lambda $nombre"
    }
}

fun lambdas() {
   val myLanbda : (String) -> Int = {
       valor -> valor.length
   }

    val lambdaEjecutada: Int = myLanbda("Hola platzi")

    println(lambdaEjecutada)

    val saludos = listOf("Hello", "hola", "Ciao")
    val longitudSaludos = saludos.map(myLanbda)

    println(longitudSaludos)


}

fun String.ramdomCase(): String{
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()
    val residuo = resultadoAleatorio % 2
    if(residuo == 0)return this.uppercase()else return this.lowercase()

}

fun imprimirNombre(nombre: String, segundoNombre:String = "", apellido: String){
println("Mi nombre es: $nombre $segundoNombre y mi apellido es: $apellido")
}

fun sets(){
    val vocalesRepetidas = setOf("a","e","i","o", "u", "a","e","i","o", "u")
    println(vocalesRepetidas)

    val numerosFavoritos = mutableSetOf("3", "7", "5")
    println(numerosFavoritos)

    numerosFavoritos.add("11")
    println(numerosFavoritos)

    numerosFavoritos.add("11")
    println(numerosFavoritos)

    numerosFavoritos.remove("11")
    println(numerosFavoritos)

    val valorDelSec = numerosFavoritos.first { numero -> numero == "5" }
    print(valorDelSec)
}

fun maps() {
    val edadSuperHeroes = mapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99,
    )
    println(edadSuperHeroes)

    val edadSuperHeroesM = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99,
    )
    println(edadSuperHeroesM)

    //add super heroes
    edadSuperHeroesM.put("wolvering",45)
    edadSuperHeroesM["Storm"] = 30
    println(edadSuperHeroesM)

    val edadIronMan = edadSuperHeroes["Ironman"]
    println(edadIronMan)

    edadSuperHeroesM.remove("Wolvering")
    println(edadSuperHeroesM)

    print(edadSuperHeroesM.keys)

}

fun fnListas() {
    val numerosDeLoteria = listOf(11,22,43,56,78,66)
    println(numerosDeLoteria)



    val numerosSort = numerosDeLoteria.sorted()
    println(numerosSort)

    val numerosSortDes = numerosSort.sortedDescending()
    println(numerosSortDes)

    val ordenarMultiplos = numerosDeLoteria.sortedBy { numero -> numero < 50 }
    println(ordenarMultiplos)

    val numerosAleatorios = numerosDeLoteria.shuffled()
    println(numerosAleatorios)

    val numerosReverse = numerosDeLoteria.reversed()
    println(numerosReverse)

    val mensajeDeNumeros = numerosDeLoteria.map {
            numero -> "Tu numero de loteria es $numero \n"
    }
    println(mensajeDeNumeros)

    val mayor50 = numerosDeLoteria.filter { numero -> numero > 50}
    println(mayor50)

}


fun variablesAndwhen(){
    println("Hello world")
    var dinero = 10
    println (dinero)
    dinero =  5
    println(dinero)

    val nombre ="Carlos"
    println(nombre)
    println(PI)

    val boolean = true
    val numeroLargo = 3L
    val double = 3.0
    val float = 3.5f

    val primerValor = 20
    val segundoValor = 10
    val tercervalor = primerValor - segundoValor
    println(tercervalor)

    val apeelido = "Rey"
    val name = "carlos"

    val fullName = "$name $apeelido"

    println(fullName)

    //When

    val colorName = "Amarillo"

    when(colorName){
        "Amarillo" -> println("color alegria")
        "Rojo", "Carmesí" -> println("rojo de amor")
        "Azul" ->{
            println("")
        }
        else -> print("none of them")
    }

    val code = 50

    when(code){
        in 200..299 -> println("everything is going well")
        in 400.. 500 -> println("something wrong")
        else -> println("somwthing out of service")
    }

    val tallaZapatos = 39

    val mensaje = when(tallaZapatos){
        39,40,41 -> "there are available "
        42,43,44 -> "almost overying"
        45 -> "sorry, we dont have"
        else-> println("no hay tallas")
    }
    print(mensaje)
}

fun nullable() {
    var nombre : String? = null

    try{
        nombre!!.length

    } catch (error: java.lang.NullPointerException){
        println("Ha ocurrido un error")
    }finally {
        println("Finalmente ha ocurrido un error... Cerrado aplicacion")
    }

    val primerValor = 10
    val segundoValor = 0
    val resultado :Int = try { primerValor/ segundoValor }catch (error: Exception){0}
    println(resultado)

    var nombre2:String? = null
    val caracterDeNombre : Int = nombre2?.length ?: 0
    print(caracterDeNombre)


}

fun listas(){

    val listNombres = listOf ("Carlos", "Juan", "Camila")
    println(listNombres)

    val listaVacia = mutableListOf<String>()
    println(listaVacia)

    listaVacia.add("Juan")
    println(listaVacia)

    val valorUsandoGet = listaVacia.get(0);
    println(valorUsandoGet)

    val valorUsandoOperador = listaVacia[0]
    println(valorUsandoOperador)

    val primerValor = listNombres.firstOrNull()
    println(primerValor)

    listaVacia.removeAt(0)
    println(listaVacia)

    listaVacia.add("Enrique")
    println(listaVacia)
    listaVacia.removeIf{caracteres -> caracteres.length >3}
    println(listaVacia)

    val myArray = arrayOf(1,2,3,4)
    println("myArray $myArray")
    println("myArray como lista ${myArray.toList()}")


}

