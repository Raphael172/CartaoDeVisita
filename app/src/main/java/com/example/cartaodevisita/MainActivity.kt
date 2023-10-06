package com.example.cartaodevisita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartaodevisita.ui.theme.CartaoDeVisitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaoDeVisitaTheme {
                CartaoVisita()
                }
            }
        }
    }
@Preview(showSystemUi = true, showBackground = true, backgroundColor = 567)
@Composable
fun CartaoVisita() {
    Box {

        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 190.dp)
                .size(150.dp)
                .clip(RoundedCornerShape(16.dp)),
        )
                Box {
                Image(
                    painter = painterResource(id = R.drawable.insta),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 685.dp)
                        .padding(end = 185.dp)
                        .size(18.dp)
                        .clip(RoundedCornerShape(16.dp))
                )
            }
        Box {
            Image(
                painter = painterResource(id = R.drawable.zap),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 652.dp)
                    .padding(end = 185.dp)
                    .size(18.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
        }
        Box {
            Image(
                painter = painterResource(id = R.drawable.gmail),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 715.dp)
                    .padding(end = 185.dp)
                    .size(18.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally


        ) {

            Text(
                text = "Raphael Rodrigues",
                fontSize = 45.sp,
                fontWeight = FontWeight.Light,
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 330.dp)
            )

            Text(
                text = "Android Developer Extraordinaire",
                fontSize = 15.sp,
                fontWeight = FontWeight.Black,
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 0.dp)
            )
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Text(
                    text = "   +55 (11)95206-2629 ",
                    fontSize = 17.sp,
                    fontWeight = FontWeight.Black,
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 150.dp)
                )
                Contatos(text = "@Rapha0riginal", Color.Black)
                Contatos(text = "                    raphael.rb172@gmail.com", Color.Black)
            }
        }
    }
}

    @Composable
    fun Contatos(text: String, color: Color) {

        Text(
            text = text,
            fontSize = 17.sp,
            color = color,
            fontWeight = FontWeight.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
                .padding(end = 30.dp)
        )
    }
