import kotlin.math.absoluteValue

/**
 * Description
 * Домашнее задание к занятию «1.2. Отличия от Java: immutability,
 * переменные, типы данных, операторы и приведение типов»
 * Задача №2 - "Люди/Человеки"
 */

fun main()
{
    //количество лайков (входной аргумент)
    //var likes = -10L
    //var likes = 0L
    //var likes = 1L
    //var likes = 2L
    //var likes = 10L
    //var likes = 11L
    //var likes = 21L
    //var likes = 22L
    var likes = 121L

    println("Понравилось $likes ${peopleNumeralForm(likes)}")
}

/**
 * Description peopleNumeralForm
 * Функция определяет числительную единичну или множественную форму слова человек
 * для числительного Понравилось N (людям/человеку)
 * likes - количество лайков
 * результат строка с числительной формой
 */
fun peopleNumeralForm(likes : Long) : String
{
    //форма слова не меняется для чисел больше 100 играет роль только остаток от деления на 100
    val likesReminder100 = (likes % 100).absoluteValue
    //форма "человек" может использоваться только для чисел закачнивающихся на единицу
    val flag             = (likes % 10 ).absoluteValue == 1L
    //возможные варианты результата
    val alternative0 = "человек"
    val alternative1 = "человеку"
    val alternative2 = "людям"
    //для каждого из диапазонов свой алгоритм
    when (likesReminder100)
    {
        in  0..0  -> return alternative0
        in  1..1  -> return alternative1
        in  2..20 -> return alternative2
        in 21..99 -> return if (flag) alternative1 else alternative2
    }
    //нет шансов попасть в эту точку
    return ""
}