const val PI =3.1416

fun main(args: Array<String>) {

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