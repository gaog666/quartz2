package com.xnpool.scheduler.quartz.manage;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xnpool.scheduler.quartz.entity.JobEntity;
import com.xnpool.scheduler.quartz.entity.ResponseResult;
import com.xnpool.scheduler.quartz.service.JobEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SchedulerController {

    @Autowired
    private JobEntityService jobEntityService;

    @GetMapping("/jobList")
    public Object jobList() {

        IPage<JobEntity> page = new Page<>(1,10);
        page = jobEntityService.page(page);
        return new ResponseResult(ResponseResult.SUCCESS, page);
    }
    @GetMapping("/edit")
    public Object edit(Integer id) {

        JobEntity jobEntity = jobEntityService.getById(id);
        return new ResponseResult(ResponseResult.SUCCESS, jobEntity);
    }
    @GetMapping("/update")
    public Object update(JobEntity jobEntity) {

        Boolean b = jobEntityService.updateById(jobEntity);

        return new ResponseResult(ResponseResult.SUCCESS, b);
    }

    @GetMapping("/delete")
    public Object delete(Integer id) {

        Boolean b = jobEntityService.removeById(id);

        return new ResponseResult(ResponseResult.SUCCESS, b);
    }

}
