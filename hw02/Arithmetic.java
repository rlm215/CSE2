// Rachel Mahoney
// hw02
// Arithmetic 

// define a class
public class Arithmetic {

// define a main method
    public static void main(String[] args) {
    
// input variables are below
int nSocks=3; // number of socks
double sockCost$ =2.58; // cost per pair of socks 
// the $ sign above is is part of the variable name
int nGlasses=6; //number of drinking glasses 
double glassCost$ =2.29; //cost per glass
int nEnvelopes=1; //number of boxes of envelopes 
double envelopeCost$ =3.25; //cost for the envelopes
double taxPercent=0.06;
double totalSockCost, totalGlassCost, totalEnvelopeCost; //total amount variables
double subtotalCostofPurchase; //cost without tax
double totalCostofPurchase; //cost with tax
double sockTax, glassTax, envelopeTax; // values for Tax on total price each item
double totalTax; //total amount of tax that will be paid on this purchase

//below calculates total cost of item before tax added on 
//also summing up each item and how many bought of said item
totalSockCost= nSocks*sockCost$; 
totalGlassCost= nGlasses*glassCost$;
totalEnvelopeCost= nEnvelopes*envelopeCost$;
System.out.println ("The amount of socks purchased is " +nSocks+ ".");
System.out.println ("The total cost of socks is " +totalSockCost+ " dollars.");
System.out.println ("The amount of glasses purchased is " +nGlasses+ ".");
System.out.println ("The total cost of glasses is " +totalGlassCost+ " dollars.");
System.out.println ("The total amount of envelopes purchases is " +nEnvelopes+ ".");
System.out.println ("The total cost of the envelopes is " +totalEnvelopeCost+ " dollars.");

//below calculates Tax on each item
sockTax= (totalSockCost*taxPercent);
glassTax= (totalGlassCost*taxPercent);
envelopeTax = (totalEnvelopeCost*taxPercent);

//round the Tax to two decimal places
double FsockTax= (double) Math.round(sockTax*100)/100;
double FglassTax= (double) Math.round(glassTax*100)/100;
double FenvelopeTax= (double) Math.round(envelopeTax*100)/100;

System.out.println ("The tax on socks is " + FsockTax+ " dollars.");
System.out.println ("The tax on glasses is " + FglassTax+ " dollars.");
System.out.println ("The tax on envelopes is " + FenvelopeTax+ " dollars.");

//below calculates the total sales tax
totalTax= (sockTax+glassTax+envelopeTax);
System.out.println ("The total tax is " +totalTax+ " dollars.");

// below calculates the total cost of the purchase before tax
// also known as subtotal
subtotalCostofPurchase= totalSockCost+totalGlassCost+totalEnvelopeCost;
System.out.println ("The subtotal or cost before tax is " +subtotalCostofPurchase+ " dollars.");

// below is the final cost of the purchase with tax 
// With the rounded cost as well
totalCostofPurchase= subtotalCostofPurchase+totalTax;
double roundCost= (double) Math.round(totalCostofPurchase*100)/100;
System.out.println ("The final cost of the purchase with tax is " +roundCost+ " dollars.");
}
}
