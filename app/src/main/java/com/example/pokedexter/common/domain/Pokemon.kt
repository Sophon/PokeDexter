package com.example.pokedexter.common.domain

data class Pokemon(
  val id: Long,
  val name: String,
  val primaryType: Type,
  val secondaryType: Type? = null,
  val ability: Ability,
  val gen: Generation,
  val stats: Stats,
) {
  data class Stats(
    val attack: Int,
    val specialAttack: Int,
    val defense: Int,
    val specialDefense: Int,
    val speed: Int,
  )
}