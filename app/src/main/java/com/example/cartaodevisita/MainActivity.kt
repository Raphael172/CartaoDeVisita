package com.example.cartaodevisita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
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
@Preview(showSystemUi = true)
@Composable
fun CartaoVisita() {
    Box {

        Image(
            painter = painterResource(id = R.drawable.roxoo),
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxSize()
        )

            Box {
                Image(
                    painter = painterResource(id = R.drawable.shinjii),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .padding(start = 115.dp)
                        .padding(top = 200.dp).padding()
                        .size(150.dp)
                        .clip(RoundedCornerShape(80.dp))
                        .border(3.dp, Color(113,31,140), CircleShape)
                )
                Image(
                    painter = painterResource(id = R.drawable.eva),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 50.dp)
                        .padding(start = 270.dp)
                        .size(190.dp)
                )
            }
                Image(
                    painter = painterResource(id = R.drawable.evaa),
                    contentDescription = null,
                    contentScale = ContentScale.Fit,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 450.dp)
                        .padding(end = 270.dp)
                        .size(190.dp)
                )
            Column(
                modifier = Modifier
                    .padding(top = 350.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {

                Text(
                    text = "Raphael Rodrigues",
                    fontSize = 45.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(44,140,31),
                )
                Text(
                    text = "Android Developer Depressive",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Black,
                    color = Color(44, 140,31),
                )
            }
                Column(
                    verticalArrangement = Arrangement.spacedBy(10.dp),
                    modifier = Modifier
                        .padding(start = 115.dp)
                        .padding(top = 660.dp)
                ) {
                    Contatos(text = "+55 (11)95206-2629",
                        id = R.drawable.zap)
                    Contatos(text = "@Rapha0riginal",
                        id = R.drawable.insta)
                    Contatos(text = "raphael.rb172@gmail.com",
                        id = R.drawable.gmail)
                }


    }
}
@Composable
fun Contatos(text:String, id:Int) {
    Row (
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Image(
            painter = painterResource(id = id),
            contentDescription = null,
            modifier = Modifier
                .size(25.dp)
                .clip(RoundedCornerShape(16.dp))
        )
        Text(
            text = text,
            color = Color(44,140,31),
            fontSize = 15.sp,
            fontWeight = FontWeight.Black
        )
    }
}