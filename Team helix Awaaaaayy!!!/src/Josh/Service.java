package Josh;

public class Service {


//Instance variables or attributes
	int servicedat;
	boolean serviced = false;
	
	

//Constructor
public Service(int sa)
{
	servicedat=sa;
	serviced=true;
	
}
public Service()
{
	servicedat=0;	
}

public String speak()
{
	if(serviced){
	return("The vehicle was serviced at " +servicedat);
}else{
	return "The vehicle has not yet been serviced.";
	}
}

}

