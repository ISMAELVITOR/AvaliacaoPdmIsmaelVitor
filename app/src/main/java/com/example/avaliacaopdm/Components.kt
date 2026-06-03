package com.example.avaliacaopdm

import android.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun Titulo(texto: String){
    Text(
        text = texto,
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
fun Imagem(idImagem: Int, modifier: Modifier = Modifier) {
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
fun CheckBox(texto: String, aceito: Boolean, onAceitoChange: (Boolean) -> Unit) {
    Row {
        Checkbox(
            checked = aceito,
            onCheckedChange = { onAceitoChange(it) }
        )
        Text(text = texto)
    }
}