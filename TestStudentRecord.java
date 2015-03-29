import java.io.*;
public class TestStudentRecord
{
    public static void main (String[] args)throws IOException
    {
	int number;
	String name, teacher;
	double avg;
	
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	RandomAccessFile schoolFile=new RandomAccessFile("school.txt", "rw");
	
	System.out.println("enter student number (1-600): ");
	number = Integer.valueOf(in.readLine()).intValue();
	
	System.out.println("Enter student name: ");
	name = in.readLine();
	
	System.out.println("Enter homeroom teacher: ");
	teacher = in.readLine();
	
	System.out.println("Enter student grade average: ");
	avg = Double.valueOf(in.readLine()).doubleValue();
	
	StudentRecord student = new StudentRecord(number,name,teacher,avg);
	schoolFile.seek((long)number * StudentRecord.RECORD_SIZE);
	student.write(schoolFile);
	
    } 
} 
