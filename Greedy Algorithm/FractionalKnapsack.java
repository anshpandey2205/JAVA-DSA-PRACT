public class FractionalKnapsack {
    public static void main (String[]args){
        int val[]={60,100,120};
        int weight[]={10,20,30};
        int W=50;

        Double ratio[][]=new Double[val.length][2];

        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(Double)weight[i];
        }
    }
}
