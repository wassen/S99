import org.scalatest._

class P01Spec extends FlatSpec with DiagrammedAssertions {
  "P01" should "配列の最後の要素を取り出す。" in {
    assert(P01.last(List(1)) === 1)
    assert(P01.last(List(1,2,3)) === 3)
  }
  it should "要素数が0ならエラー" in {
    intercept[NoSuchElementException] {
      P01.last(Nil)
    }
  }
}

