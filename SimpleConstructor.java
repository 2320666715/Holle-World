package book.Initialization;

//演示一个简单的构造函数
class Rock{
    Rock( int i){  //这是构造函数
        System.out.println("Creating Rock" + i);
    }
}

public class SimpleConstructor {
    public static void main(String[] args){
        for(int i = 0 ; i < 10 ; i++){
            new Rock(i);
        }
    }
}
