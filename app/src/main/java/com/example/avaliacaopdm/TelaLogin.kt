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



@Composable
fun TelaLogin(navController: NavController){

    var nome by remember {
        mutableStateOf("")
    }

    var senha by remember {
        mutableStateOf("")
    }

    var aceito by remember {
        mutableStateOf(false)
    }

    var carregando by remember {
        mutableStateOf(false)
    }

    val scope = rememberCoroutineScope()

    Column(modifier = Modifier.fillMaxSize()
        .padding(50.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Imagem(
            idImagem = R.drawable.bob,
            modifier = Modifier.size(300.dp)
        )

        Titulo("Seja bem vindo!!!")

        EntradaTexto("Nome",
            "digite seu nome",
            texto = nome,
            onTextoChange = { nome = it }
        )

        EntradaTexto("Senha",
            "Digite sua senha",
            texto = senha,
            onTextoChange = {senha = it}
        )

            CheckBoxAceitar(
                "salvar login",
                aceito = aceito,
                onAceitoChange = { aceito = it }
            )

            if (carregando) {
                LinearProgressIndicator()
            }

        BotaoEntrar(nome, senha,aceito, navController)

    }
}

