package Aproblems;

public class DemoExceptioin {

try{
int i = 1/0;
} catch(Test t){
System.out.println(t.getMessage());
}


}

class Test extends RuntimeException {
   
    

    public Test( String message) {
        super(message);
    }

    public Test getMessage() {
        return  new Test("Unable to execcute the program");
    }

}