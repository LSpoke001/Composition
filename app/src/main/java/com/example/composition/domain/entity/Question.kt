package com.example.composition.domain.entity

data class Question(
    val sim: Int,
    val visibleNumber: Int,
    val options: List<Int>
)