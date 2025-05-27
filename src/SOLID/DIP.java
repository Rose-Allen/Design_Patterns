package SOLID;

//BAD

class FileLogger {
    public void log(String msg) {  }
}

class App {
    FileLogger logger = new FileLogger(); // жёсткая связь
}

//GOOD
//interface Logger {
//    void log(String msg);
//}
//
//class FileLogger implements Logger {
//    public void log(String msg) { ... }
//}
//
//class App {
//    private Logger logger;
//
//    public App(Logger logger) {
//        this.logger = logger;
//    }
//}
