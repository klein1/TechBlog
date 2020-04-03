package com.tech.blog.service;

import com.tech.blog.entity.BlogCategory;
import com.tech.blog.util.PageQueryUtil;
import com.tech.blog.util.PageResult;

import java.util.List;

public interface CategoryService {

    /**
     * 查询分类的分页数据
     *
     * @param pageUtil
     * @return
     */
    PageResult getBlogCategoryPage(PageQueryUtil pageUtil);

    int getTotalCategories();

    /**
     * 添加分类数据
     *
     * @param categoryName
     * @return
     */
    Boolean saveCategory(String categoryName);

    Boolean updateCategory(Integer categoryId, String categoryName);

    Boolean deleteBatch(Integer[] ids);

    List<BlogCategory> getAllCategories();
}
