package tp1;
import java.util.Scanner;
public class Exo4 {
	public static void start() {
		String player1;
		String player2;
		String winner=""; 
	Case[] Game = new Case[9];
	boolean vainqueur = false;
	{
		for(int i = 0 ; i<9 ; i++) {
			Game[i] = new Case();
		}
	}
	Scanner sc = new Scanner(System.in);
	System.out.println("player 1 pseudo : ");
	player1 = sc.nextLine();
	System.out.println("player 2 pseudo : ");
	player2 = sc.nextLine();
	int numCase;
	char rep ;
	int i = 0;
	{
	while(i<9) {
		System.out.println("\t\t"+Game[0].getContent() +" "+Game[1].getContent()+" "+Game[2].getContent());
		System.out.println("\t\t"+Game[3].getContent() +" "+Game[4].getContent()+" "+Game[5].getContent());
		System.out.println("\t\t"+Game[6].getContent()+" "+Game[7].getContent()+" "+Game[8].getContent());
		System.out.print("\n\n");
		if(i%2==0){rep='x';System.out.println(player1+" it's your turn ");}else { rep='o';System.out.println(player2+" it's your turn ");}
		numCase = sc.nextInt() - 1;
		if(!Game[numCase].isFull()) {
			Game[numCase].remplir(rep);
			if(check(Game)) {if(rep=='x') winner = player1;else winner = player2;vainqueur=true;break;}
			i++;
		}
		else {
			System.out.println("already full");
			}

		}
		if(vainqueur) {System.out.println(winner + " wins the game");}
		else {System.out.print("draw :(");}
	}
}
	private static boolean check(Case[] tab) {
		return (tab[0].getContent() == tab[1].getContent() 
				&&
				tab[1].getContent() ==tab[2].getContent()
				&& (tab[0].getContent() == 'x' || tab[0].getContent()=='o'))
				||
				(tab[0].getContent() == tab[4].getContent() 
				&&
				tab[4].getContent() ==tab[8].getContent()
				&& (tab[0].getContent() == 'x' || tab[0].getContent()=='o'))
				||
				(tab[0].getContent() == tab[1].getContent() 
				&&
				tab[1].getContent() ==tab[2].getContent()
				&& (tab[0].getContent() == 'x' || tab[0].getContent()=='o'))
				||
				(tab[0].getContent() == tab[3].getContent() 
				&&
				tab[3].getContent() ==tab[6].getContent()
				&& (tab[0].getContent() == 'x' || tab[0].getContent()=='o'))
				||
				(tab[3].getContent() == tab[4].getContent() 
				&&
				tab[4].getContent() ==tab[5].getContent()
				&& (tab[3].getContent() == 'x' || tab[3].getContent()=='o'))
				||
				(tab[6].getContent() == tab[7].getContent() 
				&&
				tab[7].getContent() ==tab[8].getContent()
				&& (tab[6].getContent() == 'x' || tab[6].getContent()=='o'))
				||
				(tab[1].getContent() == tab[4].getContent() 
				&&
				tab[4].getContent() ==tab[7].getContent()
				&& (tab[1].getContent() == 'x' || tab[1].getContent()=='o')) 
				||
				(tab[2].getContent() == tab[5].getContent() 
				&&
				tab[5].getContent() ==tab[8].getContent()
				&& (tab[2].getContent() == 'x' || tab[2].getContent()=='o'));
				
	}
	}
