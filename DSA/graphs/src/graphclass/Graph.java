package graphclass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
	HashMap<String, ArrayList<String>> map=new  HashMap();

	
	public boolean addVertex(String key) {
		
		if(map.get(key)==null) {
		map.put(key, new ArrayList<String>());
		return true;
		}
		return false;
	}
	
	public boolean addEdge(String vertex1,String vertex2) {
		if(map.get(vertex1)!=null && map.get(vertex2)!=null) {
			map.get(vertex1).add(vertex2);
			map.get(vertex2).add(vertex1);
			return true;

		}
		return false;
	}
	
	public boolean removeEdge(String vertex1,String vertex2) {
		if(map.get(vertex1)!=null && map.get(vertex2)!=null) {
			map.get(vertex1).remove(vertex2);
			map.get(vertex2).remove(vertex1);
			return true;

		}
		return false;
	}
	
	public void removeVertex(String vertex) {
//		if(map.get(vertex)!=null) {
//			for(Map.Entry<String,ArrayList<String>> k:map.entrySet()) {
//				List<String> list=k.getValue();
//				list.remove(vertex);
//			}
//			
//			map.remove(vertex);
//		}
//	}
//	
		List<String> list=map.get(vertex);
		if(list!=null) {
			for(String k:list) {
				List<String> edges=map.get(k);
				edges.remove(vertex);
			}
			map.remove(vertex);
			
		}
	}
	public void printGraph() {
		System.out.println(map);
	}
}
