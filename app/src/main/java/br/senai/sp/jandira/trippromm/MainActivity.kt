package br.senai.sp.jandira.trippromm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BeachAccess
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Landscape
import androidx.compose.material.icons.filled.LocalFlorist
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Snowboarding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.trippromm.ui.theme.TripprommTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TripprommTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
 Column(
     Modifier.fillMaxHeight()
 ) {

Row (
modifier = Modifier
    .fillMaxWidth(),
    horizontalArrangement = Arrangement.End

)
{

    Box(
        modifier = Modifier
            .height(60.dp)
            .width(160.dp)
            .background(
                Color(0xFF9F35B6),
                shape = RoundedCornerShape(2.dp, bottomStart = 16.dp)
            )
        )
}
    Box(
        modifier = Modifier
            .height(300.dp)
            .width(200.dp)
            .offset(x = 10.dp, y = 120.dp)


    ) {
      Text(
          text = "Login",
           fontWeight = FontWeight.Bold,
          fontSize = 56.sp,
          color = Color(0xFF9F35B6)

          )
      Text(
          text = "Please sign in to coninue.",
          modifier = Modifier
              .offset(x = 0.dp, y = 70.dp),
          color = Color(0xFF999999)

          )
    }
    Box(
        modifier = Modifier
            .height(230.dp)
            .width(400.dp)


    )
    {
Text(text = "")


    OutlinedTextField(
        value = "", onValueChange = {},
        Modifier
            .width(370.dp)
            .height(60.dp)
            .offset(x = 10.dp, y = -20.dp),
        colors = OutlinedTextFieldDefaults
            .colors(
                unfocusedBorderColor = Color(0xFF9F35B6),
                unfocusedContainerColor = Color(0xFFFFFFFF),
                unfocusedLeadingIconColor =  Color(0xFF9F35B6)
            ),
        leadingIcon = {
            Icon(
                imageVector = Icons.Filled.Email,
                contentDescription = null,

            )
        },
        placeholder = {

            Text(text = "Email")

        }


    )
OutlinedTextField(value = "", onValueChange = {},
    modifier = Modifier
        .height(60.dp)
        .width(370.dp)
        .offset(x = 10.dp, y = 70.dp),

    colors = OutlinedTextFieldDefaults
        .colors(
            unfocusedBorderColor = Color(0xFF9F35B6),
            unfocusedContainerColor = Color(0xFFFFFFFF),
            unfocusedLeadingIconColor =  Color(0xFF9F35B6)
        ),
    leadingIcon = {
        Icon(
            imageVector = Icons.Filled.Lock,
            contentDescription = null,

            )
    },
    placeholder = {

        Text(text = "Password")

    }

)
        Button(onClick = { /*TODO*/ },
          modifier = Modifier
              .height(70.dp)
              .width(150.dp)
              .offset(x = 240.dp, y = 150.dp),
            colors = ButtonDefaults.buttonColors(
        containerColor = Color(0xFF9F35B6),
                contentColor =  Color(0xFFFFFFFF)
            ),
        ) {


            Text(text = "SIGN IN")
            Image(painter =
            painterResource(id = R.drawable.seta_direita),
                contentDescription = "", modifier = Modifier
                    .width(20.dp)
                    .offset(x = 10.dp),
            )
        
        }


    }

     Row(
modifier = Modifier
    .height(250.dp)
    .fillMaxWidth()
     ) {
         Box(modifier = Modifier
             .height(60.dp)
             .width(160.dp)
             .offset(x = 0.dp, y = 130.dp)
             .background(
                 Color(0xFF9F35B6),
                 shape = RoundedCornerShape(2.dp, topEnd = 16.dp)
             )

         )
         Text(text = "Don't have on account?",
             modifier = Modifier
                 .offset(x = -30.dp))
         Text(text = "Sing Up ",
             modifier = Modifier
                 .height(50.dp)
                 .fillMaxWidth()
                 .offset(x = -20.dp),
             color = Color(0xFF9F35B6),
             fontWeight = FontWeight.Bold
         )
     }



   }

 }

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TripprommTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Greeting()
        }
    }
}

@Composable
fun TelaSignUp() {
    Column(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Box(modifier = Modifier
            .height(40.dp)
            .width(160.dp)
            .offset(x = 240.dp)
            .background(
                color = Color(0xFF9F35B6),
                shape = RoundedCornerShape(2.dp, bottomStart = 16.dp)
            )
        )
    }
    Box(modifier = Modifier
        .height(100.dp)
        .width(300.dp)
        .offset(x = 30.dp, y = 60.dp)


    ) {
        Text(text = "Sign Up",
            fontSize = 42.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF9F35B6),
            modifier = Modifier
                .offset(x = 85.dp,y = 0.dp )

        )
        Text(text = "Create a new account",
            modifier = Modifier
                .offset(x = 85.dp,y = 60.dp),
            color = Color(0xFFA3A3A3)


        )

    }
