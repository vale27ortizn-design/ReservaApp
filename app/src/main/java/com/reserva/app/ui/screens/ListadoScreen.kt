package com.reserva.app.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.reserva.app.ui.components.HospedajeItem
import com.reserva.app.ui.model.hospedajesDemo
import com.reserva.app.R

@Composable
fun ListadoScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize()
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize()
                .background(color = colorResource(R.color.white)),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(hospedajesDemo) { hospedaje ->
                HospedajeItem(hospedaje = hospedaje)
            }
        }
    }
}