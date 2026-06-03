package com.example.avaliacaopdm

import android.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Checkbox
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
fun BotaoGenerico(
    texto: String,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick
    ) {
        Text(texto)
    }
}

@Composable
fun BotaoImagem(idImagem: Int, descricao:String, onClick: () -> Unit, modifier: Modifier = Modifier) {
    IconButton(
        onClick = onClick,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = idImagem),
            contentDescription = descricao,
        )
    }
}

@Composable
fun CheckBox(texto: String, aceito: Boolean, onAceitoChange: (Boolean) -> Unit) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Checkbox(
            checked = aceito,
            onCheckedChange = { onAceitoChange(it) }
        )
        Text(text = texto)
    }
}