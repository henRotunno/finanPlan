package functionAndFun;

import java.util.Scanner;
public class FinanPlan {
	
	public static int getBudgetTime(Scanner scanner) {
	    System.out.println("Hello! This program is designed to help you manage a budget through a specific time period!");
	    System.out.println("Let's start by selecting your desired range");
	    System.out.println("Type 1 for daily budget evaluation");
	    System.out.println("Type 2 for weekly budget evaluation");
	    System.out.println("Type 3 for monthly budget evaluation: ");
	    
	    int select = scanner.nextInt();
	    if(select < 1 || select > 4) {
	        System.out.println("Invalid input");
	        return -1; // indicate invalid selection
	    }
	    return select;
	}

	public static double getTotal(Scanner scanner) {
	    System.out.println("Enter the total for your budget in accordance with the time parameter: ");
	    double budgetTotal = scanner.nextDouble();
	    if(budgetTotal < 0) {
	        System.out.println("Budget cannot be negative");
	        return 0; // default value or handle error appropriately
	    }
	    return budgetTotal;
	}
	
	public static double getGoal(Scanner scanner) {
		System.out.println("Enter your personal savings goal: ");
		
		double enterGoal = scanner.nextDouble();
		if(enterGoal < 0) {
			System.out.println("Goal cannot be 0 or negative");
		}
		return enterGoal;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

	    int resultMode = -1;
	    while (resultMode == -1) {
	        resultMode = getBudgetTime(scanner);
	    }

	    double budgetTotal = getTotal(scanner);

	   
	    double getGoal = getGoal(scanner);
	    
	    switch(resultMode) {
	        case 1:
	            System.out.println("Enter expenses for a typical day:");
	            
	            // Travel
	            System.out.println("Travel and transportation: ");
	            double travel = scanner.nextDouble();
	            
	            System.out.println("Food: ");
	            double food = scanner.nextDouble();
	            
	            System.out.println("Clothing: ");
	            double clothing = scanner.nextDouble();
	            
	            System.out.println("Entertainment: ");
	            double entertainment = scanner.nextDouble();
	            
	            System.out.println("Utility: ");
	            double dailyUtil = scanner.nextDouble();
	            
	            System.out.println("Mortage or Rent: ");
	            double dailyRent = scanner.nextDouble();
	            
	            System.out.println("Other: ");
	            double other = scanner.nextDouble();
	            
	            // Add logic to calculate total expenses and compare with budget
	            double totalExpenses = travel + food + clothing + 
	            		other + entertainment + dailyUtil + dailyRent;
	            		
	            System.out.println("Total daily expenses: " + totalExpenses);
	            System.out.println("Remaining budget: " + (budgetTotal - totalExpenses));
	           
	            
double dailyStasis = budgetTotal - totalExpenses;
	            
	            if(dailyStasis < 0) {
	            	System.out.println("You are currently over your budget");
	            	
	            	System.out.println("It is not the end of the world! Here are some suggestions to cut costs");
	            	
	            	System.out.println("Transporation: Consider public transporation or carpooling");
	            	
	            	System.out.println("Food: Avoid getting food delivered and plan out groceries before you enter");
	            	
	            	System.out.println("Clothes: Consider buying clothing from cheaper outlets such as GoodWill");
	            	
	            	System.out.println("Entertainment: Having fun is important, however, needs come first"
	            			+ "try to limit these expenses for now");
	            	
	            	System.out.println("Do not panic, this is a temporary problem that can be fixed by taking the right steps");
	            }
	            
	            int days = 0;
	            double dailyGoals = 0;
	            while(dailyGoals < getGoal) {
	            	days++;
	            	dailyGoals += dailyStasis;
	            }
	            System.out.println("At the rate of saving " + dailyStasis + " a week");
	            System.out.println("You will reach your savings goal in " + days + " weeks");
	            
	            break;
	            	            	            	            	            
	           	            	            	            	            

	        case 2:
System.out.println("Enter expenses for a typical week:");
	            
	            // Travel
	            System.out.println("Travel and transportation: ");
	            double weekTravel = scanner.nextDouble();
	            
	            System.out.println("Dining and Groceries: ");
	            double weekFood = scanner.nextDouble();
	            
	            System.out.println("Clothing: ");
	            double weekClothing = scanner.nextDouble();
	            
	            
	            System.out.println("Entertainment: ");
	            double weeklyEntertainment = scanner.nextDouble();
	            
	            System.out.println("Utility: ");
	            double weeklyUtil = scanner.nextDouble();
	            
	            System.out.println("Mortage or Rent: ");
	            double weeklyRent = scanner.nextDouble();
	            	            	            	            	            	            	         	            	           	            		            	          	            
	            System.out.println("Other");
	            double weekOther = scanner.nextDouble();

	            // Add logic to calculate total expenses and compare with budget
	            double weeklyTotal = weekTravel + weekFood + weekClothing + weekOther 
	            		+weeklyEntertainment + weeklyUtil + weeklyRent;
	            System.out.println("Total weekly expenses: " + weeklyTotal);
	            System.out.println("Remaining budget: " + (budgetTotal - weeklyTotal));
	            double stasis = budgetTotal - weeklyTotal;
	            
	            
	            if(stasis < 0) {
	            	System.out.println("You are currently over your budget");
	            	
	            	System.out.println("It is not the end of the world! Here are some suggestions to cut costs");
	            	
	            	System.out.println("Transporation: Consider public transporation or carpooling");
	            	
	            	System.out.println("Food: Avoid getting food delivered and plan out groceries before you enter");
	            	
	            	System.out.println("Clothes: Consider buying clothing from cheaper outlets such as GoodWill");
	            	
	            	System.out.println("Entertainment: Having fun is important, however, needs come first"
	            			+ "try to limit these expenses for now");
	            	
	            	System.out.println("Do not panic, this is a temporary problem that can be fixed by taking the right steps");
	            }
	            
	            
	            int weeks = 0;
	            double newTotal = 0;
	            while(newTotal < getGoal) {
	            	weeks++;
	            	newTotal += stasis;
	            }
	            System.out.println("At the rate of saving " + stasis + " a day");
	            System.out.println("You will reach your savings goal in " + weeks + " days");
	            
	            break;
	          
	        case 3:
	            // Implement monthly budget logic here
	        	
	        	System.out.println("Enter expenses for a typical month: ");
	        	
	        	System.out.println("Travel and transportation: ");
	            double monthTravel = scanner.nextDouble();
	            
	            System.out.println("Dining and Groceries: ");
	            double monthFood = scanner.nextDouble();
	            
	            System.out.println("Clothing: ");
	            double monthClothing = scanner.nextDouble();
	            
	            System.out.println("Entertainment: ");
	            double monthEntertainment = scanner.nextDouble();
	            
	            System.out.println("Utility: ");
	            double monthUtil = scanner.nextDouble();
	            
	            System.out.println("Mortage or Rent: ");
	            double monthRent = scanner.nextDouble();
	            	            	            	            	            	            	         	            	           	            		            	          	            
	            System.out.println("Other");
	            double monthOther = scanner.nextDouble();

	            // Add logic to calculate total expenses and compare with budget
	            double monthlyTotal = monthTravel + monthFood + monthClothing + monthOther 
	            		+monthEntertainment + monthUtil + monthRent;
	            System.out.println("Total weekly expenses: " + monthlyTotal);
	            System.out.println("Remaining budget: " + (budgetTotal - monthlyTotal));
	            double monthlyStasis = budgetTotal - monthlyTotal;
	            
	            if(monthlyStasis < 0) {
	            	System.out.println("You are currently over your budget");
	            	
	            	System.out.println("It is not the end of the world! Here are some suggestions to cut costs");
	            	
	            	System.out.println("Transporation: Consider public transporation or carpooling");
	            	
	            	System.out.println("Food: Avoid getting food delivered and plan out groceries before you enter");
	            	
	            	System.out.println("Clothes: Consider buying clothing from cheaper outlets such as GoodWill");
	            	
	            	System.out.println("Entertainment: Having fun is important, however, needs come first"
	            			+ "try to limit these expenses for now");
	            	
	            	System.out.println("Do not panic, this is a temporary problem that can be fixed by taking the right steps");
	            }
	            
	            int months = 0;
	            double newmMonthlyTotals = 0;
	            while(newmMonthlyTotals < getGoal) {
	            	months++;
	            	newmMonthlyTotals += monthlyStasis;
	            }
	            System.out.println("At the rate of saving " + monthlyStasis + " a month");
	            System.out.println("You will reach your savings goal in " + months + " months");
	            
	            break;
	        default:
	            System.out.println("Program exited.");
	    }

	    scanner.close();
	}
			
			
			
		
	}

