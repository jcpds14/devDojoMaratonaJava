package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatchTest01 {
    public static void main(String[] args) {
        Path path = Paths.get("pasta/subpasta2/file.bkp");
        Path path1 = Paths.get("pasta/subpasta2/file.txt");
        Path path2 = Paths.get("pasta/subpasta2/file.java");

        matches(path, "glob:*.bkp");
        matches(path, "glob:**/*.{bkp,txt,java}");
        matches(path1, "glob:**/*.{bkp,txt,java}");
        matches(path2, "glob:**/*.{bkp,txt,java}");
        matches(path, "glob:**/*.???");
        matches(path1, "glob:**/*.???");
        matches(path2, "glob:**/*.???");
        matches(path2, "glob:**/*.????");
    }
    private static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": " + matcher.matches(path));

    }
}