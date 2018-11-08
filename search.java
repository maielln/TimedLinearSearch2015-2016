public class search
{
	private int[] a;
	public search(int[] b)
	{
		a = b;
	}
	public int LinearSearchInt(int val)
	{
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == val)
				return i;
		}
		return -1;
	}
	public int LinearSearchString(String[] b, String phrase)
	{
		for(int i = 0; i < b.length; i++)
		{
			if(b[i].equals(phrase))
				return i;
		}
		return -1;
	}
}