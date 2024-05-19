package les_15;

import java.util.jar.JarEntry;

public class Main {
    public static void main(String[] args) {
//создаем сотрудников
        JavaDeveloper dev1 = new JavaDeveloper();
        PythonDeveloper dev1_2 = new PythonDeveloper();

        dev1.doWork();
        dev1_2.doWork();
     ABsEmployer dev2 =new JavaDeveloper();
        dev2.doWork();
        Employer dev3 = new JavaDeveloper();
        dev3.doWork();
        People dev4= new PythonDeveloper();
        ///dev4.  нет м етодов
        Object dev5 = new JavaDeveloper();
        /// совсем нет методов
        JavaDeveloper devJava = new JavaDeveloper();
        PythonDeveloper devPython = new PythonDeveloper();

        Employer [] employers =new Employer[2];
        //  JavaDeveloper [] employers = new JavaDeveloper[2];
        //сюда не сложить разное тк можно только в родителя
        employers[0]= devJava;
        employers[1]= devPython;



    }
}
