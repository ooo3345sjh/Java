package ch12;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

import javax.swing.ComboBoxEditor;

/*
 * 날짜 : 2022/09/24
 * 이름 : 서정현
 * 내용 : P431_P436
 * 	- TreeSet 활용하기(P431)
 * 	- TreeSet 활용하기(P432)
 * 	- Comparable 인터페이스 구현하기(P434)
 * 	- Comparator 인터페이스 구현하기(P436)
 * 
 */
class Member1 implements Comparable<Member1>, Comparator<Member1> {
	private int memberId;
	private String memberName;
	
	public Member1() {}

	public Member1(int memberId, String memberName) {
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
		
		Member1 member = (Member1)obj;
		
		return member.memberId == this.memberId;
	}

	@Override
	public String toString() {
		return memberName + "회원님의 아이디는 " + memberId + "입니다";
	}

	@Override
	public int compareTo(Member1 member) {
		
		return (this.memberId - member.memberId) * -1;
	}

	@Override
	public int compare(Member1 m1, Member1 m2) {
		return (m1.memberId - m2.memberId) *-1;
	}
}

class MemberTreeSet {
	private TreeSet<Member1> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member1>(new Member1());
	}
	
	public void addMember(Member1 member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member1> ir = treeSet.iterator();
		
		while(ir.hasNext()) {
			Member1 member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				treeSet.remove(member);
				return true;
			}	
		}
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		for(Member1 member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}


public class P431_P436 {
	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member1 memberPark = new Member1(1003, "박서훤");
		Member1 memberLee = new Member1(1001, "이지원");
		Member1 memberSon = new Member1(1002, "손민국");
		
		memberTreeSet.addMember(memberPark);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberSon);
		
		Member1 memberHong = new Member1(1003, "홍길동");
		memberTreeSet.addMember(memberHong);
		memberTreeSet.showAllMember();
	}
}
