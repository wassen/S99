/**
  * Created by kazuki_asayama on 2017/05/22.
  */
object P06{
  def isPalindrome(ls :List[Int]): Boolean = ls match {
    case (first :: others) :+ last => if(first != last) {isPalindrome(others)} else{false}
    case _ => true
  }
  // ifなんか使いたくなかったのに！
  def in[T](elem: T, ls: List[T]): Boolean = {
    if (ls == Nil){
      false
    } else if(P03.get_first(ls) == elem) {
      true
    } else {
      in(elem, P03.strip_first(ls))
    }
  }
}
