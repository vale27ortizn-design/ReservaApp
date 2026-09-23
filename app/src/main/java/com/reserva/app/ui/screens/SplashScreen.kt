package com.reserva.app.ui.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.reserva.app.R
import com.reserva.app.ui.theme.ReservaAppTheme

@Composable
fun SplashScreen(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = colorResource(R.color.teal_200)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            modifier = Modifier
                .fillMaxSize()
                .padding(64.dp),
            painter = painterResource(R.drawable.ic_location),
            contentDescription = null,
            tint = colorResource(R.color.white),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SplashScreenPerview() {
    ReservaAppTheme  {
        SplashScreen()
    }
}
