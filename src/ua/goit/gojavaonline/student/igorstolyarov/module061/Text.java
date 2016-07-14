package ua.goit.gojavaonline.student.igorstolyarov.module061;

/*
Класс создан для текстовых переменных, чтобы класс main выглядел получше
 */
class Text {
    private static String firstMessage = "Для перевода значения из Цельсия в Фарингейты,\n" +
                                         "введите число. Если необходима дробная часть, тогда через запятую";
    private static String rezultText   = "Температура по шкале Фарингейта равна ";
    private static String errorMessage = "Не могу распознать симовлы. Введите число повторно";

    public static String getFirstMessage() {
        return firstMessage;
    }

    public static String getRezultText() {
        return rezultText;
    }

    public static String getErrorMessage() {
        return errorMessage;
    }
}
