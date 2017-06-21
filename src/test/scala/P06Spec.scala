/**
  * Created by kazuki_asayama on 2017/05/22.
  */
import org.scalatest._
class P06Spec extends FlatSpec with DiagrammedAssertions {
  "in" should "要素があるかどうかを判定する" in {
    assert(!P06.in(0, List(1,2,3)))
    assert(P06.in(1, List(1,2,3)))
    assert(P06.in(2, List(1,2,3)))
    assert(P06.in(3, List(1,2,3)))
    assert(!P06.in(4, List(1,2,3)))
  }
}