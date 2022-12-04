import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LabManual9 {
		  class first{
		     String reply;
			 public void FirstTry() throws IOException {
				 System.out.print("\nEnter your Pin Number: ");
				  InputStreamReader inputsr = new InputStreamReader(System.in);
				  BufferedReader inputr = new BufferedReader(inputsr);
				  reply = inputr.readLine();
			 }static void asterisks() {
				  System.out.println("****************************************************");
			 
			 }
			 public void SecondTry() throws IOException {
				 System.out.print("\nEnter your PUK Code: ");
				  InputStreamReader inputsr1 = new InputStreamReader(System.in);
				  BufferedReader inputr1 = new BufferedReader(inputsr1);
				  reply = inputr1.readLine();
				 }
		 }
	public static void main(String[] args) throws IOException {
		LabManual9 UI = new LabManual9();
		first redirect = UI.new first();
		String realnum = "0000";
	    String puk = "12345678";
	    int trials = 0;
	    redirect.FirstTry();
	   if(redirect.reply.equals(realnum)){
		   System.out.println("Welcome to Ethio Telecom");
		   first.asterisks();
	   }
	   else {
		   while(trials < 2){
               trials++;
			   System.out.println("Invalid Pin Number");
			   redirect.FirstTry();
			   
			   if(redirect.reply.equals(realnum)){
				   trials = 3;
				   System.out.println("Welcome to Ethio Telecom");
				  first.asterisks();		   
			   }
		   }
		   if(trials == 2) {
			   System.out.println("Invalid Pin Number");
			   redirect.SecondTry();
			   trials =0;
               if(redirect.reply.equals(puk)) {
            	   trials = 3;
            	   System.out.println("Welcome to Ethio Telocom");
            	   first.asterisks();
               }
			   while(trials < 2){
	               trials++;
				   System.out.println("Invalid PUK Code");
				   redirect.SecondTry();
			   }
			   if(trials == 2) {
				   System.out.println("SIM BLOCKED");
			   }
		   }
	    }
       }
	}