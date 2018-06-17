package impatient.chapter6

import impatient.UnitSpec

class testPlayingCards extends UnitSpec {

  it should "have the playing card symbols as string values" in {

    PlayingCardSuits.clubs.toString should be ("\u2663")
    PlayingCardSuits.diamonds.toString should be ("\u2666")
    PlayingCardSuits.hearts.toString should be ("\u2665")
    PlayingCardSuits.spades.toString should be ("\u2660")

  }

  it should "determine if a card suit value is red" in {

    PlayingCardSuits.isRed(PlayingCardValues.seven, PlayingCardSuits.hearts) should be (true)
    PlayingCardSuits.isRed(PlayingCardValues.ace, PlayingCardSuits.diamonds) should be (true)
    PlayingCardSuits.isRed(PlayingCardValues.jack, PlayingCardSuits.clubs) should be (false)
    PlayingCardSuits.isRed(PlayingCardValues.five, PlayingCardSuits.spades) should be (false)

  }

}
