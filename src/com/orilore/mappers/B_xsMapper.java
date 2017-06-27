package com.orilore.mappers;
import java.util.List;
import com.orilore.model.*;
public interface B_xsMapper{
	public void insert(B_xs bean);
	public B_xs selectOne(int id);
	public void delete(int id);
	public List<B_xs> select();
	public void update(B_xs bean);
}