package application.hello;

public class Greeting {

    private final long id;
    private final String content;
    private final boolean flag;

    public Greeting(long id, String content, boolean flag) {
        this.id = id;
        this.content = content;
        this.flag = flag;
    }

    public long getId(){
        return id;
    }

    public String getContent(){
        return content;
    }

    public boolean getFlag() {
        return flag;
    }
}
