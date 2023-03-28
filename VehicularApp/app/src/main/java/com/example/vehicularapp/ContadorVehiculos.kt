package com.example.vehicularapp

class ContadorVehiculos {
    private var motos: Int = 0
    private var autos: Int = 0
    private var jeeps: Int = 0
    private var camionetas: Int = 0
    private var microbuses: Int = 0
    private var minibuses: Int = 0
    private var buses: Int = 0
    private var livianosDeCarga: Int = 0

    fun getMotos(): Int {
        return motos
    }

    fun getAutos(): Int {
        return autos
    }

    fun getJeeps(): Int {
        return jeeps
    }

    fun getCamionetas(): Int {
        return camionetas
    }

    fun getMicrobuses(): Int {
        return microbuses
    }

    fun getMinibuses(): Int {
        return minibuses
    }

    fun getBuses(): Int {
        return buses
    }

    fun getLivianosDeCarga(): Int {
        return livianosDeCarga
    }


    fun incrementarMotos() {
        motos++
    }

    fun incrementarAutos() {
        autos++
    }

    fun incrementarJeeps() {
        jeeps++
    }

    fun incrementarCamionetas() {
        camionetas++
    }

    fun incrementarMicrobus() {
        microbuses++
    }

    fun incrementarMinibus() {
        minibuses++
    }

    fun incrementarBus() {
        buses++
    }

    fun incrementarLivianoDeCarga() {
        livianosDeCarga++
    }

    fun obtenerContador(): String {
        return "Motos: $motos\nAutos: $autos\nJeeps: $jeeps\nCamionetas: $camionetas\nMicrobuses: $microbuses\nMinibuses: $minibuses\nBuses: $buses\nLivianos de carga: $livianosDeCarga"
    }
}
