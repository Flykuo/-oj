package 杭电oj;

import java.util.*;

class Ed{
	List<Integer> edge=new ArrayList<>();
}
public class Main2647 {
	static int num_person;
	static int num;
	static int[] enter;
	static Ed[] edge;
	static List<Integer> list;
	static List<Integer> temp;
	static Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) {
		while (sc.hasNext()) {
			num_person = sc.nextInt();//人数
			num = sc.nextInt();//需要的作品数
			init();
			tofoSort();
		}
	}
 
	public static void init() {
		enter = new int[num_person+1];
		//集合
		list=new ArrayList<>();//存个数
		temp=new ArrayList<>();//存0的角标
		edge=new Ed[num_person+1];//自定义的类 构建n个edge集合
		for(int i=0;i<edge.length;i++) {
			edge[i]=new Ed();
		}
		for (int i = 1; i <=num; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			if (!edge[to].edge.contains(from)) {
				edge[to].edge.add(from);
				enter[from]++;//记录度
			}
		}
	}
	public static void tofoSort() {
		int count=0;
		while(count!=num_person) {
			for (int j = 1; j <= num_person; j++) {
				if (enter[j] == 0) {//将度为0的数加进去
					temp.add(j);
					count++;//记录有多少个
				}
			}
			if (temp.size()==0) {//如果不是有向无环图
				System.out.println(-1);
				return;
			} else {
				list.add(temp.size());
				for(int j=0;j<temp.size();j++) {
					int from=temp.get(j);
					enter[from]=-1;
					for(int k=0;k<edge[from].edge.size();k++) {
						enter[edge[from].edge.get(k)]--;
					}
				}
				temp.clear();
			}
		}
		int ans=0;
		for(int i=0;i<list.size();i++) {
			ans+=(i+888)*list.get(i);
		}
		System.out.println(ans);
	}
}