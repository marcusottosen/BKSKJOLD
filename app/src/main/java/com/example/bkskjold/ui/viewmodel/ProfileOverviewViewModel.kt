package com.example.bkskjold.ui.viewmodel;


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import com.example.bkskjold.data.model.ProfileInfo;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.dp
import com.example.bkskjold.data.model.CurrentUser
import com.example.bkskjold.data.model.User
import com.example.bkskjold.data.model.events
import com.example.bkskjold.data.util.getDate
import com.example.bkskjold.data.util.getMonth
import com.example.bkskjold.data.util.getWeekDay
import com.example.bkskjold.data.util.getYear
import com.example.bkskjold.ui.view.reusables.EventsCard
import com.example.bkskjold.ui.view.reusables.InvitationCard
import java.text.SimpleDateFormat

class ProfileOverviewViewModel {
    var profile = ProfileInfo().testProfile

    @Composable
    fun GetProfileView() {
        Column(modifier = Modifier.padding(start = 45.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Text(text = "Medlemsskab: ${translateMemberType(CurrentUser.userType)}")
            Text(text = "Træninger gennemført: ${CurrentUser.finishedTrainings}")
            Text(text = "Medlem siden: ${getDate(CurrentUser.memberSince)} - ${getYear(CurrentUser.memberSince)}")
            Text(text = "Tilmeldt hold: ${CurrentUser.team}")
        }
    }

    @Preview
    @Composable
    fun getPersonView() {
        Text(text = profile[4])
        Text(text = profile[5])
        Text(text = profile[6])

    }
    @Preview
    @Composable
    fun getProfileInvitationView() {
        var numberOfItems = events.size

        LazyColumn(){
            items(numberOfItems) { i ->
                InvitationCard(name = events[i].header, date = events[i].timeStart.toString(), location = events[i].location)

            }
        }
    }

    fun translateMemberType(type: Int): String{
        val translated = when(type){
            1 -> "Gæstebruger"
            2 -> "Standard medlem - 99 kr./md."
            3 -> "Træner"
            else -> {"Brugertype ikke fundet"}
        }
        return translated
    }
}

