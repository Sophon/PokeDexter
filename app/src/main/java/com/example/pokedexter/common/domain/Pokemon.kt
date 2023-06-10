package com.example.pokedexter.common.domain

data class Pokemon(
  val id: Long,
  val name: String,
  val primaryType: Type,
  val secondaryType: Type? = null,
  val ability: Ability,
  val gen: Generation,
)