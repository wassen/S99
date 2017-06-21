/**
  * Created by kazuki_asayama on 2017/05/22.
  */
object P03 {
  def strip_first[T](ls :List[T]):List[T] = ls match{
    case _ :: ls_others => ls_others
    case _ => throw new NoSuchElementException
  }
  def get_first[T](ls: List[T]): T = ls match{
    case ls_first :: _ => ls_first
    case _ => throw new NoSuchElementException
  }
  def nth[T](n: Int, ls: List[T]): T = n match{
    case 0 => get_first(ls)
    case _ => nth(n - 1, strip_first(ls))
  }
}
