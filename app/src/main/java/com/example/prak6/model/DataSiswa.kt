package com.example.prak6.model

import android.provider.ContactsContract.CommonDataKinds.Email

data class DataSiswa(                                   // Menyimpan data dengan properti
    val nim: String = "",
    val nama :String = "",
    val alamat :String = "",
    val gender :String = "",
    val email :String = "",
    val notelepon :String = "",
)
