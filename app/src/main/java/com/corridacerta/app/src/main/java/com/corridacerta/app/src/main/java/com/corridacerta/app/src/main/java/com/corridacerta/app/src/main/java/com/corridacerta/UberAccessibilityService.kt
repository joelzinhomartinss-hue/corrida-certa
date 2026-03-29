package com.corridacerta

import android.accessibilityservice.AccessibilityService
import android.view.accessibility.AccessibilityEvent
import android.util.Log

class UberAccessibilityService : AccessibilityService() {

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {

        if (event == null) return

        val texto = event.text.joinToString(" ")

        // Detecta se é tela de corrida
        if (texto.contains("R$") && texto.contains("km")) {

            Log.d("CORRIDA_CERTA", "Texto detectado: $texto")

            // Aqui no futuro vamos extrair:
            // valor da corrida
            // km da corrida
            // km até passageiro
        }
    }

    override fun onInterrupt() {}
}
