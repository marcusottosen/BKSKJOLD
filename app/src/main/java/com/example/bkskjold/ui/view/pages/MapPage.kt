package com.example.bkskjold.ui.view.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.rememberTransformableState
import androidx.compose.foundation.gestures.transformable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bkskjold.R

@Composable
fun MapPage() {

    val map = painterResource(id = R.drawable.banekort)
    var scale by remember { mutableStateOf(1f) }
    var rotation by remember { mutableStateOf(0f) }
    var offset by remember { mutableStateOf(Offset.Zero) }
    val state = rememberTransformableState { zoomChange, offsetChange, rotationChange ->
        scale *= zoomChange
        rotation += rotationChange
        offset += offsetChange
    }

    Row(modifier = Modifier.padding(10.dp), horizontalArrangement = Arrangement.Start) {
        IconButton(onClick = { /*TODO*/ }) {
            Icon(
                imageVector = Icons.Filled.ArrowBack,
                contentDescription = null
            )

        }
    }
    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(1.0f)
            .background(Color.Transparent)
    )
    {
        item {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(24.dp)
            ) {
                Text(
                    text = "FS Banekort: Efterår 2021 - tfr",
                    color = Color.Black,
                    fontSize = 18.sp
                )
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .padding(24.dp)
                        .border(2.dp, Color.Black, RectangleShape)
                        .fillMaxWidth()
                        .background(colorResource(id = R.color.primary))

                ) {


                    Image(
                        painter = map,
                        contentDescription = null,
                        modifier = Modifier
                            .clip(RectangleShape)
                            .graphicsLayer(
                                scaleX = scale,
                                scaleY = scale,
                                rotationZ = rotation,
                                translationX = offset.x,
                                translationY = offset.y
                            )
                            .transformable(state = state)

                    )

                }

                Text(
                    text = "OBS Banerne er flyttet grundet Corona testcenteret - telte og adgangsveje på Blegdamsfælleden.",
                    color = Color.Red,
                    fontSize = 12.sp
                )

            }
        }
    }
}