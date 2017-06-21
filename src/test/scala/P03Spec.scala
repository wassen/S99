import org.scalatest._

class P03Spec extends FlatSpec with DiagrammedAssertions {
  "nth" should "n番目の要素を取得する。" in {
    assert(P03.nth(0, List(1)) === 1)
    assert(P03.nth(0, List(1, 2, 3)) === 1)
    assert(P03.nth(1, List(1, 2, 3)) === 2)
    assert(P03.nth(2, List(1, 2, 3)) === 3)
  }
  it should "無い袖は振れない" in {
    intercept[NoSuchElementException] {
      P03.nth(0, Nil)
      P03.nth(-1, List(1,2,3))
      P03.nth(4, List(1,2,3))
    }

  }
}

