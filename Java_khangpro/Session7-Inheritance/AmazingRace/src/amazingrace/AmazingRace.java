package amazingrace;

import data.*;

public class AmazingRace {
    public static void main(String[] args) {
        register();
    }

    public static void register(){
        Cat tom= new Cat("TOM",1950,10.5,"><");
        tom.showRecord();

        Pet kitty = new Cat("KITTY",1990,5.0,"><");
        kitty.showRecord();

        Dog ngaoDa = new Dog("NGAO DA", 2021,50.0);
        Pet beTo = new Dog("BÊ - TÔ",2012,5.0);
        ngaoDa.showRecord();
        beTo.showRecord();

        //run() đa hình rồi các con ơi
        // if[i].run() > [j].run()     khó vì mỗi lần gọi RUN() là i và j khác nhau
        // Bài kia diện tích điểm TB lúc sort , 2 forko đổi , S, điểm
        // Bài này gọi TOM,RUN() Tên cố định , năm sinh cố định
        //RUN() không cố định
    }



}
