package com.example.practice

import java.io.Serializable

data class User(
    var userName:String,
    var birthYear:Int,
    var userImageId:Int
        ):Serializable