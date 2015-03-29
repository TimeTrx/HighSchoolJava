import java.io.*;
public class StudentRecord
{
    protected int studentNum;
    protected String name;
    protected String teacher;
    protected double gradeAvg;
    protected static final int RECORD_SIZE = 57;
    
    public StudentRecord (RandomAccessFile input) throws IOException
    {
	studentNum = input.readInt();
	
	byte[] nameBytes = new byte[30];
	input.readFully(nameBytes);
	name = new String(nameBytes,0);     //convert to String
	
	byte[] teacherBytes = new byte[15];
	input.readFully(teacherBytes);
	teacher = new String(teacherBytes,0);
	
	gradeAvg = input.readInt();
    }
    public StudentRecord(int studentNum, String name, String teacher, double gradeAvg)
    {
	this.studentNum = studentNum;
	this.name = name;
	this.teacher = teacher;
	this.gradeAvg = gradeAvg;
    }
    public void write(RandomAccessFile output) throws IOException
    {
	output.writeInt(studentNum);
	
	byte[] nameBytes = new byte[30];
	name.getBytes(0,name.length(), nameBytes, 0);
	output.write(nameBytes);
	
	byte[] teacherBytes = new byte[15];
	teacher.getBytes(0, teacher.length(), teacherBytes,0);
	
	output.writeDouble(gradeAvg);
    }
    public int getStudentNumber()
    {
	return studentNum;
    }
    public String getName()
    {
	return name;
    }
} 
