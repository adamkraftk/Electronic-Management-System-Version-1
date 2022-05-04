import java.util.*;

public class poisedMain {
    public static void main(String[] args) {
        // Create a  list for objects
        List<projectInfo> objectsOfProject = new ArrayList<>();
        List<personInfo> objectsOfPerson = new ArrayList<personInfo>();
        String menuStringLower = "a";
        while(!menuStringLower.equals("e")){
            // Create menu for selecting
            Scanner menuInput = new Scanner(System.in);
            System.out.print("\nL\t\tTo Log a New Project\nI\t\tTo Log a new Contractor\nC\t\tTo Change info about Contractor/Project\nF\t\tTo finalize and print invoice\nP\t\tTo Print All\nE\t\tTo Exit\nEnter Here: ");
            String menuString = menuInput.nextLine();
            menuStringLower = menuString.toLowerCase();

            if(menuStringLower.equals("l")) {
                //Logging Project Information
                System.out.println("\nProject is Unfinalised and completion date is unknown.");
                String finalised = "Unfinalised";
                String completionDate = "Unknown";

                Scanner projectNumInput = new Scanner(System.in);
                System.out.print("\n\nWhat is the project number: ");
                String projectNumString = projectNumInput.nextLine();

                Scanner projectNameInput = new Scanner(System.in);
                System.out.print("\nWhat is the name of the project: ");
                String projectNameString = projectNameInput.nextLine();

                Scanner buildingTypeInput = new Scanner(System.in);
                System.out.print("\nWhat type of building are you working on: ");
                String buildingTypeString = buildingTypeInput.nextLine();

                Scanner clientAddressInput = new Scanner(System.in);
                System.out.print("\nWhat is the clients address of the building being worked on: ");
                String clientAddressString = clientAddressInput.nextLine();

                Scanner erfnumberInput = new Scanner(System.in);
                System.out.print("\nWhat is the ERF number: ");
                String erfnumberString = erfnumberInput.nextLine();

                Scanner netprofitInput = new Scanner(System.in);
                System.out.print("\nHow much are you charging the client for this project: R");
                float netprofitSting = netprofitInput.nextInt();

                Scanner payToDateInput = new Scanner(System.in);
                System.out.print("\nHow much have your clients paid towards the final amount of the bill: R");
                float payToDateString = payToDateInput.nextInt();

                Scanner deadlineInput = new Scanner(System.in);
                System.out.print("\nWhen is the deadline for this project: ");
                String deadlineString = deadlineInput.nextLine();

                System.out.print("\nThis person is by default a client.");
                String relationToCompanyString = "Client";

                Scanner nameInput = new Scanner(System.in);
                System.out.print("\n\nWhat is this clients name, Please enter name and surname: ");
                String nameString = nameInput.nextLine();

                Scanner cellNumInput = new Scanner(System.in);
                System.out.print("\nWhat is this clients telephone number: ");
                String cellNumString = cellNumInput.nextLine();

                Scanner emailAddressInput = new Scanner(System.in);
                System.out.print("\nWhat is this clients email Address: ");
                String emailAddressString = emailAddressInput.nextLine();

                Scanner physicalAddressInput = new Scanner(System.in);
                System.out.print("\nWhat is this clients physical address: ");
                String physicalAddressString = physicalAddressInput.nextLine();

                // If Name of project is empty make the default House + surname of the client
                if (projectNameString.isEmpty()){
                    String [] nameSplit = nameString.split("\s");
                    projectNameString = "House " + nameSplit[1];
                }

                // Make an object of all the info logged
                projectInfo projectNew = new projectInfo(finalised,completionDate,projectNumString, projectNameString, buildingTypeString, clientAddressString, erfnumberString, netprofitSting, payToDateString, deadlineString,relationToCompanyString, nameString, cellNumString, emailAddressString, physicalAddressString);
                System.out.println(projectNew);
                personInfo PersonNew = new personInfo(relationToCompanyString, nameString, cellNumString, emailAddressString, physicalAddressString);
                objectsOfProject.add(projectNew);
                objectsOfPerson.add(PersonNew);

            }

            else if (menuStringLower.equals("i")){
                //Logging persons information
                System.out.print("\nThis person is a Contractor.");
                String relationToCompanyLower = "Contractor";

                Scanner nameInput = new Scanner(System.in);
                System.out.print("\n\nWhat is this persons name, Please enter name and surname: ");
                String nameString = nameInput.nextLine();

                Scanner cellNumInput = new Scanner(System.in);
                System.out.print("\nWhat is this persons telephone number: ");
                String cellNumString = cellNumInput.nextLine();

                Scanner emailAddressInput = new Scanner(System.in);
                System.out.print("\nWhat is this persons email Address: ");
                String emailAddressString = emailAddressInput.nextLine();

                Scanner physicalAddressInput = new Scanner(System.in);
                System.out.print("\nWhat is this persons physical address: ");
                String physicalAddressString = physicalAddressInput.nextLine();

                // Make an object of all the info logged
                personInfo PersonNew = new personInfo(relationToCompanyLower, nameString, cellNumString, emailAddressString, physicalAddressString);
                System.out.println(PersonNew);
                objectsOfPerson.add(PersonNew);
            }

            else if(menuStringLower.equals("c")){
                // editing the info logged
                Scanner editMenu = new Scanner(System.in);
                System.out.print("\nPE\t\tTo edit a Person\nPRO\t\tTo edit a Project\nEnter here: ");
                String editMenuInput = editMenu.nextLine();
                String editMenuLower = editMenuInput.toLowerCase();

                if (editMenuLower.equals("pe")){
                    // Edit info of contractors
                    for(int i = 0; i < objectsOfPerson.toArray().length;i++){
                        System.out.println(objectsOfPerson.get(i));
                    }

                    System.out.print("\nYou can only edit a contractors details!");

                    Scanner personEdit = new Scanner(System.in);
                    System.out.print("\nPlease enter the fullname of the person you would like to edit: ");
                    String namePersonEdit = personEdit.nextLine();

                    // Iterate over the list of objects and look for the name entered by the user
                    for(int iterator = 0; iterator < objectsOfPerson.toArray().length; iterator++){

                        if(Objects.equals(objectsOfPerson.get(iterator).getRelationToCompany(), "Contractor") && Objects.equals(objectsOfPerson.get(iterator).getName(), namePersonEdit)){

                            // Log the edited info
                            Scanner nameNew = new Scanner(System.in);
                            System.out.print("\nWhat is the new name of this Contractor: ");
                            String nameNewString = nameNew.nextLine();

                            Scanner cellNumNew = new Scanner(System.in);
                            System.out.print("\nWhat is the new telephone number of the Contractor: ");
                            String cellNumNewSting = cellNumNew.nextLine();

                            Scanner emailAddressNew = new Scanner(System.in);
                            System.out.print("\nWhat is the new email address of the Contractor: ");
                            String emailAddressNewString = emailAddressNew.nextLine();

                            Scanner physicalAddressNew = new Scanner(System.in);
                            System.out.print("\nWhat is the new physical address of the Contractor: ");
                            String physicalAddressNewString = physicalAddressNew.nextLine();

                            objectsOfPerson.get(iterator).setName(nameNewString);
                            objectsOfPerson.get(iterator).setCellNum(cellNumNewSting);
                            objectsOfPerson.get(iterator).setEmailAddress(emailAddressNewString);
                            objectsOfPerson.get(iterator).setPhysicalAddress(physicalAddressNewString);

                            System.out.println(objectsOfPerson.get(iterator).toString());
                        }

                        else{
                            System.out.print("\nThis is not a contractor, or you did something wrong");
                        }
                    }
                }

                else if (editMenuLower.equals("pro")){

                    // Iterate over the list of objects and look for the name entered by the user
                    for(int ipro = 0; ipro < objectsOfProject.toArray().length;ipro++){
                        System.out.println(objectsOfProject.get(ipro));
                    }
                        Scanner personEdit = new Scanner(System.in);
                        System.out.print("\nPlease enter the fullname of the person you would like to edit: ");
                        String namePersonEdit = personEdit.nextLine();

                    // Log the edited info
                        for(int proIterator = 0; proIterator < objectsOfProject.toArray().length; proIterator++){
                            if(Objects.equals(objectsOfProject.get(proIterator).getName(), namePersonEdit)){

                                Scanner dueDateInput = new Scanner(System.in);
                                System.out.print("\nWhat is the due date of the Project: ");
                                String dueDateString = dueDateInput.nextLine();

                                Scanner paidToDateInput = new Scanner(System.in);
                                System.out.print("\nHow much has the client paid to date: R");
                                float paidToDateString = paidToDateInput.nextInt();

                                objectsOfProject.get(proIterator).setPayToDate(paidToDateString);
                                objectsOfProject.get(proIterator).setDeadline(dueDateString);
                            }
                        }
                    }

                }

            //Finalise Project
            else if(menuStringLower.equals("f")){
                for(int ifinal = 0; ifinal < objectsOfProject.toArray().length;ifinal++){
                    System.out.println(objectsOfProject.get(ifinal));
                }

                Scanner finalEditInput = new Scanner(System.in);
                System.out.print("\nEnter the number of the project you would like to finalise: ");
                String finalEditString = finalEditInput.nextLine();

                for(int finalIterator = 0; finalIterator < objectsOfProject.toArray().length; finalIterator++){

                    // If number entered by user is equal to number of project and client has not paid in full
                    //Finalise project and give completion date
                if(Objects.equals(objectsOfProject.get(finalIterator).getProjectNum(), finalEditString) && objectsOfProject.get(finalIterator).getNetProfit() != objectsOfProject.get(finalIterator).getPayToDate()) {
                    System.out.print("\nProject is Finalised.");
                    String finalisedString = "Finalised";

                    Scanner completionInput = new Scanner(System.in);
                    System.out.print("\nWhat is the expected completion date: ");
                    String completionString = completionInput.nextLine();

                    objectsOfProject.get(finalIterator).setFinalised(finalisedString, completionString);
                    System.out.print(objectsOfProject.get(finalIterator));
                }

                // If the project does not match the description given by the user
                else if(!Objects.equals(objectsOfProject.get(finalIterator).getProjectNum(), finalEditString)){
                    System.out.print("Searching");
                }

                // If the user has paid in full
                //Finalise project and give completion date
                else{
                    System.out.print("\nCustomer has paid in full! No invoice can be generated.");

                    System.out.print("\n\nProject is Finalised.");
                    String finalisedString = "Finalised";

                    Scanner completionInput = new Scanner(System.in);
                    System.out.print("\nWhat is the expected completion date: ");
                    String completionString = completionInput.nextLine();

                    objectsOfProject.get(finalIterator).setCompletionDate(finalisedString,completionString);
                }
                }
            }

            else {
                // Print all
                for(int ifinal = 0; ifinal < objectsOfProject.toArray().length;ifinal++){
                    System.out.println(objectsOfProject.get(ifinal));
                }

                for(int i = 0; i < objectsOfPerson.toArray().length;i++){
                    System.out.println(objectsOfPerson.get(i));
                }
            }
        }
    }
    }

