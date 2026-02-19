package day9;

public class Engine {
	
	private int engineCC;
	private String engineMfgName;
	private String engineType;
	public Engine() {}
	public Engine(int engineCC, String engineMfgName, String engineType)
	{
		this.engineCC = engineCC;
		this.engineMfgName = engineMfgName;
		this.engineType = engineType;
	}
	public int getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	public String getEngineMfgName() {
		return engineMfgName;
	}
	public void setEngineMfgName(String engineMfgName) {
		this.engineMfgName = engineMfgName;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	
	@Override
	public String toString() {
		return "Engine [engineCC=" + engineCC + ", engineMfgName=" + engineMfgName + ", engineType=" + engineType + "]";
	}
	
	

}
