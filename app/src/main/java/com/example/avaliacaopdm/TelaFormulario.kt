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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.Row


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

    var aceito by remember {
        mutableStateOf(false)
    }

    var dia by remember {
        mutableStateOf(1)
    }


    var mes by remember {
        mutableStateOf(1)
    }

    var ano by remember {
        mutableStateOf(2026)
    }

    Column (modifier = Modifier.fillMaxSize()
        .padding(30.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)){

        Imagem(idImagem = R.drawable.interrogacao, Modifier.size(150.dp))

        Titulo("Faça seu cadastro para receber uma imagem de presente")

        EntradaTexto("nome",
            "Digite seu nome",
            texto = nome, onTextoChange = {nome = it})

        EntradaTexto("cidade",
            "Digite sua Cidade",
            texto = cidade, onTextoChange = {cidade = it})

        EntradaTexto("endereço",
            "Digite seu endereço",
            texto = endereco, onTextoChange = {endereco = it})

        DatePickerRodinha(
            dia = dia,
            mes = mes,
            ano = ano,
            onDiaChange = { dia = it },
            onMesChange = { mes = it },
            onAnoChange = { ano = it }
        )

        CheckBox(
            "Aceito os termos para receber o presente",
            aceito = aceito,
            onAceitoChange = { aceito = it }
        )

        Row(horizontalArrangement = Arrangement.spacedBy(20.dp)) {

            BotaoGenerico("Limpar",
                onClick = {
                    nome = "" ;
                    cidade = "" ;
                    endereco = "";
                    aceito = false
                })

            BotaoGenerico("Salvar",
                onClick = {
                    if(nome != "" && cidade != "" && endereco != "" && dia != 0 && mes != 0 && ano != 0 && aceito == true){
                        navController.navigate("telaPresente")
                }
                })
        }
    }

}
