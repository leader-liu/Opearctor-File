package com.orilore.controller;

import java.io.File;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import com.orilore.bizs.IB_xsBiz;
import com.orilore.model.B_xs;
import com.orilore.util.FileOperateUtil;
import com.orilore.util.PathConfiger;

@Controller
public class TController {
	@Resource
	private IB_xsBiz biz;
//	@RequestMapping("addFile")
//	public String addFile(HttpServletRequest request){
//		String name=request.getParameter("name");
//		int num=Integer.parseInt(request.getParameter("num"));
//		B_xs xs=new B_xs();
//		String tx=FileOperateUtil.uploadOneFile(request);
//		xs.setName(name);
//		xs.setNum(num);
//		xs.setTx(tx);
//		Boolean flag=biz.addB_xs(xs);
//		return "success.jsp";
//	}
	@RequestMapping("addFile")
	public String addFile(HttpServletRequest request,@RequestParam(value="tx") MultipartFile[] txs){
		String name=request.getParameter("name");
		int num=Integer.parseInt(request.getParameter("num"));
		B_xs xs=new B_xs();		
		for(int i=0;i<txs.length;i++){
			String path=FileOperateUtil.uploadManyFile(txs,request);
			xs.setName(name);
			xs.setNum(num);
			xs.setTx(path);
			Boolean flag=biz.addB_xs(xs);
		}
		return "success.jsp";
	}
}
