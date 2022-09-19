import java.awt.BorderLayout;
import java.lang.Math;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class Finance_UI extends JFrame {

	JTable Finance_UI;
	JPanel header;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Finance_UI ui = new Finance_UI();
		ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ui.setSize(1280,720);
		ui.setVisible(true);
		
	}

	/**
	 * Create the frame.
	 */
	public Finance_UI() {
		//test data input
		
		
		int numTickets = 3;
		System.out.println("Tickets for 3 passengers");
		
		ArrayList<Customers> customerArr = new ArrayList<Customers>();
		int n =1;//to count passengers
		for(int i=0; i<numTickets; ++i) {
			if(numTickets != 0) {
				//user input to act as test data				
				Scanner Fname_input = new Scanner(System.in);
				System.out.println("Input First Name for Passenger "+n);
				String first = Fname_input.nextLine();

			
				Scanner Lname_input = new Scanner(System.in);
				System.out.println("Input Last Name for Passenger "+n);
				String last = Lname_input.nextLine();

				
				Scanner Bday_input = new Scanner(System.in);
				System.out.println("Input Day of birth for Passenger "+n);
				String day = Bday_input.nextLine();

			
				Scanner Bmonth_input = new Scanner(System.in);
				System.out.println("Input Month of birth for Passenger "+n);
				String month = Bmonth_input.nextLine();

			
				Scanner Byear_input = new Scanner(System.in);
				System.out.println("Input Year of birth for Passenger "+n);
				String year = Bmonth_input.nextLine();
				System.out.println("");
				n =n+1;
			
				//ticket number generator for each passenger
				int min = 10000000;
				int max = 99999998;
				int Ticket_number = (int)(Math.random()*(max-min+1)+min);
				//creates objects from class Customer to be placed into an array called customerArr
				customerArr.add(new Customers(first,last,day,month,year,numTickets,Ticket_number));
			}
			else {
				System.out.println("ok");
			}
			
		}
		
		//Flight from Tokyo to Sydney
		
		String Flight_class="Economy",Flight_destination="Sydney",Flight_departure_time="06:20";
		System.out.println(Flight_class+" "+Flight_destination+" "+Flight_departure_time);
		
		double Flight_distance_to=11687.85,Ticket_Cost=0,compensation_cost_to,bag_cost,delay_to=179;
		
		//return Flight from Sydney to Tokyo
		double Flight_distance_return = 7021.04, delay_return = 10;
		
		//Formats the rows and columns of the table
		String[] columnNames = {"First Name","Last Name","Date of Birth","Ticket Number","Bag Costs","Ticket Costs","Food Costs","Compensation","Total"};
		Object[][] entities = new Object[numTickets][9];
		
		
		
		
		for(int i=0;i<=numTickets-1;++i) {
			//Food Cost randomizer
			int minFood = 0;
			int maxFood = 100;
			int Food = (int)(Math.random()*(maxFood-minFood+1)+minFood);

			
			//Bag number randomizer
			int minBags = 1;
			int maxBags = 5;
			int bag_quantity = (int)(Math.random()*(maxBags-minBags+1)+minBags);
			
			String first = customerArr.get(i).get_passenger_FName();
			String last = customerArr.get(i).get_passenger_LName();
			String dob = customerArr.get(i).get_passenger_dob();
			int ticket_num = customerArr.get(i).get_passenger_ticket();
			
			
			
			
			//functions calculating cost values
			Ticket_Information ticket1 = new Ticket_Information(Flight_distance_to,Flight_distance_return,Flight_class,Flight_departure_time,Flight_destination,Ticket_Cost);
			Ticket_Cost = ticket1.Flight_class_cost(Flight_distance_to,Flight_distance_return);
			Compensation comp_to = new Compensation(delay_to);
			Compensation comp_return = new Compensation(delay_return);
			compensation_cost_to = comp_to.Compensation_calc() + comp_return.Compensation_calc();
			Expenses expense1 = new Expenses(bag_quantity,Food,compensation_cost_to,Ticket_Cost);
			double total_cost = expense1.Total_cost_calc();
			bag_cost = expense1.bag_cost_calc();
			
			//places the data input from user and calculated from cost functions into the table
			entities[i][0]= first;//First Name
			entities[i][1] = last;//Last Name
			entities[i][2] = dob;// dob
			entities[i][3] = ticket_num;//ticket num
			entities[i][4] = bag_cost;//bag costs
			entities[i][5] = Ticket_Cost;// ticket costs
			entities[i][6] = Food;// food cost
			entities[i][7] = compensation_cost_to;// compensation
			entities[i][8] = total_cost;// total
			
			
			
		}
		//Tickets numbers specific to the individual assignment brief
		//entities[0][3] = 83746578;
		//entities[1][3] = 27475839;
		//entities[2][3] = 95738494;
		
		Finance_UI = new JTable(entities, columnNames);
				
		JScrollPane scrollpane = new JScrollPane(Finance_UI);
		scrollpane.setForeground(Color.RED);
		scrollpane.setBackground(Color.WHITE);
		scrollpane.setBounds(10,10,10,10);
		getContentPane().add(scrollpane, BorderLayout.CENTER);	
	}

}
