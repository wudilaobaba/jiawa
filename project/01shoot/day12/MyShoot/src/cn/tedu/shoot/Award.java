package cn.tedu.shoot;
//随机奖励接口
public interface Award {
	int DOUBLE_FIRE = 0;//火力值
	int LIFE = 1; //命
	int TIME = 2;//时间
	public int getAwardType();
}
