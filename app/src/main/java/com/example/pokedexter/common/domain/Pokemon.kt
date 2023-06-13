package com.example.pokedexter.common.domain

import com.example.pokedexter.common.domain.pokemon_detail.Form
import com.example.pokedexter.common.domain.pokemon_detail.Generation

data class Pokemon(
  val id: Long,
  val name: String,
  val primaryType: Type,
  val secondaryType: Type? = null,
  val ability: Ability,
  val stats: Stats,
  val form: Form,

  val gender: Gender,
  val gen: Generation,
  ) {
  data class Stats(
    val attack: Int,
    val specialAttack: Int,
    val defense: Int,
    val specialDefense: Int,
    val speed: Int,
  )

  enum class Gender {
    MALE,
    FEMALE,
    UNKNOWN
  }
}