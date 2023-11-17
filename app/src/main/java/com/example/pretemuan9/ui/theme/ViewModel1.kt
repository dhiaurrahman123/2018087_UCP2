package com.example.pretemuan9.ui.theme

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class ViewModel1 {
    var nama: String by mutableStateOf("")
        private set
    var nim:String by mutableStateOf("")
        private set
    var konsent:String by mutableStateOf("")
        private set
    var jdl_skripsi:String by mutableStateOf("")
        private set

    fun IsiData(nme:String, nm:String,kons:String,jdl:String){
        nama = nme
        nim = nm
        konsent=kons
        jdl_skripsi=jdl
    }
}

