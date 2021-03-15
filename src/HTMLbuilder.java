public class HTMLbuilder {

    private HTMLpage buildObject = new HTMLpage();

    public HTMLbuilder addTag(HTMLtag tag){
        this.buildObject.tags.add(tag);
        return this;
    }

    public HTMLbuilder addTag(String tag){
        this.buildObject.tags.add(new HTMLtag(tag));
        return this;
    }

    public HTMLbuilder addTag(String tag,String inhalt){
        this.buildObject.tags.add(new HTMLtag(tag,inhalt));
        return this;
    }

    public HTMLbuilder addSubTag(HTMLtag tag){
        this.buildObject.tags.get(buildObject.tags.size() - 1).getSubTags().add(tag);
        return this;
    }

    public HTMLpage build(){
        return this.buildObject;
    }

}
