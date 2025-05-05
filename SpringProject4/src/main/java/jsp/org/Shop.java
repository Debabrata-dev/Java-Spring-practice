package jsp.org;

import java.util.Map;

public class Shop {
private String name;
private String loc;
private Map<Integer, String> item;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
public Map<Integer, String> getItem() {
	return item;
}
public void setItem(Map<Integer, String> item) {
	this.item = item;
}

}
