import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FireTest {
    @Test
    public void testTimeToBurnExample() {
        char[][] forest = {
            {'t','.','.','t','t','t','t','.','t'},
            {'.','.','t','t','.','.','.','.','t'},
            {'.','.','t','t','t','t','t','t','t'},
            {'t','t','t','t','.','.','.','.','.'}
        };

        int matchR = 2;
        int matchC = 6;

        int expected = 8;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }

    // Add more tests!
    @Test
    public void testTimeToBurnTopRightCorner() {
        char[][] forest = {
            {'t','t','t','t','t','t','t','t','t'},
            {'t','t','t','t','t','t','t','t','t'},
            {'t','t','t','t','t','t','t','t','t'},
            {'t','t','t','t','t','t','t','t','t'}
        };
        /*
            {'t8','t7','t6','t5','t4','t3','t2','t1','t0'},
            {'t9','t8','t7','t6','t5','t4','t3','t2','t1'},
            {'t10','t9','t8','t7','t6','t5','t4','t3','t2'},
            {'t11','t10','t9','t8','t7','t6','t5','t4','t3'}
        */
        int matchR = 0;
        int matchC = 8;

        int expected = 11;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }

    @Test
    public void testTimeToBurnHorizontal() {
        char[][] forest = {
            {'t','t','t','t','t','t','t','t','t'}
        };

        int matchR = 0;
        int matchC = 0;

        int expected = 8;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }

    @Test
    public void testTimeToBurnVertical(){
        char[][] forest = {
            {'t'},
            {'t'},
            {'t'},
            {'t'},
            {'t'},
            {'t'},
            {'t'},
            {'t'},
            {'t'}
        };

        int matchR = 0;
        int matchC = 0;

        int expected = 8;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }

    @Test
    public void testTimeToBurnNoTrees() {
        char[][] forest = {
            {'.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.'}
        };

        int matchR = 0;
        int matchC = 0;

        int expected = 0;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }

    @Test
    public void testTimeToBurnAllDirections() {
        char[][] forest = {
          {'.', '.', '.', '.', '.'},
          {'.', '.', 't', '.', '.'},
          {'.', 't', 't', 't', '.'},
          {'.', '.', 't', '.', '.'},
          {'.', '.', '.', '.', '.'}
        };

        int matchR = 2;
        int matchC = 2;

        int expected = 1;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }

    @Test
    public void testTimeToBurnAllDiagonal() {
        char[][] forest = {
          {'t', 't', '.', '.', '.'},
          {'.', 't', 't', '.', '.'},
          {'.', '.', 't', 't', '.'},
          {'.', '.', '.', 't', 't'},
          {'.', '.', '.', '.', 't'}
        };

        int matchR = 0;
        int matchC = 0;

        int expected = 8;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }

    @Test
    public void testTimeToBurnSingular() {
        char[][] forest = {
          {'.', '.', '.', '.', '.'},
          {'.', '.', '.', '.', '.'},
          {'.', '.', 't', '.', '.'},
          {'.', '.', '.', '.', '.'},
          {'.', '.', '.', '.', '.'}
        };

        int matchR = 2;
        int matchC = 2;

        int expected = 0;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }
}
