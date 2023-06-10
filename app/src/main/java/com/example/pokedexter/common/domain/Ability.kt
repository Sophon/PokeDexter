package com.example.pokedexter.common.domain

data class Ability(
  val id: Long,
  val name: String,
  val generation: Generation,
  val effect: String,
)
