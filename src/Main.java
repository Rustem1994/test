import java.io.*;

/*
Техническое задание(ТЗ):
На вход подается строка(одно слово), и нам нужно определить какому пользовалю относиться

Решение:
Класс Пользователь(User)
Login
ФИО
Массив Слов

Класс Слово(Word)
Строка

Ришат:
Создать класс Слово
В класс Пользователь добавить новое поле Массив Слов и реализовать set и get
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(args.length);
        if (args.length>=1){
            System.out.println(args[0]);
            User[] users;

            int index=0;
            try (BufferedReader br = new BufferedReader(new FileReader(args[0])))
            {
                while ( br.readLine() != null)
                {
                    index++;
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            System.out.println("В файле "+index+" строк");

            users=new User[index];

            index=0;
            try (BufferedReader br = new BufferedReader(new FileReader(args[0])))
            {
                // BufferedReader br = new BufferedReader(new FileReader(args[0]));
                String sCurrentLine;
                while ((sCurrentLine = br.readLine()) != null)
                {
                    String[] arr_str= sCurrentLine.split(";");
                    users[index++]=new User(arr_str[0],arr_str[1]);
                }
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }

            System.out.println("Выводим строки из массив");
            for (int i=0; i<users.length; i++){
                System.out.println(users[i].getLogin()+"|"+users[i].getFIO());
            }

        }
	// write your code here
    }
}
