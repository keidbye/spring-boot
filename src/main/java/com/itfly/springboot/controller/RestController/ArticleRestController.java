package com.itfly.springboot.controller.RestController;


import com.itfly.springboot.Service.ArticleRestService;
import com.itfly.springboot.model.REST.AjaxResponse;
import com.itfly.springboot.model.REST.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticleRestController {

    @Resource(name = "articleRestJDBCService")
    ArticleRestService articleRestService;

    //增加一篇Article ，使用POST方法
    @RequestMapping(value = "/article", method = POST, produces = "application/json")
    public AjaxResponse saveArticle(@RequestBody Article article) {
        //因为使用了lombok的Slf4j注解，这里可以直接使用log变量打印日志
        log.info("articleRestService return-->"+articleRestService.saveArticle(article));

        return  AjaxResponse.success(article);
    }



    //删除一篇Article，使用DELETE方法，参数是id
    @RequestMapping(value = "/article/{id}", method = DELETE, produces = "application/json")
    public AjaxResponse deleteArticle(@PathVariable Long id) {
        articleRestService.deleteArticle(id);
        return AjaxResponse.success("success");
    }

    //更新一篇Article，使用PUT方法，以id为主键进行更新
    @RequestMapping(value = "/article/{id}", method = PUT, produces = "application/json")
    public AjaxResponse updateArticle(@PathVariable Long id, @RequestBody Article article) {
        article.setId(id);
        articleRestService.updateArticle(article);
        return AjaxResponse.success(article);
    }

    //获取一篇Article，使用GET方法
    @RequestMapping(value = "/articles/{id}", method = GET, produces = "application/json")
    public AjaxResponse getArticle(@PathVariable Long id) {

        return AjaxResponse.success(articleRestService.getArticle(id));
    }

    @RequestMapping(value = "/articles", method = GET, produces = "application/json")
    public AjaxResponse getArticle() {

        return AjaxResponse.success(articleRestService.getAll());
    }



}



// 自写测试接口

/*    @PostMapping("/testticle")
    public AjaxResponse testArticle(@RequestBody Article article){
        log.info("testArticle:{}",article);
        return AjaxResponse.success(article);
    }*/