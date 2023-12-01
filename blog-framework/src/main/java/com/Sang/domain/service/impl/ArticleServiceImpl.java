package com.Sang.domain.service.impl;

import com.Sang.domain.entity.Article;
import com.Sang.domain.mapper.ArticleMapper;
import com.Sang.domain.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper,Article> implements ArticleService {
}
