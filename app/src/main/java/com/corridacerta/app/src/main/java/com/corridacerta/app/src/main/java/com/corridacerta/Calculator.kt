package com.corridacerta

object Calculator {

    fun calcular(
        valorCorrida: Double,
        kmCorrida: Double,
        kmAtePassageiro: Double,
        consumoCarro: Double,
        precoCombustivel: Double
    ): Resultado {

        val kmTotal = kmCorrida + kmAtePassageiro

        val gastoCombustivel = (kmTotal / consumoCarro) * precoCombustivel

        val lucroLiquido = valorCorrida - gastoCombustivel

        val valorPorKm = valorCorrida / kmTotal

        return Resultado(
            kmTotal,
            gastoCombustivel,
            lucroLiquido,
            valorPorKm
        )
    }

    data class Resultado(
        val kmTotal: Double,
        val gastoCombustivel: Double,
        val lucroLiquido: Double,
        val valorPorKm: Double
    )
}
