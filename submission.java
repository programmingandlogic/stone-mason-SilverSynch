import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel 
{

	public void run () 
	{
		// to supress errors, we always check if our path is clear before we start.
		while (frontIsClear ())
		{
			makeColumn ();
		}
	}
	
	// makeColumn() actually makes two columns, so that KAREL is left off in a similar position to when it begins.
	private void makeColumn ()
	{
		
		// first, we turn KAREL to face up (since KAREL should always be left facing east)
		turnLeft ();
		
		// then we build a single column. this could be abstracted into another function, though.
		while (frontIsClear ())
		{
			if (noBeepersPresent ())
			{
				putBeeper();
			}
			move ();
		}
		
		// we move to our second column.
		turnRight ();
		move ();
		move ();
		move ();
		move ();
		turnRight ();
		
		// TODO: make this a function
		while (frontIsClear ())
		{
			if (noBeepersPresent ())
			{
				putBeeper();
			}
			move ();
		}
		
		// we move to the bottom of our next set of columns, careful not to cause errors.
		turnLeft ();
		if (frontIsClear ())
		{
			move ();
			move ();
			move ();
			move ();
		}
	}
}
