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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.R
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.trippromm.ui.theme.TripprommTheme

@Composable
fun TelaLogin(controleDeNavegacao: NavHostController) {
    var mailState = remember {
       mutableStateOf("")
    }
    var senhaState = remember {
        mutableStateOf("")
    }

    var errorState = remember {
        mutableStateOf(false)
    }
    var mensagemErrorState = remember {
       mutableStateOf("")
    }

    val contexto = LocalContext.current

    Column(
        Modifier.fillMaxHeight()
    ) {

        Row(
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
                        shape = RoundedCornerShape(
                            2.dp,
                            bottomStart = 16.dp
                        )
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


            OutlinedTextField(
                value = mailState.value, onValueChange = {
                    mailState.value = it
                },
                modifier = Modifier
                    .width(370.dp)
                    .height(60.dp)
                    .offset(x = 10.dp, y = -20.dp),
                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(
                            0xFF9F35B6
                        ),
                        unfocusedContainerColor = Color(
                            0xFFFFFFFF
                        ),
                        unfocusedLeadingIconColor = Color(
                            0xFF9F35B6
                        )
                    ),
                leadingIcon = {
                   Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = null,

                        )
                },
                placeholder = {

                   Text(text = "Email")

                },
                        isError = errorState.value


            )

            OutlinedTextField(
                value = senhaState.value, onValueChange = {
                    senhaState.value = it
                },
                keyboardOptions = KeyboardOptions
                    (
                    keyboardType =KeyboardType.NumberPassword,
                    capitalization = KeyboardCapitalization.Characters
                ),
                visualTransformation = PasswordVisualTransformation(),


                modifier = Modifier
                    .height(60.dp)
                    .width(370.dp)
                    .offset(x = 10.dp, y = 70.dp),

                colors = OutlinedTextFieldDefaults
                    .colors(
                        unfocusedBorderColor = Color(0xFF9F35B6),
                        unfocusedContainerColor = Color(0xFFFFFFFF),
                        unfocusedLeadingIconColor = Color(0xFF9F35B6)
                    ),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Lock,
                        contentDescription = null,

                        )
                },
                placeholder = {

                    Text(text = "Password")

                },
                isError = errorState.value

            )
            Button(
                onClick = {
                    if (mailState.value == "aluno" && senhaState.value == "1234") {
                        controleDeNavegacao.navigate("home")
                    } else {
                        errorState.value = true
                        mensagemErrorState.value = "Usuario ou senha não encontrados"
                    }
                },
                modifier = Modifier
                    .height(70.dp)
                    .width(150.dp)
                    .offset(x = 240.dp, y = 150.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF9F35B6),
                    contentColor = Color(0xFFFFFFFF)
                ),
            ) {


                Text(text = "SIGN IN")
                Image(
                    painter =
                    painterResource(id = br.senai.sp.jandira.trippromm.R.drawable.seta_direita),
                    contentDescription = "",
                    modifier = Modifier
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
            Box(
                modifier = Modifier
                    .height(60.dp)
                    .width(160.dp)
                    .offset(x = 0.dp, y = 130.dp)
                    .background(
                        Color(0xFF9F35B6),
                        shape = RoundedCornerShape(2.dp, topEnd = 16.dp)
                    )

            )
            Text(
                text = "Don't have on account?",
                modifier = Modifier
                    .offset(x = -30.dp)
            )
            Text(
                text = "Sing Up ",
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
fun TelaLoginPreview() {
    TripprommTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
           //TelaLogin(controleDeNavegacao)
        }
    }
}