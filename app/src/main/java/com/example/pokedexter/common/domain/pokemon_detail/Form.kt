package com.example.pokedexter.common.domain.pokemon_detail

data class Form(
  val id: Long,
  val type: Type,
  val isBattleOnly: Boolean,
) {
  enum class Type {
    DEFAULT,
    MEGA
  }
}
