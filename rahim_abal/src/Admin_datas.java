public class Admin_datas {
    private String name = "ashraful";
    private String passwod = "mahirma";
    public String solting(String p ){
        
        char[] pass=p.toCharArray();
        int fLength=p.length()*3;
        
        char[] tempPass= new char[fLength];
        System.out.println(fLength);
        int j=0;
        for(int i=0 ;i<passwod.length();i++){
            tempPass[j]=pass[i];
            tempPass[j+1]='6';
            tempPass[j+2]='9';            
            j+=3;
        }
        String newPass= new String(tempPass,0,j);
        return newPass;
    }
    passwod= solting(passwod);

    public void user_Validation(){


    }
    public void view_Report(){
        Search_Acount();

    }
    public void Delete_Acount(){
        Search_Acount();

    }
    public void Update_acount(){
        Search_Acount();

    }
    public void Search_Acount(){


    }




    public boolean checkAdminPass(String a,String b){
        if(name.equals(a) && passwod.equals(b)){
            
            return true;
        }else{
            return false;
            
        }

    }
}
