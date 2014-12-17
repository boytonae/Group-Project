
public class NaryTree<T> 
{
	private T element;
	private T[] directions;
	private T parent;
	public NaryTree(int numOfDirections)
	{
		directions = (T[]) new Object[numOfDirections];
	}
	
	public NaryTree(int numOfDirections, T parent)
	{
		directions = (T[]) new Object[numOfDirections];
		this.parent = parent;
		
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
	
	public void removeDecendants()
	{
		int i = 0;
		while(i< directions.length)
		{
		directions[i] = null;
		i++;
		}	
	}
	
	public T getElement()
	{
		return element;
	}
	
	public T setElement(T element)
	{
		this.element = element;
	}

}
