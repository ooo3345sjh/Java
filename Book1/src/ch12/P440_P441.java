package ch12;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/*
 * 날짜 : 2022/09/24
 * 이름 : 서정현
 * 내용 : P440_P441
 * 	- HashMap 활용하기(P440)
 * 	- HashMap 활용하기(P441) 
 */

class Member2 {
	private int memberId;
	private String memberName;
	
	public Member2() {}

	public Member2(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(memberId);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Member)) return false;
		
		Member2 member = (Member2)obj;
		
		return member.memberId == this.memberId;
	}

	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberId + "입니다";
	}
}

class MemberHashMap {
	private HashMap<Integer, Member2> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member2>();
	}
	
	public void addMemeber(Member2 member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			Member2 member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}

public class P440_P441 {
	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member2 memberLee = new Member2(1002, "이지원");
		Member2 memberSon = new Member2(1004, "손민국");
		Member2 memberPark = new Member2(1003, "박서훤");
		Member2 memberHong = new Member2(1001, "홍길동");
		
		memberHashMap.addMemeber(memberLee);
		memberHashMap.addMemeber(memberSon);
		memberHashMap.addMemeber(memberPark);
		memberHashMap.addMemeber(memberHong);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
		
	}

}
