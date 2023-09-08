package designpatterns.behavioural.template;

/**
 * @author hdereli
 * @since 9/8/2023
 */
public class PuzzleGame extends Game {

    @Override
    public void start() {
        System.out.println("Puzzle game started");
    }

    @Override
    public void play() {
        System.out.println("Solving puzzles");
    }

    @Override
    public void end() {
        System.out.println("Puzzle game ended");
    }
}
