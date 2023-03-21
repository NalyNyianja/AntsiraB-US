package com.example.antsirabus

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ListBus() {
    Column(
        modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Image(
            painter = painterResource(id = R.drawable.bus2),
            contentDescription = "",
            modifier = Modifier
                .size(400.dp)
                .clip(CircleShape)
        )

        Image(
            painter = painterResource(id = R.drawable.bus3),
            contentDescription = "",
            modifier = Modifier
                .size(400.dp)
                .clip(CircleShape)
        )

        Image(
            painter = painterResource(id = R.drawable.bus4),
            contentDescription = "",
            modifier = Modifier
                .size(400.dp)
                .clip(CircleShape)
        )

        Image(
            painter = painterResource(id = R.drawable.bus5),
            contentDescription = "",
            modifier = Modifier
                .size(400.dp)
                .clip(CircleShape)
        )

        Image(
            painter = painterResource(id = R.drawable.bus10),
            contentDescription = "",
            modifier = Modifier
                .size(400.dp)
                .clip(CircleShape)
        )

        Image(
            painter = painterResource(id = R.drawable.bus11),
            contentDescription = "",
            modifier = Modifier
                .size(400.dp)
                .clip(CircleShape)
        )

        Image(
            painter = painterResource(id = R.drawable.bus12),
            contentDescription = "",
            modifier = Modifier
                .size(400.dp)
                .clip(CircleShape)
        )

        Image(
            painter = painterResource(id = R.drawable.bus13),
            contentDescription = "",
            modifier = Modifier
                .size(400.dp)
                .clip(CircleShape)
        )

        Image(
            painter = painterResource(id = R.drawable.bus14),
            contentDescription = "",
            modifier = Modifier
                .size(400.dp)
                .clip(CircleShape)
        )

        Image(
            painter = painterResource(id = R.drawable.bus16),
            contentDescription = "",
            modifier = Modifier
                .size(400.dp)
                .clip(CircleShape)
        )

        Image(
            painter = painterResource(id = R.drawable.bus17),
            contentDescription = "",
            modifier = Modifier
                .size(400.dp)
                .clip(CircleShape)
        )

        Image(
            painter = painterResource(id = R.drawable.bus18),
            contentDescription = "",
            modifier = Modifier
                .size(400.dp)
                .clip(CircleShape)
        )

        Image(
            painter = painterResource(id = R.drawable.bus19),
            contentDescription = "",
            modifier = Modifier
                .size(400.dp)
                .clip(CircleShape)
        )

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview(){
    Surface(Modifier.fillMaxSize()){
        ListBus()
    }
}
