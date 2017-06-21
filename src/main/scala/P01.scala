object P01{
    def last[T](ls :List[T]):T = ls match{
        case only_element :: Nil => only_element
        case ls_first :: ls_others => last(ls_others)
        case _ => throw new NoSuchElementException
    }
    def last2[T](ls :List[T]):T = ls match{
        case ls_others :+ ls_last => ls_last
        case _ => throw new NoSuchElementException
    }
}
