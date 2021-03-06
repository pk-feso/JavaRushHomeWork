package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //Напишите тут ваш код
    private int left;
    private int top;
    private int width;
    private int height;

    public void initialize(int left, int top, int width, int height) {
        this.height = height;
        this.width = width;
        this.left = left;
        this.top = top;
    }
    public void initialize(int left, int top) {
        height = 0;
        width = 0;
        this.left = left;
        this.top = top;
    }
    public void initialize(int left, int top, int width) {
        this.width = width;
        height = width;
        this.left = left;
        this.top = top;
    }
    public void initialize(Rectangle anotherRectangle) {
        this.left = anotherRectangle.left;
        this.top = anotherRectangle.top;
        this.height = anotherRectangle.height;
        this.width = anotherRectangle.width;
    }

}
