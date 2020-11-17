package week3.day1;

import utils.ArrayUtils;

public class _06StringMethods {
    public static void main(String[] args) {
        String name = "Dima";
        String name2 = "Dima";
        String name3 = new String("Dima");
//        not recommended:
        System.out.println(name == name2); // <- ответ true, потому что ссылки на данные("Дима") одинаковые.
        System.out.println(name == name3); // <- овтет false, потому что хоть и данные("Дима") одинаковые, но ссылки на низ разные, а таким образом будут сравниваться ссылки на данные, а не сами данные.

        System.out.println(name.equals(name3)); // <- ответ true. Метод сравнивает сами стринги.
        System.out.println(name.equalsIgnoreCase("dima")); // <- за счет IgnoreCase перестает быть восприимчиым к регистру (большие или маленькие буквы). Потому что у большой и маленькой буквы разные бинарные номера.

        System.out.println(name.compareTo(name3)); // <- метод сравнивает какой из стрингов больше, ответ 0(ноль).

        String text = "Hello my name is Vova!";
        String[] words = text.split(" "); // <- split - метод делитель, будет доходить до пробела(то что укажешь в реджекс), и вставлять вместо него то, что указано внутри метода сплит (по дефолуту там пробел).
        ArrayUtils.printArray(words);

        String name4 = name.concat(name3); // <- concat - метод присоединяет String name3 к String-у name.
        System.out.println(name4);

        System.out.println(name.charAt(2)); // <- charAt - метод определяет конкретный символ в стринге, под тем номером, который указать в скобочках (отсчет начинается с 0).

        System.out.println(name.contains("im")); // <- contains - метод проверяющий содержится ли в стринге определенные символы в конкретной последовательности(ответ будет true).

        System.out.println(name.endsWith("a")); // <- endsWith - заканчивается ли таким-то(в скобочках) символом (ответ true).
        System.out.println(name.startsWith("d")); // <- startsWith - начинается ли с такого-то символа. Регистро-чувствительный метод (видит разницу между маленькой и заглавной буквой), потому ответ будет false.

        System.out.println(name.indexOf("i")); // <- даже если букв "i" будет 9шт. подряд, то все равно выведет на консоль 1.
        System.out.println(name.lastIndexOf("i")); // <- если букв "i" будет 9шт. подряд, то выведет на консоль 9.

        name = name.trim(); // <- метод "обрезающий" пробелы по краям строки (если бы они были), внутри строки не удаляет.
        System.out.println(name);

        System.out.println(name.length()); // <- length() - метод определяющий количество символов в строке, без учета пробелов.

        System.out.println(name.toUpperCase()); // <- делает все буквы заглавными/большими.
        System.out.println(name.toLowerCase()); // <- делает все буквы маленькими.

        System.out.println(name.substring(1)); // <- метод выводит символы начиная с такого-то номера и до самого конца.
        System.out.println(name.substring(1, 2)); // <- метод выводит символы с какого-то по какой-то.

        char[] symbols = name.toCharArray(); // <- разбивает строку на массив с отдельными символами.
        ArrayUtils.printArray(symbols);

    }
}

