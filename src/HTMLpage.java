import java.util.ArrayList;

public class HTMLpage {

    public ArrayList<HTMLtag> tags = new ArrayList<>();

    public HTMLpage(){
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (HTMLtag t:this.tags) {
            sb.append(t);
        }
        return sb.toString();
    }
}
