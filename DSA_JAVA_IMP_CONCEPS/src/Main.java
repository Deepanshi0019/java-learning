import javax.print.attribute.HashAttributeSet;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        HashSet<Integer> st = new HashSet<>();

        st.add(10);
        st.add(10);
        st.add(11);
        st.add(15);
        System.out.println(st);
    }
}