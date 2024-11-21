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
        _statusUI.update { statusSaatIni ->                 // statusaatini isinya sebuah model, isinya datasiswa
            statusSaatIni.copy(
                nama = ls[0],           //yang kita inputakan itu ada di ui
                gender = ls[1],
                email = ls[2],
                alamat = ls[3],
                notelepon = ls[4],
            )
        }
    }
}