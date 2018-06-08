package server.httpserver.cotroller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import server.httpserver.pojo.JobAndTriggerBean;
import server.httpserver.service.QuartzService;
import server.httpserver.service.impl.QuartzServiceImpl;

import java.util.HashMap;
import java.util.Map;

/**
 * server.httpserver.cotroller
 *
 * @User: ips
 * @Date: 2018/6/4
 */
@RestController
@RequestMapping("/view")
public class ViewController {
	private static Logger logger = LoggerFactory.getLogger(ViewController.class);

	public ViewController() {
		logger.info("ViewController construct");
	}

	@Autowired
	QuartzServiceImpl quartzServiceImpl;

	@RequestMapping("/job")
	public String JobView(){
		logger.info("test");
		return "{\"msgCode\":\"1\"}";
	}

	@RequestMapping(value="/queryjob")
		public Map<String, Object> queryjob(@RequestParam(value="pageNum")Integer pageNum, @RequestParam(value="pageSize")Integer pageSize)
	{
		Page<JobAndTriggerBean> jobAndTrigger = quartzServiceImpl.queryAllJob(pageNum, pageSize);
		Map<String, Object> map = new HashMap<String, Object>();
		//用PageInfo对结果进行包装
		PageInfo page = new PageInfo(jobAndTrigger);
		map.put("page", page);
		return map;
	}
}
