package com.example.prak6.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//@Preview(showBackground = true)
@Composable
fun FormulirView(modifier: Modifier = Modifier,
                 listJK: List<String>,
                 onSubmitClicked: (MutableList<String>) -> Unit){           // untuk menghandle onclik
    var nim by remember { mutableStateOf("") }
    var nama by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var notelepon by remember { mutableStateOf("") }


    val listData: MutableList<String> = mutableListOf(nim, nama, gender,email,alamat,notelepon)

    Column(
        modifier = modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Spacer(modifier = Modifier.height(32.dp)) // Tambahkan jarak vertikal di bagian atas

        TextField(
            value = nim,
            onValueChange = {nim=it},
            label = {
                Text(text = "NIM" )
            },
            placeholder = {
                Text(text = "Isi NIM anda")
            },
            modifier = Modifier.fillMaxWidth().padding(5.dp)
        )

        TextField(
            value = nama,
            onValueChange = {nama=it},
            label = {
                Text(text = "Nama" )
            },
            placeholder = {
                Text(text = "Isi nama anda")
            },
            modifier = Modifier.fillMaxWidth().padding(5.dp)
        )

        Row (
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround           // Memberi jarak antar elemen
        ){
            listJK.forEach{selectedGender ->
                Row(verticalAlignment = Alignment.CenterVertically){
                    RadioButton(
                        selected = gender == selectedGender,
                        onClick = {gender = selectedGender}
                    )
                    Text(text = selectedGender)
                }
            }
        }

        TextField(
            value = email,
            onValueChange = {email=it},
            label = {
                Text(text = "Email" )
            },
            placeholder = {
                Text(text = "Isi email anda")
            },
            modifier = Modifier.fillMaxWidth().padding(5.dp)
        )
        TextField(
            value = alamat,
            onValueChange = {alamat=it},
            label = {
                Text(text = "Alamat" )
            },
            placeholder = {
                Text(text = "Isi alamat anda")
            },
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

        )
        TextField(
            value = notelepon,
            onValueChange = {notelepon=it},
            label = {
                Text(text = "No Telepon" )
            },
            placeholder = {
                Text(text = "Isi notelepon anda")
            },
            modifier = Modifier.fillMaxWidth().padding(5.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
        )




    }


}

