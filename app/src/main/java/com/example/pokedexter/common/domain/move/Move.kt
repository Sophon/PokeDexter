package com.example.pokedexter.common.domain.move

import com.example.pokedexter.common.domain.pokemon_detail.Generation
import com.example.pokedexter.common.domain.pokemon_detail.Type

data class Move(
  val id: Long,
  val type: Type,
  val damage: Long,
  val damageType: Category,
  val accuracy: Int,
  val pp: Int,

  val makesContact: Boolean,
  val priority: Priority,
  val targeting: Targeting,
  val availableFrom: Generation,
) {
  enum class Priority {
    NORMAL,
    HIGH,
    MAX
  }

  enum class Targeting {
    SELF,
    FOE,
    ALLY,
    FOES,
    ALL
  }

  enum class Category {
    STATUS,
    PHYSICAL,
    SPECIAL,
  }
}
