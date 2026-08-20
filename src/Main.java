public class Main {
    static void main() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("значение#1 "+dog);
        System.out.println("значение#1 "+cat);
        System.out.println("значение#1 "+paper);

        System.out.println ("Задание2");

        var dog2 = 8.0 + 4;
        var cat2 = 3.6 + 4;
        var paper2 = 763789 + 4;
        System.out.println("значение#2 "+dog2);
        System.out.println("значение#2 "+cat2);
        System.out.println("значение#2 "+paper2);

        System.out.println ("Задание3");

        var dog3 = 8.0 - 3.5;
        var cat3 = 3.6 - 1.6;
        var paper3 = 763789 - 7639;
        System.out.println("значение#3 "+dog3);
        System.out.println("значение#3 "+cat3);
        System.out.println("значение#3 "+paper3);

        System.out.println ("Задание4");

        var friend = 19;
        var friendby2 = friend + 2;
        var friendby7 = friendby2 / 7;
        System.out.println("значение#4 "+friend);
        System.out.println("значение#4 "+friendby2);
        System.out.println("значение#4 "+friendby7);

        System.out.println ("Задание5");

        var frog=3.5;
        var frogby10=frog*10;
        var frogby35=frogby10/3.5;
        var frogby4=frogby35+4;
        System.out.println("значение#5 "+frog);
        System.out.println("значение#5 "+frogby10);
        System.out.println("значение#5 "+frogby35);
        System.out.println("значение#5 "+frogby4);

        System.out.println ("Задание6");

        var box1=78.2;
        var box2=82.7;
        var result1 = box1 + box2;
        var result2 = box2 - box1;
        System.out.println ("масса  боксеров = " + result1 );
        System.out.println ("разница масс боксеров = " + result2 );

        System.out.println ("Задание7");

        var massDifference = box2 % box1;
        System.out.println ("остаток от деления = " + massDifference );

        System.out.println ("Задание8,1");

        var fulltime=640;
        var time1=8;
        var workers=fulltime/time1;
        System.out.println ("Всего работников в компании = " + workers + "  работников" );

        System.out.println ("Задание8,2");
        var workersnew=workers+94;
        var time=workersnew*time1;
        System.out.println (" Если в компании работает = " + workersnew + " человек"+",то всего = "+ time + "  часов работы может быть поделено между сотрудниками" );

    }
}