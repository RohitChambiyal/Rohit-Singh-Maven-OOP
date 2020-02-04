package com.rohit.NewYearGift;

/**
 * Hello world!
 *
 */

abstract class candies {
	abstract void findCandies();
}
interface chocolate{
	void findChocolates();
}
class sweets {
	String sweet_name;
	boolean chocolate;
	boolean candies;
	
	sweets(String sweet_name,boolean chocolate){
		this.sweet_name = sweet_name;
		this.chocolate = chocolate;
		candies = !chocolate;
	}
	
}
class gift extends candies implements chocolate{
	int gift_no;
	int weight;
	sweets gifts[];
	gift(int weight,sweets S[],int gift_no){
		this.gift_no = gift_no;
		this.weight = weight;
		gifts = new sweets[weight];
		for(int i=0;i<weight;i++) {
			gifts[i] = S[i];
		}
	}
   void	findCandies() {
	int candies=0;
	for(int i=0;i<gifts.length;i++) {
		if(gifts[i].candies==true) 
			candies++;
	}
	System.out.println("Total candies in gift "+gift_no +" = "+ candies);
	int c=1;
	System.out.println("Sorted Candies List on bases of placement of candies in the gift "+ gift_no);

	for(int i=0;i<gifts.length;i++) {

		if(gifts[i].candies==true) {
			System.out.println(c+". "+gifts[i].sweet_name);
			c++;
		}
	}
   }
   public void	findChocolates() {
		int choco=0;
		for(int i=0;i<gifts.length;i++) {
			if(gifts[i].chocolate==true) 
				choco++;
		}
		System.out.println("Total chocolates in gift "+gift_no +" = "+ choco);
		int c=1;
		System.out.println("Sorted Chocolates List on bases of placement of chocolates in the gift "+ gift_no);
		for(int i=0;i<gifts.length;i++) {
			
			if(gifts[i].chocolate==true) {
				System.out.println(c+". "+gifts[i].sweet_name);
				c++;
			}
		}
	  }
}
public class App 
{
    public static void main( String[] args )
    {
    	sweets S[] = new sweets[7];
        S[0] = new sweets("Toffie",false);
        S[1]= new sweets("Choco",true);
        S[2]= new sweets("Rasgulla",false);
        S[3]= new sweets("Munch",true);
        S[4]= new sweets("Gulab Jamun",false);
        S[5]= new sweets("Kit Kat",false);
        S[6]= new sweets("Snickers",true);
        int total_gifts=0;
        gift G1 = new gift(5,S,++total_gifts);
        gift G2 = new gift(3,S, ++total_gifts);
        G1.findCandies();
        G1.findChocolates();
        G2.findCandies();
        G2.findChocolates();

        //gift size() function;
        
    }
}
