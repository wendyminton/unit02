/**
 * An implementation of a simple generic ordered pair class.
 * @author Wendy-Beth Minton
 */
public class Pair<T>
{
  private T first;      // The first element of the pair.
  private T second;     // The second element of the pair.

  /**
   * The constructor initializes the pair to (first, second).
   *
   * @param first the first element of the pair.
   * @param second the second element of the pair.
   */
  public Pair(T first, T second)
  {
    this.first = first;
    this.second = second;
  }

  /**
   * Gets the first element of the pair.
   *
   * @return the first element of the pair.
   */
  public T getFirst()
  {
    return this.first;
  }

  /**
   * Gets the second element of the pair.
   *
   * @return the second element of the pair.
   */
  public T getSecond()
  {
    return this.second;
  }

  /**
   * Swaps the first and second element of the pair.
   */
  public void swap()
  {
    T temp = first;
    first = second;
    second = temp;
  }

  /**
   * Convert the pair to a string.
   *
   * @return a String representing the pair.
   */
   @Override
   public String toString()
   {
     return "(" + first + ", " + second + ")";
   }
}
