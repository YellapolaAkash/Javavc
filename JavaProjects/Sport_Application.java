package ArrayChapter1;
import java.util.*;
import java.util.Scanner;

public class Sport_Application {
	public void callFinals() {
		Scanner sc=new Scanner(System.in);	
	
				System.out.println("LET'S PLAY SHORT GAME");
				System.out.println("     FINAL MATCH     ");
				System.out.println("---------------------");
				System.out.println("|    CSK VS RCB     |");
				System.out.println("---------------------");
				System.out.println("CHOOSE YOUR TEAM");
				System.out.println("1. CSK    2.RCB ");
				int s3=sc.nextInt();
				System.out.println(" LET'S HAVE A TOSS");
				System.out.println("CHOSSE BELOW OPTION");
				System.out.println("1. HEADS");
				System.out.println("2. TAILS");
				int s=sc.nextInt();
				switch(s)
				{
				case 1://HEADS
					System.out.println("WHAT U WANT TO CHOSSE");
					System.out.println("1. BATTING	2.BOWLING");
					int s1=sc.nextInt();
					switch(s1)
					{
					case 1://T WON
						System.out.println("CSK WON THE TOSS AND CHOOSE TO BAT");
						System.out.println("        RCB NEED TO BOWL		  ");
					break;
					case 2://T LOSE
						System.out.println("RCB WON THE TOSS AND CHOOSE TO BOWL");
						System.out.println("		 CSK NEED TO BAT		  ");
					break;
					default:
						System.out.println("INVALID INPUT");
					break;
					}
					break;
				case 2://TAILS
					System.out.println("WHAT U WANT TO CHOSSE");
					System.out.println("1. BATTING	2.BOWLING");
					int s2=sc.nextInt();
					switch(s2)
					{
					case 1://T WON
						System.out.println("CSK WON THE TOSS AND CHOOSE TO BAT");
						System.out.println("        RCB NEED TO BOWL          ");
						break;
					case 2://T LOSE
						System.out.println("RCB WON THE TOSS AND CHOOSE TO BOWL");
						System.out.println("		CSK NEED TO BAT		  ");
						break;
					default:
						System.out.println("INVALID INPUT");
						break;
					}
					break;
				default:
					System.out.println("INVALID INPUT");
					break;
				}
				
				System.out.println();
				System.out.println("---------------------SCORECARD-----------------------");
				System.out.println("CSK : 203/5 (20 overs)         RCB : 203/2 (20 overs)");
				System.out.println();
				System.out.println("If you want to play a super over game: press 1");
				int d=sc.nextInt();
				if(d==1) {
				int a[]=new int[] {1,2,3,4,5,6};
				Random r=new Random();
				int x,y=1,i=0,i1=0,sum=0,sum1=0;
				while(y<=2) {
					System.out.println("Innings: ");
				System.out.println("1. CSK");
				System.out.println("2. RCB");
				int sw=sc.nextInt();
				switch(sw)
				{
				case 1:
					System.out.println("CSK SCORE");
					for(x=0;x<a.length;x++)
					{
						int ball=r.nextInt(7);
						System.out.println(i+1 + " ball");
						i++;
					
						if(ball==5)
						{
						
							System.out.println("Throw (2 runs) + three runs:");
							sum=sum+ball;
						}
						sum=sum+ball;
						System.out.println(ball + " run");
						System.out.println("----------");
					}
					System.out.println("CSK score: "+ sum);
					System.out.println();
				break;
				case 2:
					System.out.println("RCB SCORE");
					for(x=0;x<a.length;x++)
					{
						int ball=r.nextInt(7);
						System.out.println(i1+1 + " ball");
						i1++;
					
						if(ball==5)
						{
						
							System.out.println("Throw (2 runs) + three runs:");
							sum1=sum1+ball;
						}
						sum1=sum1+ball;
						System.out.println(ball + " run");
						System.out.println("----------");
					}
					System.out.println("RCB score: "+ sum1);
					System.out.println();
					if(sum>sum1)
					{
						System.out.println("CSK WON THE MATCH");
						 System.out.println();
						 System.out.println("                         ..:^:!^.:^^.                 ");                        
				         System.out.println("                      :??7J7!!7?JJ7^:^~:            ");                      
				         System.out.println("                    :7Y!:^.:^:.:^~~!!7JJ!...:.         ");                       
				         System.out.println("                 :^^!!.  ::::.   .::^^^^^^^~7?^.         ");                       
				         System.out.println("           ...^!J!?.  ~.   .:?7^.. .:~?!:            ");                       
				         System.out.println("         :?7^^!!^:^^:^!? .::^YJ77J7:::. :!7!:.       ");                       
				         System.out.println("          !?^^^7!^:..~J^  ?!Y557PYY5555  .7YJ?~.       ");                       
				         System.out.println("           5J!?#P7: .? ^P7?P?P?PYYYP7PYY~  !7.         ");                       
				         System.out.println("            :!^ 7@G^  7~  G?#?BJB??GG^BPB   ~7         ");                       
				         System.out.println("                 5@J:.7  .7#?BJGJG  P5^G?5?    JY^       ");                       
				         System.out.println("             :!7^YG?.^YP?7BY:YB~YP!PG!5?!75Y:?!.        ");                      
				         System.out.println("             5YYJ:~J  #@#@P. P@^P@P@#G#.^7&^:JJ.       ");                       
				         System.out.println("             ??!!?^?7 B@G@# B&^YG:^J:??GJ~GG .~.       ");                       
				         System.out.println("              ^7?^: 7~ #@7!P7.^:.          .:^           ");                       
				         System.out.println("                .   ^.7.                               ");                            
					}
					else
					{
						System.out.println("RCB WON THE MATCH");
						System.out.println();
						System.out.println("                               !~                                                     		");
						System.out.println("                           ^5J75^                                                   ");
						System.out.println("                       :?.^~!@?!@?  .J:                                              ");
						System.out.println("                     !7^?^!5!?!.?YJJ: .57^:.!                                         ");
						System.out.println("	               .7GYY::JGJ77Y577YGJ^:Y?P7.                                         ");
						System.out.println("		          :7JG.:!!!7!!!!!!: PJ7^                                           ");
						System.out.println("	            !~^:.  :G7?JYYY5YYYYY?7G:                                             ");
						System.out.println(".                 :?B7YY??!.5PJ??JYJYJYY557                                :~!:     ");
						System.out.println("^G?                 JB~7??JJJ&B.^!77YYJJYPB??^:...                        !J?!?PPBP?~     ");
						System.out.println("P~Y?                .GG!^!?^^!    ^!?7!?7 :^5PJ5!                    .5?. ~G!!!^:..    ");
						System.out.println("?P: ~G       .         7GPJ?!:      ^!5G5?Y57   ^G&?.                   .P7   ~Y77!7J5PY:  ");
						System.out.println(":5J7! ?J   .Y5!        7B?:^5B&7    7J@5^75BP7^.?5                     JJ    .?5G##P!^:  ");
						System.out.println("!B! P~.P:  75JP:      .?P^ G5YG:   75^G^B.    :!J#~                    !5!   :#GJ7~^       ");
						System.out.println(":&?  P^^G :GY.5~   J7^~~7J7   ^^7J:^J7 G^!5^G.7?7!^. .!:                   !PY!   :G^.::      ");  
						System.out.println("@!  ?Y.P^B5  P   7G5?J?7J^   ?5JP&P:Y? Y??J ^::?J??!:                  ?B?~Y^  .~!7!!PY.  ");  
						System.out.println(".B&~  P7^5@!  J?    :!!JYG7  !GGP5?^ B .&Y7?^.....^                   :YP^^Y?G::^^^^^7G5.   ");  
						System.out.println(":P&Y. 57.Y?  ^G.     !5GJ  7#57?:  .^Y7:#@GGP55555G7     .           ^5B7 Y!&J??7J5P5J      "); 
						System.out.println(":777B@&J^JY.  YJ     G!P.  .. 7J.:7PP57 &P77?J?!:  .:7G7         JG5. JJ.G@5              "); 
						System.out.println("5!Y5?!!~ ~P^ ^G    !5J7 ~^  :YJJ?J5JG#^ ~JJ!!!!?JYYJ5GG?         7P~P  YJ ?#&!              ");  
						System.out.println("G~^Y~J5PP5J^:5~ :B.!??Y^77PP: ^PJ7?YJ^ B#^J!~5:  ?GPPP5J!:.^!!77!!^ .?5J^:J :#BP              ");   
						System.out.println("JJ:5G?^^^755^ :B:~JJ??55G.  G&YJ!.   55^~J.~P  ^??7??JJ5PB###BP5P7  ~YPBP^YJ@J              ");   
						System.out.println("!BY        ?B.  :B.    Y7P?  .J!.  5 .::@?.? !J~7?Y5555YJ7^!!!!7!^:..^PBY.7~              ");   
						System.out.println(":.         BJ  5    :B.P!      !G@B?:J!YJ5P: ?Y   ^^^^^^^^:^???J5GBGY7~ 7~                   "); 
						System.out.println("5P  57    .G:J?    !G#YP@5^:. 57:#@Y^Y7  !PGJ!^7JY5Y?7^~J#BY7                      ");
						System.out.println("P5 ^G.     5:!5~ :5B7 ?@5Y^Y! :P~ !PBJ57  .?&GY!^75J5BGPY7^:G@Y?^                    ");
						System.out.println("G7 57   ..!P5@5J7575: P@?Y!!#G~.P!  .!?G!   ^PPPJ.!Y..?G5YY! Y&GY?~~^                ");
						System.out.println(":B:75   .JGBG57#7!: P^ ~&&?J .JB575.  ?!^:  Y^ JPGP^^P: YPG7P  ^YPPY57               "); 
						System.out.println("JY P7!!:  ..   #J  ^5: ~##?:  .?Y:  J&5?!.GB7.^JB@J!5 .P@Y5:    .                   ");
						System.out.println("^G. .:^7G~  ^^~YJ .YBY~5! :G5  :G?^.   Y575Y7P^!Y7:.!PP5? .5BYY.                       ");
						System.out.println(".^^:  ^P^:7?7!!Y! .55J??YGB5?P:57 .5. ^&GJ?.7B5!!JY7   ~JJ.:?P:  :!Y?.                      ");
						System.out.println(".?J7!??^J~?J^.        :~^. 5J5J^G     55:PJ!7^:J7?Y5GP~   :!J?^.                  . .       ");  
						System.out.println(".JPBBG! . YJ                  ^&B7Y7   :5PY .B^.~:!5: ^J#@G!    :7J7:           .!7777YPY:    ");   
						System.out.println(".&B7!J#J !P                   ?B!!~  :JP?5J  5?J~7JJJ 7:.7G@B?.    JJ        !57. .5Y:.     ");   
						System.out.println("?^   .G^5!                  .~   .!Y5!.Y5   G~?J ^#!!#P!  :?G#5~.   ^?J~:...^YY. .?PY.        ");  
						System.out.println(".^~!!.P:                    .!Y5?^ :5J   JP 7P ~B!5^5&^ !. ^?55?.  .~77??7^   ?57!!7?!      "); 
						System.out.println("BGB#G7.P:                  :JPJ^   ?P  ^55. P! ^^^^ 5#JYBP:  .:~7?7!:           ^!!!!!JJ    ");  
						System.out.println("~~^^!G@P?!               .:7G?.   !P?  ^YP!   !7?77G7.GPY75YY:5J?YPP5J!.        .YJJYPGGYG?   ");  
						System.out.println("7G#BY7.             YJG:   ^5J. ^Y5!       :75!  :. .BJ?P57!!~!?J?7!!~!J5?7777.   .!     ");
						System.out.println("^P^?GG5J7!^~!!: !P?J   !B^ :55   :7JY5Y7.   :. :7^.        :75BGGGG5G@5?!7P.         ");
						System.out.println("^Y77?YPPPPPPGG575 ?575   Y5 ^G!  .JB&B5?~.   ~7??Y7                 ...   ?55#G5.         ");
						System.out.println("?JJ??7!!^::^B:5^G   Y5 G7   Y@5.  ^7JJ5J.   JY:             7J777??::.:G          ");
						System.out.println("!.  :!7?7?77??! :P.G:  YJ~#. .::P7   !&!. :55^   Y?:          !G:   .:!7Y:            ");
						System.out.println("557J?!^:....     :P.G:  5?G?  :G YJ  .PY.   YJ!.  ~JJ!^.     ~P:         G            ");
						System.out.println("J&: :^~!!77Y5:   ^P75  :#GJ   JJ5 J5.  GPJ^   :7JJ7^..77P5: !5:         J@            ");
						System.out.println("?@B:         !P!  ?BP: ^B#7   7P ?J  ?Y  7Y~G5J!:  .7??775J..JY.         ?#@            ");
						System.out.println("JB7B^         .JY^.!:^JY!.  ^YJ ^G^  5  :G 5!^7JJJ7!7GP^ !57          JP^&            ");
						System.out.println("JB G7       .: :?J^ ^5J^:^?J!^JYG^ ^G^  .P.5?   .:^!77^.!J7. :       .55..&~            ");
						System.out.println("?B  :P5:    Y&@?  :7Y7::?PPPJYY7@!.G   :G:^YYY55GY~  ^??~  .5BJ!.   !G?  :&~            ");
						System.out.println("?B    7G?.  5?:    .?J7~:^!77 7&PJY    :5J7!!^^:^!JJ7: ..  :?Y  ^55^   :&~            ");
						System.out.println("?B     .JP7.     YB7  .:~7?7!^::~:       .:^~7??7^:  .P@B     ^YP~     :&~            ");
						System.out.println("?B       :?5?:   JB   ~ ..^!77777??????77!!:. ^!.  57^   !55       :&~            ");
						System.out.println("?B         .75Y!.      GBP!   ^^     .    .^    ^#Y#7      ^?PY^         :&~            ");
						System.out.println("?B            ^?5Y7^.  . ^!   #PP.   J&J   :B?^   ^!   .?5Y!.           :&            ");
						System.out.println("?B               :7JYJ7^:      ^7!   .YJJ:   ^!:     :?JY?.              :&~            ");
						System.out.println("?B                  .^!?JYJ?!^:. .        ...:^!7JJYJ7.                  :&~            ");
						System.out.println("?B                        .^!7?JJJJJJJJJ?JJ???7!:.                       :&~            ");
						System.out.println("?B                     :7777!!.      ...                                   :&~            ");
						System.out.println("7B555555555555555555555555555555555555555555YYYYYYYYYYYYYYYYYYYYYYYYYYYYY55PG:   ");
						
					}
				break;
				}
				y++;
				}
				}
				
				
	}
	public void callPlayoffs()
	{
		  int[] R = new int[] {1,2,3,4,5,6,7,8,9,10}; 
		  String[] Team = new String[] {"RCB","CSK","SRH","MI","RR","GT","KKR","PBKS","DC","LSG"}; 
		  int[] P = new int[] {14,14,14,14,14,14,14,14,14,14}; 
		  int[] W = new int[] {10,8,8,8,7,7,6,6,5,4}; 
		  int[] L = new int[] {4,5,5,6,7,7,8,8,9,10}; 
		  int[] NR = new int[] {0,1,1,0,0,0,0,0,0,0}; 
		  String[] NRR = new String[] {"+1.189","+0.652","+0.484","+0.212","+0.056","+0.148","-0.239","-0.207","-0.508","-0.703"}; 
		  int[] Pts = new int[] {20,17,17,16,14,14,12,12,10,8}; 
		  Scanner s=new Scanner(System.in);
		  System.out.print("---------------------------------------------------------------------------------------------------"); 
		  System.out.println(); 
		  System.out.print("| Rankings |     Team     |  Played  |   Won    |  Lost  | NoResult(NR) | NetRunRate(NRR) |Points |"); 
		  System.out.println(); 
		  System.out.print("---------------------------------------------------------------------------------------------------"); 
		  System.out.println(); 
		   for(int x=0;x<=3;x++)
		   {
		   System.out.print("|    " + R[x] + "\t   |     " + Team[x] + "\t  |  " + P[x] + "\t     |   " + W[x] + "\t|   " + L[x] + "\t |    " + NR[x] + "         |    " + NRR[x] + "       |  " + Pts[x] + "\t  |"); 
		   System.out.println(); 
		   } 
		  System.out.println("---------------------------------------------------------------------------------------------------"); 
		  System.out.println();
	      System.out.println("                      	-------------------");
	      System.out.println("	              	| ROAD TO FINALS  |");
	       System.out.println("                      	-------------------");
	       System.out.println("        Q1                                           		  F     ");
	        System.out.println(" ------------------			                   ----------------");
	        System.out.println(" |  CSK  VS  RCB  |--------------------------------------->| WON  VS WON  |");
	        System.out.println(" ------------------			                   ----------------");
	        System.out.println("                 |                                ------------------^                                               ");
	        System.out.println("		 |   LOST			 E|	                               ");
	        System.out.println("	Q2	 ---------------------     ---------------	 ");
	        System.out.println(" ------------------		     |---->| LOST VS WON |");
	        System.out.println(" |  SRH  VS  MI   |-------------------     ---------------");
	        System.out.println(" ------------------       WON");
		}
	
	
	
	
		public void callStats() { 
			  while(true) { 
			   Scanner v=new Scanner(System.in);
			   System.out.println("1. Most Runs"); 
			   System.out.println("2. Most Wickets"); 
			   System.out.println("3. Most Sixes"); 
			   System.out.println("4. Highest Score"); 
			   int cs = v.nextInt(); 
			   switch(cs) { 
			   case 1: 
			    int[] P = new int[] {1,2,3,4,5,6}; 
			    String[] s = new String[] {"Shubhman Gill(GT)\t","Faf du Plessis(RCB) ","Virat Kohli(RCB)\t","Deven Conway(CSK)\t","David Warner(DC)\t","Yashasvi Jaiswal(RR)"}; 
			    int[] I =new int[] {14,14,14,14,14,14}; 
			    int[] R = new int[] {890,845,811,790,750,730}; 
			    double[] A =new double[R.length]; 
			    int n=6,x=0; 
			    for(int y=0;y<R.length;y++) { 
			     for(int z=y;z<I.length;z++) { 
			      A[x++]=R[y]/I[z]; 
			      break; 
			     } 
			    } 
			    System.out.print("-----------------------------------------------------------------------------"); 
			    System.out.println(); 
			    System.out.print("| Position |  \t\tName\t\t  |  Innings |   Runs   |  Average  |"); 
			    System.out.println(); 
			    System.out.print("-----------------------------------------------------------------------------"); 
			    System.out.println(); 
			    for(x=0;x<n;x++)
			    { 
			     System.out.print("|    " + P[x] + "\t   | " + s[x] + "\t  |    " + I[x] + "    |   " + R[x] + "\t|   " + A[x] + "    |   "); 
			     System.out.println(); 
			    } 
			    System.out.println("-----------------------------------------------------------------------------"); 
			    System.out.println("want to delete the specific rows");
			    int z5=v.nextInt();
			    for(x=z5;x<R.length-1;x++)
			    {
			    	P[x]=P[x+1]; 
					s[x]=s[x+1];
					I[x]=I[x+1];
					R[x]=R[x+1];
					A[x]=A[x+1];
					  	
			    }
			    
		        System.out.print("-----------------------------------------------------------------------------"); 
			    System.out.println(); 
		        System.out.print("| Position |  \t\tName\t\t  |  Innings |   Runs   |  Average  |"); 
			    System.out.println(); 
			    System.out.print("-----------------------------------------------------------------------------"); 
				System.out.println(); 
			    for(x=0;x<R.length-1;x++)
			    {    
			    	System.out.print("|    " + P[x] + "\t   | " + s[x] + "\t  |    " + I[x] + "    |   " + R[x] + "\t|   " + A[x] + "    |   "); 
				    System.out.println(); 
					   
					    
			    }
			    System.out.println("-----------------------------------------------------------------------------"); 
			    
			    break; 
			   case 2: 
			    int[] P1 = new int[] {1,2,3,4,5,6}; 
			    String[] s1 = new String[] {"Mohammed Siraj(RCB)","Rashid Khan(GT)","Ravindra Jadeja(CSK)","Arshdeep Singh(PBKS)","Akash Madhwal(MI)","Mohit Sharma(GT)"}; 
			    int[] I1 =new int[] {14,14,14,14,14,14}; 
			    int[] W1 = new int[] {31,28,25,22,21,20}; 
			    int n1=6;
			    String s51="";
			    int r2=s1[0].length();
			    for( x=r2;x<20;x++) {
			    	s51=s51+" ";
			    }
			    s1[0]=s1[0].concat(s51);
			    String s6="";
			    int r3=s1[1].length();
			    for( x=r3;x<20;x++) {
			    	s6=s6+" ";
			    }
			    s1[1]=s1[1].concat(s6);
			    String s7="";
			    int r4=s1[2].length();
			    for( x=r4;x<20;x++) {
			    	s7=s7+" ";
			    }
			    s1[2]=s1[2].concat(s7);
			    String s8="";
			    int r5=s1[3].length();
			    for( x=r5;x<20;x++) {
			    	s8=s8+" ";
			    }
			    s1[3]=s1[3].concat(s8);
			    String s9="";
			    int r6=s1[4].length();
			    for( x=r6;x<20;x++) {
			    	s9=s9+" ";
			    }
			    s1[4]=s1[4].concat(s9);
			    String s10="";
			    int r7=s1[5].length();
			    for( x=r7;x<20;x++) {
			    	s10=s10+" ";
			    }
			    s1[5]=s1[5].concat(s10);
			    
			   
			    System.out.print("---------------------------------------------------------------------\t"); 
			    System.out.println(); 
			    System.out.print("| Position |         \tName\t          |  Innings  |   Wickets   |"); 
			    System.out.println(); 
			    System.out.print("---------------------------------------------------------------------\t"); 
			    System.out.println(); 
			    for(x=0;x<n1;x++)
			    { 
			     System.out.print("|    " + P1[x] + "\t   |     " + s1[x] + "\t  |    " + I1[x] + "     |     " + W1[x] + "\t    |   "); 
			     System.out.println(); 
			    } 
			    System.out.println("---------------------------------------------------------------------\t"); 
			    System.out.println("Where do you want to Insert");
			    int z6=v.nextInt(),x1;
			    for(x1=W1.length-1;x1>z6;x1--)
			    {
			    	P1[x1]=P1[x1-1]; 
					s1[x1]=s1[x1-1];
					I1[x1]=I1[x1-1];
					W1[x1]=W1[x1-1];
					  	
			    }
			    System.out.println("Enter SNo");
			    int z7=v.nextInt();
			    P1[x1]=z7;
			    System.out.println("Enter Name");
			    v.nextLine();
			    String z8=v.nextLine();
			    String s5="";
			    int r=z8.length();
			    for( x=r;x<20;x++) {
			    	s5=s5+" ";
			    }
			    z8=z8.concat(s5);
			    s1[x1]=z8;
			    System.out.println("Enter Innings");
			    
			    int z9=v.nextInt();
			    I1[x1]=z9;
			    System.out.println("Enter Wickets");
			    int z10=v.nextInt();
			    W1[x1]=z10;
		        System.out.print("-----------------------------------------------------------------\t"); 
			    System.out.println(); 
		        System.out.print("| Position |         \tName\t          |  Innings |  Wickets |"); 
			    System.out.println(); 
			    System.out.print("-----------------------------------------------------------------\t"); 
				System.out.println(); 
			    for(x=0;x<W1.length;x++)
			    {    
			    	System.out.print("|    " + P1[x] + "\t   | " + s1[x] + "\t  |    " + I1[x] + "    |   " + W1[x] + "\t|   "); 
				    System.out.println(); 
					   
					    
			    }
			    System.out.println("-----------------------------------------------------------------\t"); 
			    
			    break; 
			   case 3: 
			    int[] P2 = new int[] {1,2,3,4,5,6}; 
			    String[] s2 = new String[] {"F D Plessis(RCB)","Shivam Dube(CSK)","Shubhman Gill(GT)","Glenn Maxwell(RCB)","Rutraj Gaikwad(CSK)","Rinku Singh(KKR)"}; 
			    int[] I2 =new int[] {14,14,14,14,14,14}; 
			    int[] Si2 = new int[] {36,35,33,31,30,29}; 
			    int n2=6; 
			    System.out.print("---------------------------------------------------------------------\t"); 
			    System.out.println(); 
			    System.out.print("| Position |     \tName\t          |  Innings  |  Most Sixes |"); 
			    System.out.println(); 
			    System.out.print("---------------------------------------------------------------------\t"); 
			    System.out.println(); 
			    for(x=0;x<n2;x++)
			    { 
			     System.out.print("|    "+ P2[x] + "\t   |     " +  s2[x] + "\t  |    " + I2[x] +"     |     " + Si2[x] + "\t    |   "); 
			     System.out.println(); 
			    } 
			    System.out.println("---------------------------------------------------------------------\t"); 
			    break; 
			   case 4: 
			    int[] P3 = new int[] {1,2,3,4,5,6}; 
			    String[] s3 = new String[] {"S Gill(GT)\t","Y Jaiswal(RR)\t","Henrich Klassen(SRH)","Virat Kohli(RCB)","Suryakumar Yadav(MI)","Cameron Green(MI)"}; 
			    int[] I3 =new int[] {14,14,14,14,14,14}; 
			    int[] H3 = new int[] {129,124,104,101,100,98}; 
			    int n3=6; 
			    System.out.print("---------------------------------------------------------------------\t"); 
			    System.out.println(); 
			    System.out.print("| Position |     \tName\t        |  Innings  | Highest Score	|"); 
			    System.out.println(); 
			    System.out.print("---------------------------------------------------------------------\t"); 
			    System.out.println(); 
			    for(x=0;x<n3;x++) 
			    { 
			     System.out.print("|    " + P3[x] + "\t   |     " + s3[x] + "\t|    " + I3[x] + "     |     " + H3[x] + "\t    |"); 
			     System.out.println(); 
			    } 
			    System.out.println("---------------------------------------------------------------------\t"); 
			    break; 
			   default: 
			    System.out.println("Invalid Input"); 
			   } 
			   if(cs>4) 
			    break; 
			  }


	}
	 public void callUpdated()
			 { 
		      Scanner s=new Scanner(System.in);
			  System.out.print("---------------------------------------------------------------------------------------------------"); 
			  System.out.println(); 
			  System.out.print("| Rankings |     Team     |  Played  |   Won    |  Lost  | NoResult(NR) | NetRunRate(NRR) |Points |"); 
			  System.out.println(); 
			  System.out.print("---------------------------------------------------------------------------------------------------"); 
			  System.out.println(); 
			  int[] R = new int[] {1,2,3,4,5,6,7,8,9,10}; 
			  String[] Team = new String[] {"RCB","CSK","SRH","MI","RR","GT","KKR","PBKS","DC","LSG"}; 
			  int[] P = new int[] {14,14,14,14,14,14,14,14,14,14}; 
			  int[] W = new int[] {10,8,8,8,7,7,6,6,5,4}; 
			  int[] L = new int[] {4,5,5,6,7,7,8,8,9,10}; 
			  int[] NR = new int[] {0,1,1,0,0,0,0,0,0,0}; 
			  String[] NRR = new String[] {"+1.189","+0.652","+0.484","+0.212","+0.056","+0.148","-0.239","-0.207","-0.508","-0.703"}; 
			  int[] Pts = new int[] {20,17,17,16,14,14,12,12,10,8}; 
			  int x,y,n,temp,temp3,temp4,temp5,temp6,temp8;
			  String temp2="";
			  String temp7="";
			  
			  
			  for(x=0;x<R.length;x++) 
			  { 
			   
			 // Arrays.sort(L); 
			    
			   System.out.print("|    " + R[x] + "\t   |     " + Team[x] + "\t  |  " + P[x] + "\t     |   " + W[x] + "\t|   " + L[x] + "\t |    " + NR[x] + "         |    " + NRR[x] + "       |  " + Pts[x] + "\t  |"); 
			   System.out.println(); 
			  } 
			  System.out.println("---------------------------------------------------------------------------------------------------"); 
			 
			 while(true) {
			 System.out.println("What do you wanna do ?");
			 System.out.println("1)Want to see the rotation of the table ");
			 System.out.println("2) want to search the single team");
			 int sb=s.nextInt();
			 if(sb==1)
			 {
			 System.out.println("How many Rotations");
			 n=s.nextInt();int z1;
			 for(int z=1;z<=n;z++)
			 {
				 temp=R[0];temp2=Team[0];temp3=P[0];temp4=W[0];temp5=L[0];temp7=NRR[0];temp6=NR[0];temp8=Pts[0];
				 for(z1=0;z1<R.length-1;z1++)
				 {
					 R[z1]=R[z1+1]; 
					 Team[z1]=Team[z1+1];
					 P[z1]=P[z1+1];
					 W[z1]=W[z1+1];
					 L[z1]=L[z1+1];
					 NR[z1]=NR[z1+1];
					 NRR[z1]=NRR[z1+1];
					 Pts[z1]=Pts[z1+1];
					 
					 
				 }
				 R[z1]=temp;
				 Team[z1]=temp2;
				 P[z1]=temp3;
				 W[z1]=temp4;
				 L[z1]=temp5;
				 NR[z1]=temp6;
				 NRR[z1]=temp7;
				 Pts[z1]=temp8;
				 
			 }
			 System.out.print("---------------------------------------------------------------------------------------------------"); 
			  System.out.println(); 
			  System.out.print("| Rankings |     Team     |  Played  |   Won    |  Lost  | NoResult(NR) | NetRunRate(NRR) |Points |"); 
			  System.out.println(); 
			  System.out.print("---------------------------------------------------------------------------------------------------"); 
			  System.out.println();

			  for(x=0;x<R.length;x++) 
			  { 
			   
			 // Arrays.sort(L); 
			    
			   System.out.print("|    " + R[x] + "\t   |     " + Team[x] + "\t  |  " + P[x] + "\t     |   " + W[x] + "\t|   " + L[x] + "\t |    " + NR[x] + "         |    " + NRR[x] + "       |  " + Pts[x] + "\t  |"); 
			   System.out.println(); 
			  } 
			  System.out.println("---------------------------------------------------------------------------------------------------"); 
			 
			 }
			 if(sb==2)
			 {

				  System.out.println("Enter the team name");
				  String search=s.next();
				  System.out.println("---------------------------------------------------------------------------------------------------"); 
				  System.out.println("| Rankings |     Team     |  Played  |   Won    |  Lost  | NoResult(NR) | NetRunRate(NRR) |Points |"); 
				  System.out.println(); 
				  System.out.println("---------------------------------------------------------------------------------------------------"); 
				 for(int z=0;z<R.length;z++)
				 {
					 if(search.equalsIgnoreCase(Team[z]))
					 {
						  System.out.println("|    " + R[z] + "\t   |     " + Team[z] + "\t  |  " + P[z] + "\t     |   " + W[z] + "\t|   " + L[z] + "\t |    " + NR[z] + "         |    " + NRR[z] + "       |  " + Pts[z] + "\t  |");  
					 }
				 }
				 System.out.println("---------------------------------------------------------------------------------------------------"); 
				 
			 }
			 if(sb>2)
			 {
				 break;
			 }
			 }
			 
			 } 
	         
