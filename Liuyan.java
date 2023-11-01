import java.util.Date; 
public class Liuyan {
	private Integer id; 
	private String username;	//用户名 
	private String content;	//内容 
	private Integer hid;	//房子编号 
	private String hname;	//房子名称 
	private String remarker;	//备注 
	private Date createtime;	//创建时间 

	public Liuyan (){

	}

	public void setId(Integer id){
		this.id=id;
	}
	public Integer getId(){
		return id;
	}

	public void setUsername(String username){
		this.username=username;
	}
	public String getUsername(){
		return username;
	}

	public void setContent(String content){
		this.content=content;
	}
	public String getContent(){
		return content;
	}

	public void setHid(Integer hid){
		this.hid=hid;
	}
	public Integer getHid(){
		return hid;
	}

	public void setHname(String hname){
		this.hname=hname;
	}
	public String getHname(){
		return hname;
	}

	public void setRemarker(String remarker){
		this.remarker=remarker;
	}
	public String getRemarker(){
		return remarker;
	}

	public void setCreatetime(Date createtime){
		this.createtime=createtime;
	}
	public Date getCreatetime(){
		return createtime;
	}

	@Override
	public String toString(){
		return " Liuyan [id=" + id+ " , username=" + username+ " , content=" + content+ " , hid=" + hid+ " , hname=" + hname+ " , remarker=" + remarker+ " , createtime=" + createtime+"]";
	}

}

