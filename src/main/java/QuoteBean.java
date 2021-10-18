public class QuoteBean {

    //variables
    private long id;
    private String first_name;
    private String last_name;
    private String content;

    //constructor
    public QuoteBean() {
    }

    //constructor
    public QuoteBean(long id, String first_name, String last_name, String content) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.content = content;
    }
}
