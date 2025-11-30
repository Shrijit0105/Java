class Tvfunction {
    void TurnOn(){
        System.out.println("the tv is turned on ");
    }

    void turnOff(){
        System.out.println("the tv is turned off ");

    }
    void channelChange(int channel){
        System.out.println("the channel is changed to:"+channel);

    }

    public class Tv{
        public static void main(String[] args){
            Tvfunction myTv = new Tvfunction();
            myTv.TurnOn();
            myTv.channelChange(10);
            myTv.turnOff();
        }
    }
}
