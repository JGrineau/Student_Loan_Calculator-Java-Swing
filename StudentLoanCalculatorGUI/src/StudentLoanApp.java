import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.text.DecimalFormat;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JSpinner.NumberEditor;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 * @Coder: Jarrod Grineau
 * @Class Name: StudentLoanApp
 * @Purpose: This class is responsible for building the loan calculator GUI
 * 			 It will handle events with inner classes, it will have an array list that will allow student objects to be created or removed
 * 			 It will have an input form for the student information and a payment calculation form
 * @Date: August 12, 2022
 */

@SuppressWarnings("serial")
public class StudentLoanApp extends JFrame{

	//Array list that allows students to be added or removed
	ArrayList<Student> studentList = new ArrayList<Student>();
	
	//Private Variables for the GUI
	//input 
	private JTextField studentIDInput, surnameInput, middleNameInput, firstNameInput, aptNumberInput, streetNumberInput, streetNameInput, cityInput, provinceInput, postalCodeInput, oslLoanAmountInput, cslLoanAmountInput; 
	private JPanel inputPanel;
	//output
	private JTextField studentIDOutput, surnameOutput, middleNameOutput, firstNameOutput, aptNumberOutput, streetNumberOutput, streetNameOutput, cityOutput, provinceOutput, postalCodeOutput, cslLoanAmountOutput, oslLoanAmountOutput, amortizationInput;
	private JPanel displayPanel;
	//formatting
	private Font labelFont, buttonFont, inputFont;
	private Color labelColor, buttonColor;
	private JButton clearButton, displayButton, saveButton;
	private JLabel cslRequiredLabel, oslRequiredLabel, totalRequiredLabel, totalWithInterestLabel, originalLoanLabel, totalInterestPaidLabel;
	private JFormattedTextField interestRateTextField;


	
	public StudentLoanApp() {

		//Creates the JFrame with the title
		super("Jarrod Grineau Student ID: 1002091");
		this.setSize(800, 800);
		//this.setLayout(new BorderLayout(10, 20));
		
		JLabel label = new JLabel("This is Jarrod Grineau's Student Loan Calculator ", SwingConstants.CENTER);
		label.setFont(new Font("Roboto", Font.BOLD, 25));
		label.setForeground(Color.BLACK);
		this.add(label, BorderLayout.NORTH);

		labelFont = new Font("cabin", Font.BOLD, 18);
		inputFont = new Font("cabin", Font.PLAIN, 18);
		labelColor = Color.BLACK;
		buttonColor = Color.WHITE;
		
		/**
		 * @Coder: Jarrod Grineau
		 * @Class Name: N/A
		 * @Purpose: This is the input form to take the students information
		 * 			 student#, full name, address and loan information. 
		 * @Date: August 2, 2022
		 */
		
		inputPanel = new JPanel(new GridLayout(12, 10));
		
		JLabel studentIDLabel = new JLabel("     StudentID: ");
		studentIDLabel.setFont(labelFont);
		studentIDLabel.setForeground(labelColor);
		inputPanel.add(studentIDLabel);
		studentIDInput = new JTextField(null);
		studentIDInput.setBackground(Color.YELLOW);
		studentIDInput.setFont(inputFont);
		inputPanel.add(studentIDInput);

		JLabel surnameLabel = new JLabel("     Surname: ");
		surnameLabel.setFont(labelFont);
		surnameLabel.setForeground(labelColor);
		inputPanel.add(surnameLabel);
		surnameInput = new JTextField(null);
		surnameInput.setBackground(Color.YELLOW);
		surnameInput.setFont(inputFont);
		inputPanel.add(surnameInput);

		JLabel middleNameLabel = new JLabel("     Middle name: ");
		middleNameLabel.setFont(labelFont);
		middleNameLabel.setForeground(labelColor);
		inputPanel.add(middleNameLabel);
		middleNameInput = new JTextField(null);
		middleNameInput.setFont(inputFont);
		inputPanel.add(middleNameInput);

		JLabel firstNameLabel = new JLabel("     First name: ");
		firstNameLabel.setFont(labelFont);
		firstNameLabel.setForeground(labelColor);
		inputPanel.add(firstNameLabel);
		firstNameInput = new JTextField(null);
		firstNameInput.setBackground(Color.YELLOW);
		firstNameInput.setFont(inputFont);
		inputPanel.add(firstNameInput);

		JLabel aptNumberLabel = new JLabel("     Apartment number: ");
		aptNumberLabel.setFont(labelFont);
		aptNumberLabel.setForeground(labelColor);
		inputPanel.add(aptNumberLabel);
		aptNumberInput = new JTextField(null);
		aptNumberInput.setFont(inputFont);
		inputPanel.add(aptNumberInput);

		JLabel streetNumberLabel = new JLabel("     Street number: ");
		streetNumberLabel.setFont(labelFont);
		streetNumberLabel.setForeground(labelColor);
		inputPanel.add(streetNumberLabel);
		streetNumberInput = new JTextField(null);
		streetNumberInput.setFont(inputFont);
		inputPanel.add(streetNumberInput);

		JLabel streetNameLabel = new JLabel("     Street name: ");
		streetNameLabel.setFont(labelFont);
		streetNameLabel.setForeground(labelColor);
		inputPanel.add(streetNameLabel);
		streetNameInput = new JTextField(null);
		streetNameInput.setFont(inputFont);
		inputPanel.add(streetNameInput);

		JLabel cityLabel = new JLabel("     City: ");
		cityLabel.setFont(labelFont);
		cityLabel.setForeground(labelColor);
		inputPanel.add(cityLabel);
		cityInput = new JTextField(null);
		cityInput.setFont(inputFont);
		inputPanel.add(cityInput);

		JLabel provinceLabel = new JLabel("     Province: ");
		provinceLabel.setFont(labelFont);
		provinceLabel.setForeground(labelColor);
		inputPanel.add(provinceLabel);
		provinceInput = new JTextField(null);
		provinceInput.setFont(inputFont);
		inputPanel.add(provinceInput);

		JLabel postalCodeLabel = new JLabel("     Postal code: ");
		postalCodeLabel.setFont(labelFont);
		postalCodeLabel.setForeground(labelColor);
		inputPanel.add(postalCodeLabel);
		postalCodeInput = new JTextField(null);
		postalCodeInput.setFont(inputFont);
		inputPanel.add(postalCodeInput);
 
		JLabel cslLoanAmountLabel = new JLabel("     CSL loan amount:                                       $");
		cslLoanAmountLabel.setFont(labelFont);
		cslLoanAmountLabel.setForeground(labelColor);
		inputPanel.add(cslLoanAmountLabel);
		cslLoanAmountInput = new JTextField(null);
		cslLoanAmountInput.setBackground(Color.YELLOW);
		cslLoanAmountInput.setFont(inputFont);
		inputPanel.add(cslLoanAmountInput);

		JLabel oslLoanAmountLabel = new JLabel("     OSL loan amount:                                       $");
		oslLoanAmountLabel.setFont(labelFont);
		oslLoanAmountLabel.setForeground(labelColor);
		inputPanel.add(oslLoanAmountLabel);
		oslLoanAmountInput = new JTextField(null);
		oslLoanAmountInput.setBackground(Color.YELLOW);
		oslLoanAmountInput.setFont(inputFont);
		inputPanel.add(oslLoanAmountInput);
		
		this.add(inputPanel, BorderLayout.CENTER);
		

		JPanel submissionPanel = new JPanel(new GridLayout(4, 4, 4, 4));
		buttonFont = new Font("Roboto", Font.BOLD, 20);

		clearButton = new JButton("Clear");
		clearButton.setFont(buttonFont);
		clearButton.setForeground(buttonColor);
		clearButton.setBackground(Color.red);
		clearButton.addActionListener(new clearButtonEvent());
		submissionPanel.add(clearButton);

		saveButton = new JButton("Save");
		saveButton.setFont(buttonFont);
		saveButton.setForeground(buttonColor);
		saveButton.setBackground(Color.blue);
		saveButton.addActionListener(new saveButtonAction());
		submissionPanel.add(saveButton);

		displayButton = new JButton("Display");
		displayButton.setFont(buttonFont);
		displayButton.setForeground(buttonColor);
		displayButton.setBackground(Color.green);
		displayButton.addActionListener(new displayButtonAction());
		submissionPanel.add(displayButton);

		this.add(submissionPanel, BorderLayout.SOUTH);
		
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	/**
	 * @Coder: Jarrod Grineau
	 * @Class Name: clearButtonEvent
	 * @Purpose: This is to make all the input text boxes empty to type another entry or delete what is already inputed.
	 * @Date: August 6, 2022
	 */
	private class clearButtonEvent implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {

			//Resets the values.
			studentIDInput.setText(null);
			surnameInput.setText(null);
			middleNameInput.setText(null);
			firstNameInput.setText(null);
			aptNumberInput.setText(null);
			streetNumberInput.setText(null);
			streetNameInput.setText(null);
			cityInput.setText(null);
			provinceInput.setText(null);
			postalCodeInput.setText(null);
			cslLoanAmountInput.setText(null);
			oslLoanAmountInput.setText(null);
		}
	}

