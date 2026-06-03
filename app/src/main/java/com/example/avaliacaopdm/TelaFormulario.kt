package com.example.avaliacaopdm

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun TelaFormulario(navController: NavController){

    var nome by remember {
        mutableStateOf("")
    }

    var cidade by remember {
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

    Column (modifier = Modifier.fillMaxSize()
        .padding(50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)){

        EntradaTexto("nome",
            "Digite seu nome",
            texto = nome, onTextoChange = {nome = it})

        EntradaTexto("cidade",
            "Digite sua Cidade",
            texto = nome, onTextoChange = {cidade = it})

        EntradaTexto("endereço",
            "Digite seu endereço",
            texto = endereco, onTextoChange = {endereco = it})

        CheckBox(
            "Aceito os termos de uso",
            aceito = aceito,
            onAceitoChange = { aceito = it }
        )
    }

}
