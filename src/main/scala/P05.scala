object P05{
  def reverse[T](ls :List[T]): List[T] ={
    ls.foldLeft(Nil: List[T])((x, y) => y :: x)
  }
}
