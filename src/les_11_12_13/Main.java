package les_11_12_13;



public class Main {
    public static void main(String[] args) {
        /**
         * �� ��������� ��� ���������� �����-���������� ������ ���������� EasyUm MediaProduct, ��� �������
         * ������ � ����������� �������.
         * 1. ��������� ������ ��� �������� ���������� �:
         *      - ����������� ���� (��������, �����������, ��� �������, ������, ���������� ������), ���� �����
         *      - ������� (��������, ��� ������, ������ ��������, ��������, ����������������� � �������, ������)
         * 2. ������� ������ �������� � ������������ �������� (������ � ����������� �����),
         *      ��������� ��� ����������� ����������, ������� ��� �������� �� �����.
         * 3. ����� � ������� ����� ������ ����/����� � ������� ���������� � ��� �� �����.
         * 4. ��������, ��� � ����� � ������ ��������� ������������ �����������, ��� ������������, � ��� ����������.
         */

        Object[] mediaProduct = new Object[2];

        //������� ����� 1
        VideoContent film1 = new VideoContent();
        film1.setName("������� ����");
        film1.setDirector("������ �.�.");
        film1.setStudio("�������");
        film1.setMins(120);
        film1.setYear(2005);

        //������� ����� 2
        VideoContent film2 = new VideoContent("�� ������", 1983, "���� ����������", "������ �.�", 60);
        film2.setName(" �� ������");
        film2.setYear(1983);
        film2.setDirector("������ �.�.");
        film2.setStudio("��������������");
        film2.setMins(60);

        //���� �������
        //1. ��������� � les_10 � PhoneBook �������� ����� sourchContactSubstring ����� ��� ������ "��", �� ���� "�������"
        //2. ��������� � les_11 � � ������ AudioContent ��������� ���� (�� ������� ����) � ������� ������� � ������� � ���������� + ������
        //3. Main � ������� ���� �������� �����
        //4. ����� ������� (�� ���� ���) MediaProduct � � ��� ������ ������� ������ � ����� (�����������)

        //�������� ��������� �����(��-�� ��������. ��������� ����)

        AudioContent music1 =new AudioContent();
        music1.setName("��������� ");
        music1.setExecutor("������");
        music1.setYear(1990);
        music1.setCountofTrack(12);


        AudioContent music2 =new AudioContent();

        music2.setName("������");
        music2.setExecutor("��������");
        music2.setYear(1989);
        music2.setCountofTrack(10);

        AudioContent music3 =new AudioContent();
        music3.setName("�����");
        music3.setExecutor("��");
        music3.setYear(1977);
        music3.setCountofTrack(10);


        //������� ������ � ������� ������ � �����  ******�����������
        MediaProduct[] mediaProducts =new MediaProduct[5];
        mediaProducts[0]=film1;
        mediaProducts[1]=film2;
        mediaProducts[2]=music1;
        mediaProducts[3]=music2;
        mediaProducts[4]=music3;

        // ������ �� ������� ��� � ����� � ����� � ������ �������� �����(�����������)
       for (MediaProduct product:mediaProducts){

           product.printAllInfo();//���������� ������������

        }
        System.out.println("------------------");
//1/��� ������� ����� ����� ��� ����� � ����� printAllInfo() voi, sout �� �������  � ��������� ���� 63-65
// 2����� ������� ����� ��� ������ �������  � ���������
        ServiceUtilities.printOldestMedia(mediaProducts);
//        ServiceUtilities utilities1 =new ServiceUtilities();
//        utilities1.printOldestMedia(mediaProducts);


//        System.out.println();


    }
}
