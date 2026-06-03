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

            BotaoGenerico("voltar",
                onClick = {
                navController.navigate("login")
            }
            )
            BotaoGenerico("Avançar",
                onClick = {
                    navController.navigate("login")
                }
            )
        }

        DatePickerExemplo()

        BotaoImagem(idImagem = R.drawable.voltar, "botão voltar",navController, modifier = Modifier.size(200   .dp))
    }

}

@Composable
fun DatePickerExemplo() {
    val datePickerState = rememberDatePickerState()

    DatePicker(state = datePickerState)
}
