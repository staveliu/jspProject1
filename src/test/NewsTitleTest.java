package test;

import dao.NewsTitleDao;
import entity.NewsTitle;
import org.junit.Test;

public class NewsTitleTest {
    @Test
    public void test(){
        new NewsTitleDao().findAll().forEach(nt->System.out.println(nt));
    }

}
