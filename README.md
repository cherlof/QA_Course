# QA_Course
**Описание**
Реализовать в классе Kotik дополнительные методы (5 шт), описывающие его
поведение, например play(), sleep(), chaseMouse() и т.д. Так же добавить числовую
переменную экземпляра показывающую степень сытости котика, как только она будет
ноль или меньше, котик будет отказываться выполнять любое действие, кроме eat().
Если котик голоден - он будет просить есть, а не выполнять указанное действие.
Методы описывающее поведение кота должны сигнализировать о том, выполнил его
котик или нет.
Создать в классе котик метод liveAnotherDay(), в котором будет цикл на 24 итерации, в
каждой из которых будет случайным образом вызываться один из методов котика,
отвечающих за его поведение, и если котик вместо выполнения метода будет просить
есть - его надо будет покормить.
Сделать три перегрузки метода eat(), одна из них будет принимать только количество
условных единиц сытости, и увеличивать на них соответствующую переменную
экземпляра, другая единицы сытости и название еды, третья не принимает
параметров, но содержит внутри себя вызов перегрузки принимающей название еды и
единицы сытости.
Добавить в класс Kotik статическую переменную, отвечающую за количество
созданных экземпляров класса. К переменной должна применяться арифметическая
операция «инкремент» при создании экземпляра класса.
Изменить модификаторы доступа всех переменных в классе Kotik на private. Для
доступа к переменным из других классов создать геттеры (public методы getName(),
getWeight(), и т.д.)
Создать в корневом каталоге с программой класс Application с точкой входа в
программу (метод public static void main(String[] args)).
В этом методе создать два экземпляр класса Kotik. Для первого экземпляра
использовать конструктор с параметрами, для второго конструктор без параметров в
сочетании с методами сеттерами для инициализации переменных, т.е. создается
пустой объект и сеттерами указываются параметры.
Вызвать у любого созданного экземпляра котика метод liveAnotherDay(), а также
вывести на экран (в консоль) его имя.
Вывести на экран результат сравнения одинаково ли разговаривают котики (сравнить
переменные meow).
Последней строкой в методе main вывести на экран количество котиков, созданных в
процессе выполнения программы.
Поместить класс Kotik в пакет model. При необходимости изменить модификаторы
доступа методов, чтобы программа скомпилировалась.
