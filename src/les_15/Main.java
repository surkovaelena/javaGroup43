package les_15;

import java.util.jar.JarEntry;

public class Main {
    public static void main(String[] args) {
//������� �����������
        JavaDeveloper dev1 = new JavaDeveloper();
        PythonDeveloper dev1_2 = new PythonDeveloper();

        dev1.doWork();
        dev1_2.doWork();
     ABsEmployer dev2 =new JavaDeveloper();
        dev2.doWork();
        Employer dev3 = new JavaDeveloper();
        dev3.doWork();
        People dev4= new PythonDeveloper();
        ///dev4.  ��� � ������
        Object dev5 = new JavaDeveloper();
        /// ������ ��� �������
        JavaDeveloper devJava = new JavaDeveloper();
        PythonDeveloper devPython = new PythonDeveloper();

        Employer [] employers =new Employer[2];
        //  JavaDeveloper [] employers = new JavaDeveloper[2];
        //���� �� ������� ������ �� ����� ������ � ��������
        employers[0]= devJava;
        employers[1]= devPython;



    }
}
