package task_23_3_2;

public class SecretAgent implements SpyVisitor {
    @Override
    public void visit(GeneralStaff generalStaff) {
        int option = (int) (Math.random() * 2);

        switch (option) {
            case 0 -> {
                int docs_number = Math.min(generalStaff.getSecretPaper(), (int) (Math.random() * 10));
                System.out.println("SecretAgent: Mission success");
                System.out.println("Stealing " + docs_number + " documents");
                System.out.println("Number of generals: " + generalStaff.getGenerals());
                generalStaff.setSecretPaper(generalStaff.getSecretPaper() - docs_number);
            }
            case 1 -> System.out.println("SecretAgent: mission failed");
        }
    }

    @Override
    public void visit(MilitaryBase militaryBase) {
        int option = (int) (Math.random() * 2);

        switch (option) {
            case 0 -> {
                System.out.println("SecretAgent: Mission success");
                System.out.println("Number of officers: " + militaryBase.getOfficers());
                System.out.println("Number of soldiers: " + militaryBase.getSoldiers());
                System.out.println("Number of jeeps: " + militaryBase.getJeeps());
                System.out.println("Number of tanks: " + militaryBase.getTanks());
            }
            case 1 -> System.out.println("SecretAgent: mission failed");
        }
    }
}
