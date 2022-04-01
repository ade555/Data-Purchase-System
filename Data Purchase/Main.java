import java.util.Scanner;
public class Main {
    //CODE TO WRITE A SYSTEM FOR USERS TO PURCHASE DATA

    //FUNCTION TO RUN IF USER GETS TO LAST STAGE OF BUYING DATA
    static void completePurchase(){
        Scanner dataEnd = new Scanner(System.in);
        System.out.println("What should happen when your data finishes?\n1 Continue browsing from " +
                "airtime/160Mb extra\n2 Stop my data");
        byte finalChoice = dataEnd.nextByte();
        if (finalChoice==1){
            System.out.println("You have successfully activated the data plan. You will be browsing from your" +
                    " airtime once your data finishes");
        }
        else if (finalChoice==2){
            System.out.println("You have successfully activated your data plan.");
        }
        else{
            System.out.println("Wrong input. Quit and start again");
        }
    }
    //FUNCTION TO RUN IF USER GETS TO LAST STAGE OF BUYING DATA


    //FUNCTION TO RUN IF USER ENTERS CORRECT INPUT
    static void buyAirtime() {
        Scanner dataInput = new Scanner(System.in);
        System.out.println("1 My Offer\n2 Data Bundles\n3 1500 / 6GB / 7days\n4 Family Plan/Monthly+\n" +
                "5 Everyday On\n6 Binge");
        byte action1 = dataInput.nextByte();

        //CONDITION TO DETERMINE DATAPLAN
        if (action1 ==1){
            System.out.println("1. 1GB/N300/daily\n2. 2GB/N500/daily\n3. 6GB/N1500/7days\n4. 7" +
                    "50MB/N500/14days\n" +
                    "5. 1.5GB/N1000/monthly\n6. 2GB/N1200/monthly\n7. 3GB/N1500/monthly");
            byte action2 = dataInput.nextByte();
            if (action2 >=1 && action2 <8){
               completePurchase();
            }
            else {
                System.out.println("Wrong input. Quit and start again");
            }
        }
        else if (action1 ==2){
            System.out.println("1. Daily/Weekly bundles\n2. Weekly bundles\n3. Monthly bundles" +
                    "\n4. Data++\n5. Mega bundles\n6. Big Data Plans");
            byte action3 = dataInput.nextByte();
            if (action3==1){
                System.out.println("Daily/Weekly Bundles\n1. N50/40MB/Daily\n2. N100/100MB/daily" +
                        "\n3. N200/200MB/3days\n4. N300/350MB/7days\n5. N500/750MB/14days" +
                        "\n6. N300/1GB/daily\n7. N500/2GB/daily");
                byte action4 = dataInput.nextByte();
                if (action4 >0 && action4 < 8){
                    completePurchase();
                }else{
                    System.out.println("Wrong input. Try again");
                }
            }else if (action3==2){
                System.out.println("Weekly Bundles\n1. N300/350MB/7days\n2. N500/750MB/14days" +
                        "\n3. N1500/6GB/7days" + "\n4. N500/1GB/7days\n5. N100/All social/5days");
                byte action4 = dataInput.nextByte();
                if (action4 >0 && action4 < 6){
                    completePurchase();
                }else{
                    System.out.println("Wrong input. Try again");
                }
            }else if (action3==3) {
                System.out.println("Monthly Bundles\n1. N1000/1.5GB\n2. N1200/2GB\n3. N1500/3GB\4. N2000/4.5GB" +
                        "\n5. N2500/6Gb\n6. N3000/10GB\n7. N4000/11GB\n8. N5000/20GB");
                byte action4 = dataInput.nextByte();
                if (action4 > 0 && action4 < 9) {
                    completePurchase();
                }else{
                    System.out.println("Wrong input. Try again");
                }
            }else if (action3==4) {
                System.out.println("1. N500/2.5GB/2days\n2. N3000/11GB/30 days\n3. N4000/15GB/30days" +
                        "\n4.N5000/22GB/30days");
                byte action4 = dataInput.nextByte();
                if (action4 > 0 && action4 < 5) {
                    completePurchase();
                }else{
                    System.out.println("Wrong input. Try again");
                }
            }else if (action3==5) {
                System.out.println("30 day bundles\n1. N5,000/20GB\n2. N8,000/30GB\n3. N10,000/40GB" +
                        "\n4. N15,000/75GB\n5. N20,000/120GB");
                byte action4 = dataInput.nextByte();
                if (action4 > 0 && action4 < 6) {
                    completePurchase();
                }else{
                    System.out.println("Wrong input. Try again");
                }
            }else if (action3==6) {
                System.out.println("1. N30,000/240GB/30 days\n2. N36,000/280GB/30days" +
                        "\n3. N50,000/400GB/90days\n4. N60,000/500GB/120days\n5. N100,000/1TB/365days");
                byte action4 = dataInput.nextByte();
                if (action4 > 0 && action4 < 6) {
                    completePurchase();
                }else{
                    System.out.println("Wrong input. Try again");
                }
            }
        }else if (action1==3){
            completePurchase();
        }else if (action1==4){
            System.out.println("Family plans/Monthly+\n1. Family plans+\n2. Family data plan" +
                    "\n3. Booster plan");
            byte action4 = dataInput.nextByte();
            if (action4 == 1) {
                System.out.println("Family Plans+\n1. N3,000 for 10GB + 100MINS & 100 SMS" +
                        "\n2. N5,000 for 20GB +300MINS & 100SMS\n3. N10,000 for 50GB + 750MINS & 100SMS");
                byte action5 = dataInput.nextByte();
                if (action5 > 0 && action5 < 4){
                    completePurchase();
                }else{
                    System.out.println("Wrong input. Try again");
                }
            }else if (action4 == 2){
                System.out.println("Family Plans+\n1. N3,000 for 10GB + 250MINS & 100 SMS" +
                        "\n2. N5,000 for 20GB +300MINS & 250SMS\n3. N10,000 for 50GB + 250MINS & 100SMS");
                byte action5 = dataInput.nextByte();
                if (action5 > 0 && action5 < 4){
                    completePurchase();
                }else{
                    System.out.println("Wrong input. Try again");
                }
            }else if (action4==3){
                System.out.println("1. N2000 for 8GB\n2. N4000 for 18GB");
                byte action5 = dataInput.nextByte();
                if (action5 > 0 && action5 < 3){
                    completePurchase();
                }else{
                    System.out.println("Wrong input. Try again");
                }
            }else{
                System.out.println("Wrong input. Try again");
            }
        }else if (action1==5){
            System.out.println("1. N3000/15GB/30days\n2. N6000/45GB/30days\n3. N60/200MB/daily" +
                    "\n4. N120/450MB/daily");
            byte action4 = dataInput.nextByte();
            if (action4 > 0 && action4<5){
                completePurchase();
            }else {
                System.out.println("Wrong input. Try again.");
            }
        }else if (action1==6){
            System.out.println("1. N300/1GB/daily\n2. N500/2GB/daily\n3. N1500/6GB/7days");
            byte action4 = dataInput.nextByte();
            if (action4 > 0 && action4 < 4){
                completePurchase();
            }else {
                System.out.println("Wrong input. Try again.");
            }
        }else {
            System.out.println("Invalid input. Try again");
        }
    }
    //FUNCTION TO RUN IF USER ENTERS CORRECT INPUT END


    //MAIN CODE
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter *123# to start the system");
        String code1 = input.nextLine();

        //CONDITION TO DETERMINE THE FLOW OF LOGIC
        if (code1.equals("*123#")){
            //condition for user to pick network
            System.out.println("Select a network\n1 for Airtel\n2 for MTN\n3 for Glo\n4 for 9mobile");
            byte network = input.nextByte();
            if (network == 1){
                System.out.println("You are about to buy Airtel data");
                buyAirtime();
                System.out.println("You just bought Airtel data");
            }
            else if (network == 2){
                System.out.println("You are about to buy MTN data");
                buyAirtime();
                System.out.println("You just bought MTN data");
            }
            else if (network == 3){
                System.out.println("You are about to buy Glo data");
                buyAirtime();
                System.out.println("You just bought Glo data");
            }
            else if (network == 4){
                System.out.println("You are about to buy 9mobile data");
                buyAirtime();
                System.out.println("You just bought 9mobile data");
            }
            else{
                System.out.println("Wrong input. Start again");
            }
        }
        else {
            System.out.println("Error. Try again");
        }
    }
}