package com.corridacerta

import android.content.Context

class PreferencesHelper(context: Context) {

    private val prefs = context.getSharedPreferences("corrida_certa", Context.MODE_PRIVATE)

    fun salvarConsumo(consumo: Float) {
        prefs.edit().putFloat("consumo", consumo).apply()
    }

    fun getConsumo(): Float {
        return prefs.getFloat("consumo", 10f)
    }

    fun salvarPrecoCombustivel(preco: Float) {
        prefs.edit().putFloat("preco", preco).apply()
    }

    fun getPrecoCombustivel(): Float {
        return prefs.getFloat("preco", 5f)
    }
}
