package com.example.pokedexter.common.domain

data class Pokemon(
  val id: Long,
  val primaryType: Type,
  val secondaryType: Type? = null,
)