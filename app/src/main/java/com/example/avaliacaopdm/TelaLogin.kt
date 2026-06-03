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
        ImagemLogin(
            idImagem = R.drawable.bob,
            modifier = Modifier.size(300.dp)
        )

        Titulo()

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
                aceito = aceito,
                onAceitoChange = { aceito = it }
            )

            if (carregando) {
                LinearProgressIndicator()
            }

            BotaoEntrar2(nome, senha, aceito, carregando, navController, scope) { novoValor ->
                carregando = novoValor
            }

        BotaoEntrar(nome, senha,aceito, navController)

    }
}

@Composable
fun Titulo(){
    Text(
        text = "Seja Bem Vindo!!!",
        fontSize = 30.sp,
        textAlign = TextAlign.Center,
    )
}

@Composable
fun EntradaTexto(campo: String,
                 descricao:String,
                 texto: String,
                 onTextoChange: (String) -> Unit
) {

    OutlinedTextField(
        value = texto,

        onValueChange = {
            onTextoChange(it)
        },

        label = {
            Text(campo)
        },

        placeholder = {
            Text(descricao)
        },

        singleLine = true,

        )
}

@Composable
fun ImagemLogin(idImagem: Int, modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(id = idImagem),
        contentDescription = null,
        modifier = modifier
    )
}

@Composable
fun BotaoEntrar(nome: String, senha: String,aceito: Boolean, navController: NavController) {

    Button(
        onClick = {

            if(nome == "ismael" && senha == "123" && aceito) {
                println("Login correto")
                navController.navigate("segundaTela")
            }
            else {
                println("Login incorreto")
            }

        }
    ) {
        Text(
            text = "Entrar"
        )
    }
}

@Composable
fun BotaoEntrar2(
    nome: String,
    senha: String,
    aceito: Boolean,
    carregando: Boolean,
    navController: NavController,
    scope: kotlinx.coroutines.CoroutineScope,
    onCarregandoChange: (Boolean) -> Unit
) {
    Button(
        onClick = {
            if (nome == "ismael" && senha == "123" && aceito) {
                onCarregandoChange(true)

                scope.launch {
                    delay(1000)
                    navController.navigate("segundaTela")
                }
            } else {
                println("Login incorreto")
            }
        },
        enabled = !carregando
    ) {
        Text(
            text = if (carregando) "Entrando..." else "Entrar"
        )
    }
}

@Composable
fun CheckBoxAceitar(aceito: Boolean, onAceitoChange: (Boolean) -> Unit) {
    Row {
        Checkbox(
            checked = aceito,
            onCheckedChange = { onAceitoChange(it) }
        )
        Text(text = "Aceito os termos")
    }
}

@Composable
fun ProgressBarExemplo() {
    LinearProgressIndicator()
}