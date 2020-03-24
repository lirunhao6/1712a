package com.lirunhao.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lirunhao.beans.Goods;
import com.lirunhao.beans.Type;
import com.lirunhao.service.GoodsService;

@Controller
public class GoodsController {
	
	@Autowired
	private GoodsService gService;
	//查询所有
	@RequestMapping("list")
	public String queryAll(Model model,@RequestParam(defaultValue="1")Integer pageNum){
		Map<String, Object> map=new HashMap<String, Object>();
		//分页查询
		PageHelper.startPage(pageNum, 3);
		List<Goods> list = gService.queryAll(map);
		PageInfo<Goods> page = new PageInfo<Goods>(list);
		model.addAttribute("page", page);
		return "list";
		
	}
	
	//下拉框
	@RequestMapping("toadd")
	public String toadd(Model model){
		List<Type> typeList = gService.queryType();
		model.addAttribute("typeList", typeList);
		return "add";
	}
	
	
	//添加
	@RequestMapping("add")
	public String add(Goods goods){
		try {
			gService.addGoods(goods);
			return "redirect:list";
		} catch (Exception e) {
			return "add";
		}
	}
	
	//修改下拉框
	@RequestMapping("toupdate")
	public String toupdate(Integer id,Model model){
		Goods goods = gService.queryGoodsById(id);
		model.addAttribute("goods", goods);
		List<Type> typeList = gService.queryType();
		model.addAttribute("typeList", typeList);
			
		return "update";
		
	}
	
	//修改
	@RequestMapping("update")
	public String update(Goods goods){
		try {
			gService.updateGoods(goods);
			return "redirect:list";
		} catch (Exception e) {
			// TODO: handle exception
			return "update";
		}
	}
	
	
	//删除 批删 单删
	@RequestMapping("deleteGoods")
	@ResponseBody
	public boolean deleteGoods(String ids){
		try {
			gService.deleteGoods(ids);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

}
