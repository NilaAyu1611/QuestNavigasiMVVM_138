package com.example.prak6.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.prak6.model.DataSiswa


@Composable
fun TampiData(uiState: DataSiswa, onBackButton: () -> Unit
                ){
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Spacer(modifier = Modifier.height(32.dp)) // Tambahkan jarak vertikal di bagian atas

        Text(text = "Detail Data Siswa",
            modifier = Modifier
                .padding(bottom = 16.dp)
                .fillMaxWidth(),
            fontWeight = FontWeight.ExtraBold,
            fontFamily = FontFamily.Monospace,
            textAlign = TextAlign.Center,
            color = Color.Blue
        )

        TampilData(param = "NIM", argu = uiState.nama)
        TampilData(param = "Nama", argu = uiState.nama)
        TampilData(param = "Jenis Kelamin", argu = uiState.gender)
        TampilData(param = "Email", argu = uiState.email)
        TampilData(param = "Alamat", argu = uiState.alamat)
        TampilData(param = "No Telepon", argu = uiState.notelepon)

        Button(
            onClick = onBackButton,
            modifier = Modifier.padding(top = 20.dp)
        ) {
            Text(text = "Kembali")
        }
    }

}


@Composable
fun TampilData(
    param : String, argu:String             // Agar lebih mudah dideklarasikan maka nanti tinggal dipanggil
){
    Column (
        modifier = Modifier.padding(8.dp)       // agar tidak terlalu lebar jaraknya
    ){
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(text = param,
                modifier = Modifier.weight(0.9f))
            Text(text = " :",
                modifier = Modifier.weight(0.2f))
            Text(text = argu,
                modifier = Modifier.weight(2f))       // Mmberikan ruang
        }
    }
}
