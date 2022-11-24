public class Printer <T>{//this is a generic class in java
    T ToprintThis;
    Printer(T ToprintThis){
        this.ToprintThis=ToprintThis;
    }
    void print(){
        System.out.println(ToprintThis);
    }
}
