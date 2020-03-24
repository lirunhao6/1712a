package com.lirunhao.service;

import java.util.List;
import java.util.Map;

import com.lirunhao.beans.Goods;
import com.lirunhao.beans.Type;

public interface GoodsService {
	//全查
	public List<Goods> queryAll(Map<String,Object> map);

	public List<Type> queryType();

	public void addGoods(Goods goods);
	
	public Goods queryGoodsById(Integer gid);
	
	public void updateGoods(Goods goods);
	public void deleteGoods(String ids);

}
