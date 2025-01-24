import lt.vtvpmc.Article;
import lt.vtvpmc.NewsService;
import lt.vtvpmc.NewsServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Service implements NewsService {

//    private List<Article> articles = new ArrayList<>();

private NewsServiceImpl newsService = new NewsServiceImpl();
    @Override
    public List<Article> getArticles() {
        return newsService.getArticles();
    }


}
