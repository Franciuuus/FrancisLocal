package com.example.tarea

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tarea.ui.theme.TareaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TareaTheme {
                Surface {
                    Modifier.fillMaxSize()
                    MaterialTheme.colorScheme.background
                    PhotoCard()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PhotoCard() {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ElevatedCard(
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant
            ),
            modifier = Modifier
                .size(width = 600.dp, height = 400.dp)
        ) {
            Row(
                Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.pollo),
                    contentDescription = "Pollo",
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically),
                    contentScale = ContentScale.Crop
                )

                Text(
                    text = "Pollito Pio",
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .align(Alignment.CenterVertically),
                    textAlign = TextAlign.Left
                )
            }
        }

        ElevatedCard(
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.surfaceVariant
            ),
            modifier = Modifier
                .size(width = 600.dp, height = 400.dp)
        ) {
            Row(
                Modifier
                    .fillMaxSize()
                    .padding(16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.pollo),
                    contentDescription = "Pollo",
                    modifier = Modifier
                        .weight(1f)
                        .align(Alignment.CenterVertically),
                    contentScale = ContentScale.Crop
                )

                Text(
                    text = "Pollitito",
                    modifier = Modifier
                        .padding(start = 16.dp)
                        .align(Alignment.CenterVertically),
                    textAlign = TextAlign.Left
                )
            }
        }
    }
}
