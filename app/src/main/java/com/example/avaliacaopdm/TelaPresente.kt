package com.example.avaliacaopdm

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.mutableStateOf
import androidx.navigation.NavController
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue



@Composable
fun TelaPresente(navController: NavController) {

    var contador by remember {
        mutableStateOf(10)
    }

    Column (modifier = Modifier.fillMaxSize()
        .padding(50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ){
        if(contador > 0) {
            Titulo("aperte para ganhar")
        }else{
            Titulo("parabens voce ganhou")
        }

        Box(modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            if (contador > 0) {
                BotaoImagem(
                    idImagem = R.drawable.interrogacao,
                    descricao = "interrogacao",
                    onClick = {
                        contador = contador - 1
                    },
                    modifier = Modifier.size(300.dp)
                )
            } else {
                Imagem(
                    idImagem = R.drawable.bob,
                    modifier = Modifier.size(300.dp)
                )
            }
        }


    }

}