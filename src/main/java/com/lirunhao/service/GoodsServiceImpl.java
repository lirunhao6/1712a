package com.lirunhao.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lirunhao.beans.Goods;
import com.lirunhao.beans.Type;
import com.lirunhao.mapper.GoodsMapper;

@Service
public class GoodsServiceImpl implements GoodsService{
	
	@Autowired
	private GoodsMapper gMapper;
	public List<Goods> queryAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return gMapper.queryAll(map);
	}
	public List<Type> queryType() {
		// TODO Auto-generated method stub
		return gMapper.queryType();
	}
	public void addGoods(Goods goods) {
		gMapper.addGoods(goods);
		
	}
	public Goods queryGoodsById(Integer gid) {
		// TODO Auto-generated method stub
		return gMapper.queryGoodsById(gid);
	}
	public void updateGoods(Goods goods) {
		gMapper.updateGoods(goods);
		
	}
	public void deleteGoods(String ids) {
		gMapper.deleteGoods(ids);
		
	}

}
