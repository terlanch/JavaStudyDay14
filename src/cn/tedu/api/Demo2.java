package cn.tedu.api;

public class Demo2 {
	public static void main(String[] args) {
		User u = new User();
		u.username = "nx841634721";
		u.pwd = "123456789";
		System.out.println(u);
	}

}
class User{
	//�û���
	String username;
	//����
	String pwd;
	
	
	@Override
	public String toString() {
		return "User [username=" + username + ", pwd=" + pwd + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	       @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	//��ϰ1
	/*@Override
	public boolean equals(Object obj) {
		//�жϵ�ֵַ�Ƿ���ͬ
		if(this == obj){
			return true;
		}
		//�ų�����Ϊnull�����
		if(obj == null){
			return false;
		}
		//�ų��������Ͳ�һ��
		if(this.getClass() != obj.getClass()){
			return false;
		}
		//ǿת��������
		User u1 = (User)obj;
		if(this.username == null  ){
			if(u1.username != null){
				return false;
			}
		}else if(!(this.username.equals(u1.username))){
			return false;
		}
		if(this.pwd == null  ){
			if(u1.pwd != null){
				return false;
			}
		}else if(!(this.pwd.equals(u1.pwd))){
			return false;
		}
		
		return true;		
	}*/
//��ϰ2
	/*	@Override
	public boolean equals(Object obj) {
		//���жϵ�ֵַ�Ƿ����
		if(this == obj){
			return true;
		}
		//�ų�����Ϊnull�����
		if(obj == null){
			return false;
		}
		//�ų������������Ͳ�һ�������
		if(this.getClass() != obj.getClass()){
			return false;
		}
		//ǿת��������
		User u = (User)obj;
		if(this.username == null){
			if(u.username != null){
				return false;
			}
		}else if(!(this.username.equals(u.username))){
			return false;
		}
		
		return true;
	}*/
}

