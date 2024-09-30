public class Kotik{
    private int satiety = 2;

    private boolean isSatiety(){
        return this.satiety >= 0;
    }


    void liveAnotherDay(){
        for(int i = 0; i < 25; i++){
            int action = (int) (Math.random()*5);
            if( action == 0) play();
            if( action == 1) sleep();
            if( action == 2) chaseMouse();
            if( action == 3) walk();
            if( action == 4) jump();
        }
    }

    void eat(){

    }

    void play() {
        if (isSatiety()){

        }else{
            System.out.println("Я голоден:( Покормите меня");
        }
    }

    private String needFood = "Я голоден:( Покормите меня";
    void sleep(){
        if (isSatiety()){
            System.out.println("Zzzz....");
        }else{
            System.out.println(needFood);
        }
    }

    void chaseMouse(){
        if (isSatiety()){
            System.out.println("Поймал мышку");
        }else{
            System.out.println(needFood);
        }
    }

    void walk(){
        if (isSatiety()){
            System.out.println("Я гуляю");
        }else{
            System.out.println(needFood);
        }
    }

    void jump(){
        if (isSatiety()){
            System.out.println("Прыг");
        }else{
            System.out.println(needFood);
        }
    }
    
}
