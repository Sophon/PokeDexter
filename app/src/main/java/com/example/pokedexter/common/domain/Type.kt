package com.example.pokedexter.common.domain

data class Type(
  val id: Long,
  val name: String,
  val offensiveRelations: List<Relation>,
  val defensiveRelations: List<Relation>,
) {
  data class Relation(
    val type: Type,
    val effectiveness: Effectiveness
  ) {
    enum class Effectiveness {
      SUPER_EFFECTIVE,
      EFFECTIVE,
      NORMAL,
      RESISTANT,
      SUPER_RESISTANT
    }
  }
}
