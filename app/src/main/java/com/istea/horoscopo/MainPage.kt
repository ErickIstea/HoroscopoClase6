package com.istea.horoscopo

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.istea.horoscopo.ui.theme.HoroscopoTheme

@Composable
fun MainPage() {

    val navController = rememberNavController()
    NavHost (
        navController = navController,
        startDestination = "lista"
    ) {
        composable(route = "lista") { ListaPage(navController = navController) }
        composable(route = "detalle") { DetallePage("hola jojo") }
    }

}

@Preview(showBackground = true)
@Composable
fun MainPagePreview() {
    HoroscopoTheme {
        MainPage()
    }
}