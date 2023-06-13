package com.example.pokedexter.feat.pokelist.domain

import com.example.pokedexter.common.domain.Type

data class PokemonListItem(
  val id: String,
  val spriteUrl: String,
  val type1: Type,
  val type2: Type,
)
