import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public boolean thisCausesFindBugWarnings(String s) {
        return "abc"==s;
    }

    public void thisCreatesCompilerWarnings() {
        List a = new ArrayList();
        a.add("foo");
    }
}
