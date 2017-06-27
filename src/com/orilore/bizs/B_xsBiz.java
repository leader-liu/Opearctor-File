package com.orilore.bizs;
import com.orilore.model.*;
import com.orilore.util.PathConfiger;
import com.orilore.util.UUIDGenerator;
import com.orilore.util.FileOperateUtil;
import com.orilore.mappers.*;

import java.io.File;
import java.io.IOException;
import java.util.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;
@Service
public class B_xsBiz implements IB_xsBiz{
	@Resource
	private B_xsMapper mapper ;
	@Override
	public boolean addB_xs(B_xs bean) {
			mapper.insert(bean);
			return true;

	}
	@Override
	public boolean removeB_xs(int id) {

			mapper.delete(id);
		
			return true;
	
	}
	@Override
	public boolean modifyB_xs(B_xs bean) {
		
			mapper.update(bean);
		
			return true;
	
	}
	@Override
	public B_xs getB_xs(int id) {
		B_xs bean = null;
	
			bean = mapper.selectOne(id);
		
		return bean;
	}
	@Override
	public List<B_xs> findB_xs() {
		List<B_xs> beans = null;
		
			beans = mapper.select();
	
		return beans;
	}

}
