package ar.edu.unahur.obj2.impostoresPaises

object Observatorio {
    var paises = mutableListOf<Pais>()

    fun sonLimitrofes(pais1: String, pais2:String) =
            traerPaisPorNombre(pais1)?.esLimitrofeDelString(pais2)

    fun traerPaisPorNombre(nombre:String) = paises?.find { it.nombre == nombre }

    fun necesitanTraduccion(pais1: String, pais2: String) = traerPaisPorNombre(pais2)?.let { traerPaisPorNombre(pais1)?.compartenIdiomas(it) }

    fun agregarPais(pais: List<Pais>) = paises.addAll(pais)

    fun buscarNombre(nombre:String) = paises.any { it.nombre == nombre }

    fun sonPotencialesAliados(pais1: String, pais2:String) =
            traerPaisPorNombre(pais1)?.esPotencialAliadoDe(pais2)




}