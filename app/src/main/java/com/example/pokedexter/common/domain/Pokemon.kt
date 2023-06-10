package com.example.pokedexter.common.domain

data class Pokemon(
  val id: Long,
  val name: String,
  val primaryType: Type,
  val secondaryType: Type? = null,
  val ability: Ability,
  val stats: Stats,

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