package _0_객체프로젝트;

public class UserReg {
	String id=null;
	String name=null;
	String pwd=null;
	String goodsName=null;
	int goodsQtt=0;
	
	UserReg(){
		
	}
	public void bprt() {
		System.out.println("아이디: "+id);
		System.out.println("구매품목: "+goodsName);
		System.out.println("구매수량: "+goodsQtt);
	}
	public void setId(String id) {
		this.id=id;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setPwd(String pwd) {
		this.pwd=pwd;
	}
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
}
