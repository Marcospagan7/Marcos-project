import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

    		
    		
    		//Initialized Deck
    			
    		Card[] DeckArray = new Card[52]; 
    		
    		//Initialize Club
    		for (int i=0;i<13;i++) {
    			
    			DeckArray[i] = new Card(); 
    			
    			DeckArray[i].FaceValue = i + 1; 
    			
    			DeckArray[i].suite = "Clubs"; 
    			
    			DeckArray[i].Name = "";
    			
    			if(i==0) {
    				DeckArray[i].Name = "Ace";
    			}
    			
    			if(i==10) { 
    				
    				DeckArray[i].FaceValue--;
    				DeckArray[i].Name = "Jack"; 
    			
    			}
    			if(i==11) {
    				DeckArray[i].FaceValue -= 2;
    				DeckArray[i].Name = "Queen";
    			}
    			if(i==12) {
    				DeckArray[i].FaceValue -= 3;
    				DeckArray[i].Name = "King";
    			}
    		}
    		//Initialize Spades
    			for (int i=13;i<26;i++) {
    				
    				DeckArray[i] = new Card(); 
    				
    				DeckArray[i].FaceValue = i - 13 + 1; 
    				
    				DeckArray[i].suite = "Spades"; 
    				
    				DeckArray[i].Name = "";
    				
    				if(i==13) {
    					DeckArray[i].Name = "Ace";
    				}
    				
    				if(i==23) { 
    					
    					DeckArray[i].FaceValue--;
    					DeckArray[i].Name = "Jack"; 
    				
    				}
    				if(i==24) {
    					DeckArray[i].FaceValue -= 2;
    					DeckArray[i].Name = "Queen";
    				}
    				if(i==25) {
    					DeckArray[i].FaceValue -= 3;
    					DeckArray[i].Name = "King";
    				}
    			}
    			
    			//Initialize Hearts
    					for (int i=26;i<39;i++) {
    						
    						DeckArray[i] = new Card(); 
    						
    						DeckArray[i].FaceValue = i - 26 + 1; 
    						
    						DeckArray[i].suite = "Hearts"; 
    						
    						DeckArray[i].Name = "";
    						
    						if(i==26) {
    							DeckArray[i].Name = "Ace";
    						}
    						
    						if(i==36) { 
    							
    							DeckArray[i].FaceValue--;
    							DeckArray[i].Name = "Jack"; 
    						
    						}
    						if(i==37) {
    							DeckArray[i].FaceValue -= 2;
    							DeckArray[i].Name = "Queen";
    						}
    						if(i==38) {
    							DeckArray[i].FaceValue -= 3;
    							DeckArray[i].Name = "King";
    						}
    					}
    					//Initialize Diamonds
    					for (int i=39;i<52;i++) {
    						
    						DeckArray[i] = new Card(); 
    						
    						DeckArray[i].FaceValue = i - 39 + 1; 
    						
    						DeckArray[i].suite = "Diamonds"; 
    						
    						DeckArray[i].Name = "";
    						
    						if(i==39) {
    							DeckArray[i].Name = "Ace";
    						}
    						
    						if(i==49) { 
    							
    							DeckArray[i].FaceValue--;
    							
    							DeckArray[i].Name = "Jack"; 
    						
    						}
    						if(i==50) {
    							DeckArray[i].FaceValue -= 2;
    							DeckArray[i].Name = "Queen";
    						}
    						if(i==51) {
    							DeckArray[i].FaceValue -= 3;
    							
    							DeckArray[i].Name = "King";
    						}
    					}
    
    	
    	
    	    
          
          
          
          
          
          
          
          
          
          
          //Shuffling Deck
    		for(int i = 0;i <DeckArray.length; i++) {
    			int j = (int)(Math.random()*DeckArray.length);    			
    			
          //switching variable arrays within each other
    			
          Card temp = DeckArray[i];
    			DeckArray[i]= DeckArray[j];
    			DeckArray[j]= temp; 
    			
    		}
    		
    		int totalcredits = 100;
			
    		int wager = 0;
    		
    		Scanner in = new Scanner(System.in);
    		//Setting the minimum wager to 25. Keep asking for wager if it's less than 25

      System.out.println("         | |                    ");
      System.out.println("        |   |                    ");
      System.out.println("       |     |          ");
      System.out.println("     |   ^  ^  |                       ");
      System.out.println("    |   _______  |                  ");
      System.out.println("   |   |_______|  |           ");
      System.out.println("  |              |        ");
      System.out.println(" |              |          ");
      System.out.println("|              |                    ");

        System.out.println("WELCOME TO BLACK JACK! ");

        boolean startplaying = true;

        while(startplaying == true){
          
        System.out.println("Press enter twice to play or press X if you want to review the rules of blackjack");

        String userinput = in.nextLine();
        
        if(userinput.equals("x")) {

          System.out.println("The goal of blackjack is simple, you must beat the dealer's hand by whoever is closest to 21 without going over. In this version numbered cards hold their face value while jack, king, and queen all hold a value of 10 and the ace holds a value of 1. First you the player must place a bet. You'll then be dealt two cards. The dealer also has two cards but one is face up while the other is face down. The dealer will then ask if you would like to be dealt another card. He will keep asking until you either say no or go over 21 which is called a bust and will result in a loss for you. If you wish to stop drawing cards before you reach 21 then the dealer will then reveal his face down card and try and get closer to 21 than you by drawing cards. Closet to 21 wins. Press enter to play.  ");
          
          }
        if(userinput.equals("y"));{
          
          startplaying = false;
          

          }
        
        
        }
        in.nextLine();

        

    		
    		while (wager <1 || wager>1000000000) {
    			
          System.out.println("Enter your desired bet: " );
    			
    			wager = in.nextInt();
    			
    			if (wager < 1 ) {
    				System.out.println("You've entered an unacceptable amount. Try again. ");
    			}
    						
			if(wager>1000000000) {
    				System.out.println("The bet entered is above the maximum amount. ");
    			}
      
    			



in.nextLine();//Clear scanner buffer
    		}

			
    		
			System.out.println("Your first two cards are " + DeckArray[0].printCard() + " and " + DeckArray[1].printCard());
			
			System.out.println("Dealer's first card is " + DeckArray[3].printCard());
			
			boolean continueplaying = true;
			
			int topcard = 5; //decks next top card
			
			int hiddencard = 4; //dealers second card face down
			
			int playersum = DeckArray[0].FaceValue +  DeckArray[1].FaceValue; 
			
			int dealersum =  DeckArray[3].FaceValue +  DeckArray[4].FaceValue;
			
			int winnings = totalcredits + (wager * 2);
			
			double BlackJackwinnings = totalcredits + (wager * 2.5);
			
			while (continueplaying == true) { 
				
				System.out.println("If you want another card enter y if you would like to stay enter n: ");
				
				String userinput = in.nextLine();
				
				 if(userinput.equals("y")) {
					 
					 System.out.println("Your next card is " + DeckArray[topcard].printCard());
					 
					 playersum += DeckArray[topcard++].FaceValue; 
					 
					 if (playersum > 21) {
						 System.out.println("It's a bust. You lost " + wager + " credits");
					
						 continueplaying = false;
						
					 }
				}
				else if (userinput.equals("n")){
					 
					 System.out.println("The Dealer's second card is " + DeckArray[hiddencard].printCard());
					 
					 if(dealersum < 21) {
						 System.out.println("The dealer's next card is " + DeckArray[topcard].printCard());
						 
						 dealersum += DeckArray[topcard++].FaceValue; 
						 
						  
					 }
					 
					 if (dealersum > 21) {
						if (playersum < 21) {
							 System.out.println("Congrats you win a total of " + winnings); 
						}
						else {
							System.out.println("Congrats you win Black Jack! You won a total of " + BlackJackwinnings); 
						}
						
						break;
				    }
					 
					 if (playersum > dealersum && playersum < 21) {
						 
						 System.out.println("Congrats you win a total of " + winnings); 
					 }
					 else if (playersum > dealersum && playersum == 21) {
						 
						 System.out.println("Congrats you win Black Jack! You won a total of " + BlackJackwinnings); 
					 }
					 else if (playersum < dealersum) {
						 
						 System.out.println("Sorry you lost " + wager + " credits"); 
					 }
					 else if (playersum == dealersum ) {
						 
						 System.out.println("It's a draw. No one wins "); 
					 }
					 
					 continueplaying = false;
					 
				 }
				 
			}//end of while
    	}//end of main 
    		
 //end of CardGame class









    
  }

  class Card {

    //member variables
	int FaceValue;
	String Name; 
	String suite; 
	
	//Return a string for printing based on card type
	String printCard() {
		if (Name == "King" || Name == "Queen" || Name == "Jack" || Name == "Ace") {
			return (this.Name + " of " + this.suite);
		}
		else{
			return (this.FaceValue + " of " + this.suite);
	}
	
	}












  }
