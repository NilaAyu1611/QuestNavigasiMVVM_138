package com.example.prak6

import android.content.Context

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.prak6.model.JenisKelamin
import com.example.prak6.model.JenisKelamin.JenisK
import com.example.prak6.ui.view.FormulirView
import com.example.prak6.ui.view.TampiData
import com.example.prak6.ui.view.TampilData
import com.example.prak6.viewmodel.SiswaViewModel

enum class Halaman{             // berisi daftar halaman
    FORMULIR,
    TAMPILDATA
}


@Composable
fun NavigationControl(
    modifier: Modifier = Modifier,
    viewModel: SiswaViewModel = viewModel(),
    navHost: NavHostController = rememberNavController()
)

{
    val uiState by viewModel.statusUI.collectAsState()          // Mengamati perubahan pada data statusUI dalam ViewModel




}