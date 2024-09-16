public class CaseInsensitive {
    public String caseInsensitive(String a){
        String ret="";
        
        for(int i=0;i<a.length();i++){
            int ch;
            if(i!=0){
                 ch=a.charAt(i);
                 if(ch>=65 && ch<=90){
                    ch+=32;
                 }
                 
                 ret +=(char)ch;
                
            }
            else{
                ch=a.charAt(0);
                if(a.charAt(0)>=97 && a.charAt(0)<=122){
                    ch-=32;
                }
                ret+=(char)ch;
            }
           

        }
        
        return ret;
    }

    public int nonNegative(int a){
        java.util.Scanner sc=new java.util.Scanner(System.in);
        if(a<0){
            System.out.println("Invalid.\nWrite it again.");
            return nonNegative(sc.nextInt());
        }
        else{
            return a;
        }
    }
    public String emailChecker(String s){
        String email="";
        // if(s.charAt(0)=='.'||s.charAt(s.length()-1)=='.'){
        //     return "Invalid email.\n Write again"+emailChecker(s);
        // }
        // else if(){
        //     for(int i=0;i<s.length();i++){
        //         char ch1=s.charAt(i);
        //         if(ch1>=65 && ch1<=90 ||ch1>=97 && ch1<=122||ch1>='0'&& ch1<'9'||ch1=='_'||ch1=='.'||ch1=='-'){
        //             if((ch1=='_'||ch1=='.'||ch1=='-') && i!=s.length()-1 && i!=0){        
        //             }
        //             email+=(char)ch1;
        //         }
        //     }
        // }
        boolean found=false;
        int sep_ind=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='@'){
                found=true;
                sep_ind=i;
            }

        }
        if(found==false){
            return "Invalid email.\n Write again"+emailChecker(s);
        }
        else{
            if(sep_ind>64||s.charAt(0)=='.'){
                return "Invalid email.\n Write again"+emailChecker(s);
            }
            else{
                for(int i=0;i<=sep_ind;i++){
                    char ch1=s.charAt(i); 
                    if(ch1=='.'||ch1=='_'||ch1=='.'||ch1=='-'){
                        if(s.charAt(i-1)=='.'||s.charAt(i-1)=='_'||s.charAt(i-1)=='.'||s.charAt(i-1)=='-'){
                            return "Invalid email.\n Write again"+emailChecker(s);
                        }
                        else{
                            email+=(char)ch1;
                        }
                        
                    }
                    else if(ch1>=65 && ch1<=90 ||ch1>=97 && ch1<=122||ch1>='0'&& ch1<'9'||ch1=='@'){
                        email+=(char)ch1;
                    }

                }
            }
            
        }
        for(int i=s.length()-sep_ind;i<s.length()-1;i++){
            email+=s.charAt(i);
        }
        if(email.equals(s)){
            return email;
        }
        else{
            return "Invalid email.\n Write again"+emailChecker(s); 
        }

    }
}
