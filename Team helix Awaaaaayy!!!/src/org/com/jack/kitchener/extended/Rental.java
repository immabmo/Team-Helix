package org.com.jack.kitchener.extended;

public abstract class Rental {
	
	protected int days;
	protected double dist;
	protected double costPerKm = 1;
	
	protected void setDays(int days){
		this.days = days;
	}
	
	protected double getDist(){
		return dist;
	}
	
	protected void setDist(double dist){
		this.dist = dist;
	}
	

	protected void setCost(double cost){
		this.costPerKm = cost;
	}

}
