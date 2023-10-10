public class REMOTE {

    Command b1;
    Command b2;
    Command b3;

    public REMOTE (){
        System.out.println("~~remote initialized.");
    }

    public void setButton1(Command c){
        this.b1 = c;
    }

    public void setButton2(Command c){
        this.b2 = c;
    }

    public void setButton3(Command c){
        this.b3 = c;
    }

    public void pressButton1(){
        b1.execute();
    }

    public void pressButton2(){
        b2.execute();
    }

    public void pressButton3(){
        b3.execute();
    }


}
