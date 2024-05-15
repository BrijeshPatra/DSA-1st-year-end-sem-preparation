package minorproject;
class Date {
    int day;
    String month;
    int year;

    public Date(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

class Member {
    private int memberID;
    private String lastName;
    private String firstName;
    int handicap;
    char gender;
    String team;
    String memberType;
    private int coach;
    private long phone;
    Date joinDate;

    public Member(int memberID, String lastName, String firstName, int handicap, char gender, String team, String memberType, int coach, long phone, Date joinDate) {
        this.memberID = memberID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.handicap = handicap;
        this.gender = gender;
        this.team = team;
        this.memberType = memberType;
        this.coach = coach;
        this.phone = phone;
        this.joinDate = joinDate;
    }
    public void display() {
        System.out.println("Member ID: " + memberID);
        System.out.println("Last Name: " + lastName);
        System.out.println("First Name: " + firstName);
        System.out.println("Handicap: " + handicap);
        System.out.println("Gender: " + gender);
        System.out.println("Team: " + team);
        System.out.println("Member Type: " + memberType);
        System.out.println("Coach: " + coach);
        System.out.println("Phone: " + phone);
        System.out.println("Join Date: " + joinDate.day + "-" + joinDate.month + "-" + joinDate.year);
        System.out.println();
    }

}
public class Main {
    public static void main(String[] args) {
        Date joinDate1=new Date(28,"May",2005);
        Date joinDate2=new Date(31,"May",2009);
        Date joinDate3=new Date(12,"Aug",2006);
        Date joinDate4=new Date(6,"Dec",2011);
        Date joinDate5=new Date(24,"Jan",2010);
        Date joinDate6=new Date(9,"July",2013);
        Date joinDate7=new Date(5,"Mar",2008);
        Date joinDate8=new Date(22,"June",2006);
        Date joinDate9=new Date(29,"July",2013);
        Date joinDate10=new Date(13,"Aug",2013);
        Date joinDate11=new Date(28,"July",2008);
        Date joinDate12=new Date(18,"May",2009);
        Date joinDate13=new Date(7,"Apr",2009);
        Date joinDate14=new Date(23,"Mar",2007);
        Date joinDate15=new Date(17,"Apr",2009);
        Date joinDate16=new Date(30,"May",2007);
        Date joinDate17=new Date(27,"Nov",2007);
        Date joinDate18=new Date(05,"Aug",2005);
        Date joinDate19=new Date(14,"Jan",2011);
        Date joinDate20=new Date(07,"Oct",2010);

        Member[] members=new Member[20];

        members[0]=new Member(118,"Mckenezie","Melissa",30,'F',"","Junior",153,963270,joinDate1);
        members[1]=new Member(138,"Stone","Michael",30,'M',"","Senior",0,983223,joinDate2);
        members[2]=new Member(153,"Nolan","Brenda",11,'F',"TeamB","Senior",0,442649,joinDate3);
        members[3]=new Member(176,"Branch","Helen",0,'F',"","Social",0,589419,joinDate4);
        members[4]=new Member(178,"Beck","Sarah",0,'F',"","Social",0,226596,joinDate5);
        members[5]=new Member(228,"Burton","Sandra",26,'F',"","Junior",153,244493,joinDate6);
        members[6]=new Member(235,"Cooper","William",14,'M',"TeamB","Senior",153,722954,joinDate7);
        members[7]=new Member(239,"Spence","Thomas",10,'M',"","Senior",0,697720,joinDate8);
        members[8]=new Member(258,"Olson","Barbara",16,'F',"","Senior",0,370186,joinDate9);
        members[9]=new Member(286,"Pollard","Robert",19,'M',"TeamA","Junior",235,617681,joinDate10);
        members[10]=new Member(290,"Sexton","Thomas",26,'M',"","Senior",235,268936,joinDate11);
        members[11]=new Member(323,"Wilcox","Daniel",3,'M',"","Senior",0,665393,joinDate12);
        members[12]=new Member(331,"Schmidt","Thomas",25,'M',"TeamB","Senior",153,867492,joinDate13);
        members[13]=new Member(332,"Bridges","Deborah",12,'F',"TeamA","Senior",235,279087,joinDate14);
        members[14]=new Member(339,"Young","Betty",21,'F',"TeamB","Senior",0,507813,joinDate15);
        members[15]=new Member(414,"Gilmore","Jane",5,'F',"TeamA","Junior",153,459558,joinDate16);
        members[16]=new Member(415,"Taylor","William",7,'M',"","Senior",235,137353,joinDate17);
        members[17]=new Member(461,"Reed","Robert",3,'M',"","Senior",0,994664,joinDate18);
        members[18]=new Member(469,"Willis","Carolyn",29,'F',"","Junior",235,6884378,joinDate19);
        members[19]=new Member(487,"Kent","Susan",0,'F',"","Social",235,707217,joinDate20);

        System.out.println("Members joined before 07-Apr-2009");

        for (Member member:members) {
            if(member.joinDate.year<2009 || member.joinDate.year==2009 && member.joinDate.day<7){
                member.display();
            }
        }
        System.out.println("Senior members with handicap less than 12");
        for (Member member:members) {
            if(member.memberType.equals("Senior") && member.handicap<12) {
                member.display();
            }
        }
        System.out.println("Female Senior members in TeamB");
        for (Member member:members) {
            if(member.memberType.equals("Senior") && member.gender == 'F'  &&  member.team.equals("TeamB")) {
                member.display();
            }
        }
    }
}