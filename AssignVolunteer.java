// Chapter 5 Exercise

import java.util.Scanner;

public class AssignVolunteer
{
	public static void main(String[] args) 
	{
		// variables and constants
		String message;
		int donationType;
		String volunteer;
		final int CLOTHING_CODE = 1;
		final int FURNTIURE_CODE = 2;
		final int ELECTRONICS_CODE = 3;
		final int OTHER_CODE = 4;
		final String CLOTHING_PRICER = "Regina";
		final String FURNITURE_PRICER = "Wei";
		final String ELECTRONICS_PRICER = "Lydia";
		final String OTHER_PRICER = "Marco";
		Scanner input = new Scanner(System.in);

		// input
		System.out.println("What type of donation is this?");
		System.out.print("Enter " + CLOTHING_CODE + " for CLOTHING, " + FURNTIURE_CODE + " for FURNITURE, " + ELECTRONICS_CODE + " for ELECTRONICS, or " + OTHER_CODE + " for anything else. >> ");
		donationType = input.nextInt();

		// process
		switch(donationType)
		{
			case(CLOTHING_CODE):
			{
				volunteer = CLOTHING_PRICER;
				message = "a clothing donation";
				break;
			}
			case(FURNTIURE_CODE):
			{
				volunteer = FURNITURE_PRICER;
				message = "a furniture donation";
				break;
			}
			case(ELECTRONICS_CODE):
			{
				volunteer = ELECTRONICS_PRICER;
				message = "an electronics donation";
				break;
			}
			case(OTHER_CODE):
			{
				volunteer = OTHER_PRICER;
				message = "any other type of donation";
				break;
			}	
			default:
			{
				volunteer = "invalid";
				message = "NOT a valid donation type!";
			}	
		}

		// output
		System.out.println("You entered: " + donationType);
		System.out.println("This is " + message);
		System.out.println("The volunteer who will price this item for you is: " + volunteer);

	} // end of main
}