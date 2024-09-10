import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        /*System.out.println("Введите два числа: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        task1(num1, num2);*/

        /*System.out.println("Введите делимое и делитель: ");
        float num1 = in.nextFloat();
        float num2 = in.nextFloat();
        task2(num1, num2);*/

        /*System.out.println("Введите строку:  ");
        String stroka = in.nextLine();
        task3(stroka);*/

        /*System.out.println("Введите возраст: ");
        int age = in.nextInt();
        task4(age);*/

        /*System.out.println("Введите число: ");
        int num = in.nextInt();
        task5(num);*/

        /*System.out.println("Введите число: ");
        int num = in.nextInt();
        task6(num);*/

        /*System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int[] mass = new int[size];

        System.out.println("Введите элементы массива: ");
        for(int i = 0; i < size; i++)
        {
            mass[i] = in.nextInt();
        }
        task7(mass);*/

        /*System.out.println("Введите число: ");
        int num1 = in.nextInt();
        System.out.println("Введите степень, в которую необходимо возвести число: ");
        int num2 = in.nextInt();
        task8(num1, num2);*/

        /*System.out.println("Введите строку: ");
        String str = in.nextLine();
        System.out.println("Введите количество символов для обрезки: ");
        int count = in.nextInt();
        System.out.println(task9(str, count));*/

        /*System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int[] mass = new int[size];

        System.out.println("Введите элементы массива: ");
        for(int i = 0; i < size; i++)
        {
            mass[i] = in.nextInt();
        }

        System.out.println("Введите элемент, который необходимо найти в массиве: ");
        int num = in.nextInt();
        task10(mass, num);*/

        /*System.out.println("Введите число: ");
        int num = in.nextInt();
        task11(num);*/

        /*System.out.println("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = in.nextInt();
        task12(num1, num2);*/

        /*System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int[] mass = new int[size];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++)
        {
            mass[i] = in.nextInt();
        }

        System.out.println("Введите индекс элемента: ");
        int index = in.nextInt();
        System.out.println(task13(mass, index));*/

        /*System.out.println("Введите пароль: ");
        String pass = in.nextLine();
        task14(pass);*/

        /*System.out.println("Введите дату в формате дд.мм.гггг: ");
        String date = in.next();
        task15(date);*/

        /*System.out.println("Введите первую строку: ");
        String str1 = in.nextLine();
        System.out.println("Введите вторую строку: ");
        String str2 = in.nextLine();
        task16(str1, str2);*/

        /*System.out.println("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = in.nextInt();
        System.out.println(task17(num1, num2));*/

        /*System.out.println("Введите число: ");
        int num = in.nextInt();
        task18(num);*/

        /*System.out.println("Введите температуру(Цельсия): ");
        int cel = in.nextInt();
        task19(cel);*/

        /*System.out.println("Введиите строку: ");
        String str = in.nextLine();
        task20(str);*/

        in.close();
    }

    // 1. Функция для нахождения максимума
    public static void task1(int num1, int num2)
    {
        try
        {
            if(num1 > num2)
            {
                System.out.println("Максимальное число: " + num1);
            }
            else if(num2 > num1)
            {
                System.out.println("Максимальное число: " + num2);
            }
            else
            {
                throw new Exception("Числа равны!");
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    // 2. Калькулятор деления
    public static void task2(float num1, float num2)
    {
        try
        {
            if(num2 == 0)
            {
                throw new ArithmeticException("На 0 делить нельзя!");
            }
            else
            {
                System.out.println("Результат деления " + num1/num2);
            }
        }
        catch (ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    // 3. Конвертер строк в числа
    public static void task3(String stroka)
    {
        try
        {
            int num = Integer.parseInt(stroka);
            System.out.println(num);
        }
        catch(Exception ex)
        {
            System.out.println("Введенную строку невозможно преобразовать в целое число!");
        }
    }

    // 4. Проверка возраста
    public static void task4(int age)
    {
        try
        {
            if(age >= 0 && age <= 150)
            {
                System.out.println("Введенный возраст: " + age);
            }
            else
            {
                throw new IllegalArgumentException("Некорректно введен возраст!");
            }
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    // 5. Нахождение корня
    public static void task5(int num)
    {
        try
        {
            if(num >= 0)
            {
                System.out.println("Корень из числа " + num + " равен " + Math.sqrt(num));
            }
            else
            {
                throw new IllegalArgumentException("Невозможно найти корень из отрицательного числа!");
            }
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    // 6. Факториал
    public static void task6(int num)
    {
        try
        {
            if (num > 0)
            {
                int fact = 1;
                for(int i = 1; i <= num; i++)
                {
                    fact *= i;
                }
                System.out.println("Факториал числа " + num + " равен " + fact);
            }
            else if(num == 0)
            {
                System.out.println("Факториал числа " + num + " равен " + 1);
            }
            else
            {
                throw new Exception("Невозможно найти факториал отрицательного числа!");
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    // 7. Проверка массива на нули
    public static void task7(int[] mass)
    {
        try
        {
            for(int i : mass)
            {
                if (i == 0)
                {
                    throw new Exception("Среди элементов массива есть 0!");
                }
            }
            System.out.println("Среди элементов массива нет 0!");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    // 8. Калькулятор возведения в степень
    public static void task8(int num1, int num2)
    {
        try
        {
            if(num2 >= 0)
            {
                System.out.println("Число " + num1 + " в степени " + num2 + " равно " + Math.pow(num1, num2));
            }
            else
            {
                throw new Exception("Отрицательная степень!");
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    // 9. Обрезка строки
    public static String task9(String str, int count)
    {
        try {
            if (str.length() < count)
            {
                throw new Exception("Число символов для обрезки больше длины строки!");
            }

            return str.substring(0, count);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return str;
    }

    // 10. Поиск элемента в массиве
    public static void task10(int[] mass, int num)
    {
        try
        {
            boolean flag = false;

            for (int i : mass)
            {
                if(i == num)
                {
                    flag = true;
                    break;
                }
            }

            if(flag)
            {
                System.out.println("Среди элементов массива есть число " +  num);
            }
            else
            {
                throw new Exception("Среди элементов массива нет числа " + num);
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    // 11. Конвертация в двоичную систему
    public static void task11(int num)
    {
        try
        {
            if(num < 0)
            {
                throw new IllegalArgumentException("Отрицатаельное число!");
            }
            System.out.println("Число " + num + " в двоичной системе счисления: " + Integer.toBinaryString(num));
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    // 12. Проверка делимости
    public static void task12(int num1, int num2)
    {
        try
        {
            if(num2 == 0)
            {
                throw new ArithmeticException("Второе число равно нулю!");
            }
            else if(num1 % num2 == 0)
            {
                System.out.println("Число " + num1 + " делить на " + num2 + " равно " + (num1 / num2));
            }
            else
            {
                System.out.println("Число " + num1 + " не делиться на число " + num2);
            }
        }
        catch (ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    // 13. Чтение элемента списка
    public static int task13(int[] mass, int index)
    {
        try
        {
            if(mass.length - 1 < index)
            {
                throw new IndexOutOfBoundsException("Индекс выходит за пределы списка!");
            }
            return mass[index];
        }
        catch (IndexOutOfBoundsException ex)
        {
            System.out.println(ex.getMessage());
        }
        return mass[0];
    }

    // 14. Парольная проверка
    public static void task14(String pass)
    {
        try
        {
            if(pass.length() < 8)
            {
                throw new Exception("Слишком простой пароль!");
            }
            else
            {
                System.out.println("Введенный пароль: " + pass);
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }

    // 15. Проверка даты
    public static void task15(String date)
    {
        try
        {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate localDate = LocalDate.parse(date, formatter);
        }
        catch (DateTimeParseException ex)
        {
            System.out.println("Неверный формат даты!");
        }
    }

    // 16. Конкатенация строк
    public static void task16(String str1, String str2)
    {
        try
        {
            if(str1 == null || str2 == null)
            {
                throw new NullPointerException("Одна из строк равна null!");
            }
            else
            {
                System.out.println("Результат конкатенации введенных строк: " + str1 + str2);
            }
        }
        catch (NullPointerException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    // 17. Остаток от деления
    public static int task17(int num1, int num2)
    {
        try
        {
            if(num2 == 0)
            {
                throw new Exception("На ноль делить нельзя!");
            }

            return num1 % num2;
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        return -1;
    }

    // 18. Квадратный корень
    public static void task18(int num)
    {
        try
        {
            if(num < 0)
            {
                throw new IllegalArgumentException("Невозможно найти квадратный корень из отрицательного числа!");
            }

            System.out.println("Квадратный корень из числа " + num + " равен " + Math.sqrt(num));
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    // 19. Конвертер температуры
    public static void task19(int cel)
    {
        try
        {
            if(cel >= -273)
            {
                System.out.println("Температура в Фаренгейтах: " + (cel * 9 / 5 +32));
            }
            else
            {
                throw new Exception("Невозможно перевести!");
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    // 20. Проверка строки на пустоту
    public static void task20(String str)
    {
        try
        {
            if(str == null || str == "")
            {
                throw new Exception("Строка пуста / равна null!");
            }
            else
            {
                System.out.println("Введенная строка: " + str);
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

}