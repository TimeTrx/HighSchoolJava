public class Property
{
    double storey;
    double width;
    double length;

    public Property (double numFloors, double len, double wid)
    {
	storey = numFloors;
	length = len;
	width = wid;
    }


    public Property (double len, double wid)
    {
	length = len;
	width = wid;
    }


    public double calculateArea ()
    {
	if (storey == 0)
	{
	    storey = 1;
	}
	double area = (length * width) * storey;
	return area;
    }


    public double calculatePrice (double area)
    {
	double price = ((area * 2.24) * 1.15);
	return price;
    }
}





