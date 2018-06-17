package impatient.chapter6

object PlayingCardSuits extends Enumeration {
  val clubs = Value("\u2663")
  val diamonds = Value("\u2666")
  val hearts = Value("\u2665")
  val spades = Value("\u2660")

  def isRed(cardValue: PlayingCardValues.Value, cardSuit: PlayingCardSuits.Value): Boolean = {
    Seq(PlayingCardSuits.diamonds, PlayingCardSuits.hearts) contains cardSuit
  }
}