	/**
	 * @Coder: Jarrod Grineau
	 * @Class Name: saveButtonAction
	 * @Purpose: This is used to save the data that was inputted
	 * @Date: August 6, 2022
	 */
	private class saveButtonAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			//Input validation is correct then the save button will add a Students input for calculations
			if(inputValidation() == true) {
				Student newRecord = new Student(studentIDInput.getText(), surnameInput.getText(), middleNameInput.getText(), firstNameInput.getText(), aptNumberInput.getText(), streetNumberInput.getText(), streetNameInput.getText(), cityInput.getText(), provinceInput.getText(), postalCodeInput.getText(), Double.parseDouble(cslLoanAmountInput.getText()), Double.parseDouble(oslLoanAmountInput.getText()));
				studentList.add(newRecord);
				JOptionPane.showMessageDialog(inputPanel, "Student Input Saved.");
			}else {
				JOptionPane.showMessageDialog(inputPanel, "ERROR! Input in Yellow Boxes Required");
			}
		}
	}

	/**
	 * @Coder: Jarrod Grineau
	 * @Class Name: displayButtonPress
	 * @Purpose: This the action of the display button that calls the Loan Calculation Page
	 * @Date: August 6, 2022
	 */
	private class displayButtonAction extends JFrame implements ActionListener {
		int i = 0;
		@Override
		public void actionPerformed(ActionEvent e) {

			if(!studentList.isEmpty()) {
				//Creates the display form.
				displayButton.setEnabled(false);
				this.setTitle("Jarrod Grineau's Loan Calculation Page");
				this.setSize(800, 800);
				this.setLayout(new BorderLayout(10, 20));
				
				//GridLayout for the input/JTextFields
				displayPanel = new JPanel(new GridLayout(14, 2, 5, 10));
				displayPanel.setBackground(Color.WHITE);
				
				JLabel studentIDLabel = new JLabel("     StudentID: ");
				studentIDLabel.setFont(labelFont);
				studentIDLabel.setForeground(labelColor);
				displayPanel.add(studentIDLabel);
				studentIDOutput = new JTextField(studentList.get(i).getStudentID());
				studentIDOutput.setEditable(false);
				displayPanel.add(studentIDOutput);

				JLabel surnameLabel = new JLabel("     Surname: ");
				surnameLabel.setFont(labelFont);
				surnameLabel.setForeground(labelColor);
				displayPanel.add(surnameLabel);
				surnameOutput = new JTextField(studentList.get(i).getSurname());
				surnameOutput.setEditable(false);
				displayPanel.add(surnameOutput);

				JLabel middleNameLabel = new JLabel("     Middle name: ");
				middleNameLabel.setFont(labelFont);
				middleNameLabel.setForeground(labelColor);
				displayPanel.add(middleNameLabel);
				middleNameOutput = new JTextField(studentList.get(i).getMiddleName());
				middleNameOutput.setEditable(false);
				displayPanel.add(middleNameOutput);

				JLabel firstNameLabel = new JLabel("     First name: ");
				firstNameLabel.setFont(labelFont);
				firstNameLabel.setForeground(labelColor);
				displayPanel.add(firstNameLabel);
				firstNameOutput = new JTextField(studentList.get(i).getFirstName());
				firstNameOutput.setEditable(false);
				displayPanel.add(firstNameOutput);

				JLabel aptNumberLabel = new JLabel("     Apartment number: ");
				aptNumberLabel.setFont(labelFont);
				aptNumberLabel.setForeground(labelColor);
				displayPanel.add(aptNumberLabel);
				aptNumberOutput = new JTextField(studentList.get(i).getAptNumber());
				aptNumberOutput.setEditable(false);
				displayPanel.add(aptNumberOutput);

				JLabel streetNumberLabel = new JLabel("     Street number: ");
				streetNumberLabel.setFont(labelFont);
				streetNumberLabel.setForeground(labelColor);
				displayPanel.add(streetNumberLabel);
				streetNumberOutput = new JTextField(studentList.get(i).getStreetNumber());
				streetNumberOutput.setEditable(false);
				displayPanel.add(streetNumberOutput);

				JLabel streetNameLabel = new JLabel("     Street name: ");
				streetNameLabel.setFont(labelFont);
				streetNameLabel.setForeground(labelColor);
				displayPanel.add(streetNameLabel);
				streetNameOutput = new JTextField(studentList.get(i).getStreetName());
				streetNameOutput.setEditable(false);
				displayPanel.add(streetNameOutput);

				JLabel cityLabel = new JLabel("     City: ");
				cityLabel.setFont(labelFont);
				cityLabel.setForeground(labelColor);
				displayPanel.add(cityLabel);
				cityOutput = new JTextField(studentList.get(i).getCity());
				cityOutput.setEditable(false);
				displayPanel.add(cityOutput);

				JLabel provinceLabel = new JLabel("     Province: ");
				provinceLabel.setFont(labelFont);
				provinceLabel.setForeground(labelColor);
				displayPanel.add(provinceLabel);
				provinceOutput = new JTextField(studentList.get(i).getProvince());
				provinceOutput.setEditable(false);
				displayPanel.add(provinceOutput);

				JLabel postalCodeLabel = new JLabel("     Postal code: ");
				postalCodeLabel.setFont(labelFont);
				postalCodeLabel.setForeground(labelColor);
				displayPanel.add(postalCodeLabel);
				postalCodeOutput = new JTextField(studentList.get(i).getPostalCode());
				postalCodeOutput.setEditable(false);
				displayPanel.add(postalCodeOutput);

				JLabel cslLoanAmountLabel = new JLabel("     CSL loan amount: $");
				cslLoanAmountLabel.setFont(labelFont);
				cslLoanAmountLabel.setForeground(labelColor);
				displayPanel.add(cslLoanAmountLabel);
				cslLoanAmountOutput = new JTextField(String.valueOf(studentList.get(i).getoslLoanAmount()));
				cslLoanAmountOutput.setEditable(false);
				displayPanel.add(cslLoanAmountOutput);

				JLabel oslLoanAmountLabel = new JLabel("     OSL loan amount: $");
				oslLoanAmountLabel.setFont(labelFont);
				oslLoanAmountLabel.setForeground(labelColor);
				displayPanel.add(oslLoanAmountLabel);
				oslLoanAmountOutput = new JTextField(String.valueOf(studentList.get(i).getoslLoanAmount()));
				oslLoanAmountOutput.setEditable(false);
				displayPanel.add(oslLoanAmountOutput);

				//Interest rate panel with JSpinner - up and down button via .25%.
				JLabel interestRateLabel = new JLabel("     Prime Interest Rate: ");
				interestRateLabel.setFont(labelFont);
				interestRateLabel.setForeground(labelColor);
				displayPanel.add(interestRateLabel);
				JSpinner interestRateSpinner = new JSpinner();
				interestRateSpinner = new JSpinner(new SpinnerNumberModel(0.00, 0.00, 100.00, 0.25));
				JSpinner.NumberEditor interestRateEditor = (NumberEditor)interestRateSpinner.getEditor();
				interestRateEditor.getTextField().setHorizontalAlignment(SwingConstants.LEFT);
				DecimalFormat format = new DecimalFormat();
				format = interestRateEditor.getFormat();
				format.setMinimumFractionDigits(2);
				interestRateTextField = ((JSpinner.DefaultEditor)interestRateSpinner.getEditor()).getTextField();
				interestRateTextField.setText("0.00");
				interestRateTextField.setEditable(false);
				displayPanel.add(interestRateSpinner);

				JLabel amortizationLabel = new JLabel("     Amortization Period in months: ");
				amortizationLabel.setFont(labelFont);
				amortizationLabel.setForeground(labelColor);
				amortizationLabel.setBackground(Color.YELLOW);
				displayPanel.add(amortizationLabel);
				amortizationInput = new JTextField(null);
				displayPanel.add(amortizationInput);

				this.add(displayPanel, BorderLayout.NORTH);

				//Calculation Panel
				JPanel calculationPanel = new JPanel(new GridLayout(4, 4, 4, 4));
				calculationPanel.setBackground(Color.GRAY);
				
				cslRequiredLabel = new JLabel("     CSL monthly payment: ");
				cslRequiredLabel.setFont(labelFont);
				cslRequiredLabel.setForeground(labelColor);
				calculationPanel.add(cslRequiredLabel);
				oslRequiredLabel = new JLabel("     OSL monthly payment: ");
				oslRequiredLabel.setFont(labelFont);
				oslRequiredLabel.setForeground(labelColor);
				calculationPanel.add(oslRequiredLabel);
				totalRequiredLabel = new JLabel("     Total monthly payment: ");
				totalRequiredLabel.setFont(labelFont);
				totalRequiredLabel.setForeground(labelColor);
				calculationPanel.add(totalRequiredLabel);
				totalWithInterestLabel = new JLabel("     Total payment with interest: ");
				totalWithInterestLabel.setFont(labelFont);
				totalWithInterestLabel.setForeground(labelColor);
				calculationPanel.add(totalWithInterestLabel);
				originalLoanLabel = new JLabel("     Original amount borrowed: ");
				originalLoanLabel.setFont(labelFont);
				originalLoanLabel.setForeground(labelColor);
				calculationPanel.add(originalLoanLabel);
				totalInterestPaidLabel = new JLabel("     Total interest paid: ");
				totalInterestPaidLabel.setFont(labelFont);
				totalInterestPaidLabel.setForeground(labelColor);
				calculationPanel.add(totalInterestPaidLabel);

				this.add(calculationPanel, BorderLayout.CENTER);

				JPanel submissionPanel = new JPanel(new GridLayout(4, 4, 4, 4));
				buttonFont = new Font("cabin", Font.BOLD, 20);

				JButton previousButton = new JButton("Previous");
				previousButton.setFont(buttonFont);
				previousButton.setForeground(buttonColor);
				previousButton.setBackground(Color.BLACK);
				previousButton.addActionListener(new previousButtonAction());
				submissionPanel.add(previousButton);

				JButton calculateButton = new JButton("Calculate");
				calculateButton.setFont(buttonFont);
				calculateButton.setForeground(buttonColor);
				calculateButton.setBackground(Color.BLACK);
				calculateButton.addActionListener(new calculateButtonAction());
				submissionPanel.add(calculateButton);

				JButton nextButton = new JButton("Next");
				nextButton.setFont(buttonFont);
				nextButton.setForeground(buttonColor);
				nextButton.setBackground(Color.BLACK);
				nextButton.addActionListener(new nextButtonAction());
				submissionPanel.add(nextButton);

				this.add(submissionPanel, BorderLayout.SOUTH);

				this.setLocationRelativeTo(null);
				this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				this.setVisible(true);
				
			}else {
				JOptionPane.showMessageDialog(inputPanel, "Student's input is empty. Please Fill in minimal information (Yellow boxes) to advance.");
			}
		}
	}

	/**
	 * @Coder: Jarrod Grineau
	 * @Class Name: previousButtonAction
	 * @Purpose: This the action of the previous button is to go back to the last student info that was inputed
	 * @Date: August 10, 2022
	 */
	private class previousButtonAction implements ActionListener {
		int i = 0;
		@Override
		public void actionPerformed(ActionEvent e) {

			//Checks if the viewed list is not the first.
			if(i > 0) {
				i--;
				studentIDOutput.setText(studentList.get(i).getStudentID());
				surnameOutput.setText(studentList.get(i).getSurname());
				middleNameOutput.setText(studentList.get(i).getMiddleName());
				firstNameOutput.setText(studentList.get(i).getFirstName());
				aptNumberOutput.setText(studentList.get(i).getAptNumber());
				streetNumberOutput.setText(studentList.get(i).getStreetNumber());
				streetNameOutput.setText(studentList.get(i).getStreetName());
				cityOutput.setText(studentList.get(i).getCity());
				provinceOutput.setText(studentList.get(i).getProvince());
				postalCodeOutput.setText(studentList.get(i).getPostalCode());
				cslLoanAmountOutput.setText(String.valueOf(studentList.get(i).getcslLoanAmount()));
				oslLoanAmountOutput.setText(String.valueOf(studentList.get(i).getoslLoanAmount()));
				
			}else {
				JOptionPane.showMessageDialog(displayPanel, "You are at the start of the list.");
			}
		}
	}

	/**
	 * @Coder: Jarrod Grineau
	 * @Class Name: calculateButtonAction
	 * @Purpose: This the action of the calculate button is to display the loan, combined monthly payments, 
	 * 			 amount paid with interest, original amount borrowed, and total amount of interest that is paid
	 * @Date: August 10, 2022
	 */
	private class calculateButtonAction implements ActionListener, J_G_LoanPayable {
		int i = 0;
		@Override
		public void actionPerformed(ActionEvent e) {

			//Calculations and input validation
			if(amortizationInput.getText().isBlank()) {
				JOptionPane.showMessageDialog(displayPanel, "Amortization period is required");
			}
			if(!Character.isDigit(amortizationInput.getText().charAt(i))) {
				JOptionPane.showMessageDialog(displayPanel, "ERROR! Amortization must only contain numbers");
			}
			else {
				DecimalFormat formatter = new DecimalFormat("$#,##0.00");

				double interestCsl = (Double.parseDouble(interestRateTextField.getText()) + 2.5) * ANNUAL_RATE_TO_MONTHLY_RATE;
				double interestOsl = (Double.parseDouble(interestRateTextField.getText()) + 1.0) * ANNUAL_RATE_TO_MONTHLY_RATE;
				double studentCslLoan = studentList.get(i).getcslLoanAmount();
				double studentOslLoan = studentList.get(i).getoslLoanAmount();
				int amortizationPeriod = Integer.parseInt(amortizationInput.getText());

				//Calculation results
				cslRequiredLabel.setText("     CSL monthly payment: " + formatter.format(calculateLoanPayment(studentCslLoan, interestCsl, amortizationPeriod)));
				oslRequiredLabel.setText("     OSL monthly payment: " + formatter.format(calculateLoanPayment(studentOslLoan, interestOsl, amortizationPeriod)));
				totalRequiredLabel.setText("     Total monthly payment: " + formatter.format(calculateLoanPayment(studentCslLoan, interestCsl, amortizationPeriod) + calculateLoanPayment(studentOslLoan, interestOsl, amortizationPeriod)));
				totalWithInterestLabel.setText("     Total payment with interest: " + formatter.format((calculateLoanPayment(studentCslLoan, interestCsl, amortizationPeriod) + calculateLoanPayment(studentOslLoan, interestOsl, amortizationPeriod)) * amortizationPeriod));
				originalLoanLabel.setText("     Original amount borrowed: " + formatter.format(studentCslLoan + studentOslLoan));
				totalInterestPaidLabel.setText("     Total interest paid: " + formatter.format((calculateLoanPayment(studentCslLoan, interestCsl, amortizationPeriod) + calculateLoanPayment(studentOslLoan, interestOsl, amortizationPeriod)) * amortizationPeriod - (studentCslLoan + studentOslLoan)));
			}
		}

		//abstract class from J_G_LoanPayable
		public double calculateLoanPayment(double amount, double rate, int amortization) {

			return(amount * rate * Math.pow((1.0 + rate), amortization) / (Math.pow((1 + rate), amortization) - 1.0));

		}
	}

	/**
	 * @Coder: Jarrod Grineau
	 * @Class Name: nextButtonAction
	 * @Purpose: This the action of the next button, is to go to the next student input form.
	 * @Date: August 10, 2022
	 */
	private class nextButtonAction implements ActionListener {
		int i = 0;
		@Override
		public void actionPerformed(ActionEvent e) {

			//If the list is not done - button push will move through the array
			if(studentList.size() > i + 1) {
				i++;
				studentIDOutput.setText(studentList.get(i).getStudentID());
				surnameOutput.setText(studentList.get(i).getSurname());
				middleNameOutput.setText(studentList.get(i).getMiddleName());
				firstNameOutput.setText(studentList.get(i).getFirstName());
				aptNumberOutput.setText(studentList.get(i).getAptNumber());
				streetNumberOutput.setText(studentList.get(i).getStreetNumber());
				streetNameOutput.setText(studentList.get(i).getStreetName());
				cityOutput.setText(studentList.get(i).getCity());
				provinceOutput.setText(studentList.get(i).getProvince());
				postalCodeOutput.setText(studentList.get(i).getPostalCode());
				cslLoanAmountOutput.setText(String.valueOf(studentList.get(i).getcslLoanAmount()));
				oslLoanAmountOutput.setText(String.valueOf(studentList.get(i).getoslLoanAmount()));
				
			}else {
				JOptionPane.showMessageDialog(displayPanel, "End of List");
			}
		}
	}

	/**
	 * @Coder: Jarrod Grineau
	 * @Class Name: boolean inputValidation
	 * @Purpose: This inputValidation is to validate the student Input
	 * 			 If it must be numbers and they type in letters is must throw an error and show a JOption message
	 * @Date: August 12, 2022
	 */
	public boolean inputValidation() {
		int i = 0;

		//student ID - blank, numbers only
		if(!studentIDInput.getText().isBlank()) {

			while(i < studentIDInput.getText().length()) {

				if(!Character.isDigit(studentIDInput.getText().charAt(i))) {
					JOptionPane.showMessageDialog(inputPanel, "ERROR! Student ID must only contain numbers.");
					return false;
				}
				i++;
			}

		}else {
			JOptionPane.showMessageDialog(inputPanel, "ERROR, Student ID is required");
			return false;
		}

		//last name - blank, letters only
		if(!surnameInput.getText().isBlank()) {

			while(i < surnameInput.getText().length()) {

				if(Character.isDigit(surnameInput.getText().charAt(i))) {
					JOptionPane.showMessageDialog(inputPanel, "ERROR! Surname must only contain letters");
					return false;
				}

				i++;
			}

		}else {
			JOptionPane.showMessageDialog(inputPanel, "Surname (Last name) is required");
			return false;
		}

		//middle name - letters only
		while(i < middleNameInput.getText().length()) {

			if(!Character.isAlphabetic(middleNameInput.getText().charAt(i))) {
				JOptionPane.showMessageDialog(inputPanel, "ERROR! Middle name/initial must only contain letter(s)");
				return false;
			}
			i++;
		}

		//first name - blank, letters only
		if(!firstNameInput.getText().isBlank()) {

			while(i < firstNameInput.getText().length()) {

				if(!Character.isAlphabetic(firstNameInput.getText().charAt(i))) {
					JOptionPane.showMessageDialog(inputPanel, "ERROR! First name must only contain letters");
					return false;
				}
				i++;
			}

		}else {
			JOptionPane.showMessageDialog(inputPanel, "First name is required");
			return false;
		}

		//apt number - numbers only
		while(i < aptNumberInput.getText().length()) {

			if(!Character.isDigit(aptNumberInput.getText().charAt(i))) {
				JOptionPane.showMessageDialog(inputPanel, "ERROR! Apartment number must only contain numbers");
				return false;
			}

			i++;
		}
		
		//Street number - numbers only
		while(i < streetNumberInput.getText().length()) {

			if(!Character.isDigit(streetNumberInput.getText().charAt(i))) {
				JOptionPane.showMessageDialog(inputPanel, "ERROR! Street number must contain only numbers");
				return false;
			}

			i++;
		}
		
		//CSL Loan validation - Blank, number only 
		if(!cslLoanAmountInput.getText().isBlank()) {

			while(i < cslLoanAmountInput.getText().length()) {

				if(!Character.isDigit(cslLoanAmountInput.getText().charAt(i))) {
					JOptionPane.showMessageDialog(inputPanel, "ERROR! CSL Loan must only contain numbers");
					return false;
				}
				++i;
			}
		}else {
			JOptionPane.showMessageDialog(inputPanel, "CSL loan amount is required");
			return false;
		}
		
		//CSL Loan validation - Negative number reversal
		try {
			negativeValue(Double.parseDouble(cslLoanAmountInput.getText()));
		}catch(J_G_NegativeValueException e) {
			JOptionPane.showMessageDialog(inputPanel, e.toString(), "ERROR! Connot enter Negative Value", JOptionPane.OK_OPTION);
			cslLoanAmountInput.setText("" + Math.abs(Double.parseDouble(cslLoanAmountInput.getText())));
		}
		
		//0SL Loan validation - Blank, number only
		if(!oslLoanAmountInput.getText().isBlank()) {

			while(i < oslLoanAmountInput.getText().length()) {

				if(!Character.isDigit(oslLoanAmountInput.getText().charAt(i))) {
					JOptionPane.showMessageDialog(inputPanel, "ERROR! OSL loan must only contain numbers");
					return false;
				}
				++i;
			}
		}else {
			JOptionPane.showMessageDialog(inputPanel, "OSL loan amount is required");
			return false;
		}
		//OSL Loan validation - Negative number reversal
		try {
			negativeValue(Double.parseDouble(oslLoanAmountInput.getText()));
		}catch(J_G_NegativeValueException e) {
			JOptionPane.showMessageDialog(inputPanel, e.toString(), "ERROR! Connot enter Negative Value", JOptionPane.OK_OPTION);
			oslLoanAmountInput.setText("" + Math.abs(Double.parseDouble(oslLoanAmountInput.getText())));
		}
		return true;
	}

	/**
	 * @Coder: Jarrod Grineau
	 * @Class Name: isNegative
	 * @Purpose: This inputValidation is to validate the student Input
	 * 			 If it must be numbers and they type in letters is must throw an error and show a JOption message
	 * @Date: August 12, 2022
	 */
	public void negativeValue(double value) throws J_G_NegativeValueException {

		//Checks if value received is negative.
		if(value < 0)
			throw new J_G_NegativeValueException(value);

	}
	/**
	 * @Coder: Jarrod Grineau
	 * @Class Name: Make the Class of the Student Loan Calculator run
	 * @Purpose: To run the Application
	 * @Date: August 12, 2022
	 */
	public static void main(String[] args) {
		
		new StudentLoanApp();

	}
}//end of class
