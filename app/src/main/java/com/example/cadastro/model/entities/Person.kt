package com.example.cadastro.model.entities

class Person(
    val fullName: String,
    val phone: String,
    val email: String,
    val mailList: Boolean,
    val gender: Enum<Gender>,
    val city: String,
    val federatedState: String
) {
    override fun toString(): String {
        return "Person(fullName='$fullName', phone='$phone', email='$email', mailList=$mailList, gender=$gender, city='$city', federatedState='$federatedState')"
    }
}