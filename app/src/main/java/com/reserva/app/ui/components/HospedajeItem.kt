package com.reserva.app.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.reserva.app.R
import com.reserva.app.ui.model.Hospedaje

@Composable
fun HospedajeItem(
    hospedaje: Hospedaje
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = colorResource(R.color.white))
            .padding(vertical = 8.dp)
    ) {
        Text(
            text = hospedaje.estado,
            color = if (hospedaje.estado == "Disponible") colorResource(R.color.teal_700) else Color.Red,
            style = MaterialTheme.typography.labelMedium,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = hospedaje.nombre,
            style = MaterialTheme.typography.titleMedium,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = hospedaje.ubicacion,
            style = MaterialTheme.typography.bodySmall,
            color = Color.Gray
        )


        Text(
            text = hospedaje.descripcion,
            style = MaterialTheme.typography.bodyMedium
        )


        HorizontalDivider(color = Color.LightGray)
    }
}