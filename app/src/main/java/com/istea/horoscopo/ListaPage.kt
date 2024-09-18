package com.istea.horoscopo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.istea.horoscopo.ui.theme.HoroscopoTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ListaPage(navController: NavController? = null) {

    val signos = listOf (
        "aries",
        "tauro",
        "geminis",
        "cancer",
        "leo",
        "virgo",
        "libra",
        "piscis",
        "capricornio",
        "acuario",
        "sagitario",
        "escorpio"
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Lista de signos")
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary,
                )
            )
        }
    ) { paddingValues ->
        Column (modifier = Modifier.padding(paddingValues)) {
            Button(
                onClick = {
                    navController?.navigate(route = "detalle")
                }
            ) {
                Text("Navegar a la pantalla de detalle")
            }
            LazyColumn {
                items(items = signos) { signo ->
                    ItemDeSigno(signo = signo, modifier = Modifier.padding(20.dp))
                }
            }
        }
    }
}

@Composable
fun ItemDeSigno(signo: String, modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            contentColor = MaterialTheme.colorScheme.primary
        )

    ) {
        Row( modifier = Modifier.padding(10.dp)) {
            Image(
                painterResource(R.drawable.s001),
                contentDescription = signo
            )
            Column {
                Row {
                    Text(signo)
                    Spacer(modifier = Modifier.weight(1f))
                    Text("21/03 al 19/04")
                }
                Spacer(modifier = Modifier.height(10.dp))
                Text("akjsdh asdjkh askdjha sdkjash dakjhd akjsdha ksdhakjsdh askjdhaksdjha dhadkj hasdh ")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun previewItem(){
    ItemDeSigno("Libra")
}

//@Preview(showBackground = true)
//@Composable
//fun ListaPagePreview(){
//    HoroscopoTheme {
//        ListaPage()
//    }
//}