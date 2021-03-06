package kz.MT2004.employee.department;

//Technical department, specialties from this department implements TechnicalManagement
public interface TechnicalManagement {
    public static String TechnicalInfo() {
        return "    A technical department has engineers, who are overseen the technical problems.\n" +
                "For example, they oversee the installation and commissioning of new equipment, " +
                "improve energy efficiency,\n" + "controls the video equipment, configure and test operating systems.\n";
    }
    String TechWork();
}
