import org.scalatest._

class P05Spec extends FlatSpec with DiagrammedAssertions {
  "P05" should "配列を反転させる" in {
    assert(P05.reverse(Nil) === Nil)
    assert(P05.reverse(List(1)) === List(1))
    assert(P05.reverse(List(1, 2, 3)) === List(3, 2, 1))
  }
}

