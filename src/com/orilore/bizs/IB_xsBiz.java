package com.orilore.bizs;
import com.orilore.model.*;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;
public interface IB_xsBiz{

	public boolean removeB_xs(int id);
	public boolean modifyB_xs(B_xs b_xs);
	public B_xs getB_xs(int id);
	public List<B_xs> findB_xs();
	public boolean addB_xs(B_xs b_xs);
}