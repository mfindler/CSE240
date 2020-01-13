public class Assignment {
   public static void main(String[] args) { 
    ExaminationSeating examinationSeating; 
    Student tempStudent;
     int row, col, rowNum, columnNum; 
    String studentInfo; 
    Scanner scan = new Scanner(System.in); 
    // Ask a user to enter a number of rows for a examination seating    
    System.out.println 
    ("Please enter a number of rows for a examination seating."); 
    rowNum = scan.nextInt(); 
    
    // Ask a user to enter a number of columns for a examination seating   
    System.out.println 
    ("Please enter a number of columns for a examination seating.");   
    columnNum = scan.nextInt(); 

    // instantiate a ExaminationSeating object 
    examinationSeating = new ExaminationSeating(rowNum, columnNum); 
    
    System.out.println 
    ("Please enter a student information or enter \"Q\" to quit.");
    /### reading a student's information ###/ 
    studentInfo = scan.next(); 
    /# we will read line by line ##/ 
    while (!studentInfo.equalsIgnoreCase("Q")){ 
      System.out.println("\nA student information is read."); 
      // printing information read from a file. 
      System.out.println(studentInfo); 

      // creating a student object using the student information from a user 
      tempStudent = new Student(studentInfo); 

      // Ask a user to decide where to seat a student by asking 
      // for row and column of a seat 
      System.out.println 
      ("Please enter a row number where the student wants to sit."); row =        
      scan.nextInt(); 

      System.out.println 
      ("Please enter a column number where the student wants to sit."); 
      col = scan.nextInt(); 
			
	      // Checking if the row number and column number are valid  
			// (exist in the examination that we created.)  
      if (examinationSeating.checkBoundaries(row, col) == false) { 
        System.out.println("\nrow or column number is not valid.");    
        System.out.println ("A student " + tempStudent.getFirstName() + 
          " " + tempStudent.getLastName() + " is not assigned a seat."); 
      } else { 
        // Assigning a seat for a student 
        if (examinationSeating.assignStudentAt(row,col,tempStudent) == true){ 
          System.out.println("\nThe seat at row " + row + " and column " + 
          col + " is assigned to the student " + tempStudent.toString()); 
          System.out.println(examinationSeating); 
        } else { 
          System.out.println("\nThe seat at row " + row + " and column " + 
          col + " is taken."); 
        } 
      } 
      // Read the next studentInfo 
      System.out.println 
        ("Please enter a student information or enter \"Q\" to quit."); 
      /### reading a student's information ###/ 
      studentInfo = scan.next(); 
    }
    Scan.close(); 
  } 
} 
