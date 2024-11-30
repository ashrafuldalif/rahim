
public class Admin_datas {

    private String name = "ashraful";
    private String passwod = "mahirma";

    // Constructor to transform the predefined password
    public Admin_datas() {
        passwod = solting(passwod); // Salt the predefined password
        System.out.println("Transformed Password: " + passwod); // Debugging
    }

    public String solting(String p) {
        char[] pass = p.toCharArray();
        int fLength = p.length() * 3;

        char[] tempPass = new char[fLength];
        int j = 0;
        for (int i = 0; i < pass.length; i++) {
            tempPass[j] = pass[i];
            tempPass[j + 1] = '6';
            tempPass[j + 2] = '9';
            j += 3;
        }
        String newPass = new String(tempPass, 0, j);
        return newPass;
    }

    public void user_Validation() {
        System.out.println("User validation in progress...");
    }

    public void view_Report() {
        Search_Acount();
    }

    public void Delete_Acount() {
        Search_Acount();
    }

    public void Update_acount() {
        Search_Acount();
    }

    public void Search_Acount() {
        System.out.println("Searching account...");
    }

    public boolean checkAdminPass(String a, String b) {
        System.out.println("Input Password: " + b); // Debugging
        b = solting(b); // Transform input password
        System.out.println("Transformed Input Password: " + b); // Debugging
        if (name.equals(a) && passwod.equals(b)) {
            return true;
        } else {
            return false;
        }
    }
}
