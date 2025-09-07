public class TypeOfVariable {
    int num1;

    void display(){
        String name = "hh";
        int age = 13;
        System.out.println("name:" + name + "num1:" + num1 + "age:" +age);
    }



    public static void main(String[] ards) {
        TypeOfVariable typeOfVariable = new TypeOfVariable();
        typeOfVariable.num1 = 56;

        TypeOfVariable typeOfVariable2 = new TypeOfVariable();
        typeOfVariable2.num1 = 56;

        typeOfVariable.display();
        typeOfVariable.display();
    }


    
}