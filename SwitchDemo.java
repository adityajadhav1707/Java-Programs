class SwitchDemo 
{
	public static void main(String[] args) 
	{
	   int day =4;
	   String dayName="day";
	   switch(day)
		{
		   case 1:
			      dayName="Today is Mon";
		   
		   case 2:
			      dayName="Today is Tue";
		   		   break;

		   case 3:
			      dayName="Today is Wed";
		   		   break;

		   case 4:
			      dayName="Today is Thru";
		   case 5:
			      dayName="Today is Fri";

		   case 6:
			      dayName="Today is Sat";
		   		   		   break;

		   case 7:
			      dayName="Today is Sun";
		   break;
		  
		}
		System.out.println(dayName);

	}
}
