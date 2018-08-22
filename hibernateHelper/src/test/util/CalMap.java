package test.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CalMap extends HashMap<String, Integer>{
	
	@Override
	public Integer put(String key, Integer value) {
		key = key.trim();
		Integer calValue = this.get(key);
		if(calValue!=null){
			value+=calValue;
		}
		return super.put(key, value);
	}
	
	public List<String> getBiggerThan(Integer num){
		List<String> result = new ArrayList<>();
		for(java.util.Map.Entry<String, Integer> entry :this.entrySet()){
			if(entry.getValue()>num){
				result.add(entry.getKey());
			}
		}
		return result;
	}
	public List<String> getOnlyOne(){
		List<String> result = new ArrayList<>();
		for(java.util.Map.Entry<String, Integer> entry :this.entrySet()){
			if(entry.getValue()==1){
				result.add(entry.getKey());
			}
		}
		return result;
	}
}
