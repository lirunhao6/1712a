package com.lirunhao.mapper;

import java.util.List;
import java.util.Map;

import com.lirunhao.beans.Goods;
import com.lirunhao.beans.Type;

public interface GoodsMapper {
	//全查
	public List<Goods> queryAll(Map<String,Object> map);
	//下拉框
	public List<Type> queryType();
	//添加
	public void addGoods(Goods goods);
	//查一个
	public Goods queryGoodsById(Integer gid);
	//修改
	public void updateGoods(Goods goods);
	//删除
	public void deleteGoods(String ids);
	

}
