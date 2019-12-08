
public class Classroom {
 private String building;
 private String roomNum;
 private String campus;
 private String type;
 private int capacity;
 
public Classroom() {
	super();
}

public Classroom(String building, String roomNum, String campus, String type,
		int capacity) {
	super();
	this.building = building;
	this.roomNum = roomNum;
	this.campus = campus;
	this.type = type;
	this.capacity = capacity;
}

public String getBuilding() {
	return building;
}
public void setBuilding(String building) {
	this.building = building;
}
public String getRoomNum() {
	return roomNum;
}
public void setRoomNum(String roomNum) {
	this.roomNum = roomNum;
}
public String getCampus() {
	return campus;
}
public void setCampus(String campus) {
	this.campus = campus;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}

public String toString() {
	return "Classroom [building=" + building + ", roomNum=" + roomNum
			+ ", campus=" + campus + ", type=" + type + ", capacity="
			+ capacity + "]";
}
 
}
