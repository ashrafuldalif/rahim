import java.util.Scanner;

public class AdminLogin {
    
    public static void main(String[] args) throws Exception {
        Admin_datas d= new Admin_datas();
        Scanner sc=new  Scanner ( System.in);
        System.out.println("enter name");
        String name = sc.nextLine();
        System.out.println("enter Password");
        String pass = sc.nextLine();


        if(d.checkAdminPass(name,pass)){
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
