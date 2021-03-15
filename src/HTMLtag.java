import java.util.ArrayList;
import java.util.TreeMap;

public class HTMLtag {

    private String tagName;
    private String tagValue;
    private TreeMap<String, String> attributes = new TreeMap<>();
    private ArrayList<HTMLtag> subTags = new ArrayList<>();
    private String indentation = "  ";
    private int indentations = 1;

    public HTMLtag(String tagName){
        this.tagName = tagName;
    }

    public HTMLtag(String tagName, String tagValue){
        this.tagName = tagName;
        this.tagValue = tagValue;
    }

    public HTMLtag(String tagName, String tagValue, String indentation){
        this.tagName = tagName;
        this.tagValue = tagValue;
        this.indentation = indentation;
    }

    public HTMLtag(String tagName, String tagValue, String indentation, int indentations){
        this.tagName = tagName;
        this.tagValue = tagValue;
        this.indentation = indentation;
        this.indentations = indentations;
    }


    public ArrayList<HTMLtag> getSubTags(){
        return this.subTags;
    };

    public void setSubTags(ArrayList<HTMLtag> subTags) {
        this.subTags = subTags;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        // open tag
        sb.append("<").append(this.tagName);
        this.attributes.entrySet().stream().forEach(e -> sb.append(" ").append(e.getKey()).append("=\"").append(e.getValue()).append("\""));
        sb.append(">").append("\n");

        // tag content
        sb.append(String.valueOf(this.indentation).repeat(Math.max(0, this.indentations)));
        for (HTMLtag t:this.subTags) sb.append(t);
        sb.append(this.tagValue).append("\n");

        // close tag
        sb.append("</").append(this.tagName).append(">").append("\n");

        return sb.toString();
    }
}
