package br.senai.sp.jandira.trippromm.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Snowboarding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.trippromm.R
import br.senai.sp.jandira.trippromm.ui.theme.TripprommTheme

@Composable
fun TelaHome(controleDeNavegacao: NavHostController){

     var searchState = remember {
         mutableStateOf("")
     }

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xC8FFFFFF)),
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)

        ) {

            Image(painter = painterResource(id = R.drawable.imagem), contentScale = ContentScale.Crop,contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()

            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Image(painter = painterResource(id = R.drawable.user), contentDescription = "",
                    modifier = Modifier

                        .size(width = 100.dp, height = 80.dp)
                        .padding(14.dp)
                )
            }
            Text(text = "Susana Hoffs",
                modifier = Modifier
                    .offset(x = 295.dp, y = 65.dp),
                color = Color.White,
                fontSize = 14.sp
            )

            Row(
                modifier = Modifier
                    .fillMaxHeight()
                    .offset(y = 45.dp),
                verticalAlignment = Alignment.CenterVertically


            )
            {
                Icon(
                    imageVector = Icons.Default.LocationOn, contentDescription = "",
                    Modifier
                        .offset(x = 5.dp)
                        .width(20.dp),


                    )
                Text(text = "You're in Paris",
                    color = Color.White)
                Text(text = "My Tripps",
                    modifier = Modifier
                        .offset(x = -120.dp, y = 20.dp),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White)

            }
        }

        Text(text = "Categories")
        LazyRow{

            item(1){
                Card(
                    modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)
                        .padding(6.dp),

                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color(0xFFCE00F1),
                            contentColor = Color(0xFFFFFFFFF)

                        )


                )

                {
                    Column(
                        Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,

                        ) {
                        Icon(
                            Icons.Default.Landscape, "",
                        )
                        Text(text = "Mountain")
                    }

                }
            }

            item(2){
                Card(
                    modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)
                        .padding(6.dp),
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color(0xFFD992E6),
                            contentColor = Color(0xFFFFFFFFF)
                        )
                ) {
                    Column(
                        Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(Icons.Default.Snowboarding, "")
                        Text(text = "Snow")
                    }
                }
            }
            item(3){
                Card(
                    modifier = Modifier
                        .height(100.dp)
                        .width(150.dp)
                        .padding(6.dp),
                    colors = CardDefaults
                        .cardColors(
                            containerColor = Color(0xFFD992E6),
                            contentColor = Color(0xFFFFFFFFF)
                        )
                ) {
                    Column(
                        Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(Icons.Default.BeachAccess, "")
                        Text(text = "Beach")
                    }
                }
            }

        }
        OutlinedTextField(value = searchState.value, onValueChange = {
                               searchState.value = it
        },
            modifier = Modifier
                .padding(start = 24.dp, top = 8.dp)
                .width(350.dp),

            label = {
                Text(text = "Search your destiny")
            },
            colors = OutlinedTextFieldDefaults.colors(
                focusedContainerColor = Color(0xFFFFFFFF),
                unfocusedBorderColor = Color(0xF2EBDFDF)

            ),
            trailingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint = Color.Black
                    )
                }
            },
            shape = RoundedCornerShape(16.dp)
        )
        Text(text = "Past Trips",
            modifier = Modifier
                .padding(12.dp))
        LazyColumn{
            item(1){
                Card(
                    modifier = Modifier
                        .width(400.dp)
                        .height(300.dp)
                        .background(Color(0xF7DBDBDB))
                ) {
                    Column {
                        Image(
                            painter = painterResource(id = R.drawable.imagem1), contentDescription = "",
                            modifier = Modifier
                                .width(380.dp)
                                .height(280.dp)
                                .padding(10.dp, bottom = 125.dp)

                        )
                        Text(
                            text = "London, 2019",
                            fontSize = 16.sp,
                            modifier = Modifier
                                .offset(x = 10.dp, y = -130.dp),
                            color = Color(0xFFCE00F1)
                        )
                    }
                    Text(text = "London is the capital and largest city of  the United Kingdom, with a population of just under 9 million.",
                        modifier = Modifier.offset(x = 0.dp, y = 100.dp))

                }
            }
        }

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .padding(top = 10.dp)
        ) {

        }

    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaHomePreview(){
    TripprommTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            //TelaHome(controleDeNavegacao)
        }
    }
}