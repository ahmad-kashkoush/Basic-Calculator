public class GuessingGameClass {
    private int l;
    private int r;
    public GuessingGameClass(int l, int r){
        this.l=l;
        this.r=r;
    }
    public void Guess(int guessed_number){
        int ans=(int)(Math.random()*(r-l+1))+l;
        if(guessed_number==ans){
            System.out.println("True Answer");
        }else{
            System.out.println("Wrong Answer, Number is: "+ans);
        }
    }
}
