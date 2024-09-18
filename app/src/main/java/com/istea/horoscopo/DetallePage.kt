package com.istea.horoscopo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
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
import com.istea.horoscopo.ui.theme.HoroscopoTheme
import kotlin.math.sign

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetallePage(signo:String=""){

    Scaffold (
        topBar = {
            TopAppBar(
                title = { Text("Detalle del signo") },
                colors = TopAppBarDefaults.topAppBarColors(
                    titleContentColor = MaterialTheme.colorScheme.primary,
                    containerColor = MaterialTheme.colorScheme.primaryContainer
                )
            )
        }
    ) {
        Column(modifier = Modifier.padding(it)) {
            Text( text = signo)
            Image(
                painterResource(R.drawable.i001),
                contentDescription = signo
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetallePreview(){
    HoroscopoTheme {
        DetallePage("Leo")
    }
}

@Preview(showBackground = true)
@Composable
fun DetallePreview2(){
    HoroscopoTheme {
        DetallePage("Aries")
    }
}