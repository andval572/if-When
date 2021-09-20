fun main() {
    calcularPrecio(0,"juan")
    println(calcularPrecio(20,"miguel"))

}

    fun calcularPrecio(edad:Int,nombre:String):String {
        if (edad in 1..18) {
            return ("$nombre debe abonar 5 pavos")
        } else {
            if (edad in 18..65) {
                return ("$nombre debe abonar 10 pavos")
            }
            return ("$nombre para ti es gratis")
        }
    }

