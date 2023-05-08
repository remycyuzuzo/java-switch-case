import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MobileMoney.displayChoices(new String[] {
                "Send money",
                "Buy",
                "Pay Bill",
                "Bank Services",
                "Mokash",
                "My MoMo Account",
                "Pending Approvals",
                "MoMoPay",
                "My MoMo Security",
                "Insurance",
                "MoMo Terms And Conditions",
                "Macye Macye",
                "Help",
                "Exit",
                "Back"
        });

        int selection = input.nextInt();
        switch (selection) {
            case 1: {
                MobileMoney.displayChoices(new String[] {
                        "MoMo User",
                        "Send to eKash",
                        "Across the Region",
                        "Cancel Voucher",
                        "Display Voucher",
                        "List Active Voucher",
                        "Pending Approvals",
                        "International Transfer",
                        "Exchange Rate",
                        "Insurance",
                        "Exit",
                        "Back"
                });
                break;
            }
            case 2: {
                MobileMoney.displayChoices(new String[] {
                        "Buy Airtime, Voice Pack and Data Bundle",
                        "Electricity",
                        "Pay Services",
                        "Solar",
                        "Bus Tap&Go",
                        "Online shopping Card",
                        "Back"
                });
                break;
            }
            case 3: {
                MobileMoney.displayChoices(new String[] {
                        "Pay TV",
                        "Postpaid Bill",
                        "Pay PSF",
                        "Pay Yego",
                        "Water",
                        "Rwanda Revenue",
                        "Irembo services",
                        "Airport Parking",
                        "Businesses",
                        "School",
                        "Security n Hygiene",
                        "Exit",
                        "Back"
                });

                break;
            }
            case 4: {
                MobileMoney.displayChoices(new String[] {
                        "ATM",
                        "Send MoMo to Bank",
                        "Get Money from Bank Account",
                        "Check Account Balance",
                        "Delink Bank Account",
                        "Back"
                });

                break;
            }
            case 5: {
                MobileMoney.displayChoices(new String[] {
                        "Mokash",
                        "KCB",
                        "Back",
                });
                break;

            }
            case 6: {
                MobileMoney.displayChoices(new String[] {
                        "Check Balance",
                        "Mini Statement",
                        "Get Latest Electricity Token",
                        "Preapprove Transactions",
                        "Change Language",
                        "My Offers",
                        "Exit",
                        "Back"
                });
                break;

            }
            default: {
                System.out.println("Invalid input");
            }
        }
    }
}