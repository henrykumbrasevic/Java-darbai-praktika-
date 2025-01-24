import lt.vtvpmc.Article;
import lt.vtvpmc.BaseNewsServiceTest;
import lt.vtvpmc.NewsService;
import lt.vtvpmc.NewsServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class SwearwordsToCheck extends BaseNewsServiceTest {
    List<Article> articles = new ArrayList<>();
    ArrayList<String> swearWords = new ArrayList<>();
    private String replacement = "***";
    private NewsServiceImpl newsServiceImpl = new NewsServiceImpl();


    public SwearwordsToCheck() {
        swearWords.add("rupūs miltai");
        swearWords.add("velniai rautų");
        swearWords.add("velnias");
        swearWords.add("velniais");
    }

    @Override
    protected NewsService getNewsService() {
        return null;
    }

    @Override
    public void articlesWithHeadingsContainingSwearWordsAreNotPresent() {
        for (Article article : newsServiceImpl.getArticles()) {
            for (String swearWord : swearWords) {
                if (!article.getHeading().contains(swearWord)) {
                    articles.add(article);
                }
            }
        }
    }
    
    public void articlesContainingSwearWordsInTheirBriefsAreMasked() {
        for (Article article : newsServiceImpl.getArticles()) {
            for (String swearWord : swearWords) {
                if (article.getBrief().contains(swearWord)) {
                    swearWord.replace(swearWord, replacement);
                    articles.add(article);
                }
            }
        }
    }
}