package com.kaishengit.service;


import com.github.pagehelper.PageHelper;
import com.kaishengit.entity.Article;
import com.kaishengit.entity.ArticleExample;
import com.kaishengit.entity.ArticleWithBLOBs;
import com.kaishengit.mapper.ArticleMapper;
import com.kaishengit.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author liuyu
 * @date 2017/10/26
 */
public class ArticleTestCase {
    SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();

    ArticleMapper articleMapper = sqlSession.getMapper(ArticleMapper.class);



    @Test
    public void find() {

        ArticleExample articleExample = new ArticleExample();
        PageHelper.startPage(2, 3);
        List<Article> articleList = articleMapper.selectByExample(articleExample);
      /*  List<ArticleWithBLOBs> articleWithBLOBs = articleMapper.selectByExampleWithBLOBs(articleExample);
        for (ArticleWithBLOBs articleWithBLOBs1 :articleWithBLOBs) {
            System.out.println(articleWithBLOBs1);
        }*/
        for (Article article : articleList) {
            System.out.println(article);
        }
    }

    @Test
    public void delete() {
        articleMapper.deleteByPrimaryKey(51);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void deleteByExample(){
        ArticleExample articleExample = new ArticleExample();
        articleExample.createCriteria().andIdEqualTo(51);
        articleMapper.deleteByExample(articleExample);
        sqlSession.commit();
        sqlSession.close();
    }



}
