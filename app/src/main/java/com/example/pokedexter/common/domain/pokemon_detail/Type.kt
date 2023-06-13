package com.example.pokedexter.common.domain.pokemon_detail

data class Type(
  val effectiveVs: List<Type>,
  val weakVs: List<Type>,
)
