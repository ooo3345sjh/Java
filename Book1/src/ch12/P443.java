package ch12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

/*
 * 날짜 : 2022/09/24
 * 이름 : 서정현
 * 내용 : TreeMap 활용하기(P443_P444)
 */
class MemberTreeMap {
	private TreeMap<Integer, Member1> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer, Member1>();
	}
	
	public void addMemeber(Member1 member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member1 member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}

public class P443 {
	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member1 memberLee = new Member1(1004, "이지원");
		Member1 memberSon = new Member1(1002, "손민국");
		Member1 memberPark = new Member1(1001, "박서훤");
		Member1 memberHong = new Member1(1003, "홍길동");
		
		memberTreeMap.addMemeber(memberLee);
		memberTreeMap.addMemeber(memberSon);
		memberTreeMap.addMemeber(memberPark);
		memberTreeMap.addMemeber(memberHong);
		
		memberTreeMap.showAllMember();
		
		memberTreeMap.removeMember(1004);
		memberTreeMap.showAllMember();
	}

}
