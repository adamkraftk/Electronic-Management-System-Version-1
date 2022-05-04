// Class for all Projects
public class projectInfo {

    private String finalised;
    private String completionDate;
    private String projectNum;
    private String projectName;
    private String buildingType;
    private String clientAddress;
    private String erfNum;
    private float netProfit;
    private float payToDate;
    private String deadline;
    private String relationToCompany;
    private String name;
    private String cellNum;
    private String emailAddress;
    private String physicalAddress;

    public projectInfo(String finalised,String completionDate, String projectNum, String projectName, String buildingType,String clientAddress, String erfNum, float netProfit, float payToDate, String deadline, String relationToCompany, String name, String cellNum, String emailAddress, String physicalAddress){

        this.finalised = finalised;
        this.completionDate = completionDate;
        this.projectNum = projectNum;
        this.projectName = projectName;
        this.buildingType = buildingType;
        this.clientAddress = clientAddress;
        this.erfNum = erfNum;
        this.netProfit = netProfit;
        this.payToDate = payToDate;
        this.deadline = deadline;
        this.relationToCompany = relationToCompany;
        this.name = name;
        this.cellNum = cellNum;
        this.emailAddress = emailAddress;
        this.physicalAddress = physicalAddress;

    }

    public String getName(){return this.name;}

    public String getProjectNum(){return this.projectNum;}

    public float getNetProfit(){return this.netProfit;}

    public float getPayToDate(){return this.payToDate;}

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public void setPayToDate(float payToDate) {
        this.payToDate = payToDate;
    }

    public String setFinalised(String finalised, String completionDate) {

        this.finalised = finalised;
        this.completionDate = completionDate;
        // To find amount owed
        float amountOwed = netProfit - payToDate;

        System.out.print("\nInvoice for: " + name + "\nFor Project: " + projectName + "\nProject number: " + projectNum + "\nAddress Of Client: " + physicalAddress + "\nFor the amount of R" + amountOwed);
        return "\nThe amount payable is: " + amountOwed;

    }

    public String setCompletionDate(String finalised, String completionDate){

        this.finalised = finalised;
        this.completionDate = completionDate;
        return "Project has been Finalised";

    }

    public String toString(){

        String projectInformation = "\n\nStatus: " + finalised + "\nWhen will the project be finished: " + completionDate + "\nProject Number: " + projectNum + "\nProject Name: " + projectName + "\nType of Building: " +
                                    buildingType + "\nAddress of Client: " + clientAddress + "\nERF Number: " + erfNum + "\nAmount Charged: R" + netProfit + "\nAmount that the Client has paid: R" + payToDate +
                                    "\nProject Deadline: " + deadline;

        String personInformation = "\nPersons Relation to Company: " + relationToCompany + "\nPersons Name: " + name
                                    + "\nPersons Telephone Number: " + cellNum + "\nPersons email address: " + emailAddress + "\nPersons Physical Address: " + physicalAddress + "\n";

        return projectInformation + personInformation;

    }
}
