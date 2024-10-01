import java.util.Scanner;

public class Kotik{
    private String name;
    private double weigth;
    private int satiety = 25;
    private String needFood = "Я голоден:( Покормите меня";
    private String meow = "Мяу";

    public static int countCats = 0;

    public static void printCountCats(){
        try{
            int count = Kotik.countCats;
            System.out.printf("Было создано %d котик(a)\n",count);
        }catch (Exception e){
            System.out.println("Вы еще не добавили котиков");
        }
    }

    private boolean isSatiety(){
        return this.satiety >= 0;
    }


    public Kotik(String name,double weight, String meow){
        this.name = name;
        this.weigth = weight;
        this.meow = meow;
        Kotik.countCats++;
        System.out.println("Котик добавлен");
    }

    public Kotik(String name,double weight){
        this.name = name;
        this.weigth = weight;
        Kotik.countCats++;
        System.out.println("Котик добавлен");
    }

    public Kotik(){
        System.out.println("Назовите котика и установите вес через setName setWeigth");
        Kotik.countCats++;
        System.out.println("Котик добавлен");
    }


    public void setName(String name){
        this.name = name;
        System.out.println("Имя изменено");
    }
    public void setWeigth(double weigth){
        this.weigth = weigth;
        System.out.println("Вес изменен");
    }
    public void setMeow(String meow){
        this.meow = meow;
        System.out.println("Мяу изменен");
    }



    public int getSatiety(){
        return this.satiety;
    }
    public String getName(){
        return this.name;
    }
    public double getWeigth(){
        return this.weigth;
    }
    public String getMeow(){
        return this.meow;
    }


    void liveAnotherDay(){
        System.out.println("Начнем дневной трип:");
        for(int i = 0; i < 25; i++){
            int action = (int) (Math.random()*6);
            //System.out.printf("Cытость котика %d действие %d\n",this.satiety,action);
            switch (action){
                case 0: play();break;
                case 1: sleep();break;
                case 2: chaseMouse();break;
                case 3: walk();break;
                case 4: jump();break;
                case 5: makeSound();break;
                default : System.out.println("Неверное действие");break;
            }
        }
        System.out.println("День окончен.");
    }

    public void eat(){
        //this.eat(4,"Сухой корм");
        System.out.println("Введите какая сытость у еды и как называется еда(укажите через пробел)");
        Scanner food = new Scanner(System.in);
        int satiety = 0;
        String nameFood = "";
        try {
            satiety= food.nextInt();
             nameFood = food.nextLine();
        }catch(Exception e){
            System.out.println("Неверный ввод введитe снова");
            this.eat();
        }

        eat(satiety,nameFood);
    }

    public void eat(int satiety, String food){
        this.satiety+=satiety;
        System.out.printf("Я поел %s Мяуу", food);
    }

    public void eat(int satiety){
        this.satiety+=satiety;
        System.out.println("Я что то покушал Мяу");
    }

    public void play() {
        if (isSatiety()){
            System.out.println("Ну что же, поиграемся:)");
            this.satiety--;
        }else{
            System.out.println(needFood);
            this.eat();
        }
    }


    public void makeSound(){
        if (isSatiety()){
            System.out.println(this.meow);
            this.satiety--;
        }else{
            System.out.println(needFood);
            this.eat();
        }
    }
    public void sleep(){
        if (isSatiety()){
            System.out.println("Zzzz....");
            this.satiety--;
        }else{
            System.out.println(needFood);
            this.eat();
        }
    }

    public void chaseMouse(){
        if (isSatiety()){
            System.out.println("Поймал мышку");
            this.satiety--;
        }else{
            System.out.println(needFood);
            this.eat();
        }
    }

    public void walk(){
        if (isSatiety()){
            System.out.println("Я гуляю");
            this.satiety--;
        }else{
            System.out.println(needFood);
            this.eat();
        }
    }

    public void jump(){
        if (isSatiety()){
            System.out.println("Прыг");
            this.satiety--;
        }else{
            System.out.println(needFood);
            this.eat();
        }
    }
    
}
