import java.util.ArrayList;


public class Roster {
	private String teamName;
	private ArrayList<Player> teamList;
	
	
	public Roster(String teamName) {
		this.teamName = teamName;
		teamList = new ArrayList<Player>();
	}
	public void addToTeam(Player p) {
		teamList.add(p);
	}
	
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String displayRoster(){
		String teamName = getTeamName();
		for (Player p : teamList)
			teamName += p.toString()+ "\n";
		return teamName;
		
		
	}
	
	
}
