const val PI =3.1416

fun main(args: Array<String>) {

    //variablesAndwhen()

    //nullable()

    listas()
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

