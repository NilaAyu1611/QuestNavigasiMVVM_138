package com.example.prak6.viewmodel

import androidx.lifecycle.ViewModel
import com.example.prak6.model.DataSiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class SiswaViewModel: ViewModel() {
    //Request
    private val _statusUI = MutableStateFlow(DataSiswa())
    // Respons
    val statusUI: StateFlow<DataSiswa> = _statusUI.asStateFlow()

    fun saveDataSiswa(ls: MutableList<String>){
        _statusUI.update { statusSaatIni ->                 // statu saatini isinya sebuah model, isinya datasiswa
            statusSaatIni.copy(
                nim =ls[0],
                nama = ls[1],           //yang kita inputakan itu ada di ui
                gender = ls[2],
                email = ls[3],
                alamat = ls[4],
                notelepon = ls[5],
            )
        }
    }


}