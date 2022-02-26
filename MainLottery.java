import java.util.Scanner;

public class MainLottery {
    public int[] winTicket = {12, 49, 3, 23, 11, 40};
    public int ownTicket[] = new int[6];
    public int randomNumbers;
    public int games;
    public boolean pickTickets=false;
    public long money;
    public int gameWon = 0;    
    public int sameNum = 0;
    public int matchSixNum = 0;
    public long totalMoneyWon = 0;
    Scanner ip = new Scanner(System.in);

    public void getNumberOfGames() {       
        System.out.println("How many games do you want to play?");
        games = ip.nextInt();
    }

    public void chooseTickets() {
        System.out.println("\n\nDo you want to pick your own tickets number (true/false)?");
        pickTickets = ip.nextBoolean();
    }

    public void randomNumbers() {
        for (int i = 0; i < ownTicket.length; i++) {
            ownTicket[i] = (int) (Math.random() * 48 + 1);
        }        
    }

    public void inputTickets() {
        System.out.println("Enter 6 numbers of your ticket (1-49):");
        for (int i = 0; i < ownTicket.length; i++) {
            ownTicket[i]  = ip.nextInt();
        }
    }

    public void outputTickets() {
        System.out.print("You have picked the ticket: ");
        for (int i = 0; i < ownTicket.length; i++) {
            System.out.print(ownTicket[i] + " ");
        }
    }

    public void randomTickets() {
        if (pickTickets == false) {
            randomNumbers();
            outputTickets();
        } else if (pickTickets == true) {
            inputTickets();
            outputTickets();
        }
    }

    public void winningTicket() {
        System.out.print("\nThe winning ticket is: ");
        for (int i = 0; i < winTicket.length; i++) {
            System.out.print(winTicket[i] + " ");
        }
    }

    public int sameNumber() {
        sameNum = 0;
        for (int i = 0; i < 6; i++) {
            if (ownTicket[i] == winTicket[i])
                sameNum++;
        }
        return sameNum;
    }

    public void outputTicketMatch() {
        int temp = sameNumber();
        System.out.print("\nYour ticket has matched " + temp + " number(s)");
    }

    public long prize() {
        switch (sameNum) {
            case 1:
            case 2:
                money = 10;
                break;
            case 3:
                money = 100;
                break;
            case 4:
                money = 1000;
                break;
            case 5:
                money = 500;
                break;
            case 6:
                money = 5000000;
                break;
            default:
                money = 0;
                break;
        }
        return money;
    }

    public void outputPrize() {
        long amountOfMoney = prize();
        System.out.print("\nYou have won $" + amountOfMoney);
    }

    public void numberGameWon() {
        if (sameNum > 0)
            gameWon++;
    }

    public void numberOfGameMatchSixNumber() {
        if (sameNum == 6)
            matchSixNum++;
    }

    public void totalTicket() {
        totalMoneyWon += money;
    }

    public void loopGame() {
        int i = 0;
        while (i < games) {            
            chooseTickets();
            randomTickets();
            winningTicket();
            outputTicketMatch();
            outputPrize();
            numberGameWon();
            numberOfGameMatchSixNumber();
            totalTicket();
            i++;
        }
    }

    public void outputGameWon() {
        System.out.println("\n\nThe number of games won any money: " + gameWon);
    }
    
    public void output_numberOfGameMatchSixNumber() {
        System.out.println("The number of games matched all 6 numbers: " + matchSixNum);
    }
    
    public void outputTotalMoney() {
        System.out.println("Total money won: $" + totalMoneyWon);
    }

    public void outputTotalTicketCost() {
        System.out.println("Total ticket cost: $" + games * 4);
    }

    public void outputProfitLoss() {
        System.out.println("Profit/Loss (won/cost): $" + (int) (totalMoneyWon - games * 4));
    }

    public static void main (String[] args) {
        MainLottery a = new MainLottery();
        a.getNumberOfGames();
        a.loopGame();
        a.outputGameWon();
        a.output_numberOfGameMatchSixNumber();
        a.outputTotalMoney();
        a.outputTotalTicketCost();
        a.outputProfitLoss();
    }  
}