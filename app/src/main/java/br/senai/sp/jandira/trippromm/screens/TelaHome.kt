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
import androidx.compose.foundation.lazy.items
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
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.trippromm.R
import br.senai.sp.jandira.trippromm.repository.CategoriaRepository
import br.senai.sp.jandira.trippromm.repository.ViagemRepository
import br.senai.sp.jandira.trippromm.ui.theme.TripprommTheme
import androidx.compose.foundation.lazy.LazyRow as LazyRow1

@Composable
fun TelaHome(controleDeNavegacao: NavHostController?){
    val viagens = ViagemRepository().listarTodasasViagens()
    val categorias = CategoriaRepository().listarTodasasCategorias()

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

            Image(
                painter = painterResource(id = R.drawable.imagem),
                contentScale = ContentScale.Crop,
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth()

            )
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Image(
                    painter = painterResource(id = R.drawable.user), contentDescription = "",
                    modifier = Modifier

                        .size(width = 100.dp, height = 80.dp)
                        .padding(14.dp)
                )
            }
            Text(
                text = "Susana Hoffs",
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
                Text(
                    text = "You're in Paris",
                    color = Color.White
                )
                Text(
                    text = "My Tripps",
                    modifier = Modifier
                        .offset(x = -120.dp, y = 20.dp),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

            }
        }

        Text(text = "Categories")
        LazyRow{

            items(categorias) {
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

                        Image(if (it.imagem == null) painterResource(id = R.drawable.no_image) else it.imagem!!, contentDescription = "",
                            modifier = Modifier
                                .width(40.dp)
                                .height(40.dp))
                        Text(text = "${it.title}")
                    }

                }
            }


            item(3) {
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


        OutlinedTextField(
            value = searchState.value, onValueChange = {
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
        Text(
            text = "Past Trips",
            modifier = Modifier
                .padding(12.dp)
        )

        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {
            items(viagens) {
                Card (
                    modifier = Modifier
                        .fillMaxWidth()

                        .padding(bottom = 4.dp)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Surface (
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {


                        }
                    }
                    Column(
                        modifier = Modifier
                            .padding(8.dp)
                    ) {
                        Image(if (it.image == null) painterResource(id = R.drawable.no_image) else it.image!!, contentDescription = "",
                            modifier = Modifier.height(180.dp)
                                .width(380.dp),
                            contentScale = ContentScale.Crop


                                )
                        Text(text = "${it.destine}, ${it.dataChegada.year}",
                            color = Color(0xFFCE00F1),
                            fontSize = 24.sp)
                        Text(text = it.descriptor)
                        Text(text = "${it.dataChegada.dayOfMonth} ${it.dataChegada.month.toString().substring(0..2)}",
                            color = Color(0xFFCE00F1))

                    }
                }
            }
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
            TelaHome(null)
        }
    }
}