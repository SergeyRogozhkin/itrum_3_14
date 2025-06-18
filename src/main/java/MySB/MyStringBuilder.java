package MySB;

import java.util.Stack;

public class MyStringBuilder {

    private StringBuilder builder;
    private final Stack<String> history;

    public MyStringBuilder() {
        builder = new StringBuilder();
        history = new Stack<>();
        saveSnapshot();
    }

    private void saveSnapshot() {
        history.push(builder.toString());
    }

    public void append(String str) {
        saveSnapshot();
        builder.append(str);
    }

    public void delete(int start, int end) {
        saveSnapshot();
        builder.delete(start, end);
    }

    public void undo() {
        if (!history.isEmpty()) {
            String previousState = history.pop();
            builder = new StringBuilder(previousState);
        }
    }

    public int length() {
        return builder.length();
    }

    @Override
    public String toString() {
        return builder.toString();
    }

}
