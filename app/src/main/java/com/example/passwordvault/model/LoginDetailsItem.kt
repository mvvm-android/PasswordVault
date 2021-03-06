package com.example.passwordvault.model

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Abhinav Singh on 01,July,2020
 */
@Entity(tableName = "LoginDetailsTable")
data class LoginDetailsItem(@PrimaryKey var id : String, var loginName:String, var loginEmail : String, var loginPassword : String, var loginWebsite : String, var loginNotes : String, var loginCategory : String) {

}