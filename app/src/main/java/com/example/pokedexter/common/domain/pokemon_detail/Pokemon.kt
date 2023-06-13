package com.example.pokedexter.common.domain.pokemon_detail

import com.example.pokedexter.common.domain.ability.Ability

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