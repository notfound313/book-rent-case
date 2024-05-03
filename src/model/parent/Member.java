package model.parent;

public abstract class Member {

    private String memberId;
    private String memberName;
    private String address;
    public Member(String memberId, String memberName, String address) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.address = address;
    }
    
    public Member() {
    }

    public String getMemberId() {
        return memberId;
    }
    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    


    
}
