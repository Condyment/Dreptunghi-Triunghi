
public class Punct {
private int x,y;

public Punct(int x,int y)
{
	this.x=x;
	this.y=y;
}

public  int getx()
{
return x;	
}
public int  gety()
{
return y;	
}
@Override
public String toString()
{
	return  String.format("( %d %d)",getx(),gety());
	 }  
}