Box(modifier = Modifier


) {
   Image(
        painter =
        painterResource(id = R.drawable.circulo), contentDescription = "",
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .offset(x = 0.dp, y = 160.dp)

    )
    Image(
        painter = painterResource(id = R.drawable.profile),  contentDescription = "",
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .offset(x = 0.dp, y = 165.dp)



        )
    Image(painter = painterResource(id = R.drawable.camera), contentDescription = "",
        modifier = Modifier
            .height(100.dp)
            .width(30.dp)
            .offset(x = 210.dp, y = 180.dp)

        )
}

    Column(modifier = Modifier) {
        OutlinedTextField(value = "", onValueChange = {},
            modifier = Modifier
                .height(60.dp)
                .width(370.dp)
                .offset(x = 10.dp, y = 240.dp),

            colors = OutlinedTextFieldDefaults
                .colors(
                    unfocusedBorderColor = Color(0xFF9F35B6),
                    unfocusedContainerColor = Color(0xFFFFFFFF),
                    unfocusedLeadingIconColor =  Color(0xFF9F35B6)
                ),
            label = {
                Text(text = "User")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Person,
                    contentDescription = null,

                    )

            }
        )
        OutlinedTextField(value = "", onValueChange = {},
            modifier = Modifier
                .height(60.dp)
                .width(370.dp)
                .offset(x = 10.dp, y = 260.dp),

            colors = OutlinedTextFieldDefaults
                .colors(
                    unfocusedBorderColor = Color(0xFF9F35B6),
                    unfocusedContainerColor = Color(0xFFFFFFFF),
                    unfocusedLeadingIconColor =  Color(0xFF9F35B6)
                ),
            label = {
                Text(text = "Phone")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Phone,
                    contentDescription = null,

                    )

            }
        )
        OutlinedTextField(value = "", onValueChange = {},
            modifier = Modifier
                .height(60.dp)
                .width(370.dp)
                .offset(x = 10.dp, y = 280.dp),

            colors = OutlinedTextFieldDefaults
                .colors(
                    unfocusedBorderColor = Color(0xFF9F35B6),
                    unfocusedContainerColor = Color(0xFFFFFFFF),
                    unfocusedLeadingIconColor =  Color(0xFF9F35B6)
                ),
            label = {
                Text(text = "Email")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Email,
                    contentDescription = null,

                    )

            }
        )
        OutlinedTextField(value = "", onValueChange = {},
            modifier = Modifier
                .height(60.dp)
                .width(370.dp)
                .offset(x = 10.dp, y = 300.dp),

            colors = OutlinedTextFieldDefaults
                .colors(
                    unfocusedBorderColor = Color(0xFF9F35B6),
                    unfocusedContainerColor = Color(0xFFFFFFFF),
                    unfocusedLeadingIconColor =  Color(0xFF9F35B6)
                ),
            label = {
                Text(text = "Password")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Filled.Lock,
                    contentDescription = null,

                    )

            }
        )
        Checkbox(checked = false, onCheckedChange = {},
            modifier = Modifier
                .offset(x = 0.dp, y = 295.dp))
        Text(text = "Over 18?",
            modifier = Modifier.offset(x = 40.dp, y = 260.dp))


    }
    Button(onClick = { /*TODO*/ },
        modifier = Modifier
            .height(70.dp)
            .width(380.dp)
            .offset(x = 6.dp, y = 580.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF9F35B6),
            contentColor =  Color(0xFFFFFFFF)
        )

    )

    {

        Row {
            Text(text = "Create Account",
            fontWeight = FontWeight.Bold,
                fontSize = 20.sp

                )

        }

    }

    Text(text = "Already have an account?",
        modifier = Modifier
            .offset(x = 120.dp, y = 670.dp)
        )
    Text(text = "Sign In",
        modifier = Modifier
            .offset(x = 320.dp, y = 670.dp)
            .fillMaxWidth(),
        fontWeight = FontWeight.Bold,
        color = Color(0xFF9F35B6)

    )
    Box(modifier = Modifier
        .height(40.dp)
        .width(160.dp)
        .offset(y = 740.dp)
        .background(
            color = Color(0xFF9F35B6),
            shape = RoundedCornerShape(2.dp, topEnd = 16.dp)
        )
    )


}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaSignUpPreview() {
    TripprommTheme {
        TelaSignUp()
    }
}

@Composable
fun TelaHome(){

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
                        Icon(Icons.Default.Landscape, "",
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
        OutlinedTextField(value = "", onValueChange = {},
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
            TelaHome()
        }
    }
}