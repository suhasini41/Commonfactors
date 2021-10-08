package package1;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CommonFactors
{
	private int findCommonFactors(int n1, int n2) {
		int min = 0;
		List<Integer> al = new ArrayList<>();
		if(n1<n2)
		{
			min = n1;
		}
		else
			min = n2;
		for(int i=1;i<=min;i++)
		{
			if((n1%i==0)&&(n2%i==0))
			{
				al.add(i);
			}
		}
		int size = al.size();
		return size;
	}
	@Test
	public void testCase1()
	{
		Assert.assertEquals(findCommonFactors(10, 50), 4);
	}
	@Test
	public void testCase2()
	{
		Assert.assertEquals(findCommonFactors(10, 5), 2);
	}
	
	@Test
	public void testCase3()
	{
		Assert.assertEquals(findCommonFactors(9,14), 1);
	}

}
