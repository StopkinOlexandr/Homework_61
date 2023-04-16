import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

//Задача 1.
//Используйте класс Student из урока 60 (см. Student.java).
//
//Создайте список учеников с баллами.
//
//Попросите пользователя ввести минимальный проходной балл.
//
//Выведите список учеников согласно следующим условиям:
//
//каждый ученик выведен в отдельной строке
//сумма баллов каждого ученика выше минимального проходного.
//Ученики отсортированы по убыванию среднего балла
//в списке не больше 10 учеников (извините, конкурс)
//Для обработки и вывода результата используйте потоки (Stream).
public class Task1 {

  public static void main(String[] args) throws IOException {
    List<Student> students = new ArrayList<>();
    students.add(new Student("Anton", 3));
    students.add(new Student("Boris", 2));
    students.add(new Student("Valera", 4));
    students.add(new Student("Andrey", 5));
    students.add(new Student("Yevgeniy", 3));
    students.add(new Student("Viktor1", 4));
    students.add(new Student("Anton1", 3));
    students.add(new Student("Boris1", 2));
    students.add(new Student("Valera1", 4));
    students.add(new Student("Andrey1", 5));
    students.add(new Student("Yevgeniy1", 3));
    students.add(new Student("Viktor1", 4));
    students.add(new Student("Anton2", 3));
    students.add(new Student("Boris2", 2));
    students.add(new Student("Valera2", 4));
    students.add(new Student("Andrey2", 5));
    students.add(new Student("Yevgeniy2", 3));

    BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
    System.out.print("Input minimal cross score: ");
    int crossScore = Integer.parseInt(br.readLine());

  }
}
