package br.senai.sp.jandira.trippromm.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.trippromm.R
import br.senai.sp.jandira.trippromm.ui.theme.TripprommTheme

@Composable
fun TelaSignUp(controleDeNavegacao: NavHostController) {
    var nomeState = remember {
        mutableStateOf("")
    }

    var foneState = remember {
        mutableStateOf("")
    }

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
        OutlinedTextField(value = nomeState.value, onValueChange = {
                          nomeState.value = it
        },
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
        OutlinedTextField(value = foneState.value, onValueChange = {
                               foneState.value = it
        },
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
        OutlinedTextField(value = mailState.value, onValueChange = {
                         mailState.value = it
        },
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
        OutlinedTextField(value = senhaState.value, onValueChange = {
                                senhaState.value = it
        },
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





    Text(text = "Already have an account?",
        modifier = Modifier
            .offset(x = 120.dp, y = 670.dp)
    )
    Text(text = "Sign In",
        modifier = Modifier
            .offset(x = 320.dp, y = 670.dp)
            .fillMaxWidth()
            .clickable {
                  controleDeNavegacao.navigate("login")
            },
        fontWeight = FontWeight.Bold,
        color = Color(0xFF9F35B6)

    )

    Box(modifier = Modifier
        .height(40.dp)
        .width(160.dp)
        .offset(x = 640.dp)
        .background(
            color = Color(0xFF9F35B6),
            shape = RoundedCornerShape(2.dp, bottomEnd = 16.dp)
        )
    )

}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TelaSignUpPreview() {
    TripprommTheme {
        //TelaSignUp(controleDeNavegacao)
    }
}