package neetcode.arrays_hashing;

import java.util.*;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        List<Set<Character>> cols = new ArrayList<>();
        List<Set<Character>> rows = new ArrayList<>();
        List<Set<Character>> boxes = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            cols.add(new HashSet<>());
            rows.add(new HashSet<>());
            boxes.add(new HashSet<>());
        }
        for (int c = 0; c < 9; c++) {
            for (int r = 0; r < 9; r++) {
                var n = board[c][r];
                if (n == '.'){
                    continue;
                }
                if (cols.get(r).contains(n) ||
                    rows.get(c).contains(n) ||
                    boxes.get(getBoxIndex(c,r)).contains(n)) {
                    return false;
                }
                cols.get(r).add(n);
                rows.get(c).add(n);
                boxes.get(getBoxIndex(c,r)).add(n);
            }
        }
        return true;
    }

    private int getBoxIndex(int c, int r) {
        return (c/3)*3+r/3;
    }
}
