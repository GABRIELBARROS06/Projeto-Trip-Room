package br.senai.sp.jandira.trippromm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.trippromm.screens.TelaHome
import br.senai.sp.jandira.trippromm.screens.TelaLogin
import br.senai.sp.jandira.trippromm.screens.TelaSignUp
import br.senai.sp.jandira.trippromm.ui.theme.TripprommTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TripprommTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val controleDeNavegacao = rememberNavController()
                    NavHost(
                        navController = controleDeNavegacao,
                        startDestination = "login"
                    ) {
                        composable(route = "login") { TelaLogin(controleDeNavegacao) }
                        composable(route = "home") { TelaHome(controleDeNavegacao) }
                        composable(route = "signup"){ TelaSignUp(controleDeNavegacao) }
                    }
                }
            }
        }
    }
}

