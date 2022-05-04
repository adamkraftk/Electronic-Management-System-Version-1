// Class for all Persons
public class personInfo {
    private String relationToCompany;
    private String name;
    private String cellNum;
    private String emailAddress;
    private String physicalAddress;

    public personInfo( String relationToCompany, String name, String cellNum, String emailAddress, String physicalAddress){
        this.relationToCompany = relationToCompany;
        this.name = name;
        this.cellNum = cellNum;
        this.emailAddress = emailAddress;
        this.physicalAddress = physicalAddress;
    }

    public String getRelationToCompany(){return this.relationToCompany;}

    public String getName(){return this.name;}

    public void setName(String name) {
        this.name = name;
    }

    public void setCellNum(String cellNum) {
        this.cellNum = cellNum;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPhysicalAddress(String physicalAddress) {
        this.physicalAddress = physicalAddress;
    }



    public String toString(){

        String personInformation = "\nPersons Relation to Company: " + relationToCompany + "\nPersons Name: " + name
                                    + "\nPersons Telephone Number: " + cellNum + "\nPersons email address: " + emailAddress + "\nPersons Physical Address: " + physicalAddress;

        return personInformation;
    }
}