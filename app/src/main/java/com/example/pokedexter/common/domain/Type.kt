package com.example.pokedexter.common.domain

data class Type(
  val effectiveVs: List<Type>,
  val weakVs: List<Type>,
)
