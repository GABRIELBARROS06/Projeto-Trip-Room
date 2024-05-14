package br.senai.sp.jandira.trippromm.repository


import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.trippromm.R
import br.senai.sp.jandira.trippromm.dao.TripRoomDb
import br.senai.sp.jandira.trippromm.model.Viagem
import java.time.LocalDate
import android.content.Context

class ViagemRepository{


    @Composable
    fun listarTodasasViagens(): List<Viagem> {
        // Viagem Londres = new Viagem();
        val londres = Viagem()
        londres.id = 1
        londres.destine = "Londres"
        londres.descriptor = "Londres, capital da Inglaterra e do Reino Unido, " +
                "é uma cidade do século 21 com uma história que remonta à era romana."
        londres.dataChegada = LocalDate.of(2019, 2, 21)
        londres.dataPartida = LocalDate.of(2019, 2, 21)
        londres.image = painterResource(id = R.drawable.imagem)


        val porto = Viagem()
        porto.id = 2
        porto.destine = "Porto"
        porto.descriptor = "O Porto é uma cidade portuguesa" +
                " e capital da sub-região da Área Metropolitana do Porto e da região do Norte," +
                " pertencendo ao distrito do Porto."
        porto.dataChegada = LocalDate.of(2019, 2, 21)
        porto.dataPartida = LocalDate.of(2019, 2, 21)
        porto.image = null

        val amsterda = Viagem()
        amsterda.id = 3
        amsterda.destine = "Amsterdã"
        amsterda.descriptor =
            "Amsterdã é a capital da Holanda, conhecida por seu patrimônio artístico," +
                    " um elaborado sistema de canais e casas estreitas com telhados de duas águas,"
        amsterda.dataChegada = LocalDate.of(2019, 2, 21)
        amsterda.dataPartida = LocalDate.of(2019, 2, 21)
        amsterda.image = painterResource(id = R.drawable.amster)


        val barcelona = Viagem()
        barcelona.id = 4
        barcelona.destine = "Barcelona"
        barcelona.descriptor = "Barcelona (em catalão: AFI: /bərsəˈɫonə/; " +
                "" +
                "em castelhano: AFI: /barθeˈlona/) é a capital da comunidade autônoma da Catalunha," +
                " Espanha, bem como o segundo município mais populoso do país, " +
                "com uma população de 1,6 milhão dentro dos limites da cidade."
        barcelona.dataChegada = LocalDate.of(2019, 2, 21)
        barcelona.dataPartida = LocalDate.of(2019, 2, 21)
        barcelona.image = null

        val milao = Viagem()
        milao.id = 5
        milao.destine = "Milao"
        milao.descriptor = "Milão, uma metrópole na região da Lombardia ao norte da Itália," +
                " é uma capital mundial da moda e do design."
        milao.dataChegada = LocalDate.of(2021, 4, 21)
        milao.dataPartida = LocalDate.of(2019, 2, 21)
        milao.image = painterResource(id = R.drawable.milao)


        return listOf(londres, porto, amsterda, barcelona, milao)





        }


    }
