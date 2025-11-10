package com.graphyon.Threading;

import java.util.Scanner;

public class If_Else_207 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter College Name: ");
		String cname=sc.nextLine().toUpperCase();
		
		System.out.println("Enter Department Name: ");
		String dname=sc.nextLine().toUpperCase();
		
		System.out.println("Enter Year: ");
		int year=sc.nextInt();
		sc.nextLine(); 
		
		System.out.println("Enter Student Name: ");
		String sname=sc.nextLine().toUpperCase();
		
		System.out.println("Enter SGPA:");
		Double sgpa=sc.nextDouble();
		
		double Percentage = (sgpa - 0.75) * 10;

		if(cname.equals("P. R. POTE"))
		{
			if(dname.equals("CSE"))
			{
				if((year==4||year==3) && sgpa>=8)
				{
					System.out.println("Student name:"+sname);
					System.out.println(sname+" your percentage is: "+Percentage);
					System.out.println("Congratulations !! You are eligible for the placement.");
				}
				else
				{
					if(year==2 && sgpa>=8)
					{
						System.out.println("Student Name:"+sname);
						System.out.println(sname+" your percentage is: "+Percentage);
						System.out.println("Congratulations !! You are eligible for the internship.");
					}
					else
					{
						System.out.println("Student Name:"+sname);
						System.out.println(sname+" your percentage is: "+Percentage);
						System.out.println("Oops !! You are not eligible.");
					}
				}
			}
			else
			{
				if(dname.equals("AIDS") && year==4||year==3 && sgpa>=8)
				{
					System.out.println("Student Name:"+sname);
					System.out.println(sname+" your percentage is: "+Percentage);
					System.out.println("Congratulations !! You are eligible for the placement.");
				}
				else
				{
					if(year==4||year==3 && sgpa>=8)
					{
						System.out.println("Student Name:"+sname);
						System.out.println(sname+" your percentage is: "+Percentage);
						System.out.println("Congratulations !! You are eligible for the placement.");
					}
					else
					{
						if(year==2 && sgpa>=8)
						{
							System.out.println("Student Name:"+sname);
							System.out.println(sname+" your percentage is: "+Percentage);
							System.out.println("Congratulations !! You are eligible for the internship.");
						}
						else
						{
							System.out.println("Student Name:"+sname);
							System.out.println(sname+" your percentage is: "+Percentage);
							System.out.println("Oops !! You are not eligible.");
						}
					}
				}
			}
		}
		else
		{
			if(dname.equals("CSE"))
			{
				if(year==4||year==3 && sgpa>=8)
				{
					System.out.println("Student name:"+sname);
					System.out.println(sname+" your percentage is: "+Percentage);
					System.out.println("Congratulations !! You are eligible for open campus.");
				}
				else
				{
					if(year==2 && sgpa>=8)
					{
						System.out.println("Student name:"+sname);
						System.out.println(sname+" your percentage is: "+Percentage);
						System.out.println("Congratulations !! You are eligible for internship.");
					}
					else
					{
						System.out.println("Student name:"+sname);
						System.out.println(sname+" your percentage is: "+Percentage);
						System.out.println("Oops !! You are not eligible.");
					}
				}
			}
			else
			{
				if(year==4||year==3 && sgpa>=8)
				{
					System.out.println("Student Name:"+sname);
					System.out.println(sname+" your percentage is: "+Percentage);
					System.out.println("Congratulations !! You are eligible for the placement.");
				}
				else
				{
					if(year==2 && sgpa>=8)
					{
						System.out.println("Student Name:"+sname);
						System.out.println(sname+" your percentage is: "+Percentage);
						System.out.println("Congratulations !! You are eligible for the intersnhip.");
					}
					else
					{
						System.out.println("Student name:"+sname);
						System.out.println(sname+" your percentage is: "+Percentage);
						System.out.println("Oops !! You are not eligible.");
					}
				}
			}
		}
		sc.close();
	}

}
