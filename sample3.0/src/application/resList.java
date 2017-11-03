package application;

public enum resList {
	brotherNoodle("兄弟面"), KongfuNoodle("功夫面");
	private String name;
	public String getName(){
		return name;
	}

	resList(String name){
		this.name = name;
	}
}
