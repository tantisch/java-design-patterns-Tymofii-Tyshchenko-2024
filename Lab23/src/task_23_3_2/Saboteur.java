package task_23_3_2;

public class Saboteur implements SpyVisitor {
    @Override
    public void visit(GeneralStaff generalStaff) {
        int option = (int) (Math.random() * 2);

        switch (option) {
            case 0 -> {
                int generals_number = Math.min(generalStaff.getGenerals(), (int) (Math.random() * 5));
                int docs_number = Math.min(generalStaff.getSecretPaper(), (int) (Math.random() * 25));
                System.out.println("Saboteur: Mission success");
                System.out.println("Killing " + generals_number + " generals");
                System.out.println("Burning " + docs_number + " documents");
                generalStaff.setGenerals(generalStaff.getGenerals() - generals_number);
                generalStaff.setSecretPaper(generalStaff.getSecretPaper() - docs_number);
            }
            case 1 -> System.out.println("Saboteur: mission failed");
        }
    }

    @Override
    public void visit(MilitaryBase militaryBase) {
        int option = (int) (Math.random() * 2);

        switch (option) {
            case 0 -> {
                int officers_number = Math.min(militaryBase.getOfficers(), (int) (Math.random() * 5));
                int soldiers_number = Math.min(militaryBase.getSoldiers(), (int) (Math.random() * 100));
                int jeeps_number = Math.min(militaryBase.getJeeps(), (int) (Math.random() * 25));
                int tanks_number = Math.min(militaryBase.getTanks(), (int) (Math.random() * 10));
                System.out.println("Saboteur: Mission success");
                System.out.println("Killing " + officers_number + " officers");
                System.out.println("Killing " + soldiers_number + " soldiers");
                System.out.println("Destroying " + jeeps_number + " jeeps");
                System.out.println("Destroying " + tanks_number + " tanks");
                militaryBase.setOfficers(militaryBase.getOfficers() - officers_number);
                militaryBase.setSoldiers(militaryBase.getSoldiers() - soldiers_number);
                militaryBase.setJeeps(militaryBase.getJeeps() - jeeps_number);
                militaryBase.setTanks(militaryBase.getTanks() - tanks_number);
            }
            case 1 -> System.out.println("Saboteur: mission failed");
        }
    }
}
