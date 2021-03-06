package io.easyspring.framework.base.data.mybatis.test.service.impl;

import io.easyspring.framework.base.data.mybatis.test.model.SortUser;
import io.easyspring.framework.base.data.mybatis.test.service.SortUserService;
import io.easyspring.framework.base.form.BaseSortForm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * 用户的 service 测试类(分页功能)
 *
 * @author summer
 * DateTime 2018-12-04 22:16
 * @version V1.0.0-RELEASE
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class SortUserServiceImplTest {

    /**
     * 注入排序的 service
     */
    @Resource
    private SortUserService sortUserService;

    /**
     * 公共的排序方法测试
     *
     * Author summer
     * DateTime 2018-12-12 17:36
     * Version V1.0.0-RELEASE
     */
    @Test
    public void sort() throws InstantiationException, IllegalAccessException {
        // 创建公共的分页对象
        BaseSortForm baseSortFrom = new BaseSortForm();
        baseSortFrom.setId(1428117721710592L);
        baseSortFrom.setEasySort(10);

        Integer sort = sortUserService.sort(baseSortFrom, SortUser.class);
        Integer changeSize = 1;
        assertEquals(changeSize, sort);
    }

    /**
     * 公共的排序方法测试
     *
     * Author summer
     * DateTime 2018-12-12 17:36
     * Version V1.0.0-RELEASE
     */
    @Test
    public void sortNoChange() throws InstantiationException, IllegalAccessException {
        // 创建公共的分页对象
        BaseSortForm baseSortFrom = new BaseSortForm();
        baseSortFrom.setId(123L);
        baseSortFrom.setEasySort(10);

        Integer sort = sortUserService.sort(baseSortFrom, SortUser.class);
        Integer changeSize = 0;
        assertEquals(changeSize, sort);

    }

    /**
     * 公共的排序方法测试
     *
     * Author summer
     * DateTime 2018-12-12 17:36
     * Version V1.0.0-RELEASE
     */
    @Test
    public void sortNoChange2() throws InstantiationException, IllegalAccessException {

        Long id = 1428117721710592L;
        // 创建公共的分页对象
        BaseSortForm baseSortFrom = new BaseSortForm();
        baseSortFrom.setId(id);
        baseSortFrom.setEasySort(-10);

        Integer sort = sortUserService.sort(baseSortFrom, SortUser.class);
        Integer changeSize = 0;
        assertEquals(changeSize, sort);
    }

    /**
     * 公共的排序方法测试(集合)
     *
     * Author summer
     * DateTime 2018-12-12 17:36
     * Version V1.0.0-RELEASE
     */
    @Test
    public void sortList() throws InstantiationException, IllegalAccessException {

        // 创建公共的分页对象
        BaseSortForm baseSortFrom1 = new BaseSortForm();
        baseSortFrom1.setId(1428117721710592L);
        baseSortFrom1.setEasySort(1);
        // 创建公共的分页对象
        BaseSortForm baseSortFrom2 = new BaseSortForm();
        baseSortFrom2.setId(1428117721710609L);
        baseSortFrom2.setEasySort(1);
        // 创建公共的分页对象
        BaseSortForm baseSortFrom3 = new BaseSortForm();
        baseSortFrom3.setId(1428117721710610L);
        baseSortFrom3.setEasySort(1);

        List<BaseSortForm> baseSortFromList = new ArrayList<>();
        baseSortFromList.add(baseSortFrom1);
        baseSortFromList.add(baseSortFrom2);
        baseSortFromList.add(baseSortFrom3);

        Integer sort = sortUserService.sort(baseSortFromList, SortUser.class);
        Integer changeSize = 3;
        assertEquals(changeSize, sort);
    }

    /**
     * 公共的排序方法测试(集合-过滤无效值)
     *
     * Author summer
     * DateTime 2018-12-12 17:36
     * Version V1.0.0-RELEASE
     */
    @Test
    public void sortList2() throws InstantiationException, IllegalAccessException {

        // 创建公共的分页对象
        BaseSortForm baseSortFrom1 = new BaseSortForm();
        baseSortFrom1.setId(123L);
        baseSortFrom1.setEasySort(1);
        // 创建公共的分页对象
        BaseSortForm baseSortFrom2 = new BaseSortForm();
        baseSortFrom2.setId(1428117721710609L);
        baseSortFrom2.setEasySort(1);
        // 创建公共的分页对象
        BaseSortForm baseSortFrom3 = new BaseSortForm();
        baseSortFrom3.setId(1428117721710610L);
        baseSortFrom3.setEasySort(1);

        List<BaseSortForm> baseSortFromList = new ArrayList<>();
        baseSortFromList.add(baseSortFrom1);
        baseSortFromList.add(baseSortFrom2);
        baseSortFromList.add(baseSortFrom3);

        Integer sort = sortUserService.sort(baseSortFromList, SortUser.class);
        Integer changeSize = 2;
        assertEquals(changeSize, sort);
    }

    /**
     * 公共的排序方法测试(集合-包含重复修改)
     *
     * Author summer
     * DateTime 2018-12-12 17:36
     * Version V1.0.0-RELEASE
     */
    @Test
    public void sortList3() throws InstantiationException, IllegalAccessException {

        // 创建公共的分页对象
        BaseSortForm baseSortFrom1 = new BaseSortForm();
        baseSortFrom1.setId(1428117721710609L);
        baseSortFrom1.setEasySort(1);
        // 创建公共的分页对象
        BaseSortForm baseSortFrom2 = new BaseSortForm();
        baseSortFrom2.setId(1428117721710609L);
        baseSortFrom2.setEasySort(1);
        // 创建公共的分页对象
        BaseSortForm baseSortFrom3 = new BaseSortForm();
        baseSortFrom3.setId(1428117721710610L);
        baseSortFrom3.setEasySort(1);

        List<BaseSortForm> baseSortFromList = new ArrayList<>();
        baseSortFromList.add(baseSortFrom1);
        baseSortFromList.add(baseSortFrom2);
        baseSortFromList.add(baseSortFrom3);

        Integer sort = sortUserService.sort(baseSortFromList, SortUser.class);
        Integer changeSize = 3;
        assertEquals(changeSize, sort);
    }

}