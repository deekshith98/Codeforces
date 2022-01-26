class goodString
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int l=sc.nextInt();
		String s=sc.next();

		ArrayList<Integer> arr = new ArrayList<Integer>();
		int count=0;

		if(l%2==0)
		{
			for(int=0;i<l;i+=2)
			{
				if(s.charAt(i)==s.charAt(i+1))
				{
					count++;
					arr.add(i);
				}
				System.out.println(count*2);
				
			}
		}
	}
}