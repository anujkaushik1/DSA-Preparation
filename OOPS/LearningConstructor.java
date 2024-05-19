package OOPS;

public class LearningConstructor {
     String name;

    LearningConstructor(){
        System.out.println("constructor called");
        name = "anuj";
    }
    LearningConstructor(int a){
        System.out.println("second called");
    }

    public static void main(String[] args) {
        LearningConstructor obj = new LearningConstructor();
        LearningConstructor obj2 = new LearningConstructor(10);
        System.out.println(obj.name);
        System.out.println(obj2.name);

    }
}
