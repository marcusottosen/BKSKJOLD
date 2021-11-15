package com.example.bkskjold.ui.viewmodel

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.bkskjold.data.model.EventData
import com.example.bkskjold.ui.view.reusables.EventsCard

open class EventOverviewViewModel {
    @Preview
    @Composable
    fun getEventsView() {
        var events = EventData().getEvents()
        var numberOfItems = events.size

        LazyColumn(){
            items(numberOfItems) { i ->
                EventsCard(header = events[i][0], description = events[i][1], time = events[i][2], location = events[i][3])

            }
        }
    }
}