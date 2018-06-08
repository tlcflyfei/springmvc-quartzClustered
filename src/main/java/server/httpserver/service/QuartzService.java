package server.httpserver.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import server.httpserver.pojo.JobAndTriggerBean;

/**
 * server.httpserver.service
 *
 * @User: ips
 * @Date: 2018/6/6
 */
public  interface  QuartzService {

	/**
	 * 查询所有定时任务
	 * @param pageNum - 查询第几页
	 * @param pageSize - 每页数据量
	 * @return 带分页的结果
	 */
	Page<JobAndTriggerBean> queryAllJob(int pageNum, int pageSize);

}
