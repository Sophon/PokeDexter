package com.example.pokedexter.common.domain.ability

import com.example.pokedexter.common.domain.pokemon_detail.Generation

data class Ability(
  val id: Long,
  val name: String,
  val generation: Generation,
  val effect: String,
)