	 public void callTeams(int a[],String []b)
	 {
		 Scanner s=new Scanner(System.in);
		 System.out.println("----------------------------------------------------------");
			System.out.println("|\t"+"SNO\t"+"|\t"+"TEAM NAME\t"+"\t\t |");
			System.out.println("----------------------------------------------------------");
			for(int y=0;y<a.length;y++)
			{
				System.out.println("|\t"+a[y]+"\t| "+" " +b[y]+" \t |");
			}
			System.out.println("----------------------------------------------------------");
		
			while(true)
			
			{
				System.out.println("IF YOU WANT TO CHOOSE THE TEAM DETAILS");
				int sn=s.nextInt();
			switch(sn)
			{
			case 1:
				System.out.println("Captain       : Mahendra Singh Dhoni");
				System.out.println("Head Coach    : Stephen Fleming");
				System.out.println("IPL Title Won : 5 ");
				break;
			case 2:
				System.out.println("Captain       : Rishabh Pant");
				System.out.println("Head Coach    : Ricky Pointing");
				System.out.println("IPL Title Won : 0");
				break;
			case 3:
				System.out.println("Captain       : Hardik Pandya");
				System.out.println("Head Coach    : Ahish Nehra");
				System.out.println("IPL Title Won : 1 ");
				break;	
			case 4:
				System.out.println("Captain       : KL Rahul");
				System.out.println("Head Coach    : Andy Flower");
				System.out.println("IPL Title Won : 0");
				break;	
			case 5:
				System.out.println("Captain       : Shreyas Iyer");
				System.out.println("Head Coach    : Chandrakant Pant");
				System.out.println("IPL Title Won : 2 ");
				break;
			case 6:
				System.out.println("Captain       : Rohit Sharma");
				System.out.println("Head Coach    : Mark Boucher");
				System.out.println("IPL Title Won : 5 ");
				break;	
			case 7:
				System.out.println("Captain       : Shikar Dhawan");
				System.out.println("Head Coach    : Trevor Bayliss");
				System.out.println("IPL Title Won : 0 ");
				break;
			case 8:
				System.out.println("Captain       : Faf DuPlesiss");
				System.out.println("Head Coach    : Sanjay Bangar");
				System.out.println("IPL Title Won : 0 ");
				break;	
			case 9:
				System.out.println("Captain       : Sanju Samson");
				System.out.println("Head Coach    : Kumar Sangakkara");
				System.out.println("IPL Title Won : 1 ");
				break;
			case 10:
				System.out.println("Captain       : Aden Markram");
				System.out.println("Head Coach    : Brain Lara");
				System.out.println("IPL Title Won : 2 ");
				break;
			}
			if(sn==0)
			{
			
			break;
			}	 
	 }
	 }
	

