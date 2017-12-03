
class A09
{
	int i=10;
	int j[]={10,20,30};
	
	int[] m()
	{
		int[] values=new int[this.j.length];
	    int index=0;
		for(int t:this.j)  //for(int i=0;i<j.length;i++){int t=j[i];}
		{
			values[index++]=t+this.i;
		}
		return values;
	}	
}

class A09Test
{
	public static void main(String...fgt)
	{
		for(int x:new A09().m())
		{
			System.out.println(x);
		}
	}
}