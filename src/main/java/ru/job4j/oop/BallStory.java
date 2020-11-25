package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        ball.tryEat(ball);
        ball.goesStrait("goes");
        hare.appears("appears");
        hare.tryEat(ball);
        ball.runs(hare);
        wolf.appears("appears");
        wolf.tryEat(ball);
        ball.runs(wolf);
        fox.appears("appears");
        fox.tryEat(ball);
        ball.die(ball);
        fox.disappear("goes in woods");
    }
}
