package com.example.bkskjold.data.util

import com.example.bkskjold.data.model.*

fun preloadDB(){
    //userWriteToDB()
    //trainingsWriteToDB()
    //eventWriteToDB()
    //newsWriteToDB()

    loadUsersFromDB()
    loadNewsFromDB()
    loadTrainingsFromDB()
    loadEventsFromDB()
}