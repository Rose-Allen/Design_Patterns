package SOLID;

//Bad example
class Bird {
    public void fly() {}
}

class Ostrich extends Bird {
    public void fly() { throw new UnsupportedOperationException(); }
}

//Good
//class Bird { }
//
//class FlyingBird extends Bird {
//    public void fly() {  }
//}
//
//class Ostrich extends Bird { }
//class Sparrow extends FlyingBird { }



