package com.example.avaliacaopdm

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.material3.DatePicker
import androidx.compose.material3.IconButton
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size

@Composable
fun SegundaTela(navController: NavController){

    Column(modifier = Modifier.fillMaxSize().padding(50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {

        Row() {
            BotaoVoltar(navController)
            BotaoAvancar(navController)
        }

        DatePickerExemplo()

        BotaoImagem(navController, modifier = Modifier.size(200   .dp))
    }

}

@Composable
fun BotaoVoltar(navController: NavController) {

    Button(
        onClick = {
                navController.navigate("login")
        }
    ) {
        Text(
            text = "Voltar"
        )
    }
}

@Composable
fun BotaoAvancar(navController: NavController) {

    Button(
        onClick = {
            navController.navigate("login")
        }
    ) {
        Text(
            text = "Avancar"
        )
    }
}

@Composable
fun DatePickerExemplo() {
    val datePickerState = rememberDatePickerState()

    DatePicker(state = datePickerState)
}

@Composable
fun BotaoImagem(navController: NavController, modifier: Modifier = Modifier) {
    IconButton(
        onClick = {
        navController.navigate("login")
        },
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = R.drawable.voltar),
            contentDescription = "Botão com imagem",
        )
    }
}