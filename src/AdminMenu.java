
    import api.AdminResource;


import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


    public class AdminMenu {

        private static final AdminResource adminResource = AdminResource.getSingleton();

        public static void adminMenu() {
            String line = "";
            final Scanner scanner = new Scanner(System.in);

            printMenu();

            try {
                do {
                    line = scanner.nextLine();

                    if (line.length() == 1) {
                        switch (line.charAt(0)) {
                            case '1':
                                displayAllCustomers();
                                break;
                            case '2':
                                displayAllRooms();
                                break;
                            case '3':
                                displayAllReservations();
                                break;
                            case '4':
                                addRoom();
                                break;
                            case '5':
                                MainMenu.printMainMenu();
                                break;
                            default:
                                System.out.println("Unknown action\n");
                                break;
                        }
                    } else {
                        System.out.println("Error: Invalid action\n");
                    }
                } while (line.charAt(0) != '5' || line.length() != 1);
            } catch (StringIndexOutOfBoundsException ex) {
                System.out.println("Empty input received. Exiting program...");
            }
        }

        private static void printMenu() {
            System.out.print("\nAdmin Menu\n" +
                    "--------------------------------------------\n" +
                    "1. See all Customers\n" +
                    "2. See all Rooms\n" +
                    "3. See all Reservations\n" +
                    "4. Add a Room\n" +
                    "5. Back to Main Menu\n" +
                    "--------------------------------------------\n" +
                    "Please select a number for the menu option:\n");
        }

        p