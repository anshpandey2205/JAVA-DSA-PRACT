
public class FindSubSet {
    public static void Subset(String str,String ans,int i){
        // BASECASE
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }

        // YES CHOICE
        Subset(str, ans+str.charAt(i), i+1);

        // NO CHOICE
        Subset(str, ans, i+1);

    }
    public static void main(String[]args){
        String str="abc";
        Subset(str,"", 0);
    }
}
