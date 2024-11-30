
import java.util.Scanner;

public class AdminLogin {

    // public static void clearConsole() {
    //     for (int i = 0; i < 50; i++) {
    //         System.out.println("\n");
    //     }

    // }
    private static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) throws Exception {
        Admin_datas d = new Admin_datas();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        String name = sc.nextLine();
        System.out.println("enter Password");
        String pass = sc.nextLine();

        boolean check = d.checkAdminPass(name, pass);
        clearConsole();
        if (check==true){
            System.out.println("Chose :");
            System.out.println("1. user Validation");
            System.out.println("2. view Report");
            System.out.println("3 Delete Acount ");
            System.out.println("4 Update acount ");
            System.out.println("5. Search Acount ");
            System.out.println("6. Log out ");
            int ans = sc.nextInt();
            switch (ans) {
                case 1:
                    d.user_Validation();
                break;
                    case 2:
                    d.view_Report();
                    
                break;
                    case 3:
                    d.Delete_Acount();
                break;
                    case 4:
                    d.Update_acount();
                break;
                    case 5:
                    d.Search_Acount();
                break;
                case 6:
                    System.out.println("End__ 0-O");
                    System.exit(0);
                break;
            
                        default:
            System.out.println("wrong Input please try again 00");
                    break;
            } 
        }else{
            System.out.println("dure gia m00000r");
        }

    }
}
