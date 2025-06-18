package MySB;

public class Test {

    public static void main(String[] args) {
        MyStringBuilder sb = new MyStringBuilder();
        sb.append("Проверка ");
        sb.append("метода ");
        sb.append("Undo ");
        System.out.println(sb);
        sb.undo();
        System.out.println(sb);

        System.out.println("Удаляем все");
        sb.delete(0, sb.length());
        System.out.println("0" + sb + "0");
        sb.undo();
        System.out.println(sb);

    }
}
