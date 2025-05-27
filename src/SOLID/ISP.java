package SOLID;



//Bad

interface Machine {
    void print();
    void scan();
    void fax();
}

class SimplePrinter implements Machine {
    public void print() {  }
    public void scan() { } // лишнее
    public void fax() { }  // лишнее
}

//Good
//interface Printer {
//    void print();
//}
//
//interface Scanner {
//    void scan();
//}