	public static void main(String[] args)
	{
		Sport_Application obj=new Sport_Application();
		
		int a[]=new int [] {1,2,3,4,5,6,7,8,9,10};
		String b[]=new String[] {"CSK-CHENNAI SUPER KINGS\t","DC-DELHI CAPITALS\t\t","GT-GUJARAT TITANS\t\t","LSG-LUCKNOW SUPER GIANTS\t","KKR-KOLKOTA KNIGHT RIDERS\t","MI-MUMBAI INDIANS\t\t","PBK-PUNJAB KINGS\t\t","RCB-ROYAL CHALLENGERS BANGALORE","RR-RAJASTHAN ROYALS\t\t","SRH-SUN RISERS HYDERABAD\t"};
		int e=0;
		while(e<=4)
		{
			System.out.println("1)NAME OF THE TEAMS");
			System.out.println("2)UPDATED POINT TABLE");
			System.out.println("3)STATS");
			System.out.println("4)PLAYOFFS");
			System.out.println("5)THE FINALS");
			
			Scanner s=new Scanner(System.in);
			int x=s.nextInt();
		switch(x)
		{
		case 1:
			obj.callTeams(a,b);
			break;
		case 2:
			obj.callUpdated();
			break;
		case 3:
			obj.callStats();
			break;
		case 4:
			obj.callPlayoffs();
			break;
		case 5:
			obj.callFinals();
			break;
		default:
			System.out.println("Invalid Input");
		}
		e++;
		 
		}
		

	}

}
