import lt.vtvpmc.Article;

public class ArticleClass implements Article {

    private String heading;
    private String brief;

    @Override
    public String getHeading() {
        return heading;
    }

    @Override
    public String getBrief() {
        return brief;
    }

}
