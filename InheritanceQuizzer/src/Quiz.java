import java.util.Scanner;

public class Quiz
	{
		static Scanner input = new Scanner(System.in);
		static int counter;

		public static void main(String[] args)
			{
				counter = 0;
				showCode();
				q1();
				q2();
				q3();
				q4();
				q5();
				q6();
				q7();
				q8();
				q9();
				q10();
				q11();
				q12();
				end();

			}
		
		public static void showCode()
		{
			System.out.println("public class Crime\n" + 
					"	{\n" + 
					"	public static void commit()\n" + 
					"		{\n" + 
					"		System.out.println(“Lets go rob a bank or something”);\n" + 
					"                }\n" + 
					"	public static void run()\n" + 
					"		{\n" + 
					"		System.out.println(“The police are coming!!”);\n" + 
					"		}\n" + 
					"	}\n" + 
					"");
			
			System.out.println("public class Fruad extends Crime\n" + 
					"	{\n" + 
					"	public static void commit()\n" + 
					"		{\n" + 
					"		System.out.println(“Google Search: how to commit tax invasion”);\n" + 
					"           }\n" + 
					"	public static void getCaught()\n" + 
					"		{\n" + 
					"		System.out.println(“The IRS found us...”);\n" + 
					"		}\n" + 
					"	}\n" + 
					"");
		}
		
		public static void answers()
		{
			System.out.println();
			System.out.println("a) Lets go rob a bank or something");
			System.out.println("b) Google Search: how to commit tax invasion");
			System.out.println("c) The police are coming!!");
			System.out.println("d) The IRS found us...");
			System.out.println("e) Error");
			System.out.println();
		}
		
		public static void q1()
		{
			System.out.println();
			System.out.println("What would this print:");
			System.out.println();
			System.out.println("Crime x = new Fruad();\n" + 
					"x.commit();");
			
			answers();
			
			String ans = input.nextLine();
			
			if (ans.equals("b"))
				{
					System.out.println("Correct!");
					counter++;
				}
			else
				{
					System.out.println("Incorrect");
					System.out.println("Next question");
				}
			
			
		}
		
		public static void q2()
		{
			System.out.println();
			System.out.println("What would this print:");
			System.out.println();
			System.out.println("Crime x = new Crime();\n" + 
					"x.commit();");
			
			answers();
			
			String ans = input.nextLine();
			
			if (ans.equals("a"))
				{
					System.out.println("Correct!");
					counter++;
				}
			else
				{
					System.out.println("Incorrect");
					System.out.println("Next question");
				}
			
			
		}
		
		public static void q3()
		{
			System.out.println();
			System.out.println("What would this print:");
			System.out.println();
			System.out.println("Crime x = new Fruad();\n" + 
					"x.run();");
			
			answers();
			
			String ans = input.nextLine();
			
			if (ans.equals("e"))
				{
					System.out.println("Correct!");
					counter++;
				}
			else
				{
					System.out.println("Incorrect");
					System.out.println("Next question");
				}
			
			
		}
		
		public static void q4()
		{
			System.out.println();
			System.out.println("What would this print:");
			System.out.println();
			System.out.println("Fruad x = new Fruad();\n" + 
					"x.run();");
			
			answers();
			
			String ans = input.nextLine();
			
			if (ans.equals("e"))
				{
					System.out.println("Correct!");
					counter++;
				}
			else
				{
					System.out.println("Incorrect");
					System.out.println("Next question");
				}
			
			
		}
		
		public static void q5()
		{
			System.out.println();
			System.out.println("What would this print:");
			System.out.println();
			System.out.println("Crime x = new Fruad();\n" + 
					"x.getCaught();");
			
			answers();
			
			String ans = input.nextLine();
			
			if (ans.equals("d"))
				{
					System.out.println("Correct!");
					counter++;
				}
			else
				{
					System.out.println("Incorrect");
					System.out.println("Next question");
				}
			
			
		}
		
		public static void q6()

		{
			System.out.println();
			System.out.println("What would this print:");
			System.out.println();
			System.out.println("Fraud x = new Fraud();\n" + 
					"x.commit();");
			
			answers();
			
			String ans = input.nextLine();
			
			if (ans.equals("b"))
				{
					System.out.println("Correct!");
					counter++;
				}
			else
				{
					System.out.println("Incorrect");
					System.out.println("Next question");
				}
			
			
		}
		
		public static void q7()
			{
				System.out.println();
				System.out.println("What would this print:");
				System.out.println();
				System.out.println("Crime x = new Fruad();\n" + 
						"((Fruad)x).commit();");
				
				answers();
				
				String ans = input.nextLine();
				
				if (ans.equals("b"))
					{
						System.out.println("Correct!");
						counter++;
					}
				else
					{
						System.out.println("Incorrect");
						System.out.println("Next question");
					}
				
				
			}
		
		public static void q8()

			{
				System.out.println();
				System.out.println("What would this print:");
				System.out.println();
				System.out.println("Fruad x = new Fruad();\n" + 
						"((Crime)x).commit();");
				
				answers();
				
				String ans = input.nextLine();
				
				if (ans.equals("e"))
					{
						System.out.println("Correct!");
						counter++;
					}
				else
					{
						System.out.println("Incorrect");
						System.out.println("Next question");
					}
				
				
			}
		
		public static void q9()
			{
				System.out.println();
				System.out.println("What would this print:");
				System.out.println();
				System.out.println("Crime x = new Crime();\n" + 
						"x.getCaught();");
				
				answers();
				
				String ans = input.nextLine();
				
				if (ans.equals("e"))
					{
						System.out.println("Correct!");
						counter++;
					}
				else
					{
						System.out.println("Incorrect");
						System.out.println("Next question");
					}
				
				
			}
		
		public static void q10()
			{
				System.out.println();
				System.out.println("What would this print:");
				System.out.println();
				System.out.println("Crime x = new Fruad();\n" + 
						"x.commit(); \n"
						+ "x.getCaught");
				
				System.out.println();
				System.out.println("Write answer in order with a space inbetween like 'a b'");
				
				answers();
				
				String ans = input.nextLine();
				
				if (ans.equals("b d"))
					{
						System.out.println("Correct!");
						counter++;
					}
				else
					{
						System.out.println("Incorrect");
						System.out.println("Next question");
					}
				
				
			}
		
		public static void q11()
			{
				System.out.println();
				System.out.println("What would this print:");
				System.out.println();
				System.out.println("Crime x = new Fruad();\n" + 
						"((Fruad)x).commit(); \n"
						+ "((Crime)x).run();");
				
				System.out.println();
				System.out.println("Write answer in order with a space inbetween like 'a b'");
				
				answers();
				
				String ans = input.nextLine();
				
				
				if (ans.equals("a c"))
					{
						System.out.println("Correct!");
						counter++;
					}
				else
					{
						System.out.println("Incorrect");
						System.out.println("Next question");
					}
				
				
			}
		
		public static void q12()
			{
				System.out.println();
				System.out.println("What would this print:");
				System.out.println();
				System.out.println("Fruad x = new Fruad();\n" + 
						"x.commit('Murder'); \n"
						+ "x.run();");
				
				answers();
				
				String ans = input.nextLine();
				
				if (ans.equals("e"))
					{
						System.out.println("Correct!");
						counter++;
					}
				else
					{
						System.out.println("Incorrect");
						System.out.println("Next question");
					}
				
				
			}
		
		public static void end()
		{
			System.out.println("You finished the quiz!");
			System.out.println("You got " + counter + " out of 12 correct!");
		}

	}
