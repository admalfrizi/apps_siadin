package com.example.apps_siadin.models

class HariKini( tanggal: String? , colorDay : Int?) {
    private var tanggal: String
    init {
        this.tanggal = tanggal!!
    }

    fun getTanggal() : String? {
        return tanggal
    }

    fun setTanggal(tanggal: String?){
        this.tanggal = tanggal!!
    }

    private var colorDay : Int
    init {
        this.colorDay = colorDay!!
    }

    fun getColorDay() : Int? {
        return colorDay
    }

    fun setColorDay(colorDay: Int?) {
        this.colorDay = colorDay!!
    }


}