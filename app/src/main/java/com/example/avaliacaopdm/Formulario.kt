package com.example.avaliacaopdm

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.LinearProgressIndicator
import kotlinx.coroutines.launch
import kotlinx.coroutines.delay
import androidx.compose.runtime.rememberCoroutineScope
/*
@Composable
fun Formulario(navController: NavController){

    var nome by remember {
        mutableStateOf("")
    }

    var endereco by remember {
        mutableStateOf("")
    }

    var dataNasciemento by remember {
        mutableStateOf("")
    }

    var aceito by remember {
        mutableStateOf(false)
    }

    Column (){

    }

}


@Composable
fun EntradaDeTexto(campo: String,
                   descricao: String,
                   texto: String,
                   onTextoChange: (String) -> Unit
){
    OutlinedTextField(
        value = texto,

        onValueChange = {
            onTextoChange(it)
        },

        label = {
            Text(campo)
        },

        placeolder = {
            Text(descricao)
        },

        singleline = true,

    )

}
*/
