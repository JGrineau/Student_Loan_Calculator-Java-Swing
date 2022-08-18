/**
 * @Coder: Jarrod Grineau
 * @Class Name: Student
 * @Purpose: Student base class that provides getters and setters(not studentID)
 * @Date: August 2, 2022
 */
public class Student {
	
	//Variables
	private String studentID;
	private String surname;
	private String middleName;
	private String firstName;
	private String aptNumber;
	private String streetNumber;
	private String streetName;
	private String city;
	private String province;
	private String postalCode;
	
	private double cslLoanAmount;
	private double oslLoanAmount;
	
	//Constructor
	public Student(String studentID, String surname, String middleName, String firstName, String aptNumber, String streetNumber, String streetName, String city, String province, String postalCode, double cslLoanAmount, double oslLoanAmount) {

		this.studentID = studentID;
		this.surname = surname;
		this.middleName = middleName;
		this.firstName = firstName;
		this.aptNumber = aptNumber;
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;

		this.cslLoanAmount = cslLoanAmount;
		this.oslLoanAmount = oslLoanAmount;
	}
	
	//Getters.
		public String getStudentID(){ 
			return this.studentID; 
			}
		public String getSurname(){ 
			return this.surname; 
			}
		public String getMiddleName(){ 
			return this.middleName; 
			}
		public String getFirstName(){ 
			return this.firstName; 
			}
		public String getAptNumber(){ 
			return this.aptNumber; 
			}
		public String getStreetNumber(){ 
			return this.streetNumber; 
			}
		public String getStreetName(){ 
			return this.streetName; 
			}
		public String getCity(){ 
			return this.city; 
			}
		public String getProvince(){ 
			return this.province; 
			}
		public String getPostalCode(){ 
			return this.postalCode; 
			}

		public double getcslLoanAmount(){ 
			return this.cslLoanAmount; 
			}
		public double getoslLoanAmount(){ 
			return this.oslLoanAmount; 
			}
		


		//Setters
		public void setSurname(String surname){ 
			this.surname = surname; 
			}
		public void setMiddleName(String middleName){ 
			this.middleName = middleName; 
			}
		public void setFirstName(String firstName){ 
			this.firstName = firstName; 
			}
		public void setAptNumber(String aptNumber){ 
			this.aptNumber = aptNumber; 
			}
		public void setStreetNumber(String streetNumber){ 
			this.streetNumber = streetNumber; 
			}
		public void setStreetName(String streetName){ 
			this.streetName = streetName; 
			}
		public void setCity(String city){ 
			this.city = city; 
			}
		public void setProvince(String province){ 
			this.province = province; 
			}
		public void setPostalCode(String postalCode){ 
			this.postalCode = postalCode; 
			}

		public void setCslLoanAmount(double cslLoanAmount){ 
			this.cslLoanAmount = cslLoanAmount; 
			}
		public void setOslLoanAmount(double oslLoanAmount){ 
			this.oslLoanAmount = oslLoanAmount; 
			}
		
		/**
		 * @Coder: Jarrod Grineau
		 * @Class Name: toString
		 * @Purpose: Override String class to create a string for student name, student number(getter) and Loan info
		 * 			 This is for the (Yellow) important info only. 
		 * @Date: August 2, 2022
		 */
		@Override
		public String toString(){

			return "Student Name: " + this.surname + ", " + this.firstName + " " + this.middleName + "Student Number: " + this.getStudentID() + "CSL Amount is " + this.cslLoanAmount + "OSL Amount is: " + this.oslLoanAmount;

		}
	
	
	
	
	
	
}
