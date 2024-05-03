package repository;

import java.util.ArrayList;
import java.util.List;

import model.child.member.LoanMember;
import model.parent.Member;

public class RepositoryMember {

    public  List<Member> getAllMemeber(){
        List<Member> listAllMembers = new ArrayList<>();
        
        Member member1 = new LoanMember("M-001","Risman","Bandung");
        Member member2 = new LoanMember("M-002","Budi","Bandung");
        Member member3  = new LoanMember("M-003","Resti","Kab. Bandung");
        

        listAllMembers.add(member1);
        listAllMembers.add(member2);
        listAllMembers.add(member3);

        return listAllMembers;
        



    }
    
}
