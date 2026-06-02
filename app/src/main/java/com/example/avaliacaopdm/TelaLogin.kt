package com.example.avaliacaopdm

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text


@Composable
fun TelaLogin(navController: NavController){

    var nome by remember {
        mutableStateOf("")
    }

    var aceito by remember {
        mutableStateOf(true)
    }

    var ativo by remember {
        mutableStateOf(false)
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {

        Greeting("ola")

        Imagem(
            idImagem = R.drawable.bob,
            modifier = Modifier.size(150.dp).clip(CircleShape)
        )

        Titulo("Nome de Teste")

        EntradaTexto("Digite seu nome",
            "nome",
            texto = nome,
            onTextoChange = { nome = it }
        )

        CheckBox(
            "Li e aceito as regras",
            aceito = aceito,
            onAceitoChange = { aceito = it }
        )

        if(nome != "" && aceito == true){
            ativo = true
        }else{
            ativo = false
        }

        BotaoEnable("Concluir Cadastro",
            ativo,
            onClick = {

            }
        )
    }
}

@Composable
private fun Greeting(name: String) {
    Column(
        modifier = Modifier
            .padding()
            .fillMaxWidth()
            .background(color = Color.Cyan)
            .size(70.dp)
    ) {
        Text(text = "")
        Titulo("CadastroAPP")
    }
}
