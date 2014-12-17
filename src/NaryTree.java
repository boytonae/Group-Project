
public class NaryTree<T> 
{
	private T[] directions;

	public NaryTree(int numOfDirections)
	{
		directions = (T[]) new Object[numOfDirections];
	}

	
	/**
	 * adds an element if you know the direction is empty
	 * @param element
	 * @param direction
	 */
	public void add(T element, int direction)
	{
		if(direction < directions.length && directions[direction] == null){
			directions[direction] = element;
		}
	}
	
	

}
