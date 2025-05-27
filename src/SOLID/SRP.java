package SOLID;

public class SRP {
    // Printer bad example
    public void generate(){
        System.out.println("Generate");
    }

    public void print(){
        System.out.println("Print");
    }

    public void save(){
        System.out.println("Save");
    }
}

//Good example
class Report {
    public void generate() {
        System.out.println("Generate Report");
    }
}

class Printer{
    public void print(Report report){
        System.out.println( "Print Report");
    }
}

class FileSaver{
    public void save(Report report){
        System.out.println("Save Report");
    }
}


