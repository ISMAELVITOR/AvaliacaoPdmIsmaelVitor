package com.example.avaliacaopdm


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
import android.widget.NumberPicker
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue


@Composable
fun Titulo(texto: String){
    Text(
        text = texto,
        fontSize = 20.sp,
        textAlign = TextAlign.Center
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

@Composable
fun DatePickerRodinha(
    dia: Int,
    mes: Int,
    ano: Int,
    onDiaChange: (Int) -> Unit,
    onMesChange: (Int) -> Unit,
    onAnoChange: (Int) -> Unit
) {
    Row {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Dia")
            AndroidView(factory = { context ->
                NumberPicker(context).apply {
                    minValue = 1
                    maxValue = 31
                    value = dia
                    setOnValueChangedListener { _, _, novoValor ->
                        onDiaChange(novoValor)
                    }
                }
            })
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Mês")
            AndroidView(factory = { context ->
                NumberPicker(context).apply {
                    minValue = 1
                    maxValue = 12
                    value = mes
                    setOnValueChangedListener { _, _, novoValor ->
                        onMesChange(novoValor)
                    }
                }
            })
        }

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Ano")
            AndroidView(factory = { context ->
                NumberPicker(context).apply {
                    minValue = 2020
                    maxValue = 2035
                    value = ano
                    setOnValueChangedListener { _, _, novoValor ->
                        onAnoChange(novoValor)
                    }
                }
            })
        }
    }
}