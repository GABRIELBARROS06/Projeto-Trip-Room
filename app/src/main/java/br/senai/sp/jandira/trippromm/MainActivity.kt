package br.senai.sp.jandira.trippromm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.expandHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.trippromm.ui.theme.TripprommTheme

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
 Column {

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
                unfocusedContainerColor = Color(0xFFFFFFFF)
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
            unfocusedContainerColor = Color(0xFFFFFFFF)
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
        }

    }
     Row {
         Text(text = "Don’t have an account?",
         Modifier.offset(x = 135.dp))
         Text(text = "Sign up",
             Modifier.offset(x = 140.dp),
             fontWeight = FontWeight.Bold,
             color = Color(0xFF9F35B6)

             )
     }



   }

 }

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    TripprommTheme {
Greeting()
    }
}