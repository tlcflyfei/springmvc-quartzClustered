package server.httpserver.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import server.httpserver.dao.JobDetailsBeanMapper;
import server.httpserver.pojo.JobAndTriggerBean;
import server.httpserver.service.QuartzService;

import javax.annotation.Resource;
import java.util.List;

/**
 * server.httpserver.service.impl
 *
 * @User: ips
 * @Date: 2018/6/6
 */
@Service
public class QuartzServiceImpl implements QuartzService {

	@Resource
	JobDetailsBeanMapper jobDetailsBeanMapper;

	public Page<JobAndTriggerBean> queryAllJob(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);

		List<JobAndTriggerBean> userList = jobDetailsBeanMapper.selectAllJobAndTrigger();

		return (Page<JobAndTriggerBean>)userList;

	}
}
