package com.example.bkskjold.data.model

class EventData {
    /*
    TODO data should be fetched from a database.
    */
    val event1 = listOf("hygge i klubhuset", "Kom og hyg i klubuset!! Der vil være pølsehorn og sodavand til de små, samt øl og vin de forældrene.", "29/09 kl. 13:00", "Klubhuset")
    val event2 = listOf("Klubmøde", "Vi skal snakke om klubben", "05/12 kl. 21:00", "Klubhuset")
    val event3 = listOf("Junior kamp", "Juniorerne skal spille kamp mod Ballerup. Kom og se med!", "23/11 kl. 15:30", "Bane C")
    val event4 = listOf("Senior kamp", "Kom og se os tæske Lyngby Boldklub", "28/11 kl. 21:00", "Bane A")
    val event5 = listOf("hygge i klubhuset", "Kom og hyg i klubuset!! Der vil være pølsehorn og sodavand til de små, samt øl og vin de forældrene.", "29/09 kl. 13:00", "Klubhuset")
    val event6 = listOf("hygge i klubhuset", "Kom og hyg i klubuset!! Der vil være pølsehorn og sodavand til de små, samt øl og vin de forældrene.", "29/09 kl. 13:00", "Klubhuset")
    val event7 = listOf("hygge i klubhuset", "Kom og hyg i klubuset!! Der vil være pølsehorn og sodavand til de små, samt øl og vin de forældrene.", "29/09 kl. 13:00", "Klubhuset")
    val event8 = listOf("hygge i klubhuset", "Kom og hyg i klubuset!! Der vil være pølsehorn og sodavand til de små, samt øl og vin de forældrene.", "29/09 kl. 13:00", "Klubhuset")
    val event9 = listOf("hygge i klubhuset", "Kom og hyg i klubuset!! Der vil være pølsehorn og sodavand til de små, samt øl og vin de forældrene.", "29/09 kl. 13:00", "Klubhuset")
    val event10 = listOf("hygge i klubhuset", "Kom og hyg i klubuset!! Der vil være pølsehorn og sodavand til de små, samt øl og vin de forældrene.", "29/09 kl. 13:00", "Klubhuset")
    val event11 = listOf("hygge i klubhuset", "Kom og hyg i klubuset!! Der vil være pølsehorn og sodavand til de små, samt øl og vin de forældrene.", "29/09 kl. 13:00", "Klubhuset")

    private val events = listOf(event1, event2, event3, event4, event5, event6, event7, event8, event9, event10, event11)

    fun getEvents(): List<List<String>> {
        return events
    }
}