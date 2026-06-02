package com.example.avaliacaopdm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.avaliacaopdm.ui.theme.AvaliacaoPDMTheme
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AvaliacaoPDMTheme {
                val navController = rememberNavController()

                NavHost(navController, startDestination = "formulario"
                ) {

                    composable("formulario") {
                        TelaFormulario(navController)
                    }

                    composable("login") {
                    TelaLogin(navController)
                    }

                    composable("telaPresente") {
                        TelaPresente(navController)
                    }
                }
            }
        }
    }
}




