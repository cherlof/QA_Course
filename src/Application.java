
public class Application {
    public static void main(String[] args) {
            Kotik.printCountCats();

            Kotik kotik1 = new Kotik("Barsik",18.5,"МЯУУУУУУ");
            Kotik kotik2 = new Kotik();
            kotik2.setName("Vasya");
            kotik2.setWeigth(12.3);
            kotik2.setMeow("МЯУУУУУУ");
            System.out.printf("Меня зовут %s\n",kotik1.getName());
            kotik1.liveAnotherDay();
            System.out.printf("Меня зовут %s\n",kotik2.getName());
            kotik2.liveAnotherDay();

            if(kotik1.getMeow().equals(kotik2.getMeow())){
                System.out.println("Мы одинаково мяукаем");
            }else {
                System.out.println("Мы слишком разные, не понимаю его");
            }
            //После изменения мяу

            kotik2.setMeow("МЯУ");

            if(kotik1.getMeow().equals(kotik2.getMeow())){
                System.out.println("Мы одинаково мяукаем");
            }else {
                System.out.println("Мы слишком разные, не понимаю его");
            }

            Kotik.printCountCats();


    }
}