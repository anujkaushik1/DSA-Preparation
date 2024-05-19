package OOPS;

public class ThisKeyword {
    String name;

    private ThisKeyword(String name){
        this.name = name;
        System.out.println("Before name = " + this.name);
        concatValueWithName(this);
        System.out.println("After name = " + this.name);

    }

    private void concatValueWithName(ThisKeyword objectThisKeyword) {
        objectThisKeyword.name = "Method called";
    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword("TESTINGGGG");
    }
}
